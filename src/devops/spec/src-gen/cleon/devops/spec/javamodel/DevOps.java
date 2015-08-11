package cleon.devops.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DevOps extends DynamicResource implements IDevOps {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDevOps> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDevOps>() {
    
    @Override
    public IDevOps create() {
      return new DevOps();
    }
    
    @Override
    public IDevOps create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DevOps(resourceRepository, resource);
    }
  
  };

  public DevOps() {
    super(IDevOps.TYPE_ID);
  }
  
  public DevOps(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDevOps.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.devops.spec.build.javamodel.IBuild selectBuild() {
    return _getSingle(cleon.devops.spec.build.javamodel.IBuild.class, cleon.devops.spec.SpecPackage.DevOps_build);
  }

  public DevOps setBuild(cleon.devops.spec.build.javamodel.IBuild build) {
    _setSingle(cleon.devops.spec.SpecPackage.DevOps_build, build);
    return this;
  }
    
  @Override
  public cleon.devops.spec.code.javamodel.ICode selectCode() {
    return _getSingle(cleon.devops.spec.code.javamodel.ICode.class, cleon.devops.spec.SpecPackage.DevOps_code);
  }

  public DevOps setCode(cleon.devops.spec.code.javamodel.ICode code) {
    _setSingle(cleon.devops.spec.SpecPackage.DevOps_code, code);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.devops.spec.deploy.javamodel.IDeploy> selectDeploy() {
    return _getList(cleon.devops.spec.deploy.javamodel.IDeploy.class, cleon.devops.spec.SpecPackage.DevOps_deploy);
  }

  public DevOps setDeploy(java.util.List<? extends cleon.devops.spec.deploy.javamodel.IDeploy> deploy) {
    _setList(cleon.devops.spec.SpecPackage.DevOps_deploy, deploy);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.devops.spec.operate.javamodel.IOperate> selectOperates() {
    return _getList(cleon.devops.spec.operate.javamodel.IOperate.class, cleon.devops.spec.SpecPackage.DevOps_operates);
  }

  public DevOps setOperates(java.util.List<? extends cleon.devops.spec.operate.javamodel.IOperate> operates) {
    _setList(cleon.devops.spec.SpecPackage.DevOps_operates, operates);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.devops.spec.release.javamodel.IRelease> selectRelease() {
    return _getList(cleon.devops.spec.release.javamodel.IRelease.class, cleon.devops.spec.SpecPackage.DevOps_release);
  }

  public DevOps setRelease(java.util.List<? extends cleon.devops.spec.release.javamodel.IRelease> release) {
    _setList(cleon.devops.spec.SpecPackage.DevOps_release, release);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.devops.spec.test.javamodel.ITest> selectTest() {
    return _getList(cleon.devops.spec.test.javamodel.ITest.class, cleon.devops.spec.SpecPackage.DevOps_test);
  }

  public DevOps setTest(java.util.List<? extends cleon.devops.spec.test.javamodel.ITest> test) {
    _setList(cleon.devops.spec.SpecPackage.DevOps_test, test);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DevOps setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.devops.spec.build.javamodel.IBuild.class, cleon.devops.spec.SpecPackage.DevOps_build, visitor);
    _acceptSingle(cleon.devops.spec.code.javamodel.ICode.class, cleon.devops.spec.SpecPackage.DevOps_code, visitor);
    _acceptList(cleon.devops.spec.deploy.javamodel.IDeploy.class, cleon.devops.spec.SpecPackage.DevOps_deploy, visitor);
    _acceptList(cleon.devops.spec.operate.javamodel.IOperate.class, cleon.devops.spec.SpecPackage.DevOps_operates, visitor);
    _acceptList(cleon.devops.spec.release.javamodel.IRelease.class, cleon.devops.spec.SpecPackage.DevOps_release, visitor);
    _acceptList(cleon.devops.spec.test.javamodel.ITest.class, cleon.devops.spec.SpecPackage.DevOps_test, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.devops.spec.javamodel.IDevOps selectToMeCode(cleon.devops.spec.code.javamodel.ICode object) {
    return _getToMeSingle(object.getRepository(), cleon.devops.spec.javamodel.IDevOps.class, cleon.devops.spec.SpecPackage.DevOps_code, object.getResource());
  }
  
  public static cleon.devops.spec.javamodel.IDevOps selectToMeBuild(cleon.devops.spec.build.javamodel.IBuild object) {
    return _getToMeSingle(object.getRepository(), cleon.devops.spec.javamodel.IDevOps.class, cleon.devops.spec.SpecPackage.DevOps_build, object.getResource());
  }
  
  public static java.util.List<cleon.devops.spec.javamodel.IDevOps> selectToMeTest(cleon.devops.spec.test.javamodel.ITest object) {
    return _getToMeList(object.getRepository(), cleon.devops.spec.javamodel.IDevOps.class, cleon.devops.spec.SpecPackage.DevOps_test, object.getResource());
  }
  
  public static java.util.List<cleon.devops.spec.javamodel.IDevOps> selectToMeRelease(cleon.devops.spec.release.javamodel.IRelease object) {
    return _getToMeList(object.getRepository(), cleon.devops.spec.javamodel.IDevOps.class, cleon.devops.spec.SpecPackage.DevOps_release, object.getResource());
  }
  
  public static java.util.List<cleon.devops.spec.javamodel.IDevOps> selectToMeDeploy(cleon.devops.spec.deploy.javamodel.IDeploy object) {
    return _getToMeList(object.getRepository(), cleon.devops.spec.javamodel.IDevOps.class, cleon.devops.spec.SpecPackage.DevOps_deploy, object.getResource());
  }
  
  public static java.util.List<cleon.devops.spec.javamodel.IDevOps> selectToMeOperates(cleon.devops.spec.operate.javamodel.IOperate object) {
    return _getToMeList(object.getRepository(), cleon.devops.spec.javamodel.IDevOps.class, cleon.devops.spec.SpecPackage.DevOps_operates, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c6c94ef5-406e-11e5-b5f0-5b1ce9c3de3e,ECGfN5JRdVACi+ZFAjrZwXDdJoo=] */
