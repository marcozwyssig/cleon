package cleon.common.resources.spec.resources.list.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class GenericContextInnerListType extends DynamicResource implements IGenericContextInnerListType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGenericContextInnerListType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGenericContextInnerListType>() {
    
    @Override
    public IGenericContextInnerListType create() {
      return new GenericContextInnerListType();
    }
    
    @Override
    public IGenericContextInnerListType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new GenericContextInnerListType(resourceRepository, resource);
    }
  
  };

  public GenericContextInnerListType() {
    super(IGenericContextInnerListType.TYPE_ID);
  }
  
  public GenericContextInnerListType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGenericContextInnerListType.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public GenericContextInnerListType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,58498600-e9f6-11e8-9dfb-85981d867b8c,JIB9NGIePvljIkBVrqG9Mbku670=] */
