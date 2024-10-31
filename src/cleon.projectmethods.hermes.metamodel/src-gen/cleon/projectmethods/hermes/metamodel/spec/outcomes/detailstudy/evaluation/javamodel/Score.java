package cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Score extends DynamicResource implements IScore {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IScore> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IScore>() {
    
    @Override
    public IScore create() {
      return new Score();
    }
    
    @Override
    public IScore create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Score(resourceRepository, resource);
    }
  
  };

  public Score() {
    super(IScore.TYPE_ID);
  }
  
  public Score(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IScore.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Score setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (is__V_()) return visitor.visit__V_();
    if (is__X_()) return visitor.visit__X_();
    if (is__Y_()) return visitor.visit__Y_();
    if (is__0_()) return visitor.visit__0_();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (is__V_()) {
      visitor.visit__V_();
      return;
    }
    if (is__X_()) {
      visitor.visit__X_();
      return;
    }
    if (is__Y_()) {
      visitor.visit__Y_();
      return;
    }
    if (is__0_()) {
      visitor.visit__0_();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean is__V_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.Score___V_);
  }
  
  @Override
  public boolean is__X_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.Score___X_);
  }
  
  @Override
  public boolean is__Y_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.Score___Y_);
  }
  
  @Override
  public boolean is__0_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.Score___0_);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b606e74b-3c1a-11e5-9962-cf3035adb922,j4yyOJ9VN2KRYNE72aLJI/pUa/E=] */
