package cleon.sdp.spec.projectmanagement.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NonFunctionalFeatureGroup extends DynamicResource implements INonFunctionalFeatureGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INonFunctionalFeatureGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INonFunctionalFeatureGroup>() {
    
    @Override
    public INonFunctionalFeatureGroup create() {
      return new NonFunctionalFeatureGroup();
    }
    
    @Override
    public INonFunctionalFeatureGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NonFunctionalFeatureGroup(resourceRepository, resource);
    }
  
  };

  public NonFunctionalFeatureGroup() {
    super(INonFunctionalFeatureGroup.TYPE_ID);
  }
  
  public NonFunctionalFeatureGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INonFunctionalFeatureGroup.TYPE_ID);
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
  public java.util.List<? extends cleon.sdp.spec.projectmanagement.backlog.story.javamodel.IConstraint> selectConstraints() {
    return _getList(cleon.sdp.spec.projectmanagement.backlog.story.javamodel.IConstraint.class, cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.NonFunctionalFeatureGroup_constraints);
  }

  public NonFunctionalFeatureGroup setConstraints(java.util.List<? extends cleon.sdp.spec.projectmanagement.backlog.story.javamodel.IConstraint> constraints) {
    _setList(cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.NonFunctionalFeatureGroup_constraints, constraints);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NonFunctionalFeatureGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sdp.spec.projectmanagement.backlog.javamodel.IWorkItem> selectWorkItems() {
    return _getList(cleon.sdp.spec.projectmanagement.backlog.javamodel.IWorkItem.class, cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.FeatureGroup_workItems);
  }

  public NonFunctionalFeatureGroup setWorkItems(java.util.List<? extends cleon.sdp.spec.projectmanagement.backlog.javamodel.IWorkItem> workItems) {
    _setList(cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.FeatureGroup_workItems, workItems);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.sdp.spec.projectmanagement.backlog.story.javamodel.IConstraint.class, cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.NonFunctionalFeatureGroup_constraints, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.sdp.spec.projectmanagement.backlog.javamodel.IWorkItem.class, cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.FeatureGroup_workItems, visitor);
  }

  // toMeRelations
  
  public static cleon.sdp.spec.projectmanagement.backlog.javamodel.INonFunctionalFeatureGroup selectToMeConstraints(cleon.sdp.spec.projectmanagement.backlog.story.javamodel.IConstraint object) {
    return _getToMeSingle(object.getRepository(), cleon.sdp.spec.projectmanagement.backlog.javamodel.INonFunctionalFeatureGroup.class, cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.NonFunctionalFeatureGroup_constraints, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8f5ab315-3777-11e5-95d9-2b04d7ab02d9,873Ep9VOqynizY0YIfvzVYN0PZ0=] */
