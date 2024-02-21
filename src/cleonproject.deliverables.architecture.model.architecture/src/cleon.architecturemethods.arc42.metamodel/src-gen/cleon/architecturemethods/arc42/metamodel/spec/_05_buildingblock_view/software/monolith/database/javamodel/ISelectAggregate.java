package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.database.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISelectAggregate extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b9b422de-d0cc-11ee-a38e-0b82bafb3097");
  
  public static interface IValueVoidVisitor {
    
    public void visitMAX();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitMAX();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isMAX();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b9b422de-d0cc-11ee-a38e-0b82bafb3097,YSbqOTU78/j1SZwiGgKQB9eVyBk=] */
