package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class MultilingualName extends DynamicResource implements IMultilingualName {

  // abstract implementation, only used for static method calls
  private MultilingualName() {
    super(IMultilingualName.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.language.metamodel.spec.javamodel.IMultilingualName selectToMeDefaultName(cleon.common.language.metamodel.spec.javamodel.ILanguageName object) {
    return _getToMeSingle(object.getRepository(), cleon.common.language.metamodel.spec.javamodel.IMultilingualName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_defaultName, object.getResource());
  }
  
  public static cleon.common.language.metamodel.spec.javamodel.IMultilingualName selectToMeNames(cleon.common.language.metamodel.spec.javamodel.ILanguageName object) {
    return _getToMeSingle(object.getRepository(), cleon.common.language.metamodel.spec.javamodel.IMultilingualName.class, cleon.common.language.metamodel.spec.SpecPackage.MultilingualName_names, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1564455b-3360-11e8-a9fe-87ba35d8f5c4,ZgmfI9KtAA5Dh5DxSh4stCng9Q0=] */
