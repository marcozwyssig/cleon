package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IUserLicenseType extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("953f4627-dfd3-11ef-b0be-9b4cac321140");
  
  public static interface IValueVoidVisitor {
    
    public void visitFloating__F___N_Concurrent__O___F_License();
    
    public void visitPer__F_User__F_License();
    
    public void visitNamed__F_User__F_License();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitFloating__F___N_Concurrent__O___F_License();
    
    public R visitPer__F_User__F_License();
    
    public R visitNamed__F_User__F_License();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isFloating__F___N_Concurrent__O___F_License();
  
  public boolean isPer__F_User__F_License();
  
  public boolean isNamed__F_User__F_License();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,953f4627-dfd3-11ef-b0be-9b4cac321140,NbfkevWQlyuSgH1eCn/hx/gMWsM=] */
