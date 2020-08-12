package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequestProtocol extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("98d01b1c-dc79-11ea-a169-cb4c6ff66798");
  
  public static interface IValueVoidVisitor {
    
    public void visitHttp();
    
    public void visitHttps();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitHttp();
    
    public R visitHttps();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isHttp();
  
  public boolean isHttps();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,98d01b1c-dc79-11ea-a169-cb4c6ff66798,v6ITQxDocndp+nby03YTP4nsov4=] */
