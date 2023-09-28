package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IConnectionType extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fbcfa2cf-6ce5-11e9-a6d3-775c09e81e2d");
  
  public static interface IValueVoidVisitor {
    
    public void visitRDP();
    
    public void visitSSH();
    
    public void visitWeb();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitRDP();
    
    public R visitSSH();
    
    public R visitWeb();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isRDP();
  
  public boolean isSSH();
  
  public boolean isWeb();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fbcfa2cf-6ce5-11e9-a6d3-775c09e81e2d,kdZN2qXWjsPUQNNFhOMOaVZQ/jI=] */
