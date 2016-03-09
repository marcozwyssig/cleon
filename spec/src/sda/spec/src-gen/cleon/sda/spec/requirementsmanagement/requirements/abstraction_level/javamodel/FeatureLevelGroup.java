package cleon.sda.spec.requirementsmanagement.requirements.abstraction_level.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FeatureLevelGroup extends DynamicResource implements IFeatureLevelGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFeatureLevelGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFeatureLevelGroup>() {
    
    @Override
    public IFeatureLevelGroup create() {
      return new FeatureLevelGroup();
    }
    
    @Override
    public IFeatureLevelGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FeatureLevelGroup(resourceRepository, resource);
    }
  
  };

  public FeatureLevelGroup() {
    super(IFeatureLevelGroup.TYPE_ID);
  }
  
  public FeatureLevelGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFeatureLevelGroup.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FeatureLevelGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0d2d83f3-a95c-11e5-bda2-a7fc3bd7c783,r5kUSg4PD4fnRlFAxJdAfwOvKzY=] */
