package cleon.sdp.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Sdp extends DynamicResource implements ISdp {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISdp> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISdp>() {
    
    @Override
    public ISdp create() {
      return new Sdp();
    }
    
    @Override
    public ISdp create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Sdp(resourceRepository, resource);
    }
  
  };

  public Sdp() {
    super(ISdp.TYPE_ID);
  }
  
  public Sdp(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISdp.TYPE_ID);
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
  public cleon.sdp.spec.project.javamodel.IProject selectProject() {
    return _getSingle(cleon.sdp.spec.project.javamodel.IProject.class, cleon.sdp.spec.SpecPackage.Sdp_project);
  }

  public Sdp setProject(cleon.sdp.spec.project.javamodel.IProject project) {
    _setSingle(cleon.sdp.spec.SpecPackage.Sdp_project, project);
    return this;
  }
    
  @Override
  public cleon.sdp.spec.requirements.javamodel.IRequirements selectRequirements() {
    return _getSingle(cleon.sdp.spec.requirements.javamodel.IRequirements.class, cleon.sdp.spec.SpecPackage.Sdp_requirements);
  }

  public Sdp setRequirements(cleon.sdp.spec.requirements.javamodel.IRequirements requirements) {
    _setSingle(cleon.sdp.spec.SpecPackage.Sdp_requirements, requirements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Sdp setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.sdp.spec.project.javamodel.IProject.class, cleon.sdp.spec.SpecPackage.Sdp_project, visitor);
    _acceptSingle(cleon.sdp.spec.requirements.javamodel.IRequirements.class, cleon.sdp.spec.SpecPackage.Sdp_requirements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sdp.spec.javamodel.ISdp selectToMeRequirements(cleon.sdp.spec.requirements.javamodel.IRequirements object) {
    return _getToMeSingle(object.getRepository(), cleon.sdp.spec.javamodel.ISdp.class, cleon.sdp.spec.SpecPackage.Sdp_requirements, object.getResource());
  }
  
  public static cleon.sdp.spec.javamodel.ISdp selectToMeProject(cleon.sdp.spec.project.javamodel.IProject object) {
    return _getToMeSingle(object.getRepository(), cleon.sdp.spec.javamodel.ISdp.class, cleon.sdp.spec.SpecPackage.Sdp_project, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ea1700ac-ff9a-11e4-ac0a-959b440f987f,Tqbn1jmHLdSlk7h4H4LYKjAYf48=] */
