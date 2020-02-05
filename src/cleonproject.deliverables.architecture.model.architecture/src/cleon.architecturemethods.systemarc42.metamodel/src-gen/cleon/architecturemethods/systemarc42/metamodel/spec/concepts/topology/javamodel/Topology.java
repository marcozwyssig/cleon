package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Topology extends DynamicResource implements ITopology {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITopology> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITopology>() {
    
    @Override
    public ITopology create() {
      return new Topology();
    }
    
    @Override
    public ITopology create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Topology(resourceRepository, resource);
    }
  
  };

  public Topology() {
    super(ITopology.TYPE_ID);
  }
  
  public Topology(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITopology.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopologyEnvironment> selectTopologyEnvironment() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopologyEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.Topology_topologyEnvironment);
  }

  public Topology setTopologyEnvironment(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopologyEnvironment> topologyEnvironment) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.Topology_topologyEnvironment, topologyEnvironment);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Topology setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopologyEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.Topology_topologyEnvironment, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology selectToMeTopologyEnvironment(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopologyEnvironment object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.Topology_topologyEnvironment, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fca3a39b-878a-11e9-a61b-279ebde48b48,TAp/+Ok987W8M8SCRuMLWtAn1ss=] */
