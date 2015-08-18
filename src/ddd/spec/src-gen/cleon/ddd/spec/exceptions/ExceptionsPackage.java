package cleon.ddd.spec.exceptions;

import ch.actifsource.core.Resource;

public class ExceptionsPackage {
  
  public static final Resource DomainException = new Resource("d23456fc-25e9-11e3-af30-61c5782ee2ab");
  public static final Resource ExceptionDekomposition = new Resource("510327f6-266d-11e5-95dc-8f1cdbd9db54");
  public static final Resource ExceptionDekomposition_into = new Resource("510327f7-266d-11e5-95dc-8f1cdbd9db54");
  
  /* Begin Protected Region [[user]] */
  
  /* End Protected Region   [[user]] */
  
  private ExceptionsPackage() {}
  
  public static final String getScopeName() {
    return "cleon.ddd.spec";
  }
  
  public static final String getResourceFolderPath() {
    return "asrc";
  }
  
  public static final String getPackageName() {
    return "cleon.ddd.spec.exceptions";
  }
  
}
/* Actifsource ID=[c1a07b92-fc09-11e0-b756-0dc1d96a76cb,cleon.ddd.spec.exceptions,pVc5ZFLfcgrmUxLPPIDhTBRD6KY=] */
