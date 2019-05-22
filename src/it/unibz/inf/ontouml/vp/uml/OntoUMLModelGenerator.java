package it.unibz.inf.ontouml.vp.uml;

import java.util.Iterator;

import com.vp.plugin.ApplicationManager;
import com.vp.plugin.model.IAssociation;
import com.vp.plugin.model.IAssociationClass;
import com.vp.plugin.model.IAssociationEnd;
import com.vp.plugin.model.IClass;
import com.vp.plugin.model.IGeneralization;
import com.vp.plugin.model.IGeneralizationSet;
import com.vp.plugin.model.IModelElement;
import com.vp.plugin.model.IProject;
import com.vp.plugin.model.factory.IModelElementFactory;

import it.unibz.inf.ontouml.xtext.xcore.EndurantType;
import it.unibz.inf.ontouml.xtext.xcore.RelationType;

public class OntoUMLModelGenerator {
	
	public String generateOntoUMLModel() {
		StringBuilder model = new StringBuilder();
		IProject p = ApplicationManager.instance().getProjectManager().getProject();
		String[] metypes = { IModelElementFactory.MODEL_TYPE_CLASS,
				IModelElementFactory.MODEL_TYPE_ASSOCIATION,
				IModelElementFactory.MODEL_TYPE_ASSOCIATION_CLASS,
				IModelElementFactory.MODEL_TYPE_GENERALIZATION,
				IModelElementFactory.MODEL_TYPE_GENERALIZATION_SET };
		@SuppressWarnings("unchecked")
		Iterator<IModelElement> iter = p.allLevelModelElementIterator(metypes);
		
		while(iter.hasNext()) {
			IModelElement me = iter.next();
			StringBuilder line = toOntoUMLModelElement(me);
			
			if(line!=null) {
				model.append(line);
				model.append('\n');
			}
		}
		
		return model.toString();
	}

	private StringBuilder toOntoUMLModelElement(IModelElement me) {
		String mt = me.getModelType();
		
		switch (mt) {
		case IModelElementFactory.MODEL_TYPE_CLASS:
			return toOntoUMLClass((IClass) me);
			
		case IModelElementFactory.MODEL_TYPE_ASSOCIATION:
			return toOntoUMLAssociation((IAssociation) me);
			
		case IModelElementFactory.MODEL_TYPE_ASSOCIATION_CLASS:
			return toOntoUMLAssociationClass((IAssociationClass) me);
			
		case IModelElementFactory.MODEL_TYPE_GENERALIZATION:
			return toOntoUMLGeneralization((IGeneralization) me);
			
		case IModelElementFactory.MODEL_TYPE_GENERALIZATION_SET:
			return toOntoUMLGeneralizationSet((IGeneralizationSet) me);
			
		default:
			return null;
		}
	}

	private StringBuilder toOntoUMLGeneralizationSet(IGeneralizationSet me) {
		GeneralizationSetAdapter gs = (GeneralizationSetAdapter) AdapterManager.getApater(me);
		StringBuilder ret = new StringBuilder();
		
		if(gs.isDisjoint()) ret.append("disjoint ");
		if(gs.isComplete()) ret.append("complete ");
		ret.append("generalizationset "+gs.getQuotatedId()+" aka "+gs.getQuotatedName()+" { ");
		for (GeneralizationAdapter gen : gs.getGeneralizations()) {
			ret.append(gen.getQuotatedId()+" ");
		}
		ret.append("}");

		return ret;
	}

	private StringBuilder toOntoUMLGeneralization(IGeneralization me) {
		StringBuilder ret = new StringBuilder();
		GeneralizationAdapter g = (GeneralizationAdapter) AdapterManager.getApater(me);
		
		ret.append("generalization");
		ret.append(' ' + g.getQuotatedId());
		ret.append(" aka");
		ret.append(' ' + g.getQuotatedName());
		ret.append(' ' + g.getGeneric().getQuotatedId());
		ret.append(' ' + g.getSpecific().getQuotatedId());
		
		return ret;
	}

	private StringBuilder toOntoUMLAssociation(IAssociation me) {
		StringBuilder ret = new StringBuilder();
		AssociationAdapter a = (AssociationAdapter) AdapterManager.getApater(me);
		RelationType rtype = a.getOntoUMLType();
		
		if(rtype==RelationType.NONE)
			ret.append("association " + a.getQuotatedId());
		else
			ret.append(rtype.toString() + ' ' + a.getQuotatedId());
		
		if(!a.toString().isEmpty())
			ret.append(" aka " + a.getQuotatedName());
		
		String aggregationKind = a.getFromAggregationKind();
		if(aggregationKind.equals(IAssociationEnd.AGGREGATION_KIND_AGGREGATION)) {
			ret.append(" aggregation");
		} else if(aggregationKind.equals(IAssociationEnd.AGGREGATION_KIND_COMPOSITED)) {
			ret.append(" composition");
		}
		
		String card = a.getFromCardinality();
		if(card != IAssociationEnd.MULTIPLICITY_UNSPECIFIED) {
			if(!card.contains(".."))
				ret.append(" [" + card + ".." + card + ']');
			else
				ret.append(" [" + card + ']');
		}
		ret.append(' ' + a.getFrom().getQuotatedId());
		

		aggregationKind = a.getToAggregationKind();
		if(aggregationKind.equals(IAssociationEnd.AGGREGATION_KIND_AGGREGATION)) {
			ret.append(" aggregation");
		} else if(aggregationKind.equals(IAssociationEnd.AGGREGATION_KIND_COMPOSITED)) {
			ret.append(" composition");
		}
		card = a.getToCardinality();
		if(card != IAssociationEnd.MULTIPLICITY_UNSPECIFIED) {
			if(!card.contains(".."))
				ret.append(" [" + card + ".." + card + ']');
			else
				ret.append(" [" + card + ']');
		}
		ret.append(' ' + a.getTo().getQuotatedId());
		
		return ret;
	}
	
	private StringBuilder toOntoUMLAssociationClass(IAssociationClass me) {
		StringBuilder ret = new StringBuilder();
		AssociationClassAdapter a = (AssociationClassAdapter) AdapterManager.getApater(me);
		
		ret.append("derivation " + a.getQuotatedId());
		ret.append(' ' + a.getFrom().getQuotatedId());
		ret.append(' ' + a.getTo().getQuotatedId());
		
		return ret;
	}

	private StringBuilder toOntoUMLClass(IClass me) {
		StringBuilder ret = new StringBuilder();
		ClassAdapter c = (ClassAdapter) AdapterManager.getApater(me);
		EndurantType etype = c.getOntoUMLType();
		
		if(etype==EndurantType.NONE)
			ret.append("class");
		else
			ret.append(etype.toString());
		
		ret.append(' '+c.getQuotatedId());
		ret.append(" aka");
		ret.append(' '+c.getQuotatedName());
		return ret;
	}

}
