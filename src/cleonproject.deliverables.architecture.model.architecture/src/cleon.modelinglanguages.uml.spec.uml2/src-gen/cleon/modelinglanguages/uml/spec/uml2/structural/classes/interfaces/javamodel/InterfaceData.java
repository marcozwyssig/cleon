package cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InterfaceData extends DynamicResource implements IInterfaceData {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterfaceData> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterfaceData>() {
    
    @Override
    public IInterfaceData create() {
      return new InterfaceData();
    }
    
    @Override
    public IInterfaceData create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InterfaceData(resourceRepository, resource);
    }
  
  };

  public InterfaceData() {
    super(IInterfaceData.TYPE_ID);
  }
  
  public InterfaceData(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInterfaceData.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InterfaceData setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b88a9458-26c1-11e3-a71a-b71d2dda9f8e,c6batbm8c+IGFvvKOYrXLHi/dUM=] */
