package cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISecurityConcept extends cleon.architecturemethods.itarc42.metamodel.spec.concepts.javamodel.IConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9515e875-0eae-11e9-9f19-6d15636f4ecc");
  
  // relations
  
  public cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.realm.javamodel.IDirectoryService selectRealm();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.javamodel.IRBAC> selectRbac();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9515e875-0eae-11e9-9f19-6d15636f4ecc,on8AZFp3WxYm8OIuSogwz9Tr8v0=] */
