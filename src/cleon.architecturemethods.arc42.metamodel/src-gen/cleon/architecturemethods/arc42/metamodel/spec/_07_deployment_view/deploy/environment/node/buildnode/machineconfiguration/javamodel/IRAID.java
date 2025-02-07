package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.machineconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRAID extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("02c21abc-e534-11ef-b3bd-2f2a4370e45f");
  
  public static interface IValueVoidVisitor {
    
    public void visitRAID__F_0();
    
    public void visitRAID__F_1();
    
    public void visitRAID__F_5();
    
    public void visitRAID__F_6();
    
    public void visitRAID__F_10();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitRAID__F_0();
    
    public R visitRAID__F_1();
    
    public R visitRAID__F_5();
    
    public R visitRAID__F_6();
    
    public R visitRAID__F_10();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isRAID__F_0();
  
  public boolean isRAID__F_1();
  
  public boolean isRAID__F_5();
  
  public boolean isRAID__F_6();
  
  public boolean isRAID__F_10();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,02c21abc-e534-11ef-b3bd-2f2a4370e45f,lU9KVtfE3OCQDbs83Tw/cOrVnhE=] */
