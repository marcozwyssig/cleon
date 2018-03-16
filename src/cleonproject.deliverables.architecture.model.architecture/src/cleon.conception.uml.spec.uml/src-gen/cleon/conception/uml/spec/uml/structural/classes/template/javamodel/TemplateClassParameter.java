package cleon.conception.uml.spec.uml.structural.classes.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TemplateClassParameter extends DynamicResource implements ITemplateClassParameter {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITemplateClassParameter> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITemplateClassParameter>() {
    
    @Override
    public ITemplateClassParameter create() {
      return new TemplateClassParameter();
    }
    
    @Override
    public ITemplateClassParameter create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TemplateClassParameter(resourceRepository, resource);
    }
  
  };

  public TemplateClassParameter() {
    super(ITemplateClassParameter.TYPE_ID);
  }
  
  public TemplateClassParameter(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITemplateClassParameter.TYPE_ID);
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

  public TemplateClassParameter setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,50dae04c-a3bb-11e3-8095-f11af53ab806,Ej6v1c3zQZazAxMoZPJgmGfoEZY=] */
