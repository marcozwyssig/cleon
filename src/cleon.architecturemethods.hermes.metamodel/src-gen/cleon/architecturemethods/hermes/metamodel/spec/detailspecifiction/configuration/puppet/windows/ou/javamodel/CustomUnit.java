package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.ou.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CustomUnit extends DynamicResource implements ICustomUnit {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICustomUnit> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICustomUnit>() {
    
    @Override
    public ICustomUnit create() {
      return new CustomUnit();
    }
    
    @Override
    public ICustomUnit create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CustomUnit(resourceRepository, resource);
    }
  
  };

  public CustomUnit() {
    super(ICustomUnit.TYPE_ID);
  }
  
  public CustomUnit(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICustomUnit.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CustomUnit setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9159c3d1-05af-11f0-a7b1-53303e9b84a9,2Jyd6R15+DwZhbtNc4Bugw3Aqb0=] */
