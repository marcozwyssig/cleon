package cleon.conception.architecture.spec.soa;

import ch.actifsource.core.Resource;

public class SoaPackage {
  
  public static final Resource DataService = new Resource("d93b7c9d-13cb-11e3-bec7-f1e135382475");
  public static final Resource Event = new Resource("3789a935-a3ba-11e3-8095-f11af53ab806");
  public static final Resource DataService_events = new Resource("3de09653-a3ba-11e3-8095-f11af53ab806");
  public static final Resource Event_eventType = new Resource("7b9825e9-a3ba-11e3-8095-f11af53ab806");
  public static final Resource MessageService = new Resource("7a41f99a-a436-11e3-a07f-f96d34c3de8f");
  
  /* Begin Protected Region [[user]] */
  
  /* End Protected Region   [[user]] */
  
  private SoaPackage() {}
  
  public static final String getScopeName() {
    return "cleon.conception.architecture.spec.soa";
  }
  
  public static final String getResourceFolderPath() {
    return "asrc";
  }
  
  public static final String getPackageName() {
    return "cleon.conception.architecture.spec.soa";
  }
  
}
/* Actifsource ID=[c1a07b92-fc09-11e0-b756-0dc1d96a76cb,cleon.conception.architecture.spec.soa,VG9Vmlcg2p3uUVzBrwpwDhgwSlA=] */
