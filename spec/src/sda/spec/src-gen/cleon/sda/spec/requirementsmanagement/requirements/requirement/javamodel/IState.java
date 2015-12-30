package cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IState extends ch.actifsource.core.javamodel.IEnumValue, cleon.doc.spec.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db79c858-294d-11e5-b035-b579d7e91534");
  
  public static interface IValueVoidVisitor {
    
    public void visitIdentified();
    
    public void visitAligned();
    
    public void visitApproved();
    
    public void visitImplemented();
    
    public void visitFulfilled();
    
    public void visitRejected();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitIdentified();
    
    public R visitAligned();
    
    public R visitApproved();
    
    public R visitImplemented();
    
    public R visitFulfilled();
    
    public R visitRejected();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isIdentified();
  
  public boolean isAligned();
  
  public boolean isApproved();
  
  public boolean isImplemented();
  
  public boolean isFulfilled();
  
  public boolean isRejected();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db79c858-294d-11e5-b035-b579d7e91534,5h5PFBZM6A89FKc7i94hB137978=] */
