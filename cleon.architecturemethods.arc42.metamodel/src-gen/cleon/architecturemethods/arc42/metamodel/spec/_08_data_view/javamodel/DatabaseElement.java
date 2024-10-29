package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DatabaseElement extends DynamicResource implements IDatabaseElement {

  // abstract implementation, only used for static method calls
  private DatabaseElement() {
    super(IDatabaseElement.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7027282b-e133-11ee-995f-5faf5f77d478,l9ad4Qv2rRMOj3Y80T7T2WUQxxg=] */
