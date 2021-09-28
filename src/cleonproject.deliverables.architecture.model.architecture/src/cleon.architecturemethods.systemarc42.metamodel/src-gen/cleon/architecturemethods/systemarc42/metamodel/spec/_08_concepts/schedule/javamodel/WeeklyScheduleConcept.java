package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.schedule.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WeeklyScheduleConcept extends DynamicResource implements IWeeklyScheduleConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWeeklyScheduleConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWeeklyScheduleConcept>() {
    
    @Override
    public IWeeklyScheduleConcept create() {
      return new WeeklyScheduleConcept();
    }
    
    @Override
    public IWeeklyScheduleConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WeeklyScheduleConcept(resourceRepository, resource);
    }
  
  };

  public WeeklyScheduleConcept() {
    super(IWeeklyScheduleConcept.TYPE_ID);
  }
  
  public WeeklyScheduleConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWeeklyScheduleConcept.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WeeklyScheduleConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ff539162-1f89-11ec-a206-f571806bf8d3,7lJRd8PLByAu25n3w0lec7Ucup4=] */
