package cleon.common.resources.spec.resources.confidentiality.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IConfidentialityClassification extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("58a88265-c10e-11e6-8f58-ad3c6ee7602f");
  
  public static interface IValueVoidVisitor {
    
    public void visitSK0();
    
    public void visitSK1();
    
    public void visitSK2();
    
    public void visitSK3();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitSK0();
    
    public R visitSK1();
    
    public R visitSK2();
    
    public R visitSK3();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isSK0();
  
  public boolean isSK1();
  
  public boolean isSK2();
  
  public boolean isSK3();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,58a88265-c10e-11e6-8f58-ad3c6ee7602f,/tRgYGIqwG1aMTWCQM5vAB7DGpk=] */
