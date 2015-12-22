package cleon.bpmn.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Bpmn extends DynamicResource implements IBpmn {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBpmn> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBpmn>() {
    
    @Override
    public IBpmn create() {
      return new Bpmn();
    }
    
    @Override
    public IBpmn create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Bpmn(resourceRepository, resource);
    }
  
  };

  public Bpmn() {
    super(IBpmn.TYPE_ID);
  }
  
  public Bpmn(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBpmn.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.bpmn.spec.organigram.javamodel.IOrganigram selectOrganigram() {
    return _getSingle(cleon.bpmn.spec.organigram.javamodel.IOrganigram.class, cleon.bpmn.spec.SpecPackage.Bpmn_organigram);
  }

  public Bpmn setOrganigram(cleon.bpmn.spec.organigram.javamodel.IOrganigram organigram) {
    _setSingle(cleon.bpmn.spec.SpecPackage.Bpmn_organigram, organigram);
    return this;
  }
    
  @Override
  public cleon.bpmn.spec.organisational.javamodel.IOrganisational selectOrganisational() {
    return _getSingle(cleon.bpmn.spec.organisational.javamodel.IOrganisational.class, cleon.bpmn.spec.SpecPackage.Bpmn_organisational);
  }

  public Bpmn setOrganisational(cleon.bpmn.spec.organisational.javamodel.IOrganisational organisational) {
    _setSingle(cleon.bpmn.spec.SpecPackage.Bpmn_organisational, organisational);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Bpmn setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.bpmn.spec.organigram.javamodel.IOrganigram.class, cleon.bpmn.spec.SpecPackage.Bpmn_organigram, visitor);
    _acceptSingle(cleon.bpmn.spec.organisational.javamodel.IOrganisational.class, cleon.bpmn.spec.SpecPackage.Bpmn_organisational, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.bpmn.spec.javamodel.IBpmn selectToMeOrganisational(cleon.bpmn.spec.organisational.javamodel.IOrganisational object) {
    return _getToMeSingle(object.getRepository(), cleon.bpmn.spec.javamodel.IBpmn.class, cleon.bpmn.spec.SpecPackage.Bpmn_organisational, object.getResource());
  }
  
  public static cleon.bpmn.spec.javamodel.IBpmn selectToMeOrganigram(cleon.bpmn.spec.organigram.javamodel.IOrganigram object) {
    return _getToMeSingle(object.getRepository(), cleon.bpmn.spec.javamodel.IBpmn.class, cleon.bpmn.spec.SpecPackage.Bpmn_organigram, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b0d96e05-7e49-11e5-85ce-e7c8e0b30f03,xbNZ/OIDeQ2zj7WY+1WcjVddM2Y=] */
