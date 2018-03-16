package cleon.common.analysis.spec.analysis.solution.solutions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Solutions extends DynamicResource implements ISolutions {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutions> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutions>() {
    
    @Override
    public ISolutions create() {
      return new Solutions();
    }
    
    @Override
    public ISolutions create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Solutions(resourceRepository, resource);
    }
  
  };

  public Solutions() {
    super(ISolutions.TYPE_ID);
  }
  
  public Solutions(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISolutions.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements);
  }

  public Solutions setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.analysis.spec.analysis.solution.solutions.javamodel.ISolution> selectSolutions() {
    return _getList(cleon.common.analysis.spec.analysis.solution.solutions.javamodel.ISolution.class, cleon.common.analysis.spec.analysis.solution.solutions.SolutionsPackage.Solutions_solutions);
  }

  public Solutions setSolutions(java.util.List<? extends cleon.common.analysis.spec.analysis.solution.solutions.javamodel.ISolution> solutions) {
    _setList(cleon.common.analysis.spec.analysis.solution.solutions.SolutionsPackage.Solutions_solutions, solutions);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Solutions setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, visitor);
    _acceptList(cleon.common.analysis.spec.analysis.solution.solutions.javamodel.ISolution.class, cleon.common.analysis.spec.analysis.solution.solutions.SolutionsPackage.Solutions_solutions, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.common.analysis.spec.analysis.solution.solutions.javamodel.ISolutions selectToMeSolutions(cleon.common.analysis.spec.analysis.solution.solutions.javamodel.ISolution object) {
    return _getToMeSingle(object.getRepository(), cleon.common.analysis.spec.analysis.solution.solutions.javamodel.ISolutions.class, cleon.common.analysis.spec.analysis.solution.solutions.SolutionsPackage.Solutions_solutions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d6243e22-3c14-11e5-9962-cf3035adb922,0I1FWCAGP1qMyIkrRJdyhu0+bHM=] */
