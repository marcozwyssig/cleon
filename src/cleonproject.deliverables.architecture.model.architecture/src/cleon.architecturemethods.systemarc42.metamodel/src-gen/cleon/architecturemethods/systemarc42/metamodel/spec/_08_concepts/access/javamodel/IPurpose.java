package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPurpose extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b7bb9567-84df-11ec-8ce3-4fc564ebb802");
  
  public static interface IValueVoidVisitor {
    
    public void visitManagement();
    
    public void visitManagement__F___N_Fallback__O_();
    
    public void visitUser();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitManagement();
    
    public R visitManagement__F___N_Fallback__O_();
    
    public R visitUser();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isManagement();
  
  public boolean isManagement__F___N_Fallback__O_();
  
  public boolean isUser();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b7bb9567-84df-11ec-8ce3-4fc564ebb802,Wl8oQBTyHx0R2Re1PO92Wkcj0Nc=] */
