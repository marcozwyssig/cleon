package cleon.conception.actifsource.spec.importer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ImportClass extends DynamicResource implements IImportClass {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportClass> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportClass>() {
    
    @Override
    public IImportClass create() {
      return new ImportClass();
    }
    
    @Override
    public IImportClass create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ImportClass(resourceRepository, resource);
    }
  
  };

  public ImportClass() {
    super(IImportClass.TYPE_ID);
  }
  
  public ImportClass(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImportClass.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectClass() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_class);
  }

  public ImportClass setClass(ch.actifsource.core.javamodel.IClass class_) {
    _setSingle(cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_class, class_);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.importer.javamodel.IImportAssociation> selectMapAssoc() {
    return _getMap(cleon.conception.actifsource.spec.importer.javamodel.IImportAssociation.class, cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_mapAssoc);
  }

  public ImportClass setMapAssoc(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.importer.javamodel.IImportAssociation> mapAssoc) {
    _setMap(cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_mapAssoc, mapAssoc);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.importer.javamodel.IImportAttribute> selectMapAttr() {
    return _getMap(cleon.conception.actifsource.spec.importer.javamodel.IImportAttribute.class, cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_mapAttr);
  }

  public ImportClass setMapAttr(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.importer.javamodel.IImportAttribute> mapAttr) {
    _setMap(cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_mapAttr, mapAttr);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.importer.javamodel.IImportOwnRelation> selectMapOwnRel() {
    return _getMap(cleon.conception.actifsource.spec.importer.javamodel.IImportOwnRelation.class, cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_mapOwnRel);
  }

  public ImportClass setMapOwnRel(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.actifsource.spec.importer.javamodel.IImportOwnRelation> mapOwnRel) {
    _setMap(cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_mapOwnRel, mapOwnRel);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ImportClass setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ImportClass setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_class, visitor);
    _acceptMap(cleon.conception.actifsource.spec.importer.javamodel.IImportAssociation.class, cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_mapAssoc, visitor);
    _acceptMap(cleon.conception.actifsource.spec.importer.javamodel.IImportAttribute.class, cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_mapAttr, visitor);
    _acceptMap(cleon.conception.actifsource.spec.importer.javamodel.IImportOwnRelation.class, cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_mapOwnRel, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.actifsource.spec.importer.javamodel.IImportClass> selectToMeClass(ch.actifsource.core.javamodel.IClass object) {
    return _getToMeList(object.getRepository(), cleon.conception.actifsource.spec.importer.javamodel.IImportClass.class, cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_class, object.getResource());
  }
  
  public static cleon.conception.actifsource.spec.importer.javamodel.IImportClass selectToMeMapAttr(cleon.conception.actifsource.spec.importer.javamodel.IImportAttribute object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.importer.javamodel.IImportClass.class, cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_mapAttr, object.getResource());
  }
  
  public static cleon.conception.actifsource.spec.importer.javamodel.IImportClass selectToMeMapOwnRel(cleon.conception.actifsource.spec.importer.javamodel.IImportOwnRelation object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.importer.javamodel.IImportClass.class, cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_mapOwnRel, object.getResource());
  }
  
  public static cleon.conception.actifsource.spec.importer.javamodel.IImportClass selectToMeMapAssoc(cleon.conception.actifsource.spec.importer.javamodel.IImportAssociation object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.importer.javamodel.IImportClass.class, cleon.conception.actifsource.spec.importer.ImporterPackage.ImportClass_mapAssoc, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9f4f0c3f-2217-11e8-8247-038452bbec5f,WNI7xlgPtP962RBgb9lKANHksMk=] */
