package cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Principles extends DynamicResource implements IPrinciples {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPrinciples> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPrinciples>() {
    
    @Override
    public IPrinciples create() {
      return new Principles();
    }
    
    @Override
    public IPrinciples create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Principles(resourceRepository, resource);
    }
  
  };

  public Principles() {
    super(IPrinciples.TYPE_ID);
  }
  
  public Principles(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPrinciples.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple> selectPrinciples() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple.class, cleon.sda.spec.requirementsmanagement.motivation.principles.PrinciplesPackage.Principles_principles);
  }

  public Principles setPrinciples(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple> principles) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.principles.PrinciplesPackage.Principles_principles, principles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Principles setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple.class, cleon.sda.spec.requirementsmanagement.motivation.principles.PrinciplesPackage.Principles_principles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciples selectToMePrinciples(cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciples.class, cleon.sda.spec.requirementsmanagement.motivation.principles.PrinciplesPackage.Principles_principles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5d54c5db-a951-11e5-bda2-a7fc3bd7c783,TkQxj54zPgDrtYt1GQ0mOqc5idM=] */
