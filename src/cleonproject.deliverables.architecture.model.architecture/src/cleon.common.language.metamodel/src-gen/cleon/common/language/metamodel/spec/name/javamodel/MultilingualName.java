package cleon.common.language.metamodel.spec.name.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class MultilingualName extends DynamicResource implements IMultilingualName {

  // abstract implementation, only used for static method calls
  private MultilingualName() {
    super(IMultilingualName.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.language.metamodel.spec.name.javamodel.IMultilingualName selectToMeTranslation(cleon.common.language.metamodel.spec.name.javamodel.ILanguageNameTranslation object) {
    return _getToMeSingle(object.getRepository(), cleon.common.language.metamodel.spec.name.javamodel.IMultilingualName.class, cleon.common.language.metamodel.spec.name.NamePackage.MultilingualName_translation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1564455b-3360-11e8-a9fe-87ba35d8f5c4,xBjMmlZsVvG6zSqWw6GUXw4rXTo=] */
