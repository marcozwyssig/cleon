package cleon.support.projectmanagement.spec.resource.persons;

import ch.actifsource.core.Resource;

public class PersonsPackage {
  
  public static final Resource Person = new Resource("9bfc0d2c-ff9e-11e4-ac0a-959b440f987f");
  public static final Resource Person_surname = new Resource("067b63cf-ff9f-11e4-ac0a-959b440f987f");
  public static final Resource Person_firstname = new Resource("09d7d545-ff9f-11e4-ac0a-959b440f987f");
  public static final Resource Person_shortname = new Resource("0dc49fdb-ff9f-11e4-ac0a-959b440f987f");
  public static final Resource Persons = new Resource("68e1ab2e-a7e4-11e5-82dd-3b995d9c840c");
  public static final Resource Persons_persons = new Resource("6d022fb8-a7e4-11e5-82dd-3b995d9c840c");
  public static final Resource Person_absences = new Resource("987aeed1-c4c6-11e5-8558-4b8affb7767c");
  public static final Resource Person_organisation = new Resource("e591c58c-c768-11e5-b3f9-43c5a0896ea1");
  public static final Resource Person_experiences = new Resource("bca2dd07-07d4-11e6-a579-8304ec3aa032");
  public static final Resource OwnerAware_owner = new Resource("d5635ef0-2f05-11e6-8bd9-a77b8d2a3a0e");
  public static final Resource OwnerAware = new Resource("dd829c7f-3385-11e6-b251-57783f5929b3");
  public static final Resource AuthorsAware = new Resource("bce16132-bff1-11e7-9dcc-23cb45d05890");
  public static final Resource AuthorsAware_authors = new Resource("bce16133-bff1-11e7-9dcc-23cb45d05890");
  
  /* Begin Protected Region [[user]] */
  
  /* End Protected Region   [[user]] */
  
  private PersonsPackage() {}
  
  public static final String getScopeName() {
    return "cleon.common.projectmanagement.spec.resource";
  }
  
  public static final String getResourceFolderPath() {
    return "asrc";
  }
  
  public static final String getPackageName() {
    return "cleon.support.projectmanagement.spec.resource.persons";
  }
  
}
/* Actifsource ID=[c1a07b92-fc09-11e0-b756-0dc1d96a76cb,cleon.support.projectmanagement.spec.resource.persons,KMsdQRrb9zyWbzD9xf5enDnySAs=] */
