package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequestMethod extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4c6592d2-dc79-11ea-a169-cb4c6ff66798");
  
  public static interface IValueVoidVisitor {
    
    public void visitGET();
    
    public void visitPOST();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitGET();
    
    public R visitPOST();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isGET();
  
  public boolean isPOST();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4c6592d2-dc79-11ea-a169-cb4c6ff66798,m4juf4xtTRzYsRCBjQoq/aGCS6A=] */
