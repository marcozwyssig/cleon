package cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IStao extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2a148fc4-e28d-11ed-99b7-d1ac0e4a4893");
  
  public static interface IValueVoidVisitor {
    
    public void visitA();
    
    public void visitB();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitA();
    
    public R visitB();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isA();
  
  public boolean isB();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2a148fc4-e28d-11ed-99b7-d1ac0e4a4893,3tQCaNgM0IVrUhxp3IBDENwVhBk=] */
