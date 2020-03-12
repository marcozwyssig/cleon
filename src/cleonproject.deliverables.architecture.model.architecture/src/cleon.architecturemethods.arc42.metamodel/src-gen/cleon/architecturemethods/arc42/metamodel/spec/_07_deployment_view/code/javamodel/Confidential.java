package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.code.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Confidential extends DynamicResource implements IConfidential {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConfidential> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConfidential>() {
    
    @Override
    public IConfidential create() {
      return new Confidential();
    }
    
    @Override
    public IConfidential create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Confidential(resourceRepository, resource);
    }
  
  };

  public Confidential() {
    super(IConfidential.TYPE_ID);
  }
  
  public Confidential(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IConfidential.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Confidential setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4fe0527a-41b7-11e5-a2b3-edc7f3343844,089/ftseLHNt2vbiXQ5lwyeP1N8=] */
