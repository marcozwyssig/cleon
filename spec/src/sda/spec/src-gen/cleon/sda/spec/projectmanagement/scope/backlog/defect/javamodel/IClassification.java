package cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IClassification extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9a8462a1-3765-11e5-95d9-2b04d7ab02d9");
  
  public static interface IValueVoidVisitor {
    
    public void visit__W___F___N_leichter__F_Fehler__O_();
    
    public void visit__X___F___N_wesentlicher__F_Fehler__O_();
    
    public void visit__Y___F___N_kritischer__F_Fehler__O_();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visit__W___F___N_leichter__F_Fehler__O_();
    
    public R visit__X___F___N_wesentlicher__F_Fehler__O_();
    
    public R visit__Y___F___N_kritischer__F_Fehler__O_();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean is__W___F___N_leichter__F_Fehler__O_();
  
  public boolean is__X___F___N_wesentlicher__F_Fehler__O_();
  
  public boolean is__Y___F___N_kritischer__F_Fehler__O_();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9a8462a1-3765-11e5-95d9-2b04d7ab02d9,Na/xH40AX61iNJgGiULp2nz5eTY=] */
