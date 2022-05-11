package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProtocol extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("21d2d137-8c92-11eb-a9c0-c3b95abf3470");
  
  public static interface IValueVoidVisitor {
    
    public void visitCifs();
    
    public void visitNfs();
    
    public void visitSMBv3();
    
    public void visitSMBv2();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitCifs();
    
    public R visitNfs();
    
    public R visitSMBv3();
    
    public R visitSMBv2();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isCifs();
  
  public boolean isNfs();
  
  public boolean isSMBv3();
  
  public boolean isSMBv2();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,21d2d137-8c92-11eb-a9c0-c3b95abf3470,JZhv/FDOzsg+VhaYQybEDQ+ra1I=] */
