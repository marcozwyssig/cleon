package cleon.uml.spec.structural.classes.association.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICollectionType extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("261182b1-13ca-11e3-bec7-f1e135382475");
  
  public static interface IValueVoidVisitor {
    
    public void visitEnumerable();
    
    public void visitObservableCollection();
    
    public void visitObservableCollectionWithView();
    
    public void visitList();
    
    public void visitReadOnlyList();
    
    public void visitCollection();
    
    public void visitReadOnlyObservableCollection();
    
    public void visitReadOnlyCollection();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitEnumerable();
    
    public R visitObservableCollection();
    
    public R visitObservableCollectionWithView();
    
    public R visitList();
    
    public R visitReadOnlyList();
    
    public R visitCollection();
    
    public R visitReadOnlyObservableCollection();
    
    public R visitReadOnlyCollection();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isEnumerable();
  
  public boolean isObservableCollection();
  
  public boolean isObservableCollectionWithView();
  
  public boolean isList();
  
  public boolean isReadOnlyList();
  
  public boolean isCollection();
  
  public boolean isReadOnlyObservableCollection();
  
  public boolean isReadOnlyCollection();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,261182b1-13ca-11e3-bec7-f1e135382475,KOBcJdEhfa0hHLbahpsfZYMmlno=] */
