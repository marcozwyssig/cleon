package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.abstraction_level.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractionLevel extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3da3b4e2-ff9b-11e4-ac0a-959b440f987f");
  
  public static interface IValueVoidVisitor {
    
    public void visitCAP();
    
    public void visitCMP();
    
    public void visitFEA();
    
    public void visitFUN();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitCAP();
    
    public R visitCMP();
    
    public R visitFEA();
    
    public R visitFUN();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isCAP();
  
  public boolean isCMP();
  
  public boolean isFEA();
  
  public boolean isFUN();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3da3b4e2-ff9b-11e4-ac0a-959b440f987f,OgmTzzkGBMUEOxD/xErpa3SiSVo=] */
