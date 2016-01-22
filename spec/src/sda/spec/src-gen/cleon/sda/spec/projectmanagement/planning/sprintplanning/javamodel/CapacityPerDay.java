package cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CapacityPerDay extends DynamicResource implements ICapacityPerDay {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapacityPerDay> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapacityPerDay>() {
    
    @Override
    public ICapacityPerDay create() {
      return new CapacityPerDay();
    }
    
    @Override
    public ICapacityPerDay create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CapacityPerDay(resourceRepository, resource);
    }
  
  };

  public CapacityPerDay() {
    super(ICapacityPerDay.TYPE_ID);
  }
  
  public CapacityPerDay(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICapacityPerDay.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CapacityPerDay setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cd28fab0-c0d5-11e5-8f91-3dfd9b379121,gWRgaIWTVshIMiXkfbr/h6N5Clw=] */
