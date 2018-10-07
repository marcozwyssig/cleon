package cleon.applications.actifsource.spec.asrc2xml.javamodel;

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
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.ImportClass_class);
  }

  public ImportClass setClass(ch.actifsource.core.javamodel.IClass class_) {
    _setSingle(cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.ImportClass_class, class_);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportAssociation> selectMapAssoc() {
    return _getMap(cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportAssociation.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapAssoc);
  }

  public ImportClass setMapAssoc(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportAssociation> mapAssoc) {
    _setMap(cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapAssoc, mapAssoc);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.spec.asrc2xml.javamodel.IAbstractImportAttribute> selectMapAttr() {
    return _getMap(cleon.applications.actifsource.spec.asrc2xml.javamodel.IAbstractImportAttribute.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.ImportClass_mapAttr);
  }

  public ImportClass setMapAttr(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.spec.asrc2xml.javamodel.IAbstractImportAttribute> mapAttr) {
    _setMap(cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.ImportClass_mapAttr, mapAttr);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportOwnRelation> selectMapOwnRel() {
    return _getMap(cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportOwnRelation.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapOwnRel);
  }

  public ImportClass setMapOwnRel(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportOwnRelation> mapOwnRel) {
    _setMap(cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapOwnRel, mapOwnRel);
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
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.ImportClass_class, visitor);
    _acceptMap(cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportAssociation.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapAssoc, visitor);
    _acceptMap(cleon.applications.actifsource.spec.asrc2xml.javamodel.IAbstractImportAttribute.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.ImportClass_mapAttr, visitor);
    _acceptMap(cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportOwnRelation.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractImportClass_mapOwnRel, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportClass> selectToMeClass(ch.actifsource.core.javamodel.IClass object) {
    return _getToMeList(object.getRepository(), cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportClass.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.ImportClass_class, object.getResource());
  }
  
  public static cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportClass selectToMeMapAttr(cleon.applications.actifsource.spec.asrc2xml.javamodel.IAbstractImportAttribute object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportClass.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.ImportClass_mapAttr, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9f4f0c3f-2217-11e8-8247-038452bbec5f,+o8/EpKrFBK3aBYVoBmbfNb4byg=] */
