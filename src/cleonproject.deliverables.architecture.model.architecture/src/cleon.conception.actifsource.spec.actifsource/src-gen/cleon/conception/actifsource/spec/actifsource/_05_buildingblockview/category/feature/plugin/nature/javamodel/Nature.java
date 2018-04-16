package cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.nature.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Nature extends DynamicResource implements INature {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INature> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INature>() {
    
    @Override
    public INature create() {
      return new Nature();
    }
    
    @Override
    public INature create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Nature(resourceRepository, resource);
    }
  
  };

  public Nature() {
    super(INature.TYPE_ID);
  }
  
  public Nature(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INature.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Nature setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c6ee893a-3fd7-11e8-bd50-b94594551673,rX/8ZHN4hQ9Gll6tiPrm4Bd3cTk=] */
