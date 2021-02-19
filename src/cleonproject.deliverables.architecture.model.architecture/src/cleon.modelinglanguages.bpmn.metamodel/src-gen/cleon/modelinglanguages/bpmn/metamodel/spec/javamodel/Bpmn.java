package cleon.modelinglanguages.bpmn.metamodel.spec.javamodel;

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
  public cleon.modelinglanguages.bpmn.metamodel.spec.organigram.javamodel.IOrganigram selectOrganigram() {
    return _getSingle(cleon.modelinglanguages.bpmn.metamodel.spec.organigram.javamodel.IOrganigram.class, cleon.modelinglanguages.bpmn.metamodel.spec.SpecPackage.Bpmn_organigram);
  }

  public Bpmn setOrganigram(cleon.modelinglanguages.bpmn.metamodel.spec.organigram.javamodel.IOrganigram organigram) {
    _setSingle(cleon.modelinglanguages.bpmn.metamodel.spec.SpecPackage.Bpmn_organigram, organigram);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.bpmn.metamodel.spec.organisational.javamodel.IOrganisational selectOrganisational() {
    return _getSingle(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.javamodel.IOrganisational.class, cleon.modelinglanguages.bpmn.metamodel.spec.SpecPackage.Bpmn_organisational);
  }

  public Bpmn setOrganisational(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.javamodel.IOrganisational organisational) {
    _setSingle(cleon.modelinglanguages.bpmn.metamodel.spec.SpecPackage.Bpmn_organisational, organisational);
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
    _acceptSingle(cleon.modelinglanguages.bpmn.metamodel.spec.organigram.javamodel.IOrganigram.class, cleon.modelinglanguages.bpmn.metamodel.spec.SpecPackage.Bpmn_organigram, visitor);
    _acceptSingle(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.javamodel.IOrganisational.class, cleon.modelinglanguages.bpmn.metamodel.spec.SpecPackage.Bpmn_organisational, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.bpmn.metamodel.spec.javamodel.IBpmn selectToMeOrganisational(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.javamodel.IOrganisational object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.bpmn.metamodel.spec.javamodel.IBpmn.class, cleon.modelinglanguages.bpmn.metamodel.spec.SpecPackage.Bpmn_organisational, object.getResource());
  }
  
  public static cleon.modelinglanguages.bpmn.metamodel.spec.javamodel.IBpmn selectToMeOrganigram(cleon.modelinglanguages.bpmn.metamodel.spec.organigram.javamodel.IOrganigram object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.bpmn.metamodel.spec.javamodel.IBpmn.class, cleon.modelinglanguages.bpmn.metamodel.spec.SpecPackage.Bpmn_organigram, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b0d96e05-7e49-11e5-85ce-e7c8e0b30f03,rIu3iQRqPjwnmBAHqY+2BULX2BE=] */
