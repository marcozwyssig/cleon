package cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Cluster extends DynamicResource implements ICluster {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICluster> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICluster>() {
    
    @Override
    public ICluster create() {
      return new Cluster();
    }
    
    @Override
    public ICluster create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Cluster(resourceRepository, resource);
    }
  
  };

  public Cluster() {
    super(ICluster.TYPE_ID);
  }
  
  public Cluster(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICluster.TYPE_ID);
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

  public Cluster setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,edc49df2-6899-11e7-9be5-6dfce969ae4e,hIEBy+9MDpvXl5an8CGCDfOxBk8=] */
