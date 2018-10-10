package cleon.architecturemethods.arc42.spec.devops.spec.release.type.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WspArtefactType extends DynamicResource implements IWspArtefactType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWspArtefactType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWspArtefactType>() {
    
    @Override
    public IWspArtefactType create() {
      return new WspArtefactType();
    }
    
    @Override
    public IWspArtefactType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WspArtefactType(resourceRepository, resource);
    }
  
  };

  public WspArtefactType() {
    super(IWspArtefactType.TYPE_ID);
  }
  
  public WspArtefactType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWspArtefactType.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WspArtefactType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bc3dd6bd-3b4c-11e5-86bc-73aedc28563d,QuLAEk9DUmIPbRJaGaKu6xm4MTc=] */
