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
		
		if(strs.contains(StereotypeUtils.STR_DEPENDENCE))
			return RelationType.DEPENDENCE;
		if(strs.contains(StereotypeUtils.STR_INHERENCE))
			return RelationType.INHERENCE;
		if(strs.contains(StereotypeUtils.STR_INVOLVEMENT))
			return RelationType.INVOLVEMENT;
		if(strs.contains(StereotypeUtils.STR_DESCRIPTIVE))
			return RelationType.DESCRIPTIVE;
		if(strs.contains(StereotypeUtils.STR_NON_DESCRIPTIVE))
			return RelationType.NON_DESCRIPTIVE;
		
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
	
	
	
}
