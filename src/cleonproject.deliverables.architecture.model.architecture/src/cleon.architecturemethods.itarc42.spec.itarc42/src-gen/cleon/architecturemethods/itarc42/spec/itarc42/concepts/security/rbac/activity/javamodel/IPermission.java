package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPermission extends cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId, ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ffd8187a-7f1a-11e9-9a52-07d4b074defc");
  
  public static interface IValueVoidVisitor {
    
    public void visitGuest();
    
    public void visitOperator();
    
    public void visitAdmin();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitGuest();
    
    public R visitOperator();
    
    public R visitAdmin();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isGuest();
  
  public boolean isOperator();
  
  public boolean isAdmin();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ffd8187a-7f1a-11e9-9a52-07d4b074defc,zurXLAxcS/KTYk7943IN0PwYEoE=] */
