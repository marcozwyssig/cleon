package cleon.sda.spec.projectmanagement.scope.backlog.javamodel;

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
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IFeatureGroup> selectFeatureGroups() {
    return _getList(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Backlog_featureGroups);
  }

  public Backlog setFeatureGroups(java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IFeatureGroup> featureGroups) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Backlog_featureGroups, featureGroups);
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
    _acceptList(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Backlog_featureGroups, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog> selectToMeFeatureGroups(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IFeatureGroup object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Backlog_featureGroups, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,28af8502-ff9c-11e4-ac0a-959b440f987f,CZAWJQGRpwjzFWE1oUykAX5KIPg=] */
