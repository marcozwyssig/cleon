package cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AbstractInterface extends DynamicResource implements IAbstractInterface {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbstractInterface> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbstractInterface>() {
    
    @Override
    public IAbstractInterface create() {
      return new AbstractInterface();
    }
    
    @Override
    public IAbstractInterface create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AbstractInterface(resourceRepository, resource);
    }
  
  };

  public AbstractInterface() {
    super(IAbstractInterface.TYPE_ID);
  }
  
  public AbstractInterface(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAbstractInterface.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.javamodel.IInterfaceData> selectData() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.javamodel.IInterfaceData.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.InterfacesPackage.AbstractInterface_data);
  }

  public AbstractInterface setData(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.javamodel.IInterfaceData> data) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.InterfacesPackage.AbstractInterface_data, data);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> selectMethods() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.MethodClass_methods);
  }

  public AbstractInterface setMethods(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> methods) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.MethodClass_methods, methods);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AbstractInterface setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.javamodel.IInterfaceData.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.InterfacesPackage.AbstractInterface_data, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.MethodClass_methods, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.javamodel.IAbstractInterface> selectToMeData(cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.javamodel.IInterfaceData object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.javamodel.IAbstractInterface.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.InterfacesPackage.AbstractInterface_data, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b626174f-26c1-11e3-a71a-b71d2dda9f8e,lSlqkfYu/xXKVYxMa38xsP3mt1Q=] */
