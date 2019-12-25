package cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICpuArchitecture extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0bba3407-2d73-11e6-959f-d1cef44ff5fd");
  
  public static interface IValueVoidVisitor {
    
    public void visitX86_32bit();
    
    public void visitX86_64bit();
    
    public void visitX86_32_64_bit();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitX86_32bit();
    
    public R visitX86_64bit();
    
    public R visitX86_32_64_bit();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isX86_32bit();
  
  public boolean isX86_64bit();
  
  public boolean isX86_32_64_bit();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0bba3407-2d73-11e6-959f-d1cef44ff5fd,DG0kIGq6lCYoeJdj2TIJyKDvBh0=] */
