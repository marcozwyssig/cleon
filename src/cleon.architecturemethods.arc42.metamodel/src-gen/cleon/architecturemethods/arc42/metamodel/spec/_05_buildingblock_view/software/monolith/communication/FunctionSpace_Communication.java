package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b938d789-cf1f-11ee-8c06-a5102392725a,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.Message;

/* End Protected Region   [[b938d789-cf1f-11ee-8c06-a5102392725a,imports]] */

public class FunctionSpace_Communication {

  /* Begin Protected Region [[b938d789-cf1f-11ee-8c06-a5102392725a]] */
  
  /* End Protected Region   [[b938d789-cf1f-11ee-8c06-a5102392725a]] */


  public static interface IEnumerationValueFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4edcab4a-cf28-11ee-8c06-a5102392725a")
    public java.lang.String SimpleName();

  }
  
  public static interface IEnumerationValueFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EnumerationValueFunctionsImpl implements IEnumerationValueFunctionsImpl {

    public static final IEnumerationValueFunctionsImpl INSTANCE = new EnumerationValueFunctionsImpl();

    private EnumerationValueFunctionsImpl() {}

  }
  
  public static class EnumerationValueFunctions {

    private EnumerationValueFunctions() {}

  }

  public static interface IFieldFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f2670945-fac7-11f0-81b8-83fdbb37c0b0")
    public java.lang.String FieldName();

    @IDynamicResourceExtension.MethodId("4851d0e2-fac8-11f0-81b8-83fdbb37c0b0")
    public java.lang.Integer FieldPosition();

    @IDynamicResourceExtension.MethodId("503aa8fb-fac8-11f0-81b8-83fdbb37c0b0")
    public java.lang.String SimpleName();

  }
  
  public static interface IFieldFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4851d0e2-fac8-11f0-81b8-83fdbb37c0b0")
    public java.lang.Integer FieldPosition(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField field);

  }
  
  public static class FieldFunctionsImpl implements IFieldFunctionsImpl {

    public static final IFieldFunctionsImpl INSTANCE = new FieldFunctionsImpl();

    private FieldFunctionsImpl() {}

    @Override
    public java.lang.Integer FieldPosition(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField field) {
      /* Begin Protected Region [[4851d0e2-fac8-11f0-81b8-83fdbb37c0b0]] */
    	int fieldIndex = 0;
    	for (var currentField : Message.selectToMeFields(field).selectFields().values()) {
    	    if (currentField.equals(field)) {
    	        return fieldIndex;
    	    }
    	    fieldIndex++;
    	}
    	return -1;
      /* End Protected Region   [[4851d0e2-fac8-11f0-81b8-83fdbb37c0b0]] */
    }

  }
  
  public static class FieldFunctions {

    private FieldFunctions() {}

    public static java.lang.Integer FieldPosition(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField field) {
      return DynamicResourceUtil.invoke(IFieldFunctionsImpl.class, FieldFunctionsImpl.INSTANCE, field).FieldPosition(field);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b938d789-cf1f-11ee-8c06-a5102392725a,Lkt9KkOqaunzTO0WVJzcOdZLuig=] */
