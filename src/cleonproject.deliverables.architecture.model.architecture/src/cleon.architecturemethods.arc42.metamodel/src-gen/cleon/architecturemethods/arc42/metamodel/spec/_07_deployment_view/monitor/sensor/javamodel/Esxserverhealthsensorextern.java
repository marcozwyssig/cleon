package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Esxserverhealthsensorextern extends DynamicResource implements IEsxserverhealthsensorextern {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEsxserverhealthsensorextern> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEsxserverhealthsensorextern>() {
    
    @Override
    public IEsxserverhealthsensorextern create() {
      return new Esxserverhealthsensorextern();
    }
    
    @Override
    public IEsxserverhealthsensorextern create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Esxserverhealthsensorextern(resourceRepository, resource);
    }
  
  };

  public Esxserverhealthsensorextern() {
    super(IEsxserverhealthsensorextern.TYPE_ID);
  }
  
  public Esxserverhealthsensorextern(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEsxserverhealthsensorextern.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IIgnoreUnknoenWarnings selectIgnoreunknownwarnings() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IIgnoreUnknoenWarnings.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.esxserverhealthsensorextern_ignoreunknownwarnings);
  }

  public Esxserverhealthsensorextern setIgnoreunknownwarnings(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IIgnoreUnknoenWarnings ignoreunknownwarnings) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.esxserverhealthsensorextern_ignoreunknownwarnings, ignoreunknownwarnings);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Esxserverhealthsensorextern setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IIgnoreUnknoenWarnings.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.esxserverhealthsensorextern_ignoreunknownwarnings, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IEsxserverhealthsensorextern> selectToMeIgnoreunknownwarnings(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IIgnoreUnknoenWarnings object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IEsxserverhealthsensorextern.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.esxserverhealthsensorextern_ignoreunknownwarnings, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db50281c-c1eb-11ea-820f-9931558a898c,6K84Tw4mOyDy+F0uL5fWg84hEcc=] */
