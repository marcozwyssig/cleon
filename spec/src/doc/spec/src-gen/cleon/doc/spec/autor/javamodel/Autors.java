package cleon.doc.spec.autor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Autors extends DynamicResource implements IAutors {

  // abstract implementation, only used for static method calls
  private Autors() {
    super(IAutors.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.doc.spec.autor.javamodel.IAutors> selectToMeAutors(cleon.doc.spec.autor.javamodel.IAutor object) {
    return _getToMeList(object.getRepository(), cleon.doc.spec.autor.javamodel.IAutors.class, cleon.doc.spec.autor.AutorPackage.Autors_autors, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a59c8d77-c589-11e5-aeea-1db9268c0ee9,+pFJ2KckNaYaE4WVMb2IcNEolP4=] */
