package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILAGType extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4ded4698-303c-11ed-b561-abe8147b73fc");
  
  public static interface IValueVoidVisitor {
    
    public void visitH();
    
    public void visitG();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitH();
    
    public R visitG();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isH();
  
  public boolean isG();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4ded4698-303c-11ed-b561-abe8147b73fc,Ur4VbHw4VrpxgEJEwIRzEcvjGWU=] */
