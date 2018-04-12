package it.unibz.inf.ontouml.vp.uml;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.vp.plugin.model.IGeneralization;
import com.vp.plugin.model.IGeneralizationSet;

public class GeneralizationSetAdapter extends ModelElementAdapter {

	protected GeneralizationSetAdapter(IGeneralizationSet adaptee) {
		super(adaptee);
	}

	@Override
	protected IGeneralizationSet getInstance() {
		return (IGeneralizationSet) super.getInstance();
	}
	
	public Set<GeneralizationAdapter> getGeneralizations() {
		Set<GeneralizationAdapter> generalizations = new HashSet<GeneralizationAdapter>();
		@SuppressWarnings("unchecked")
		Iterator<IGeneralization> iter = getInstance().generalizationIterator();

		while (iter.hasNext()) {
			ModelElementAdapter adap = ModelAccess.getAdapter(iter.next().getId());
			if (adap != null && adap instanceof GeneralizationAdapter)
				generalizations.add((GeneralizationAdapter) adap);
		}
		return generalizations;
	}
	
	public boolean isDisjoint() {
		return getInstance().isDisjoint();
	}
	
	public boolean isComplete() {
		return getInstance().isCovering();
	}
	
}
