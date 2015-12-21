package cleon.sdp.spec.projectmanagement.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DefectFeatureGroup extends DynamicResource implements IDefectFeatureGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDefectFeatureGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDefectFeatureGroup>() {
    
    @Override
    public IDefectFeatureGroup create() {
      return new DefectFeatureGroup();
    }
    
    @Override
    public IDefectFeatureGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DefectFeatureGroup(resourceRepository, resource);
    }
  
  };

  public DefectFeatureGroup() {
    super(IDefectFeatureGroup.TYPE_ID);
  }
  
  public DefectFeatureGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDefectFeatureGroup.TYPE_ID);
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
  public java.util.List<? extends cleon.sdp.spec.projectmanagement.backlog.defect.javamodel.IDefect> selectDefects() {
    return _getList(cleon.sdp.spec.projectmanagement.backlog.defect.javamodel.IDefect.class, cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.DefectFeatureGroup_defects);
  }

  public DefectFeatureGroup setDefects(java.util.List<? extends cleon.sdp.spec.projectmanagement.backlog.defect.javamodel.IDefect> defects) {
    _setList(cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.DefectFeatureGroup_defects, defects);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DefectFeatureGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sdp.spec.projectmanagement.backlog.javamodel.IWorkItem> selectWorkItems() {
    return _getList(cleon.sdp.spec.projectmanagement.backlog.javamodel.IWorkItem.class, cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.FeatureGroup_workItems);
  }

  public DefectFeatureGroup setWorkItems(java.util.List<? extends cleon.sdp.spec.projectmanagement.backlog.javamodel.IWorkItem> workItems) {
    _setList(cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.FeatureGroup_workItems, workItems);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.sdp.spec.projectmanagement.backlog.defect.javamodel.IDefect.class, cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.DefectFeatureGroup_defects, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.sdp.spec.projectmanagement.backlog.javamodel.IWorkItem.class, cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.FeatureGroup_workItems, visitor);
  }

  // toMeRelations
  
  public static cleon.sdp.spec.projectmanagement.backlog.javamodel.IDefectFeatureGroup selectToMeDefects(cleon.sdp.spec.projectmanagement.backlog.defect.javamodel.IDefect object) {
    return _getToMeSingle(object.getRepository(), cleon.sdp.spec.projectmanagement.backlog.javamodel.IDefectFeatureGroup.class, cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.DefectFeatureGroup_defects, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d243a7a6-369e-11e5-95d9-2b04d7ab02d9,VLd2lk2atVfCdyscmtocUj4RADI=] */
