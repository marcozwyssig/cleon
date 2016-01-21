package cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Sprint extends DynamicResource implements ISprint {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprint> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprint>() {
    
    @Override
    public ISprint create() {
      return new Sprint();
    }
    
    @Override
    public ISprint create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Sprint(resourceRepository, resource);
    }
  
  };

  public Sprint() {
    super(ISprint.TYPE_ID);
  }
  
  public Sprint(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISprint.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, identifier);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Sprint setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.util.Date.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_end, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.util.Date.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_start, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,46c6145c-3761-11e5-95d9-2b04d7ab02d9,qppKG56qbBSFP1gfqr6APizyNik=] */
