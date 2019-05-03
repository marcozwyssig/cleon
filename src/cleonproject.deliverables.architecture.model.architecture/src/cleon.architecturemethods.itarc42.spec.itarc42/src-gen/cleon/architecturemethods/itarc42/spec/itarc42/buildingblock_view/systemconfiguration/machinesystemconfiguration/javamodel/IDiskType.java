package cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDiskType extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("00c36073-2b6b-11e9-90eb-451204ee9d3c");
  
  public static interface IValueVoidVisitor {
    
    public void visitSDD();
    
    public void visitHDD();
    
    public void visitVMDK__F___S___F_Thin__F_Provisioning();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitSDD();
    
    public R visitHDD();
    
    public R visitVMDK__F___S___F_Thin__F_Provisioning();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isSDD();
  
  public boolean isHDD();
  
  public boolean isVMDK__F___S___F_Thin__F_Provisioning();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,00c36073-2b6b-11e9-90eb-451204ee9d3c,yGTuiaZwUtZO1gTC05zYtKXQRaA=] */
