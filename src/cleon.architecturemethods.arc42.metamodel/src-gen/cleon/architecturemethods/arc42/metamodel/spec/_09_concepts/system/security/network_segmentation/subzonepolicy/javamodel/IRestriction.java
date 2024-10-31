package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRestriction extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f310eb7a-b844-11e9-8760-2d4a9d15ec14");
  
  public static interface IValueVoidVisitor {
    
    public void visitRestricted();
    
    public void visitAllowed();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitRestricted();
    
    public R visitAllowed();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isRestricted();
  
  public boolean isAllowed();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f310eb7a-b844-11e9-8760-2d4a9d15ec14,VMgoCfqV/RMlosADreusJZ5MrP8=] */
