package cleon.architecturemethods.hermes.metamodel.spec.licensing.redhat.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRhelLicenseType extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9b193b6e-dfed-11ef-8b41-bffcdee4ee9e");
  
  public static interface IValueVoidVisitor {
    
    public void visitHost__S_Based();
    
    public void visitVM__S_Based();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitHost__S_Based();
    
    public R visitVM__S_Based();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isHost__S_Based();
  
  public boolean isVM__S_Based();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9b193b6e-dfed-11ef-8b41-bffcdee4ee9e,cxMN/wfwcy6RhVvkINrZGESYCA0=] */
