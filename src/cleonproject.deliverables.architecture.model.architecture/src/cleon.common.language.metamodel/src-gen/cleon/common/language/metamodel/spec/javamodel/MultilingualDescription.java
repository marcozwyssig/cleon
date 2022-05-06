package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class MultilingualDescription extends DynamicResource implements IMultilingualDescription {

  // abstract implementation, only used for static method calls
  private MultilingualDescription() {
    super(IMultilingualDescription.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.language.metamodel.spec.javamodel.IMultilingualDescription selectToMeTranslation(cleon.common.language.metamodel.spec.javamodel.ILanguageDescription object) {
    return _getToMeSingle(object.getRepository(), cleon.common.language.metamodel.spec.javamodel.IMultilingualDescription.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualDescription_translation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a9e3052c-335e-11e8-a9fe-87ba35d8f5c4,bqnm3hEZh2SmY85jk4Y5rR90dnc=] */
