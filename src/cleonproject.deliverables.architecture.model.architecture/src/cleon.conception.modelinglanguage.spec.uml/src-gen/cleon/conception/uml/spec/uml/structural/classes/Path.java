package cleon.conception.uml.spec.uml.structural.classes;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[8a4e3836-0e63-11e3-ba64-7778a0a14717,imports]] */
import cleon.conception.uml.spec.uml.structural.classes.javamodel.*;
import cleon.conception.uml.spec.uml.structural.classes.javamodel.Class;
import cleon.conception.uml.spec.uml.structural.classes.method.messageExchange.javamodel.*;
/* End Protected Region   [[8a4e3836-0e63-11e3-ba64-7778a0a14717,imports]] */

public class Path {

  /* Begin Protected Region [[8a4e3836-0e63-11e3-ba64-7778a0a14717]] */
  
  /* End Protected Region   [[8a4e3836-0e63-11e3-ba64-7778a0a14717]] */


  public static interface IClassifierFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c522ded4-26cb-11e3-a71a-b71d2dda9f8e")
    public java.lang.String GetTypeName();

    @IDynamicResourceExtension.MethodId("afbad413-97dd-11e3-bb9a-e57bbf5647bb")
    public List<cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackage> GetPackagesReverse();

    @IDynamicResourceExtension.MethodId("afbad41c-97dd-11e3-bb9a-e57bbf5647bb")
    public java.lang.String GetPackageName();

