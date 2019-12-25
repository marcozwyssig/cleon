package cleon.common.resources.metamodel.spec.complexity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ComplexityAware extends DynamicResource implements IComplexityAware {

  // abstract implementation, only used for static method calls
  private ComplexityAware() {
    super(IComplexityAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.common.resources.metamodel.spec.complexity.javamodel.IComplexityAware> selectToMeComplexity(cleon.common.resources.metamodel.spec.complexity.javamodel.IComplexity object) {
    return _getToMeList(object.getRepository(), cleon.common.resources.metamodel.spec.complexity.javamodel.IComplexityAware.class, cleon.common.resources.metamodel.spec.complexity.ComplexityPackage.ComplexityAware_complexity, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c145e25c-8fe7-11e8-a5b5-191902fe097a,xBDizt2sGFcuasef/N1nBGgZR9k=] */
