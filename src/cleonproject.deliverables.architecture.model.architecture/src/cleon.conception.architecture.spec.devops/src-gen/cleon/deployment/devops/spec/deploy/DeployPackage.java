package cleon.deployment.devops.spec.deploy;

import ch.actifsource.core.Resource;

public class DeployPackage {
  
  public static final Resource Deploy = new Resource("6e7d700a-406f-11e5-b5f0-5b1ce9c3de3e");
  public static final Resource Environment = new Resource("0bbfeb7d-4070-11e5-b5f0-5b1ce9c3de3e");
  public static final Resource Deploy_environments = new Resource("122cf90e-4070-11e5-b5f0-5b1ce9c3de3e");
  public static final Resource ProductionEnvironment = new Resource("abb6d972-4070-11e5-b5f0-5b1ce9c3de3e");
  public static final Resource QAEnvironment = new Resource("b1dfd829-4070-11e5-b5f0-5b1ce9c3de3e");
  public static final Resource DevelopmentEnvironment = new Resource("ce76dfe8-4070-11e5-b5f0-5b1ce9c3de3e");
  public static final Resource LocalDevelopmentEnvironment = new Resource("d3cb2a83-4070-11e5-b5f0-5b1ce9c3de3e");
  public static final Resource Environment_abbrevation = new Resource("2fa0daf7-44f7-11e5-b1a6-c55612d53cf4");
  
  /* Begin Protected Region [[user]] */
  
  /* End Protected Region   [[user]] */
  
  private DeployPackage() {}
  
  public static final String getScopeName() {
    return "cleon.conception.architecture.spec.devops";
  }
  
  public static final String getResourceFolderPath() {
    return "asrc";
  }
  
  public static final String getPackageName() {
    return "cleon.deployment.devops.spec.deploy";
  }
  
}
/* Actifsource ID=[c1a07b92-fc09-11e0-b756-0dc1d96a76cb,cleon.deployment.devops.spec.deploy,YFp9r4BrKEFfHkDcNAOTNyxKfWQ=] */
