package cleon.common.language.metamodel.spec.translation.description.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class MultilingualDescription extends DynamicResource implements IMultilingualDescription {

  // abstract implementation, only used for static method calls
  private MultilingualDescription() {
    super(IMultilingualDescription.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.language.metamodel.spec.translation.description.javamodel.IMultilingualDescription selectToMeDescriptionTranslation(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation object) {
    return _getToMeSingle(object.getRepository(), cleon.common.language.metamodel.spec.translation.description.javamodel.IMultilingualDescription.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a9e3052c-335e-11e8-a9fe-87ba35d8f5c4,mEHeHH5gvXQ4kd8OJYqYNlBvvh4=] */
