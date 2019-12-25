package cleon.architecturemethods.itarc42.metamodel.template.plantuml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[30168fe9-0e23-11e9-8b4c-f9aec93d8b56,imports]] */

/* End Protected Region   [[30168fe9-0e23-11e9-8b4c-f9aec93d8b56,imports]] */

public class FunctionSpace_Segmentation_PlantUml {

  /* Begin Protected Region [[30168fe9-0e23-11e9-8b4c-f9aec93d8b56]] */
  
  /* End Protected Region   [[30168fe9-0e23-11e9-8b4c-f9aec93d8b56]] */


  public static interface ISegmentationDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("690e74d7-0e23-11e9-8b4c-f9aec93d8b56")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IZone> SelectZone();

    @IDynamicResourceExtension.MethodId("a15643d8-0e23-11e9-8b4c-f9aec93d8b56")
    public java.lang.String RenderUmlElement();

  }
  
  public static interface ISegmentationDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SegmentationDiagramFunctionsImpl implements ISegmentationDiagramFunctionsImpl {

    public static final ISegmentationDiagramFunctionsImpl INSTANCE = new SegmentationDiagramFunctionsImpl();

    private SegmentationDiagramFunctionsImpl() {}

  }
  
  public static class SegmentationDiagramFunctions {

    private SegmentationDiagramFunctions() {}

  }

  public static interface IZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("208047b3-0e24-11e9-8b4c-f9aec93d8b56")
    public java.lang.String RenderZone();

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

  public static interface ISecurityZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5ef1c6d8-0eba-11e9-ab93-7d5aca01d5cb")
    public java.lang.String RenderZone();

  }
  
  public static interface ISecurityZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SecurityZoneFunctionsImpl implements ISecurityZoneFunctionsImpl {

    public static final ISecurityZoneFunctionsImpl INSTANCE = new SecurityZoneFunctionsImpl();

    private SecurityZoneFunctionsImpl() {}

  }
  
  public static class SecurityZoneFunctions {

    private SecurityZoneFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,30168fe9-0e23-11e9-8b4c-f9aec93d8b56,UJQPDu9hw+wlx9mfwnvRBEDfdQw=] */
