package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestAccountTemplateNoRole extends DynamicResource implements ITestAccountTemplateNoRole {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestAccountTemplateNoRole> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestAccountTemplateNoRole>() {
    
    @Override
    public ITestAccountTemplateNoRole create() {
      return new TestAccountTemplateNoRole();
    }
    
    @Override
    public ITestAccountTemplateNoRole create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestAccountTemplateNoRole(resourceRepository, resource);
    }
  
  };

  public TestAccountTemplateNoRole() {
    super(ITestAccountTemplateNoRole.TYPE_ID);
  }
  
  public TestAccountTemplateNoRole(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestAccountTemplateNoRole.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestAccountTemplateNoRole setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,214b42e2-9927-11f0-b89e-65f425c2dee1,UiQHKt10s4h6fyED7CD5isFQKzc=] */
