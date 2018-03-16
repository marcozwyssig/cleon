package cleon.conception.actifsource.spec.importer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ImportAttribute extends DynamicResource implements IImportAttribute {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportAttribute> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportAttribute>() {
    
    @Override
    public IImportAttribute create() {
      return new ImportAttribute();
    }
    
    @Override
    public IImportAttribute create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ImportAttribute(resourceRepository, resource);
    }
  
  };

  public ImportAttribute() {
    super(IImportAttribute.TYPE_ID);
  }
  
  public ImportAttribute(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImportAttribute.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IAttribute selectAttribute() {
    return _getSingle(ch.actifsource.core.javamodel.IAttribute.class, cleon.conception.actifsource.spec.importer.ImporterPackage.ImportAttribute_attribute);
  }

  public ImportAttribute setAttribute(ch.actifsource.core.javamodel.IAttribute attribute) {
    _setSingle(cleon.conception.actifsource.spec.importer.ImporterPackage.ImportAttribute_attribute, attribute);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ImportAttribute setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ImportAttribute setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IAttribute.class, cleon.conception.actifsource.spec.importer.ImporterPackage.ImportAttribute_attribute, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.actifsource.spec.importer.javamodel.IImportAttribute> selectToMeAttribute(ch.actifsource.core.javamodel.IAttribute object) {
    return _getToMeList(object.getRepository(), cleon.conception.actifsource.spec.importer.javamodel.IImportAttribute.class, cleon.conception.actifsource.spec.importer.ImporterPackage.ImportAttribute_attribute, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dbb8e1fa-221e-11e8-8749-cb7f4d6924d3,FqftwNgPtq4gVkip9JluBSfaPbc=] */
