package cleon.sdp.spec.projectmanagement.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Backlog extends DynamicResource implements IBacklog {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBacklog> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBacklog>() {
    
    @Override
    public IBacklog create() {
      return new Backlog();
    }
    
    @Override
    public IBacklog create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Backlog(resourceRepository, resource);
    }
  
  };

  public Backlog() {
    super(IBacklog.TYPE_ID);
  }
  
  public Backlog(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBacklog.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.sdp.spec.projectmanagement.backlog.javamodel.IFeatureGroup> selectFeatureGroups() {
    return _getList(cleon.sdp.spec.projectmanagement.backlog.javamodel.IFeatureGroup.class, cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.Backlog_featureGroups);
  }

  public Backlog setFeatureGroups(java.util.List<? extends cleon.sdp.spec.projectmanagement.backlog.javamodel.IFeatureGroup> featureGroups) {
    _setList(cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.Backlog_featureGroups, featureGroups);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Backlog setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.sdp.spec.projectmanagement.backlog.javamodel.IFeatureGroup.class, cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.Backlog_featureGroups, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sdp.spec.projectmanagement.backlog.javamodel.IBacklog> selectToMeFeatureGroups(cleon.sdp.spec.projectmanagement.backlog.javamodel.IFeatureGroup object) {
    return _getToMeList(object.getRepository(), cleon.sdp.spec.projectmanagement.backlog.javamodel.IBacklog.class, cleon.sdp.spec.projectmanagement.backlog.BacklogPackage.Backlog_featureGroups, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,28af8502-ff9c-11e4-ac0a-959b440f987f,VW/GVnTHpoTLv37IftmsLR5rafU=] */
