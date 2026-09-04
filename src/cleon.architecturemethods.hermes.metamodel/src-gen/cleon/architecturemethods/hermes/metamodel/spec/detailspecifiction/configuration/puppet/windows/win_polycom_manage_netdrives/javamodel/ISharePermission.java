package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISharePermission extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4cc987fa-0805-11f0-8081-eb3f9417daa7");
  
  public static interface IValueVoidVisitor {
    
    public void visitFull();
    
    public void visitRead();
    
    public void visitModify();
    
    public void visitExecute();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitFull();
    
    public R visitRead();
    
    public R visitModify();
    
    public R visitExecute();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isFull();
  
  public boolean isRead();
  
  public boolean isModify();
  
  public boolean isExecute();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4cc987fa-0805-11f0-8081-eb3f9417daa7,y8ORqGwHAGMn4NK51qyfSWUUzX0=] */
