package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Domains extends DynamicResource implements IDomains {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDomains> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDomains>() {
    
    @Override
    public IDomains create() {
      return new Domains();
    }
    
    @Override
    public IDomains create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Domains(resourceRepository, resource);
    }
  
  };

  public Domains() {
    super(IDomains.TYPE_ID);
  }
  
  public Domains(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDomains.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain> selectDomains() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.DomainPackage.Domains_domains);
  }

  public Domains setDomains(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain> domains) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.DomainPackage.Domains_domains, domains);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Domains setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.DomainPackage.Domains_domains, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomains selectToMeDomains(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomains.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.DomainPackage.Domains_domains, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4d3ffd5b-d00e-11ea-b5a9-731249efa1a3,QNa8elDMMeLZMtOXI5NfOdWKUZ8=] */
