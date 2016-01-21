package cleon.sda.spec.projectmanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ProjectDocument extends DynamicResource implements IProjectDocument {

  // abstract implementation, only used for static method calls
  private ProjectDocument() {
    super(IProjectDocument.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7212c4ba-ba84-11e5-b56d-4f524d402f4b,2AAQBQVenLbkkIaHDgpo6ZrfH5c=] */
