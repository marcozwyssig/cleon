package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirementState extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db79c858-294d-11e5-b035-b579d7e91534");
  
  public static interface IValueVoidVisitor {
    
    public void visitIdentified();
    
    public void visitAligned();
    
    public void visitApproved__F___N_By__F_Supplier__O_();
    
    public void visitApproved();
    
    public void visitDesigned();
    
    public void visitImplemented();
    
    public void visitAccepted();
    
    public void visitRejected__F___N_QS__O_();
    
    public void visitRejected();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitIdentified();
    
    public R visitAligned();
    
    public R visitApproved__F___N_By__F_Supplier__O_();
    
    public R visitApproved();
    
    public R visitDesigned();
    
    public R visitImplemented();
    
    public R visitAccepted();
    
    public R visitRejected__F___N_QS__O_();
    
    public R visitRejected();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isIdentified();
  
  public boolean isAligned();
  
  public boolean isApproved__F___N_By__F_Supplier__O_();
  
  public boolean isApproved();
  
  public boolean isDesigned();
  
  public boolean isImplemented();
  
  public boolean isAccepted();
  
  public boolean isRejected__F___N_QS__O_();
  
  public boolean isRejected();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db79c858-294d-11e5-b035-b579d7e91534,OB/VjKLIj2BWc9nVJImj43YHNt8=] */
