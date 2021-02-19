package cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRuntime extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.metamodel.spec.naming.javamodel.IShortName {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8a0ef5c9-1bfe-11e9-9896-651e5faa32a4");
  
  public static interface IValueVoidVisitor {
    
    public void visitPhysical();
    
    public void visitVirtual();
    
    public void visitContainer();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitPhysical();
    
    public R visitVirtual();
    
    public R visitContainer();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isPhysical();
  
  public boolean isVirtual();
  
  public boolean isContainer();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8a0ef5c9-1bfe-11e9-9896-651e5faa32a4,WFZJQnm/pYAelt16rF5U3kyiN6Q=] */
