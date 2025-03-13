package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDuplex extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("87ad7620-f180-11e8-b3e7-15e2dd8d9b05");
  
  public static interface IValueVoidVisitor {
    
    public void visitAuto();
    
    public void visitFull();
    
    public void visitHalf();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitAuto();
    
    public R visitFull();
    
    public R visitHalf();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isAuto();
  
  public boolean isFull();
  
  public boolean isHalf();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,87ad7620-f180-11e8-b3e7-15e2dd8d9b05,jWZ1GEutXmmApglpIO/vpbNexxo=] */
