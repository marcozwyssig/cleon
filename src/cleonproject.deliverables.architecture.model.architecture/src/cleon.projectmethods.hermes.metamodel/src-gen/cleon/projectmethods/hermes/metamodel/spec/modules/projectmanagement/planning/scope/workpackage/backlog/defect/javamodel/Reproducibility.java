package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.defect.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Reproducibility extends DynamicResource implements IReproducibility {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IReproducibility> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IReproducibility>() {
    
    @Override
    public IReproducibility create() {
      return new Reproducibility();
    }
    
    @Override
    public IReproducibility create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Reproducibility(resourceRepository, resource);
    }
  
  };

  public Reproducibility() {
    super(IReproducibility.TYPE_ID);
  }
  
  public Reproducibility(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IReproducibility.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectReproduce() {
    return _getListAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.defect.DefectPackage.Reproducibility_reproduce);
  }
    
  public void setReproduce(java.util.List<java.lang.String> reproduce) {
     _setListAttribute(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.defect.DefectPackage.Reproducibility_reproduce, reproduce);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Reproducibility setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.defect.DefectPackage.Reproducibility_reproduce, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f0b01183-36b1-11e5-95d9-2b04d7ab02d9,aFfSQPmQ11v3zpcqiHO+Oyo6lW4=] */
