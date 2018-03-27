package cleon.deployment.devops.spec.release.type;

import ch.actifsource.core.Resource;

public class TypePackage {
  
  public static final Resource MsiArtefactType = new Resource("bc3dd6b4-3b4c-11e5-86bc-73aedc28563d");
  public static final Resource WspArtefactType = new Resource("bc3dd6bd-3b4c-11e5-86bc-73aedc28563d");
  public static final Resource DllArtefactType = new Resource("bc3dd6cf-3b4c-11e5-86bc-73aedc28563d");
  public static final Resource DeploymentArtefactType = new Resource("cdaf0402-44fa-11e5-b1a6-c55612d53cf4");
  
  /* Begin Protected Region [[user]] */
  
  /* End Protected Region   [[user]] */
  
  private TypePackage() {}
  
  public static final String getScopeName() {
    return "cleon.conception.architecture.spec.devops";
  }
  
  public static final String getResourceFolderPath() {
    return "asrc";
  }
  
  public static final String getPackageName() {
    return "cleon.deployment.devops.spec.release.type";
  }
  
}
/* Actifsource ID=[c1a07b92-fc09-11e0-b756-0dc1d96a76cb,cleon.deployment.devops.spec.release.type,9pqldzV/jMfskcbp63KqCe9CrvE=] */
