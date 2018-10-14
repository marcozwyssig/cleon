package cleon.initialization.projectmanagement.spec.steering.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Steering extends DynamicResource implements ISteering {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISteering> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISteering>() {
    
    @Override
    public ISteering create() {
      return new Steering();
    }
    
    @Override
    public ISteering create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Steering(resourceRepository, resource);
    }
  
  };

  public Steering() {
    super(ISteering.TYPE_ID);
  }
  
  public Steering(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISteering.TYPE_ID);
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
  public cleon.initialization.projectmanagement.spec.steering.controlling.javamodel.IControlling selectControlling() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.controlling.javamodel.IControlling.class, cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_controlling);
  }

  public Steering setControlling(cleon.initialization.projectmanagement.spec.steering.controlling.javamodel.IControlling controlling) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_controlling, controlling);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.steering.impediments.javamodel.IImpediments selectImpediments() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.impediments.javamodel.IImpediments.class, cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_impediments);
  }

  public Steering setImpediments(cleon.initialization.projectmanagement.spec.steering.impediments.javamodel.IImpediments impediments) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_impediments, impediments);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanning selectPlanning() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanning.class, cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_planning);
  }

  public Steering setPlanning(cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanning planning) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_planning, planning);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRisknanagement selectRisks() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRisknanagement.class, cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_risks);
  }

  public Steering setRisks(cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRisknanagement risks) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_risks, risks);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Steering setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.controlling.javamodel.IControlling.class, cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_controlling, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.impediments.javamodel.IImpediments.class, cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_impediments, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanning.class, cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_planning, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRisknanagement.class, cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_risks, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.steering.javamodel.ISteering selectToMeRisks(cleon.initialization.projectmanagement.spec.steering.riskmanagement.javamodel.IRisknanagement object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.javamodel.ISteering.class, cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_risks, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.steering.javamodel.ISteering selectToMeControlling(cleon.initialization.projectmanagement.spec.steering.controlling.javamodel.IControlling object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.javamodel.ISteering.class, cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_controlling, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.steering.javamodel.ISteering selectToMeImpediments(cleon.initialization.projectmanagement.spec.steering.impediments.javamodel.IImpediments object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.javamodel.ISteering.class, cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_impediments, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.steering.javamodel.ISteering selectToMePlanning(cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanning object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.javamodel.ISteering.class, cleon.initialization.projectmanagement.spec.steering.SteeringPackage.Steering_planning, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,08ac260a-bdf7-11e6-a3f0-c7681ee45a3f,B/Ib+Y5wCcz3fyiytvyE6SyCzp8=] */
