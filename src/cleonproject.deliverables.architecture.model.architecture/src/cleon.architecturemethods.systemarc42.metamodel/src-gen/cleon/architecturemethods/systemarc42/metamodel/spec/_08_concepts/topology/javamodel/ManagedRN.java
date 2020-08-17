package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ManagedRN extends DynamicResource implements IManagedRN {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManagedRN> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManagedRN>() {
    
    @Override
    public IManagedRN create() {
      return new ManagedRN();
    }
    
    @Override
    public IManagedRN create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ManagedRN(resourceRepository, resource);
    }
  
  };

  public ManagedRN() {
    super(IManagedRN.TYPE_ID);
  }
  
  public ManagedRN(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IManagedRN.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN> selectManagedHss() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.ManagedRN_managedHss);
  }

  public ManagedRN setManagedHss(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN> managedHss) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.ManagedRN_managedHss, managedHss);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITDM> selectManagedTDM() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITDM.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.ManagedRN_managedTDM);
  }

  public ManagedRN setManagedTDM(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITDM> managedTDM) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.ManagedRN_managedTDM, managedTDM);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN selectMss() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.ManagedRN_mss);
  }

  public ManagedRN setMss(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN mss) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.ManagedRN_mss, mss);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ManagedRN setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ManagedRN setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.ManagedRN_managedHss, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITDM.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.ManagedRN_managedTDM, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.ManagedRN_mss, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IManagedRN> selectToMeMss(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IManagedRN.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.ManagedRN_mss, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IManagedRN> selectToMeManagedHss(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IManagedRN.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.ManagedRN_managedHss, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IManagedRN> selectToMeManagedTDM(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITDM object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IManagedRN.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.ManagedRN_managedTDM, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e1de521f-e0b4-11ea-8443-8f528e21caa3,rb1INzV04v61aDzfj12LBMJW2BA=] */
