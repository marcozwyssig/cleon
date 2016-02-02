package cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Source extends DynamicResource implements ISource {

  // abstract implementation, only used for static method calls
  private Source() {
    super(ISource.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource selectToMeComposites(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource.class, cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.Source_composites, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3b2b59c5-a951-11e5-bda2-a7fc3bd7c783,8tS/q84iuIIM9w2wrTpVd9kHaF0=] */
