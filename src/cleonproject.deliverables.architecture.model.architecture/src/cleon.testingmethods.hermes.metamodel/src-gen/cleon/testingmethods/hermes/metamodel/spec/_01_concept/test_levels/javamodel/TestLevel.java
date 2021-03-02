package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestLevel extends DynamicResource implements ITestLevel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestLevel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestLevel>() {
    
    @Override
    public ITestLevel create() {
      return new TestLevel();
    }
    
    @Override
    public ITestLevel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestLevel(resourceRepository, resource);
    }
  
  };

  public TestLevel() {
    super(ITestLevel.TYPE_ID);
  }
  
  public TestLevel(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestLevel.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestLevel setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isUnittest()) return visitor.visitUnittest();
    if (isUnitintegrationtest()) return visitor.visitUnitintegrationtest();
    if (isSystemtest()) return visitor.visitSystemtest();
    if (isSystemintegrationstest()) return visitor.visitSystemintegrationstest();
    if (isAkzeptanztest()) return visitor.visitAkzeptanztest();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isUnittest()) {
      visitor.visitUnittest();
      return;
    }
    if (isUnitintegrationtest()) {
      visitor.visitUnitintegrationtest();
      return;
    }
    if (isSystemtest()) {
      visitor.visitSystemtest();
      return;
    }
    if (isSystemintegrationstest()) {
      visitor.visitSystemintegrationstest();
      return;
    }
    if (isAkzeptanztest()) {
      visitor.visitAkzeptanztest();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isUnittest() {
    return getResource().equals(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevel_Unittest);
  }
  
  @Override
  public boolean isUnitintegrationtest() {
    return getResource().equals(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevel_Unitintegrationtest);
  }
  
  @Override
  public boolean isSystemtest() {
    return getResource().equals(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevel_Systemtest);
  }
  
  @Override
  public boolean isSystemintegrationstest() {
    return getResource().equals(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevel_Systemintegrationstest);
  }
  
  @Override
  public boolean isAkzeptanztest() {
    return getResource().equals(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevel_Akzeptanztest);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4731eb51-5153-11e9-bb61-971a423d31e9,eAFUuwodWxRjpwvfvEorFa3RjoU=] */
