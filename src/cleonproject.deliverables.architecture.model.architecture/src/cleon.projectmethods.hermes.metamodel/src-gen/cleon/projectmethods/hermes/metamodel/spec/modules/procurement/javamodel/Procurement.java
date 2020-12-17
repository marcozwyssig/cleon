package cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Procurement extends DynamicResource implements IProcurement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProcurement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProcurement>() {
    
    @Override
    public IProcurement create() {
      return new Procurement();
    }
    
    @Override
    public IProcurement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Procurement(resourceRepository, resource);
    }
  
  };

  public Procurement() {
    super(IProcurement.TYPE_ID);
  }
  
  public Procurement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProcurement.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IContract> selectContracts() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IContract.class, cleon.projectmethods.hermes.metamodel.spec.modules.procurement.ProcurementPackage.Procurement_contracts);
  }

  public Procurement setContracts(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IContract> contracts) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.procurement.ProcurementPackage.Procurement_contracts, contracts);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Procurement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IContract.class, cleon.projectmethods.hermes.metamodel.spec.modules.procurement.ProcurementPackage.Procurement_contracts, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IProcurement selectToMeContracts(cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IContract object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IProcurement.class, cleon.projectmethods.hermes.metamodel.spec.modules.procurement.ProcurementPackage.Procurement_contracts, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b4733279-4058-11eb-aaa9-61838d129c8c,oLiOepkGbxhAopnvq7WkzkpQ0Wg=] */
