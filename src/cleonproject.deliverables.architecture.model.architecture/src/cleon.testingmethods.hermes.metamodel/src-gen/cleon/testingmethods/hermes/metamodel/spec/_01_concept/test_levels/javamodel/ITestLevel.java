package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestLevel extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4731eb51-5153-11e9-bb61-971a423d31e9");
  
  public static interface IValueVoidVisitor {
    
    public void visitUnittest();
    
    public void visitUnitintegrationtest();
    
    public void visitSystemtest();
    
    public void visitSystemintegrationstest();
    
    public void visitAkzeptanztest();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitUnittest();
    
    public R visitUnitintegrationtest();
    
    public R visitSystemtest();
    
    public R visitSystemintegrationstest();
    
    public R visitAkzeptanztest();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isUnittest();
  
  public boolean isUnitintegrationtest();
  
  public boolean isSystemtest();
  
  public boolean isSystemintegrationstest();
  
  public boolean isAkzeptanztest();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4731eb51-5153-11e9-bb61-971a423d31e9,eW+ggBN2yGKEVFPE/+7WNBFLd6k=] */
