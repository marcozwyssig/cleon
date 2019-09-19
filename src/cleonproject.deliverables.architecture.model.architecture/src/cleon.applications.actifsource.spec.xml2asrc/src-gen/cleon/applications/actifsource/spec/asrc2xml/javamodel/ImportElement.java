package cleon.applications.actifsource.spec.asrc2xml.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ImportElement extends DynamicResource implements IImportElement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportElement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportElement>() {
    
    @Override
    public IImportElement create() {
      return new ImportElement();
    }
    
    @Override
    public IImportElement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ImportElement(resourceRepository, resource);
    }
  
  };

  public ImportElement() {
    super(IImportElement.TYPE_ID);
  }
  
  public ImportElement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImportElement.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectXml__S_name() {
    return _getSingleAttribute(java.lang.String.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractImportAttribute_xml__S_name);
  }
    
  public void setXml__S_name(java.lang.String xml__S_name) {
     _setSingleAttribute(cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractImportAttribute_xml__S_name, xml__S_name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IAttribute selectAttribute() {
    return _getSingle(ch.actifsource.core.javamodel.IAttribute.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractImportAttribute_attribute);
  }

  public ImportElement setAttribute(ch.actifsource.core.javamodel.IAttribute attribute) {
    _setSingle(cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractImportAttribute_attribute, attribute);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ImportElement setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ImportElement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractImportAttribute_xml__S_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IAttribute.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractImportAttribute_attribute, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5ef37ed7-3292-11e8-925e-0378e2266aa0,JyCFp901eqhTmyi+g4wVXyYVbds=] */
