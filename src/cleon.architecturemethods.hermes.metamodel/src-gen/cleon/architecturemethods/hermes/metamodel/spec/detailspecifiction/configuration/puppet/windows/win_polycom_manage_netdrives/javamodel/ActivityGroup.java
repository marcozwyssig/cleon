package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ActivityGroup extends DynamicResource implements IActivityGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivityGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivityGroup>() {
    
    @Override
    public IActivityGroup create() {
      return new ActivityGroup();
    }
    
    @Override
    public IActivityGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ActivityGroup(resourceRepository, resource);
    }
  
  };

  public ActivityGroup() {
    super(IActivityGroup.TYPE_ID);
  }
  
  public ActivityGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IActivityGroup.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.system.javamodel.IActivityPermission selectActivityPermission() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.system.javamodel.IActivityPermission.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.ActivityGroup_activityPermission);
  }

  public ActivityGroup setActivityPermission(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.system.javamodel.IActivityPermission activityPermission) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.ActivityGroup_activityPermission, activityPermission);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ActivityGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.system.javamodel.IActivityPermission.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.ActivityGroup_activityPermission, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IActivityGroup> selectToMeActivityPermission(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.system.javamodel.IActivityPermission object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IActivityGroup.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.ActivityGroup_activityPermission, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,afde3b77-07fe-11f0-bc12-1bbda1d7028e,TSCmU/2vc0UBOJLL9NScBt5vCHQ=] */
