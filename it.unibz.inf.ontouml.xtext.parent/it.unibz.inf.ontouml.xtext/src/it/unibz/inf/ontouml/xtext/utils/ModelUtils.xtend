package it.unibz.inf.ontouml.xtext.utils

import java.util.Set
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass
import java.util.HashSet
import it.unibz.inf.ontouml.xtext.xcore.ModelElement
import com.google.inject.Inject

class ModelUtils {
	
//	@Inject extension ModelUtils
	
	def Set<OntoUMLClass> getClassHierarchy(OntoUMLClass c)
	{
		val ch = new HashSet<OntoUMLClass>()
		c.classHierarchy(ch)
	}
	
	def private Set<OntoUMLClass> classHierarchy(OntoUMLClass c, Set<OntoUMLClass> ch) {
		for (current : c.superclasses) {
			if (!ch.contains(current)) {
				ch.add(current)
				ch.addAll(current.classHierarchy(ch))
			}
		}
		ch
	}
	
	def String nameOrAlias(ModelElement e) {
		val it = e
		if(alias.nullOrEmpty || alias=="unnamed")	return name
		else											return alias
	}
	
}