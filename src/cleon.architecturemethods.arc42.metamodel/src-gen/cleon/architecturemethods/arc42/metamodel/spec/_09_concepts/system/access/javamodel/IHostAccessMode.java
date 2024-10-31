package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IHostAccessMode extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3b5f0242-2439-11eb-83b1-3d2a97975978");
  
  public static interface IValueVoidVisitor {
    
    public void visitAll();
    
    public void visitOnlyCluster();
    
    public void visitNoCluster();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitAll();
    
    public R visitOnlyCluster();
    
    public R visitNoCluster();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isAll();
  
  public boolean isOnlyCluster();
  
  public boolean isNoCluster();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3b5f0242-2439-11eb-83b1-3d2a97975978,RJzoIjFLroimBpt36m5OE+McvQs=] */
