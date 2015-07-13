package cleon.sdp.spec.project.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Story extends DynamicResource implements IStory {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStory> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStory>() {
    
    @Override
    public IStory create() {
      return new Story();
    }
    
    @Override
    public IStory create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Story(resourceRepository, resource);
    }
  
  };

  public Story() {
    super(IStory.TYPE_ID);
  }
  
  public Story(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStory.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.sdp.spec.project.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.sdp.spec.project.javamodel.IPerson.class, cleon.sdp.spec.project.ProjectPackage.WorkItem_owner);
  }

  public Story setOwner(cleon.sdp.spec.project.javamodel.IPerson owner) {
    _setSingle(cleon.sdp.spec.project.ProjectPackage.WorkItem_owner, owner);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Story setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.sdp.spec.project.javamodel.IPerson.class, cleon.sdp.spec.project.ProjectPackage.WorkItem_owner, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,461882c1-ff9c-11e4-ac0a-959b440f987f,rkvJk1e/7b+qK7K0uKIBTxWQIbY=] */
