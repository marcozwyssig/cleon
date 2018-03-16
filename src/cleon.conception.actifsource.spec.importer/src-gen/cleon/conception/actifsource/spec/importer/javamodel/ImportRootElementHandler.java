package cleon.conception.actifsource.spec.importer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ImportRootElementHandler extends DynamicResource implements IImportRootElementHandler {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportRootElementHandler> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportRootElementHandler>() {
    
    @Override
    public IImportRootElementHandler create() {
      return new ImportRootElementHandler();
    }
    
    @Override
    public IImportRootElementHandler create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ImportRootElementHandler(resourceRepository, resource);
    }
  
  };

  public ImportRootElementHandler() {
    super(IImportRootElementHandler.TYPE_ID);
  }
  
  public ImportRootElementHandler(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImportRootElementHandler.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IAttribute selectDiscriminator() {
    return _getSingle(ch.actifsource.core.javamodel.IAttribute.class, cleon.conception.actifsource.spec.importer.ImporterPackage.AbstractOwnImportRelation_discriminator);
  }

  public ImportRootElementHandler setDiscriminator(ch.actifsource.core.javamodel.IAttribute discriminator) {
    _setSingle(cleon.conception.actifsource.spec.importer.ImporterPackage.AbstractOwnImportRelation_discriminator, discriminator);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.importer.javamodel.IImportClass> selectMapCls() {
    return _getMap(cleon.conception.actifsource.spec.importer.javamodel.IImportClass.class, cleon.conception.actifsource.spec.importer.ImporterPackage.AbstractOwnImportRelation_mapCls);
  }

  public ImportRootElementHandler setMapCls(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.importer.javamodel.IImportClass> mapCls) {
    _setMap(cleon.conception.actifsource.spec.importer.ImporterPackage.AbstractOwnImportRelation_mapCls, mapCls);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IOwnRelation selectRelation() {
    return _getSingle(ch.actifsource.core.javamodel.IOwnRelation.class, cleon.conception.actifsource.spec.importer.ImporterPackage.AbstractOwnImportRelation_relation);
  }

  public ImportRootElementHandler setRelation(ch.actifsource.core.javamodel.IOwnRelation relation) {
    _setSingle(cleon.conception.actifsource.spec.importer.ImporterPackage.AbstractOwnImportRelation_relation, relation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ImportRootElementHandler setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ImportRootElementHandler setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IAttribute.class, cleon.conception.actifsource.spec.importer.ImporterPackage.AbstractOwnImportRelation_discriminator, visitor);
    _acceptMap(cleon.conception.actifsource.spec.importer.javamodel.IImportClass.class, cleon.conception.actifsource.spec.importer.ImporterPackage.AbstractOwnImportRelation_mapCls, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IOwnRelation.class, cleon.conception.actifsource.spec.importer.ImporterPackage.AbstractOwnImportRelation_relation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9f8c2d4e-23a5-11e8-9237-83e9a2871328,DWNW9SSNink6tsksM7t+xirKhik=] */
