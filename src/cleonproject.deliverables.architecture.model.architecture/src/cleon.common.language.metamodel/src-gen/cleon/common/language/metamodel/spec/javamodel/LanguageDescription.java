package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class LanguageDescription extends DynamicResource implements ILanguageDescription {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguageDescription> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILanguageDescription>() {
    
    @Override
    public ILanguageDescription create() {
      return new LanguageDescription();
    }
    
    @Override
    public ILanguageDescription create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new LanguageDescription(resourceRepository, resource);
    }
  
  };

  public LanguageDescription() {
    super(ILanguageDescription.TYPE_ID);
  }
  
  public LanguageDescription(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILanguageDescription.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.common.language.metamodel.spec.javamodel.ILanguage selectLanguage() {
    return _getSingle(cleon.common.language.metamodel.spec.javamodel.ILanguage.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageDescription_language);
  }

  public LanguageDescription setLanguage(cleon.common.language.metamodel.spec.javamodel.ILanguage language) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.LanguageDescription_language, language);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public LanguageDescription setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public LanguageDescription setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.common.language.metamodel.spec.javamodel.ILanguage.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageDescription_language, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.common.language.metamodel.spec.javamodel.ILanguageDescription> selectToMeLanguage(cleon.common.language.metamodel.spec.javamodel.ILanguage object) {
    return _getToMeList(object.getRepository(), cleon.common.language.metamodel.spec.javamodel.ILanguageDescription.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageDescription_language, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d03edb49-335f-11e8-a9fe-87ba35d8f5c4,djZR87RVqoezu0OKHCi9Pi2/JiQ=] */
