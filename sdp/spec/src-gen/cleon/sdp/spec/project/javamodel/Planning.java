package cleon.sdp.spec.project.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Planning extends DynamicResource implements IPlanning {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlanning> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlanning>() {
    
    @Override
    public IPlanning create() {
      return new Planning();
    }
    
    @Override
    public IPlanning create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Planning(resourceRepository, resource);
    }
  
  };

  public Planning() {
    super(IPlanning.TYPE_ID);
  }
  
  public Planning(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPlanning.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Planning setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sdp.spec.project.javamodel.IUserStory> selectWorkItem() {
    return _getMap(cleon.sdp.spec.project.javamodel.IUserStory.class, cleon.sdp.spec.project.ProjectPackage.Planning_workItem);
  }

  public Planning setWorkItem(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sdp.spec.project.javamodel.IUserStory> workItem) {
    _setMap(cleon.sdp.spec.project.ProjectPackage.Planning_workItem, workItem);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptMap(cleon.sdp.spec.project.javamodel.IUserStory.class, cleon.sdp.spec.project.ProjectPackage.Planning_workItem, visitor);
  }

  // toMeRelations
  
  public static cleon.sdp.spec.project.javamodel.IPlanning selectToMeWorkItem(cleon.sdp.spec.project.javamodel.IUserStory object) {
    return _getToMeSingle(object.getRepository(), cleon.sdp.spec.project.javamodel.IPlanning.class, cleon.sdp.spec.project.ProjectPackage.Planning_workItem, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,28af8502-ff9c-11e4-ac0a-959b440f987f,PkRdUe1R9CgCHE+XzO0Gpjm2Nyo=] */
