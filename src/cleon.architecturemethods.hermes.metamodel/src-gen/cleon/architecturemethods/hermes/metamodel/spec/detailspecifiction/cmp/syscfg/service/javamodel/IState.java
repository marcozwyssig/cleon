package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.service.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IState extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("27d16d51-ef3d-11e8-be8a-b748ff8f0a75");
  
  public static interface IValueVoidVisitor {
    
    public void visitRunning();
    
    public void visitStopped__F_();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitRunning();
    
    public R visitStopped__F_();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isRunning();
  
  public boolean isStopped__F_();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,27d16d51-ef3d-11e8-be8a-b748ff8f0a75,8FrPWzKbIOIFR4aq7ym8vMNBydk=] */
