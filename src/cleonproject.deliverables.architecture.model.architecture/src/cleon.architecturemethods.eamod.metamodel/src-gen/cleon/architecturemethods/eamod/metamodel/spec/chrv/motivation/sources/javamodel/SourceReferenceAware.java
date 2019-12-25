package cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SourceReferenceAware extends DynamicResource implements ISourceReferenceAware {

  // abstract implementation, only used for static method calls
  private SourceReferenceAware() {
    super(ISourceReferenceAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.sources.javamodel.ISourceReferenceAware selectToMeReferences(cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.sources.javamodel.ISourceReference object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.sources.javamodel.ISourceReferenceAware.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.sources.SourcesPackage.SourceReferenceAware_references, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,51e1e58c-ea67-11e8-8092-1f65b9544bbd,lKx2q5JLHzjCx5pWSdMiJNRCNjY=] */
