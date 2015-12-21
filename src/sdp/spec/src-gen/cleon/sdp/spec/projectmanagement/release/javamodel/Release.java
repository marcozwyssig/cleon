package cleon.sdp.spec.projectmanagement.release.javamodel;

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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.sdp.spec.projectmanagement.release.javamodel.ITimePlan> selectRelease() {
    return _getList(cleon.sdp.spec.projectmanagement.release.javamodel.ITimePlan.class, cleon.sdp.spec.projectmanagement.release.ReleasePackage.Release_release);
  }

  public Release setRelease(java.util.List<? extends cleon.sdp.spec.projectmanagement.release.javamodel.ITimePlan> release) {
    _setList(cleon.sdp.spec.projectmanagement.release.ReleasePackage.Release_release, release);
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
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.sdp.spec.projectmanagement.release.javamodel.ITimePlan.class, cleon.sdp.spec.projectmanagement.release.ReleasePackage.Release_release, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sdp.spec.projectmanagement.release.javamodel.IRelease selectToMeRelease(cleon.sdp.spec.projectmanagement.release.javamodel.ITimePlan object) {
    return _getToMeSingle(object.getRepository(), cleon.sdp.spec.projectmanagement.release.javamodel.IRelease.class, cleon.sdp.spec.projectmanagement.release.ReleasePackage.Release_release, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2755120c-3761-11e5-95d9-2b04d7ab02d9,OqGSbjujg6ANFZLjGFD46GMTTUY=] */
