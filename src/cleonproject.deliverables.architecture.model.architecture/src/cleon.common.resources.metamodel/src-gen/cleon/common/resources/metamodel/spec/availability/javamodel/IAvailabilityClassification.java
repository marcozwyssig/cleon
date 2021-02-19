package cleon.common.resources.metamodel.spec.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAvailabilityClassification extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9534ff15-c10e-11e6-8f58-ad3c6ee7602f");
  
  public static interface IValueVoidVisitor {
    
    public void visitVK0();
    
    public void visitVK1();
    
    public void visitVK2();
    
    public void visitVK3();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitVK0();
    
    public R visitVK1();
    
    public R visitVK2();
    
    public R visitVK3();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isVK0();
  
  public boolean isVK1();
  
  public boolean isVK2();
  
  public boolean isVK3();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9534ff15-c10e-11e6-8f58-ad3c6ee7602f,dOJ5AwYGcbMikRbFKf6OwReQ0dw=] */
