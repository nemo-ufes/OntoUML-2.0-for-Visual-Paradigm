package it.unibz.inf.ontouml.vp.uml;

import java.util.Arrays;
import java.util.List;

import com.vp.plugin.model.IAssociation;
import com.vp.plugin.model.IAssociationEnd;
import com.vp.plugin.model.IModelElement;

import it.unibz.inf.ontouml.vp.utils.StereotypeUtils;
import it.unibz.inf.ontouml.xtext.xcore.EndurantType;
import it.unibz.inf.ontouml.xtext.xcore.RelationType;

public class AssociationAdapter extends ModelElementAdapter {

	AssociationAdapter(IAssociation association) {
		super(association);
	}
	
	@Override
	protected IAssociation getInstance() {
		return (IAssociation) super.getInstance();
	}

	public RelationType getOntoUMLType() {
		List<String> strs = Arrays.asList(getInstance().toStereotypeArray());
		
		if(strs.contains(StereotypeUtils.STR_EXTERNAL_DEPENDENCE))
			return RelationType.EXTERNAL_DEPEDENCE;
		if(strs.contains(StereotypeUtils.STR_CHARACTERIZATION))
			return RelationType.CHARACTERIZATION;
		if(strs.contains(StereotypeUtils.STR_MEDIATION))
			return RelationType.MEDIATION;
		if(strs.contains(StereotypeUtils.STR_MATERIAL))
			return RelationType.MATERIAL;
		if(strs.contains(StereotypeUtils.STR_COMPARATIVE))
			return RelationType.COMPARATIVE;
		if(strs.contains(StereotypeUtils.STR_HISTORICAL))
			return RelationType.HISTORICAL;
		
		return RelationType.NONE;
	}

	public ModelElementAdapter getFrom() {
		return AdapterManager.getApater(getInstance().getFrom());
	}

	public ModelElementAdapter getTo() {
		return AdapterManager.getApater(getInstance().getTo());
	}

	public String getFromCardinality() {
		return ((IAssociationEnd) getInstance().getFromEnd()).getMultiplicity();
	}
	
	public String getToCardinality() {
		return ((IAssociationEnd) getInstance().getFromEnd()).getMultiplicity();
	}
	
	public String getFromAggregationKind() {
		return ((IAssociationEnd) getInstance().getFromEnd()).getAggregationKind();
	}
	
	public String getToAggregationKind() {
		return ((IAssociationEnd) getInstance().getToEnd()).getAggregationKind();
	}
	
}
