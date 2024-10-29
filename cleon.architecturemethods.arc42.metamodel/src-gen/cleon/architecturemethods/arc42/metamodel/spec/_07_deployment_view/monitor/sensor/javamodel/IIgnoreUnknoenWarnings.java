package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IIgnoreUnknoenWarnings extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2335ec9c-e3ba-11ea-84e3-5dbec94345a4");
  
  public static interface IValueVoidVisitor {
    
    public void visitWarn();
    
    public void visitIgnore();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitWarn();
    
    public R visitIgnore();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isWarn();
  
  public boolean isIgnore();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2335ec9c-e3ba-11ea-84e3-5dbec94345a4,WRmuqLuMNYloVdiDBbDaT7YfAS8=] */
