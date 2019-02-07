package cleon.modelinglanguages.graph.spec.graphviz.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Graph extends DynamicResource implements IGraph {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGraph> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGraph>() {
    
    @Override
    public IGraph create() {
      return new Graph();
    }
    
    @Override
    public IGraph create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Graph(resourceRepository, resource);
    }
  
  };

  public Graph() {
    super(IGraph.TYPE_ID);
  }
  
  public Graph(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGraph.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Graph setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9337d174-2aca-11e9-b83f-8be423c00623,0H2xP4j1jOOgzjVH9vPeWoKAszI=] */
