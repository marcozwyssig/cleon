package cleon.initialization.projectmanagement.spec.resource.persons.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AuthorsAware extends DynamicResource implements IAuthorsAware {

  // abstract implementation, only used for static method calls
  private AuthorsAware() {
    super(IAuthorsAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IAuthorsAware> selectToMeAuthors(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IAuthorsAware.class, cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.AuthorsAware_authors, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bce16132-bff1-11e7-9dcc-23cb45d05890,Z1uNOBKWvop8s/T9PEyMXSCESRo=] */
