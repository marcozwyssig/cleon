package cleon.deployment.devops.spec.release.type.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MsiArtefactType extends DynamicResource implements IMsiArtefactType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMsiArtefactType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMsiArtefactType>() {
    
    @Override
    public IMsiArtefactType create() {
      return new MsiArtefactType();
    }
    
    @Override
    public IMsiArtefactType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MsiArtefactType(resourceRepository, resource);
    }
  
  };

  public MsiArtefactType() {
    super(IMsiArtefactType.TYPE_ID);
  }
  
  public MsiArtefactType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMsiArtefactType.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MsiArtefactType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bc3dd6b4-3b4c-11e5-86bc-73aedc28563d,iR62foN3d45w5yFB/eSZBYt7pgE=] */
