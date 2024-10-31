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

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.naming.NamingPackage.MandatoryShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.naming.NamingPackage.MandatoryShortName_shortName, shortName);
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
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.naming.NamingPackage.MandatoryShortName_shortName, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isUnittest__F___N_UT__O_()) return visitor.visitUnittest__F___N_UT__O_();
    if (isUnitintegrationtest__F___N_UIT__O_()) return visitor.visitUnitintegrationtest__F___N_UIT__O_();
    if (isSystemtest__F___N_ST__O_()) return visitor.visitSystemtest__F___N_ST__O_();
    if (isSystemintegrationstest__F___N_SIT__O_()) return visitor.visitSystemintegrationstest__F___N_SIT__O_();
    if (isAkzeptanztest__F___N_AT__O_()) return visitor.visitAkzeptanztest__F___N_AT__O_();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isUnittest__F___N_UT__O_()) {
      visitor.visitUnittest__F___N_UT__O_();
      return;
    }
    if (isUnitintegrationtest__F___N_UIT__O_()) {
      visitor.visitUnitintegrationtest__F___N_UIT__O_();
      return;
    }
    if (isSystemtest__F___N_ST__O_()) {
      visitor.visitSystemtest__F___N_ST__O_();
      return;
    }
    if (isSystemintegrationstest__F___N_SIT__O_()) {
      visitor.visitSystemintegrationstest__F___N_SIT__O_();
      return;
    }
    if (isAkzeptanztest__F___N_AT__O_()) {
      visitor.visitAkzeptanztest__F___N_AT__O_();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isUnittest__F___N_UT__O_() {
    return getResource().equals(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevel_Unittest__F___N_UT__O_);
  }
  
  @Override
  public boolean isUnitintegrationtest__F___N_UIT__O_() {
    return getResource().equals(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevel_Unitintegrationtest__F___N_UIT__O_);
  }
  
  @Override
  public boolean isSystemtest__F___N_ST__O_() {
    return getResource().equals(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevel_Systemtest__F___N_ST__O_);
  }
  
  @Override
  public boolean isSystemintegrationstest__F___N_SIT__O_() {
    return getResource().equals(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevel_Systemintegrationstest__F___N_SIT__O_);
  }
  
  @Override
  public boolean isAkzeptanztest__F___N_AT__O_() {
    return getResource().equals(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevel_Akzeptanztest__F___N_AT__O_);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4731eb51-5153-11e9-bb61-971a423d31e9,wrEORbQlojjJMtRSk2TWs//JBw8=] */
