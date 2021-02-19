package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITrack extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("eb22793b-dfaa-11e9-9827-a1514ee8d06a");
  
  public static interface IValueVoidVisitor {
    
    public void visitLog();
    
    public void visitNone();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitLog();
    
    public R visitNone();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isLog();
  
  public boolean isNone();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,eb22793b-dfaa-11e9-9827-a1514ee8d06a,larbgax4HbBnSU15bkFwdWUN5XU=] */
