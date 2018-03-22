package cleon.support.projectmanagement.spec.resource.infrastructure;

import ch.actifsource.core.Resource;

public class InfrastructurePackage {
  
  public static final Resource Software = new Resource("052b13bf-a7e0-11e5-82dd-3b995d9c840c");
  public static final Resource Infrastructure = new Resource("5dd75f3f-c768-11e5-b3f9-43c5a0896ea1");
  public static final Resource HasAssets_assets = new Resource("5dae77ec-5ee7-11e6-ab50-915f052afe3b");
  public static final Resource Software_purchaseDate = new Resource("56448d21-5eea-11e6-ab50-915f052afe3b");
  public static final Resource Asset = new Resource("6ef368b1-bbd6-11e6-997f-d73ea5a3671c");
  public static final Resource Hardware = new Resource("a37ad3ae-bbd6-11e6-997f-d73ea5a3671c");
  public static final Resource System = new Resource("bd920ebe-bbd6-11e6-997f-d73ea5a3671c");
  public static final Resource HasAssets = new Resource("c80d50de-bbd6-11e6-997f-d73ea5a3671c");
  public static final Resource Network = new Resource("f3c2bd7d-bbd6-11e6-997f-d73ea5a3671c");
  public static final Resource Space = new Resource("0df52110-bbd7-11e6-997f-d73ea5a3671c");
  
  /* Begin Protected Region [[user]] */
  
  /* End Protected Region   [[user]] */
  
  private InfrastructurePackage() {}
  
  public static final String getScopeName() {
    return "cleon.common.projectmanagement.spec.resource";
  }
  
  public static final String getResourceFolderPath() {
    return "asrc";
  }
  
  public static final String getPackageName() {
    return "cleon.support.projectmanagement.spec.resource.infrastructure";
  }
  
}
/* Actifsource ID=[c1a07b92-fc09-11e0-b756-0dc1d96a76cb,cleon.support.projectmanagement.spec.resource.infrastructure,T5YQXy+cPGO6I61HFZBVEwyHzKo=] */
