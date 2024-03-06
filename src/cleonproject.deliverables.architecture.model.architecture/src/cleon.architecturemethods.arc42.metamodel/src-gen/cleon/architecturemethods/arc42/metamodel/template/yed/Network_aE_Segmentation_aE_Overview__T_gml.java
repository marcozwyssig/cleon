package cleon.architecturemethods.arc42.metamodel.template.yed;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[e2605a04-070c-11ec-a1d2-b10f798ffb28,imports]] */

/* End Protected Region   [[e2605a04-070c-11ec-a1d2-b10f798ffb28,imports]] */

public class Network_aE_Segmentation_aE_Overview__T_gml {

  /* Begin Protected Region [[e2605a04-070c-11ec-a1d2-b10f798ffb28]] */
  
  /* End Protected Region   [[e2605a04-070c-11ec-a1d2-b10f798ffb28]] */


  public static interface IZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e260823b-070c-11ec-a1d2-b10f798ffb28")
    public java.lang.String GenerateZone();

    @IDynamicResourceExtension.MethodId("96acf0ff-0710-11ec-a1d2-b10f798ffb28")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("146b7da1-0711-11ec-a1d2-b10f798ffb28")
    public java.lang.String AssignComponents();

  }
  
  public static interface IZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ZoneFunctionsImpl implements IZoneFunctionsImpl {

    public static final IZoneFunctionsImpl INSTANCE = new ZoneFunctionsImpl();

    private ZoneFunctionsImpl() {}

  }
  
  public static class ZoneFunctions {

    private ZoneFunctions() {}

  }

  public static interface ISecuritySubZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("aa609412-0710-11ec-a1d2-b10f798ffb28")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("28253c11-0711-11ec-a1d2-b10f798ffb28")
    public java.lang.String AssignComponents();

  }
  
  public static interface ISecuritySubZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SecuritySubZoneFunctionsImpl implements ISecuritySubZoneFunctionsImpl {

    public static final ISecuritySubZoneFunctionsImpl INSTANCE = new SecuritySubZoneFunctionsImpl();

    private SecuritySubZoneFunctionsImpl() {}

  }
  
  public static class SecuritySubZoneFunctions {

    private SecuritySubZoneFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,e2605a04-070c-11ec-a1d2-b10f798ffb28,s4/VlC6+LREGLIuAypNl5TOl1Rw=] */
