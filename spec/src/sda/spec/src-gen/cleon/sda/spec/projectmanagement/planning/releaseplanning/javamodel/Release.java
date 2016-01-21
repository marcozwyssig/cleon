package cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Release extends DynamicResource implements IRelease {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRelease> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRelease>() {
    
    @Override
    public IRelease create() {
      return new Release();
    }
    
    @Override
    public IRelease create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Release(resourceRepository, resource);
    }
  
  };

  public Release() {
    super(IRelease.TYPE_ID);
  }
  
  public Release(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRelease.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.Date selectEnd() {
    return _getSingleAttribute(java.util.Date.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_end);
  }
    
  public void setEnd(java.util.Date end) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_end, end);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.util.Date selectStart() {
    return _getSingleAttribute(java.util.Date.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_start);
  }
    
  public void setStart(java.util.Date start) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_start, start);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint> selectSprints() {
    return _getList(cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.Release_sprints);
  }

  public Release setSprints(java.util.List<? extends cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint> sprints) {
    _setList(cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.Release_sprints, sprints);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Release setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.util.Date.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_end, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.util.Date.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_start, visitor);
    // relations
    _acceptList(cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.Release_sprints, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.IRelease selectToMeSprints(cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.IRelease.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.Release_sprints, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2755120c-3761-11e5-95d9-2b04d7ab02d9,LnRAciJLNpTV1ULgrP7siQ2V6aw=] */
