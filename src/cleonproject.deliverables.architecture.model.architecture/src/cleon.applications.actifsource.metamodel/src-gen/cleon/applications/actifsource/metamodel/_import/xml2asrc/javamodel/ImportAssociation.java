package cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ImportAssociation extends DynamicResource implements IImportAssociation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportAssociation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportAssociation>() {
    
    @Override
    public IImportAssociation create() {
      return new ImportAssociation();
    }
    
    @Override
    public IImportAssociation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ImportAssociation(resourceRepository, resource);
    }
  
  };

  public ImportAssociation() {
    super(IImportAssociation.TYPE_ID);
  }
  
  public ImportAssociation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImportAssociation.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectXmlref() {
    return _getSingleAttribute(java.lang.String.class, cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.ImportAssociation_xmlref);
  }
    
  public void setXmlref(java.lang.String xmlref) {
     _setSingleAttribute(cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.ImportAssociation_xmlref, xmlref);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IAssociation selectAssocation() {
    return _getSingle(ch.actifsource.core.javamodel.IAssociation.class, cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.ImportAssociation_assocation);
  }

  public ImportAssociation setAssocation(ch.actifsource.core.javamodel.IAssociation assocation) {
    _setSingle(cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.ImportAssociation_assocation, assocation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectObject() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.ImportAssociation_object);
  }

  public ImportAssociation setObject(ch.actifsource.core.javamodel.IResource object) {
    _setSingle(cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.ImportAssociation_object, object);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IRelation selectSelect() {
    return _getSingle(ch.actifsource.core.javamodel.IRelation.class, cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.ImportAssociation_select);
  }

  public ImportAssociation setSelect(ch.actifsource.core.javamodel.IRelation select) {
    _setSingle(cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.ImportAssociation_select, select);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ImportAssociation setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ImportAssociation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.ImportAssociation_xmlref, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IAssociation.class, cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.ImportAssociation_assocation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.ImportAssociation_object, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IRelation.class, cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.ImportAssociation_select, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IImportAssociation> selectToMeAssocation(ch.actifsource.core.javamodel.IAssociation object) {
    return _getToMeList(object.getRepository(), cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IImportAssociation.class, cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.ImportAssociation_assocation, object.getResource());
  }
  
  public static java.util.List<cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IImportAssociation> selectToMeObject(ch.actifsource.core.javamodel.IResource object) {
    return _getToMeList(object.getRepository(), cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IImportAssociation.class, cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.ImportAssociation_object, object.getResource());
  }
  
  public static java.util.List<cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IImportAssociation> selectToMeSelect(ch.actifsource.core.javamodel.IRelation object) {
    return _getToMeList(object.getRepository(), cleon.applications.actifsource.metamodel._import.xml2asrc.javamodel.IImportAssociation.class, cleon.applications.actifsource.metamodel._import.xml2asrc.Xml2asrcPackage.ImportAssociation_select, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5bd29123-26c1-11e8-a805-991f3ff583b7,x9eHwL1IPptKLsmezU9F84AtFL4=] */
