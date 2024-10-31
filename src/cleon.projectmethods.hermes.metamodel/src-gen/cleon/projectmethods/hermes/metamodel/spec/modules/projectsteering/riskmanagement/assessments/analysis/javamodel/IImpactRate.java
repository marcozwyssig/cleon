package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IImpactRate extends ch.actifsource.core.javamodel.IEnumValue, ch.actifsource.core.javamodel.ICommentable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("68e06d85-2f01-11e6-8bd9-a77b8d2a3a0e");
  
  public static interface IValueVoidVisitor {
    
    public void visit__W_();
    
    public void visit__X_();
    
    public void visit__Y_();
    
    public void visit__Z_();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visit__W_();
    
    public R visit__X_();
    
    public R visit__Y_();
    
    public R visit__Z_();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean is__W_();
  
  public boolean is__X_();
  
  public boolean is__Y_();
  
  public boolean is__Z_();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,68e06d85-2f01-11e6-8bd9-a77b8d2a3a0e,naEN8cgzi10YCUhHFSX52NN9KFA=] */
