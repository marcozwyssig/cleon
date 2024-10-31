package cleon.common.glossary.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class GlossaryAware extends DynamicResource implements IGlossaryAware {

  // abstract implementation, only used for static method calls
  private GlossaryAware() {
    super(IGlossaryAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.common.glossary.metamodel.spec.javamodel.IGlossaryAware> selectToMeGlossary(cleon.common.glossary.metamodel.spec.javamodel.IGlossary object) {
    return _getToMeList(object.getRepository(), cleon.common.glossary.metamodel.spec.javamodel.IGlossaryAware.class, cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,76a0d31a-4f09-11e6-a115-99fb8013e67b,IsFdPBTveXZrjogJnC5h9ytW2eo=] */
