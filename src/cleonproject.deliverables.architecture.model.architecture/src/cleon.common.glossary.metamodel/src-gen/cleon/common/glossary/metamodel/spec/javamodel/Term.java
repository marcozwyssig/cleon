package cleon.common.glossary.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Term extends DynamicResource implements ITerm {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITerm> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITerm>() {
    
    @Override
    public ITerm create() {
      return new Term();
    }
    
    @Override
    public ITerm create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Term(resourceRepository, resource);
    }
  
  };

  public Term() {
    super(ITerm.TYPE_ID);
  }
  
  public Term(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITerm.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
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
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.description.javamodel.ILanguageDescriptionTranslation> selectTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.description.DescriptionPackage.MultilingualDescription_translation);
  }

  public Term setTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.description.javamodel.ILanguageDescriptionTranslation> translation) {
    _setMap(cleon.common.language.metamodel.spec.description.DescriptionPackage.MultilingualDescription_translation, translation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Term setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptMap(cleon.common.language.metamodel.spec.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.description.DescriptionPackage.MultilingualDescription_translation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8781d59d-0c87-11e6-86c5-87a8b520dd59,7C27AuznEKng96OFNSlb6tQ86Pc=] */
