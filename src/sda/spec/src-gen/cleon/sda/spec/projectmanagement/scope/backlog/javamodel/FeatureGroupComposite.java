package cleon.sda.spec.projectmanagement.scope.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FeatureGroupComposite extends DynamicResource implements IFeatureGroupComposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFeatureGroupComposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFeatureGroupComposite>() {
    
    @Override
    public IFeatureGroupComposite create() {
      return new FeatureGroupComposite();
    }
    
    @Override
    public IFeatureGroupComposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FeatureGroupComposite(resourceRepository, resource);
    }
  
  };

  public FeatureGroupComposite() {
    super(IFeatureGroupComposite.TYPE_ID);
  }
  
  public FeatureGroupComposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFeatureGroupComposite.TYPE_ID);
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
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IFeatureGroup> selectSubfeatureGroup() {
    return _getList(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.FeatureGroupComposite_subfeatureGroup);
  }

  public FeatureGroupComposite setSubfeatureGroup(java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IFeatureGroup> subfeatureGroup) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.FeatureGroupComposite_subfeatureGroup, subfeatureGroup);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FeatureGroupComposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem> selectWorkItems() {
    return _getList(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.FeatureGroup_workItems);
  }

  public FeatureGroupComposite setWorkItems(java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem> workItems) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.FeatureGroup_workItems, workItems);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.FeatureGroupComposite_subfeatureGroup, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.FeatureGroup_workItems, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IFeatureGroupComposite selectToMeSubfeatureGroup(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IFeatureGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IFeatureGroupComposite.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.FeatureGroupComposite_subfeatureGroup, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,66562d7f-369c-11e5-95d9-2b04d7ab02d9,6goil0HZkBE4GdyonwaLk41QB5I=] */
