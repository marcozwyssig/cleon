package cleon.architecturemethods.eamod.spec.testing._09_test_execution._static.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class StaticTestExecution extends DynamicResource implements IStaticTestExecution {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStaticTestExecution> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStaticTestExecution>() {
    
    @Override
    public IStaticTestExecution create() {
      return new StaticTestExecution();
    }
    
    @Override
    public IStaticTestExecution create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new StaticTestExecution(resourceRepository, resource);
    }
  
  };

  public StaticTestExecution() {
    super(IStaticTestExecution.TYPE_ID);
  }
  
  public StaticTestExecution(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStaticTestExecution.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public StaticTestExecution setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.IStaticTestSpecification selectStaticTestSpecification() {
    return _getSingle(cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.IStaticTestSpecification.class, cleon.architecturemethods.eamod.spec.testing._09_test_execution._static._staticPackage.StaticTestExecution_staticTestSpecification);
  }

  public StaticTestExecution setStaticTestSpecification(cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.IStaticTestSpecification staticTestSpecification) {
    _setSingle(cleon.architecturemethods.eamod.spec.testing._09_test_execution._static._staticPackage.StaticTestExecution_staticTestSpecification, staticTestSpecification);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public StaticTestExecution setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public StaticTestExecution setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.IStaticTestSpecification.class, cleon.architecturemethods.eamod.spec.testing._09_test_execution._static._staticPackage.StaticTestExecution_staticTestSpecification, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.testing._09_test_execution._static.javamodel.IStaticTestExecution> selectToMeStaticTestSpecification(cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.IStaticTestSpecification object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.testing._09_test_execution._static.javamodel.IStaticTestExecution.class, cleon.architecturemethods.eamod.spec.testing._09_test_execution._static._staticPackage.StaticTestExecution_staticTestSpecification, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4a969a6c-20d7-11e6-9368-9172b77c2cff,N89kq1A5je3jFCmjQDxUPKH+fZI=] */
