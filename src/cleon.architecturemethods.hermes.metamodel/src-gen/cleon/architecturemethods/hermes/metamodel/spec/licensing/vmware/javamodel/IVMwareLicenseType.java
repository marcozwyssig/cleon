package cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IVMwareLicenseType extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ef399c70-dff0-11ef-8b41-bffcdee4ee9e");
  
  public static interface IValueVoidVisitor {
    
    public void visitEnd__F_User__F_License__F_Agreement__F___N_EULA__O_();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitEnd__F_User__F_License__F_Agreement__F___N_EULA__O_();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isEnd__F_User__F_License__F_Agreement__F___N_EULA__O_();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ef399c70-dff0-11ef-8b41-bffcdee4ee9e,2Zrp39UxfFFL39UHC3ZQI1m7lZM=] */
