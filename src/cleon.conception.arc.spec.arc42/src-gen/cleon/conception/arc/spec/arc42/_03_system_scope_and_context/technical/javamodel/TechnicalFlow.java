package cleon.conception.arc.spec.arc42._03_system_scope_and_context.technical.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TechnicalFlow extends DynamicResource implements ITechnicalFlow {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITechnicalFlow> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITechnicalFlow>() {
    
    @Override
    public ITechnicalFlow create() {
      return new TechnicalFlow();
    }
    
    @Override
    public ITechnicalFlow create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TechnicalFlow(resourceRepository, resource);
    }
  
  };

  public TechnicalFlow() {
    super(ITechnicalFlow.TYPE_ID);
  }
  
  public TechnicalFlow(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITechnicalFlow.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectDirectionTo() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.arc.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.Flow_directionTo);
  }
    
  public void setDirectionTo(java.lang.Boolean directionTo) {
     _setSingleAttribute(cleon.conception.arc.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.Flow_directionTo, directionTo);
  }

  @Override
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.ITechnicalMember selectFrom() {
    return _getSingle(cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.ITechnicalMember.class, cleon.conception.arc.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.TechnicalFlow_from);
  }

  public TechnicalFlow setFrom(cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.ITechnicalMember from) {
    _setSingle(cleon.conception.arc.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.TechnicalFlow_from, from);
    return this;
  }
    
  @Override
  public cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.ITechnicalMember selectTo() {
    return _getSingle(cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.ITechnicalMember.class, cleon.conception.arc.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.TechnicalFlow_to);
  }

  public TechnicalFlow setTo(cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.ITechnicalMember to) {
    _setSingle(cleon.conception.arc.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.TechnicalFlow_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TechnicalFlow setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.arc.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.Flow_directionTo, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.ITechnicalMember.class, cleon.conception.arc.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.TechnicalFlow_from, visitor);
    _acceptSingle(cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.ITechnicalMember.class, cleon.conception.arc.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.TechnicalFlow_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.arc.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalFlow> selectToMeFrom(cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.ITechnicalMember object) {
    return _getToMeList(object.getRepository(), cleon.conception.arc.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalFlow.class, cleon.conception.arc.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.TechnicalFlow_from, object.getResource());
  }
  
  public static java.util.List<cleon.conception.arc.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalFlow> selectToMeTo(cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.ITechnicalMember object) {
    return _getToMeList(object.getRepository(), cleon.conception.arc.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalFlow.class, cleon.conception.arc.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.TechnicalFlow_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8ca0b7d4-2801-11e6-b263-9db62e053e59,clzLKq58o3u9V2r2Mns+fgeHRfI=] */
