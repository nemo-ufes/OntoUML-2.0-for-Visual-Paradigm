package it.unibz.inf.ontouml.xtext.utils

import java.util.Set
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass
import java.util.HashSet
import it.unibz.inf.ontouml.xtext.xcore.ModelElement
import com.google.inject.Inject

class ModelUtils {
	
	@Inject extension ModelUtils
	
	def Set<OntoUMLClass> getClassHierarchy(OntoUMLClass c)
	{
		val ch = new HashSet<OntoUMLClass>()
		return getClassHierarchy(c, ch)
	}
	
	private def Set<OntoUMLClass> getClassHierarchy(OntoUMLClass c, Set<OntoUMLClass> ch)
	{
		for (current : c.superClasses) {
			if (!ch.contains(current)) {
				ch.add(current)
				ch.addAll(current.classHierarchy(ch))
			}
		}
		ch
	}
	
}