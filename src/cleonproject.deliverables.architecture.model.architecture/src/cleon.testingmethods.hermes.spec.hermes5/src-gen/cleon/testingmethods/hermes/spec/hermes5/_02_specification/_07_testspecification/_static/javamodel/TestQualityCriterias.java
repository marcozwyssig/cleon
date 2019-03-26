package cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestQualityCriterias extends DynamicResource implements ITestQualityCriterias {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestQualityCriterias> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestQualityCriterias>() {
    
    @Override
    public ITestQualityCriterias create() {
      return new TestQualityCriterias();
    }
    
    @Override
    public ITestQualityCriterias create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestQualityCriterias(resourceRepository, resource);
    }
  
  };

  public TestQualityCriterias() {
    super(ITestQualityCriterias.TYPE_ID);
  }
  
  public TestQualityCriterias(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestQualityCriterias.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestQualityCriteria> selectTestQualityCriterias() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestQualityCriteria.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static._staticPackage.TestQualityCriterias_testQualityCriterias);
  }

  public TestQualityCriterias setTestQualityCriterias(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestQualityCriteria> testQualityCriterias) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static._staticPackage.TestQualityCriterias_testQualityCriterias, testQualityCriterias);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestQualityCriterias setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestQualityCriteria.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static._staticPackage.TestQualityCriterias_testQualityCriterias, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestQualityCriterias selectToMeTestQualityCriterias(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestQualityCriteria object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestQualityCriterias.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static._staticPackage.TestQualityCriterias_testQualityCriterias, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c117ff0b-1cf1-11e6-aaba-9db7fdc64d7e,xCkiduFv4A6SyHDLnVdq8fp1DhY=] */
