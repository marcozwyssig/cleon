package cleon.sdp.spec.requirementmanagement.requirements.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IState extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db79c858-294d-11e5-b035-b579d7e91534");
  
  public static interface IValueVoidVisitor {
    
    public void visitOpen();
    
    public void visitIn__F_Progress();
    
    public void visitDone();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitOpen();
    
    public R visitIn__F_Progress();
    
    public R visitDone();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isOpen();
  
  public boolean isIn__F_Progress();
  
  public boolean isDone();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db79c858-294d-11e5-b035-b579d7e91534,+1U/kXMFij1TUYuwvM2h4LSe3TU=] */
