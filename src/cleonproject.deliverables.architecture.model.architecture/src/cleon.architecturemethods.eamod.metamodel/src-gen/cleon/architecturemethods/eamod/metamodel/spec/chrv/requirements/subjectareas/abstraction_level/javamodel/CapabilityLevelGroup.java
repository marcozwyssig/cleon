package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.abstraction_level.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CapabilityLevelGroup extends DynamicResource implements ICapabilityLevelGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapabilityLevelGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapabilityLevelGroup>() {
    
    @Override
    public ICapabilityLevelGroup create() {
      return new CapabilityLevelGroup();
    }
    
    @Override
    public ICapabilityLevelGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CapabilityLevelGroup(resourceRepository, resource);
    }
  
  };

  public CapabilityLevelGroup() {
    super(ICapabilityLevelGroup.TYPE_ID);
  }
  
  public CapabilityLevelGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICapabilityLevelGroup.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CapabilityLevelGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0895ab98-a95c-11e5-bda2-a7fc3bd7c783,vF0YbVyaER75W+old163Jpjef64=] */
