package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.type.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DllArtefactType extends DynamicResource implements IDllArtefactType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDllArtefactType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDllArtefactType>() {
    
    @Override
    public IDllArtefactType create() {
      return new DllArtefactType();
    }
    
    @Override
    public IDllArtefactType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DllArtefactType(resourceRepository, resource);
    }
  
  };

  public DllArtefactType() {
    super(IDllArtefactType.TYPE_ID);
  }
  
  public DllArtefactType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDllArtefactType.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DllArtefactType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bc3dd6cf-3b4c-11e5-86bc-73aedc28563d,6TsaILciMO105DJfwukclAm3GRQ=] */