    @IDynamicResourceExtension.MethodId("afbafb3c-97dd-11e3-bb9a-e57bbf5647bb")
    public java.lang.String GetPackageNamespace();

  }
  
  public static interface IClassifierFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ClassifierFunctionsImpl implements IClassifierFunctionsImpl {

    public static final IClassifierFunctionsImpl INSTANCE = new ClassifierFunctionsImpl();

    private ClassifierFunctionsImpl() {}

  }
  
  public static class ClassifierFunctions {

    private ClassifierFunctions() {}

  }

  public static interface IMethodFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e9d1466b-299c-11e3-b126-5543aee7ce98")
    public java.lang.String GetMethodSignature();

    @IDynamicResourceExtension.MethodId("cc09db03-29a4-11e3-b126-5543aee7ce98")
    public java.lang.String GetMethodAsCollection();

    @IDynamicResourceExtension.MethodId("08549406-29a5-11e3-b126-5543aee7ce98")
    public java.lang.String GetAsyncMethodSignature();

    @IDynamicResourceExtension.MethodId("7e51a830-29a5-11e3-b126-5543aee7ce98")
    public java.lang.String GetSyncMethodSignature();

    @IDynamicResourceExtension.MethodId("3856c522-29a5-11e3-b126-5543aee7ce98")
    public java.lang.String GetReturnType();

    @IDynamicResourceExtension.MethodId("34173f90-634c-11e3-b1c5-c32a80755979")
    public java.lang.String GetMethodSignatureForInterface();

    @IDynamicResourceExtension.MethodId("41cc299e-634c-11e3-b1c5-c32a80755979")
    public java.lang.String GetAsyncMethodSignatureForInterface();

    @IDynamicResourceExtension.MethodId("3f36a1b1-a376-11e3-9113-ffc7f11b0a42")
    public java.lang.String GetParameter();

    @IDynamicResourceExtension.MethodId("0f9f5207-a482-11e3-a07f-f96d34c3de8f")
    public java.lang.String GetVoidOrTask();

    @IDynamicResourceExtension.MethodId("2bc4106e-a482-11e3-a07f-f96d34c3de8f")
    public java.lang.Boolean IsAsync();

    @IDynamicResourceExtension.MethodId("8cf91f46-d530-11e3-aa16-fda309a373dd")
    public java.lang.String GetParameters();

    @IDynamicResourceExtension.MethodId("09318207-d531-11e3-aa16-fda309a373dd")
    public java.lang.String GetSyncParameters();

    @IDynamicResourceExtension.MethodId("67d0396d-d531-11e3-aa16-fda309a373dd")
    public java.lang.String GetAsyncParameters();

  }
  
  public static interface IMethodFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("2bc4106e-a482-11e3-a07f-f96d34c3de8f")
    public java.lang.Boolean IsAsync(final cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethod method);

  }
  
  public static class MethodFunctionsImpl implements IMethodFunctionsImpl {

    public static final IMethodFunctionsImpl INSTANCE = new MethodFunctionsImpl();

    private MethodFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsAsync(final cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethod method) {
      /* Begin Protected Region [[2bc4106e-a482-11e3-a07f-f96d34c3de8f]] */
        return !(method.selectMep() instanceof ISyncRequestResponse);
      /* End Protected Region   [[2bc4106e-a482-11e3-a07f-f96d34c3de8f]] */
    }

  }
  
  public static class MethodFunctions {

    private MethodFunctions() {}

    public static java.lang.Boolean IsAsync(final cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethod method) {
      return DynamicResourceUtil.invoke(IMethodFunctionsImpl.class, MethodFunctionsImpl.INSTANCE, method).IsAsync(method);
    }

  }

  public static interface IParameterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("11140771-567e-11e3-a79c-0705324013db")
    public java.lang.String GetParameterAsCollection();

    @IDynamicResourceExtension.MethodId("111407ad-567e-11e3-a79c-0705324013db")
    public java.lang.String GetParameterType();

    @IDynamicResourceExtension.MethodId("d4cb45a3-a47f-11e3-a07f-f96d34c3de8f")
    public java.lang.String GetParameter();

  }
  
  public static interface IParameterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ParameterFunctionsImpl implements IParameterFunctionsImpl {

    public static final IParameterFunctionsImpl INSTANCE = new ParameterFunctionsImpl();

    private ParameterFunctionsImpl() {}

  }
  
  public static class ParameterFunctions {

    private ParameterFunctions() {}

  }

  public static interface IPropertyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("644816d6-29a7-11e3-b126-5543aee7ce98")
    public java.lang.String GetPropertySignature();

    @IDynamicResourceExtension.MethodId("fb7fca83-29a7-11e3-b126-5543aee7ce98")
    public java.lang.String GetPropertyAsCollection();

  }
  
  public static interface IPropertyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PropertyFunctionsImpl implements IPropertyFunctionsImpl {

    public static final IPropertyFunctionsImpl INSTANCE = new PropertyFunctionsImpl();

    private PropertyFunctionsImpl() {}

  }
  
  public static class PropertyFunctions {

    private PropertyFunctions() {}

  }

  public static interface IClassFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9e151a85-5c32-11e3-b5c2-4929c5d760c5")
    public cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass GetBase();

    @IDynamicResourceExtension.MethodId("b186134b-5c36-11e3-b5c2-4929c5d760c5")
    public java.lang.Boolean IsBase();

    @IDynamicResourceExtension.MethodId("6270d67f-5c39-11e3-b5c2-4929c5d760c5")
    public java.lang.Boolean IsNotAbstract();

    @IDynamicResourceExtension.MethodId("cb3aca5f-5ccf-11e3-b5c2-4929c5d760c5")
    public java.lang.Boolean isSubClass();

  }
  
  public static interface IClassFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9e151a85-5c32-11e3-b5c2-4929c5d760c5")
    public cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass GetBase(final cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass class_);

    @IDynamicResourceExtension.MethodId("b186134b-5c36-11e3-b5c2-4929c5d760c5")
    public java.lang.Boolean IsBase(final cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass class_);

    @IDynamicResourceExtension.MethodId("6270d67f-5c39-11e3-b5c2-4929c5d760c5")
    public java.lang.Boolean IsNotAbstract(final cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass class_);

    @IDynamicResourceExtension.MethodId("cb3aca5f-5ccf-11e3-b5c2-4929c5d760c5")
    public java.lang.Boolean isSubClass(final cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass class_);

  }
  
  public static class ClassFunctionsImpl implements IClassFunctionsImpl {

    public static final IClassFunctionsImpl INSTANCE = new ClassFunctionsImpl();

    private ClassFunctionsImpl() {}

    @Override
    public cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass GetBase(final cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass class_) {
      /* Begin Protected Region [[9e151a85-5c32-11e3-b5c2-4929c5d760c5]] */
		if( class_.selectExtends() == null)
		{
			return class_;
		}
		else
		{
			return GetBase(class_.selectExtends());
		}  
      /* End Protected Region   [[9e151a85-5c32-11e3-b5c2-4929c5d760c5]] */
    }

    @Override
    public java.lang.Boolean IsBase(final cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass class_) {
      /* Begin Protected Region [[b186134b-5c36-11e3-b5c2-4929c5d760c5]] */
        if( class_.selectExtends() == null)
    	  {    	    
    	    List<IClass> clazz = Class.selectToMeExtends(class_); 
    	  	return clazz != null && clazz.isEmpty() == false;
    	  }
      return false;   
      /* End Protected Region   [[b186134b-5c36-11e3-b5c2-4929c5d760c5]] */
    }

    @Override
    public java.lang.Boolean IsNotAbstract(final cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass class_) {
      /* Begin Protected Region [[6270d67f-5c39-11e3-b5c2-4929c5d760c5]] */
    	if (class_.selectIsAbstract() != null)
    	{
    		return !(class_.selectIsAbstract().booleanValue());
    	}
    	return true;     
      /* End Protected Region   [[6270d67f-5c39-11e3-b5c2-4929c5d760c5]] */
    }

    @Override
    public java.lang.Boolean isSubClass(final cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass class_) {
      /* Begin Protected Region [[cb3aca5f-5ccf-11e3-b5c2-4929c5d760c5]] */
    	return class_.selectExtends() != null; 
      /* End Protected Region   [[cb3aca5f-5ccf-11e3-b5c2-4929c5d760c5]] */
    }

  }
  
  public static class ClassFunctions {

    private ClassFunctions() {}

    public static cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass GetBase(final cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass class_) {
      return DynamicResourceUtil.invoke(IClassFunctionsImpl.class, ClassFunctionsImpl.INSTANCE, class_).GetBase(class_);
    }

    public static java.lang.Boolean IsBase(final cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass class_) {
      return DynamicResourceUtil.invoke(IClassFunctionsImpl.class, ClassFunctionsImpl.INSTANCE, class_).IsBase(class_);
    }

    public static java.lang.Boolean IsNotAbstract(final cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass class_) {
      return DynamicResourceUtil.invoke(IClassFunctionsImpl.class, ClassFunctionsImpl.INSTANCE, class_).IsNotAbstract(class_);
    }

    public static java.lang.Boolean isSubClass(final cleon.conception.uml.spec.uml.structural.classes.javamodel.IClass class_) {
      return DynamicResourceUtil.invoke(IClassFunctionsImpl.class, ClassFunctionsImpl.INSTANCE, class_).isSubClass(class_);
    }

  }

  public static interface IAssociationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cac65a1a-6ecb-11e3-b3c1-7d834d89b418")
    public java.lang.Boolean IsSuppressSubjectAutoProperty();

    @IDynamicResourceExtension.MethodId("52158130-6ed4-11e3-b3c1-7d834d89b418")
    public java.lang.Boolean IsObjectReadOnly();

    @IDynamicResourceExtension.MethodId("d09589e8-6ed4-11e3-b3c1-7d834d89b418")
    public java.lang.Boolean IsSubjectReadOnly();

  }
  
  public static interface IAssociationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("cac65a1a-6ecb-11e3-b3c1-7d834d89b418")
    public java.lang.Boolean IsSuppressSubjectAutoProperty(final cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociation association);

    @IDynamicResourceExtension.MethodId("52158130-6ed4-11e3-b3c1-7d834d89b418")
    public java.lang.Boolean IsObjectReadOnly(final cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociation association);

    @IDynamicResourceExtension.MethodId("d09589e8-6ed4-11e3-b3c1-7d834d89b418")
    public java.lang.Boolean IsSubjectReadOnly(final cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociation association);

  }
  
  public static class AssociationFunctionsImpl implements IAssociationFunctionsImpl {

    public static final IAssociationFunctionsImpl INSTANCE = new AssociationFunctionsImpl();

    private AssociationFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsSuppressSubjectAutoProperty(final cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociation association) {
      /* Begin Protected Region [[cac65a1a-6ecb-11e3-b3c1-7d834d89b418]] */
    	if (association.selectSuppressAutoProperty() == null)
    	{
    		return false;
    	}
    	
    	return association.selectSuppressAutoProperty().booleanValue();   
      /* End Protected Region   [[cac65a1a-6ecb-11e3-b3c1-7d834d89b418]] */
    }

    @Override
    public java.lang.Boolean IsObjectReadOnly(final cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociation association) {
      /* Begin Protected Region [[52158130-6ed4-11e3-b3c1-7d834d89b418]] */
        if( association.selectObjectReadOnly() == null)
        {
      	  return false;
        }
        return association.selectObjectReadOnly().booleanValue();  
      /* End Protected Region   [[52158130-6ed4-11e3-b3c1-7d834d89b418]] */
    }

    @Override
    public java.lang.Boolean IsSubjectReadOnly(final cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociation association) {
      /* Begin Protected Region [[d09589e8-6ed4-11e3-b3c1-7d834d89b418]] */
        if( association.selectSubjectReadOnly() == null)
        {
      	  return false;
        }
        return association.selectSubjectReadOnly().booleanValue();   
      /* End Protected Region   [[d09589e8-6ed4-11e3-b3c1-7d834d89b418]] */
    }

  }
  
  public static class AssociationFunctions {

    private AssociationFunctions() {}

    public static java.lang.Boolean IsSuppressSubjectAutoProperty(final cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociation association) {
      return DynamicResourceUtil.invoke(IAssociationFunctionsImpl.class, AssociationFunctionsImpl.INSTANCE, association).IsSuppressSubjectAutoProperty(association);
    }

    public static java.lang.Boolean IsObjectReadOnly(final cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociation association) {
      return DynamicResourceUtil.invoke(IAssociationFunctionsImpl.class, AssociationFunctionsImpl.INSTANCE, association).IsObjectReadOnly(association);
    }

    public static java.lang.Boolean IsSubjectReadOnly(final cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociation association) {
      return DynamicResourceUtil.invoke(IAssociationFunctionsImpl.class, AssociationFunctionsImpl.INSTANCE, association).IsSubjectReadOnly(association);
    }

  }

  public static interface ITemplateParameterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f0595eb5-a47e-11e3-a07f-f96d34c3de8f")
    public java.lang.String GetTemplateParameter();

  }
  
  public static interface ITemplateParameterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TemplateParameterFunctionsImpl implements ITemplateParameterFunctionsImpl {

    public static final ITemplateParameterFunctionsImpl INSTANCE = new TemplateParameterFunctionsImpl();

    private TemplateParameterFunctionsImpl() {}

  }
  
  public static class TemplateParameterFunctions {

    private TemplateParameterFunctions() {}

  }

  public static interface IPackageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f9dcf222-97dd-11e3-bb9a-e57bbf5647bb")
    public List<cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackage> GetPackagesReverse();

    @IDynamicResourceExtension.MethodId("23652716-01d9-11e4-ab1e-81fd30785d6d")
    public cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackage GetPackage();

    @IDynamicResourceExtension.MethodId("48e0af88-01f4-11e4-8e4d-5f45fa20862b")
    public List<cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier> GetClassifier();

    @IDynamicResourceExtension.MethodId("fa6cf58c-01f4-11e4-8e4d-5f45fa20862b")
    public List<cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackage> GetPackages();

  }
  
  public static interface IPackageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PackageFunctionsImpl implements IPackageFunctionsImpl {

    public static final IPackageFunctionsImpl INSTANCE = new PackageFunctionsImpl();

    private PackageFunctionsImpl() {}

  }
  
  public static class PackageFunctions {

    private PackageFunctions() {}

  }

  public static interface IEventForFieldFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8d227c8e-8133-11e4-8088-3b9944d3a0bd")
    public java.lang.String EventName();

    @IDynamicResourceExtension.MethodId("3d31206b-d200-11e4-84de-1fc870bd40d0")
    public java.lang.String PubSubEventName();

    @IDynamicResourceExtension.MethodId("c900acfd-d2d1-11e4-8b90-c7d981a5f2fd")
    public java.lang.String Name();

  }
  
  public static interface IEventForFieldFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EventForFieldFunctionsImpl implements IEventForFieldFunctionsImpl {

    public static final IEventForFieldFunctionsImpl INSTANCE = new EventForFieldFunctionsImpl();

    private EventForFieldFunctionsImpl() {}

  }
  
  public static class EventForFieldFunctions {

    private EventForFieldFunctions() {}

  }

  public static interface IEventFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c0a8ee12-8464-11e4-b694-d31e04b0409a")
    public java.lang.String EventName();

    @IDynamicResourceExtension.MethodId("346a1e03-d200-11e4-84de-1fc870bd40d0")
    public java.lang.String PubSubEventName();

    @IDynamicResourceExtension.MethodId("b467b2cc-d2d1-11e4-8b90-c7d981a5f2fd")
    public java.lang.String Name();

  }
  
  public static interface IEventFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EventFunctionsImpl implements IEventFunctionsImpl {

    public static final IEventFunctionsImpl INSTANCE = new EventFunctionsImpl();

    private EventFunctionsImpl() {}

  }
  
  public static class EventFunctions {

    private EventFunctions() {}

  }

  public static interface ICustomEventFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d2651bd8-d30b-11e4-8b90-c7d981a5f2fd")
    public java.lang.String EventName();

    @IDynamicResourceExtension.MethodId("d2651be8-d30b-11e4-8b90-c7d981a5f2fd")
    public java.lang.String PubSubEventName();

    @IDynamicResourceExtension.MethodId("d2651bf3-d30b-11e4-8b90-c7d981a5f2fd")
    public java.lang.String Name();

  }
  
  public static interface ICustomEventFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CustomEventFunctionsImpl implements ICustomEventFunctionsImpl {

    public static final ICustomEventFunctionsImpl INSTANCE = new CustomEventFunctionsImpl();

    private CustomEventFunctionsImpl() {}

  }
  
  public static class CustomEventFunctions {

    private CustomEventFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,8a4e3836-0e63-11e3-ba64-7778a0a14717,fAnlklnxc0nISCDYu/BbZUmzc5I=] */
