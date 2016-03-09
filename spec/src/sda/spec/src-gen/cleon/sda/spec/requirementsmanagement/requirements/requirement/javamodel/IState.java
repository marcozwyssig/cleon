package cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IState extends ch.actifsource.core.javamodel.IEnumValue, cleon.doc.spec.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db79c858-294d-11e5-b035-b579d7e91534");
  
  public static interface IValueVoidVisitor {
    
    public void visitIdentified();
    
    public void visitAligned();
    
    public void visitApproved__F___N_By__F_Supplier__O_();
    
    public void visitApproved();
    
    public void visitImplemented();
    
    public void visitFulfilled();
    
    public void visitRejected__F___N_Out__S_Of__S_Scope__O_();
    
    public void visitRejected__F___N_Beistellung__O_();
    
    public void visitRejected__F___N_QS__O_();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitIdentified();
    
    public R visitAligned();
    
    public R visitApproved__F___N_By__F_Supplier__O_();
    
    public R visitApproved();
    
    public R visitImplemented();
    
    public R visitFulfilled();
    
    public R visitRejected__F___N_Out__S_Of__S_Scope__O_();
    
    public R visitRejected__F___N_Beistellung__O_();
    
    public R visitRejected__F___N_QS__O_();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isIdentified();
  
  public boolean isAligned();
  
  public boolean isApproved__F___N_By__F_Supplier__O_();
  
  public boolean isApproved();
  
  public boolean isImplemented();
  
  public boolean isFulfilled();
  
  public boolean isRejected__F___N_Out__S_Of__S_Scope__O_();
  
  public boolean isRejected__F___N_Beistellung__O_();
  
  public boolean isRejected__F___N_QS__O_();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db79c858-294d-11e5-b035-b579d7e91534,Qhl/BuMrfn+TWAaBql0T+3FuV6k=] */
