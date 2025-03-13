package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.ifc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInterfaceState extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("40f81c53-f180-11e8-b3e7-15e2dd8d9b05");
  
  public static interface IValueVoidVisitor {
    
    public void visitPresent();
    
    public void visitAbsent();
    
    public void visitShutdown();
    
    public void visitNo_shutdown();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitPresent();
    
    public R visitAbsent();
    
    public R visitShutdown();
    
    public R visitNo_shutdown();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isPresent();
  
  public boolean isAbsent();
  
  public boolean isShutdown();
  
  public boolean isNo_shutdown();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,40f81c53-f180-11e8-b3e7-15e2dd8d9b05,ChqkprqdVJkDNoZDdxVoAi6NLSo=] */
