package cleon.sda.spec.projectmanagement.scope.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FunctionalFeatureGroup extends DynamicResource implements IFunctionalFeatureGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionalFeatureGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionalFeatureGroup>() {
    
    @Override
    public IFunctionalFeatureGroup create() {
      return new FunctionalFeatureGroup();
    }
    
    @Override
    public IFunctionalFeatureGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FunctionalFeatureGroup(resourceRepository, resource);
    }
  
  };

  public FunctionalFeatureGroup() {
    super(IFunctionalFeatureGroup.TYPE_ID);
  }
  
  public FunctionalFeatureGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFunctionalFeatureGroup.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FunctionalFeatureGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IUserStory> selectWorkItems() {
    return _getList(cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IUserStory.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.FunctionalFeatureGroup_workItems);
  }

  public FunctionalFeatureGroup setWorkItems(java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IUserStory> workItems) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.FunctionalFeatureGroup_workItems, workItems);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IUserStory.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.FunctionalFeatureGroup_workItems, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IFunctionalFeatureGroup selectToMeWorkItems(cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel.IUserStory object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IFunctionalFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.FunctionalFeatureGroup_workItems, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,89e4b111-3777-11e5-95d9-2b04d7ab02d9,yM+YARp5TEdBgbCFTIriEytry7k=] */
