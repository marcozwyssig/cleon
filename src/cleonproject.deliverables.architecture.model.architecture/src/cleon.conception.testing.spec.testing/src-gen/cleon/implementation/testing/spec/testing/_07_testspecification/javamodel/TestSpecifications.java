package cleon.implementation.testing.spec.testing._07_testspecification.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestSpecifications extends DynamicResource implements ITestSpecifications {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSpecifications> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSpecifications>() {
    
    @Override
    public ITestSpecifications create() {
      return new TestSpecifications();
    }
    
    @Override
    public ITestSpecifications create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestSpecifications(resourceRepository, resource);
    }
  
  };

  public TestSpecifications() {
    super(ITestSpecifications.TYPE_ID);
  }
  
  public TestSpecifications(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestSpecifications.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements);
  }

  public TestSpecifications setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTestSpecification> selectStaticTestSpecifications() {
    return _getMap(cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTestSpecification.class, cleon.implementation.testing.spec.testing._07_testspecification._07_testspecificationPackage.TestSpecifications_staticTestSpecifications);
  }

  public TestSpecifications setStaticTestSpecifications(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTestSpecification> staticTestSpecifications) {
    _setMap(cleon.implementation.testing.spec.testing._07_testspecification._07_testspecificationPackage.TestSpecifications_staticTestSpecifications, staticTestSpecifications);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestSpecifications setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, visitor);
    _acceptMap(cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTestSpecification.class, cleon.implementation.testing.spec.testing._07_testspecification._07_testspecificationPackage.TestSpecifications_staticTestSpecifications, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.implementation.testing.spec.testing._07_testspecification.javamodel.ITestSpecifications selectToMeStaticTestSpecifications(cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTestSpecification object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing._07_testspecification.javamodel.ITestSpecifications.class, cleon.implementation.testing.spec.testing._07_testspecification._07_testspecificationPackage.TestSpecifications_staticTestSpecifications, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1c345fe2-1db1-11e6-974b-630b7f5d3b95,o0KANWVm+URnBKZ/mw+iy+L7UIA=] */
