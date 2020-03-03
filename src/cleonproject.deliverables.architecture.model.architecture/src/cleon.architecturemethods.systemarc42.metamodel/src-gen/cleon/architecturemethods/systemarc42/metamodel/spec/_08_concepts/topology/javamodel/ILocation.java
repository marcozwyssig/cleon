package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILocation extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("865b3a4b-57c9-11ea-bd7a-4baf1bc87b3c");
  
  public static interface IValueVoidVisitor {
    
    public void visitA();
    
    public void visitB();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitA();
    
    public R visitB();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isA();
  
  public boolean isB();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,865b3a4b-57c9-11ea-bd7a-4baf1bc87b3c,5HUtUcDcQxjf5zstuTPe/OSeSnY=] */
