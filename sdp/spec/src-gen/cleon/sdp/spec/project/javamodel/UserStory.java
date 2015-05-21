package cleon.sdp.spec.project.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class UserStory extends DynamicResource implements IUserStory {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUserStory> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUserStory>() {
    
    @Override
    public IUserStory create() {
      return new UserStory();
    }
    
    @Override
    public IUserStory create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new UserStory(resourceRepository, resource);
    }
  
  };

  public UserStory() {
    super(IUserStory.TYPE_ID);
  }
  
  public UserStory(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IUserStory.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.sdp.spec.project.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.sdp.spec.project.javamodel.IPerson.class, cleon.sdp.spec.project.ProjectPackage.WorkItem_owner);
  }

  public UserStory setOwner(cleon.sdp.spec.project.javamodel.IPerson owner) {
    _setSingle(cleon.sdp.spec.project.ProjectPackage.WorkItem_owner, owner);
    return this;
  }
    
  @Override
  public cleon.sdp.spec.requirements.javamodel.IRequirement selectRequirement() {
    return _getSingle(cleon.sdp.spec.requirements.javamodel.IRequirement.class, cleon.sdp.spec.project.ProjectPackage.UserStory_requirement);
  }

  public UserStory setRequirement(cleon.sdp.spec.requirements.javamodel.IRequirement requirement) {
    _setSingle(cleon.sdp.spec.project.ProjectPackage.UserStory_requirement, requirement);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public UserStory setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public UserStory setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.sdp.spec.project.javamodel.IPerson.class, cleon.sdp.spec.project.ProjectPackage.WorkItem_owner, visitor);
    _acceptSingle(cleon.sdp.spec.requirements.javamodel.IRequirement.class, cleon.sdp.spec.project.ProjectPackage.UserStory_requirement, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sdp.spec.project.javamodel.IUserStory> selectToMeRequirement(cleon.sdp.spec.requirements.javamodel.IRequirement object) {
    return _getToMeList(object.getRepository(), cleon.sdp.spec.project.javamodel.IUserStory.class, cleon.sdp.spec.project.ProjectPackage.UserStory_requirement, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,693cc9f9-ff9c-11e4-ac0a-959b440f987f,se6NponlCbGEMhGRXxll2anm0us=] */
