package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Mime extends DynamicResource implements IMime {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMime> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMime>() {
    
    @Override
    public IMime create() {
      return new Mime();
    }
    
    @Override
    public IMime create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Mime(resourceRepository, resource);
    }
  
  };

  public Mime() {
    super(IMime.TYPE_ID);
  }
  
  public Mime(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMime.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectMime() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.Mime_mime);
  }
    
  public void setMime(java.lang.String mime) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.Mime_mime, mime);
  }

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

  public Mime setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_iis.Win_polycom_iisPackage.Mime_mime, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4a8d4bce-115d-11f0-a4f9-b5f995a9e0fe,4fOryNf3rGzrODqUujosn0TPsnc=] */
