package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestLevel extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.common.resources.metamodel.spec.naming.javamodel.IMandatoryShortName {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4731eb51-5153-11e9-bb61-971a423d31e9");
  
  public static interface IValueVoidVisitor {
    
    public void visitUnittest__F___N_UT__O_();
    
    public void visitUnitintegrationtest__F___N_UIT__O_();
    
    public void visitSystemtest__F___N_ST__O_();
    
    public void visitSystemintegrationstest__F___N_SIT__O_();
    
    public void visitAkzeptanztest__F___N_AT__O_();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitUnittest__F___N_UT__O_();
    
    public R visitUnitintegrationtest__F___N_UIT__O_();
    
    public R visitSystemtest__F___N_ST__O_();
    
    public R visitSystemintegrationstest__F___N_SIT__O_();
    
    public R visitAkzeptanztest__F___N_AT__O_();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isUnittest__F___N_UT__O_();
  
  public boolean isUnitintegrationtest__F___N_UIT__O_();
  
  public boolean isSystemtest__F___N_ST__O_();
  
  public boolean isSystemintegrationstest__F___N_SIT__O_();
  
  public boolean isAkzeptanztest__F___N_AT__O_();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4731eb51-5153-11e9-bb61-971a423d31e9,BdkkToJrY4iS7MQRI8FzDzUTcKI=] */
