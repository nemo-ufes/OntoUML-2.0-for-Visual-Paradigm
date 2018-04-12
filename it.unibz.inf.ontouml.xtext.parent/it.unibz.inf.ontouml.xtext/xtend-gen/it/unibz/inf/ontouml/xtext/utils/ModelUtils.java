package it.unibz.inf.ontouml.xtext.utils;

import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ModelUtils {
  public Set<OntoUMLClass> getClassHierarchy(final OntoUMLClass c) {
    Set<OntoUMLClass> _xblockexpression = null;
    {
      final HashSet<OntoUMLClass> ch = new HashSet<OntoUMLClass>();
      _xblockexpression = this.classHierarchy(c, ch);
    }
    return _xblockexpression;
  }
  
  private Set<OntoUMLClass> classHierarchy(final OntoUMLClass c, final Set<OntoUMLClass> ch) {
    Set<OntoUMLClass> _xblockexpression = null;
    {
      EList<OntoUMLClass> _superclasses = c.getSuperclasses();
      for (final OntoUMLClass current : _superclasses) {
        boolean _contains = ch.contains(current);
        boolean _not = (!_contains);
        if (_not) {
          ch.add(current);
          ch.addAll(this.classHierarchy(current, ch));
        }
      }
      _xblockexpression = ch;
    }
    return _xblockexpression;
  }
}
