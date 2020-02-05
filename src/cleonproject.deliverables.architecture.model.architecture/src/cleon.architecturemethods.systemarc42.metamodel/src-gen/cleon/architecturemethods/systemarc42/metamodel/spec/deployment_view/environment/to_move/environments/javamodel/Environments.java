package cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Environments extends DynamicResource implements IEnvironments {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnvironments> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnvironments>() {
    
    @Override
    public IEnvironments create() {
      return new Environments();
    }
    
    @Override
    public IEnvironments create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Environments(resourceRepository, resource);
    }
  
  };

  public Environments() {
    super(IEnvironments.TYPE_ID);
  }
  
  public Environments(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnvironments.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel.IEnvironment> selectEnvironments_to_move() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel.IEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.EnvironmentsPackage.Environments_environments_aE_to_aE_move);
  }

  public Environments setEnvironments_to_move(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel.IEnvironment> environments_to_move) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.EnvironmentsPackage.Environments_environments_aE_to_aE_move, environments_to_move);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Environments setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel.IEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.EnvironmentsPackage.Environments_environments_aE_to_aE_move, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel.IEnvironments selectToMeEnvironments_to_move(cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel.IEnvironment object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel.IEnvironments.class, cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.EnvironmentsPackage.Environments_environments_aE_to_aE_move, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,531927b6-053e-11ea-b1c2-9163c84d2612,QOHWHi0PH2qIGc+Z5K/95cglPhQ=] */
