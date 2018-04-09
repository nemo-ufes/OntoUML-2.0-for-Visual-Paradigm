package it.unibz.inf.ontouml.xtext.utils;

import com.google.inject.Inject;
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ModelUtils {
  @Inject
  @Extension
  private ModelUtils _modelUtils;
  
  public Set<OntoUMLClass> getClassHierarchy(final OntoUMLClass c) {
    final HashSet<OntoUMLClass> ch = new HashSet<OntoUMLClass>();
    return this.getClassHierarchy(c, ch);
  }
  
  private Set<OntoUMLClass> getClassHierarchy(final OntoUMLClass c, final Set<OntoUMLClass> ch) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method classHierarchy(Set<OntoUMLClass>) is undefined for the type OntoUMLClass");
  }
}
