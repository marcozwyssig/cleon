package cleon.common.resources.metamodel.spec.literals;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[687a9337-070f-11ec-a1d2-b10f798ffb28,imports]] */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* End Protected Region   [[687a9337-070f-11ec-a1d2-b10f798ffb28,imports]] */

public class GuidFunctionSpace {

  /* Begin Protected Region [[687a9337-070f-11ec-a1d2-b10f798ffb28]] */

  /* End Protected Region   [[687a9337-070f-11ec-a1d2-b10f798ffb28]] */


  public static interface IGuidFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ced062d0-cc4e-11ea-8b73-6b1c6b53a7a6")
    public java.lang.Integer id();

    /**
     * Positions: 0, 9, 18, 27
     */
    @IDynamicResourceExtension.MethodId("74703b6c-d7c7-11ee-9944-773b3d757386")
    public java.lang.String fourDigitKey();

    @IDynamicResourceExtension.MethodId("b0b664fa-2f14-11f0-9f77-e70293d1379e")
    public java.lang.String hyphensToUnderscore();

  }
  
  public static interface IGuidFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("ced062d0-cc4e-11ea-8b73-6b1c6b53a7a6")
    public java.lang.Integer id(final java.util.UUID guid);

    /**
     * Positions: 0, 9, 18, 27
     */
    @IDynamicResourceExtension.MethodId("74703b6c-d7c7-11ee-9944-773b3d757386")
    public java.lang.String fourDigitKey(final java.util.UUID guid);

    @IDynamicResourceExtension.MethodId("b0b664fa-2f14-11f0-9f77-e70293d1379e")
    public java.lang.String hyphensToUnderscore(final java.util.UUID guid);

  }
  
  public static class GuidFunctionsImpl implements IGuidFunctionsImpl {

    public static final IGuidFunctionsImpl INSTANCE = new GuidFunctionsImpl();

    private GuidFunctionsImpl() {}

    @Override
    public java.lang.Integer id(final java.util.UUID guid) {
      /* Begin Protected Region [[ced062d0-cc4e-11ea-8b73-6b1c6b53a7a6]] */
      return guid.hashCode();
      /* End Protected Region   [[ced062d0-cc4e-11ea-8b73-6b1c6b53a7a6]] */
    }

    @Override
    public java.lang.String fourDigitKey(final java.util.UUID guid) {
      /* Begin Protected Region [[74703b6c-d7c7-11ee-9944-773b3d757386]] */
      // Get bytes from the UUID string
      final var uuidBytes = guid.toString().getBytes(StandardCharsets.UTF_8);

      // Create a hash of the UUID bytes
      MessageDigest md;
      try {
      	md = MessageDigest.getInstance("SHA-256");
      	final var hash = md.digest(uuidBytes);

      	// Use a portion of the hash to create an integer
      	final var intFromHash = (hash[0] & 0xFF) << 24 | (hash[1] & 0xFF) << 16 | (hash[2] & 0xFF) << 8 | hash[3] & 0xFF;

      	return String.format("%04d", Math.abs(intFromHash % 10000));
      } catch (final NoSuchAlgorithmException e) {
      	e.printStackTrace();
      }
      return null;

      /* End Protected Region   [[74703b6c-d7c7-11ee-9944-773b3d757386]] */
    }

    @Override
    public java.lang.String hyphensToUnderscore(final java.util.UUID guid) {
      /* Begin Protected Region [[b0b664fa-2f14-11f0-9f77-e70293d1379e]] */
    	 return guid.toString().replace("-", "_").toUpperCase();
      /* End Protected Region   [[b0b664fa-2f14-11f0-9f77-e70293d1379e]] */
    }

  }
  
  public static class GuidFunctions {

    private GuidFunctions() {}

    public static java.lang.Integer id(final java.util.UUID guid) {
      return DynamicResourceUtil.invoke(IGuidFunctionsImpl.class, GuidFunctionsImpl.INSTANCE, guid).id(guid);
    }

    /**
     * Positions: 0, 9, 18, 27
     */
    public static java.lang.String fourDigitKey(final java.util.UUID guid) {
      return DynamicResourceUtil.invoke(IGuidFunctionsImpl.class, GuidFunctionsImpl.INSTANCE, guid).fourDigitKey(guid);
    }

    public static java.lang.String hyphensToUnderscore(final java.util.UUID guid) {
      return DynamicResourceUtil.invoke(IGuidFunctionsImpl.class, GuidFunctionsImpl.INSTANCE, guid).hyphensToUnderscore(guid);
    }

  }

  public static interface IAnyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("702ae505-2f25-11f0-a641-656c88d7f94a")
    public java.util.UUID randomGuid();

  }
  
  public static interface IAnyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("702ae505-2f25-11f0-a641-656c88d7f94a")
    public java.util.UUID randomGuid(final java.lang.Object any);

  }
  
  public static class AnyFunctionsImpl implements IAnyFunctionsImpl {

    public static final IAnyFunctionsImpl INSTANCE = new AnyFunctionsImpl();

    private AnyFunctionsImpl() {}

    @Override
    public java.util.UUID randomGuid(final java.lang.Object any) {
      /* Begin Protected Region [[702ae505-2f25-11f0-a641-656c88d7f94a]] */
       return java.util.UUID.randomUUID();
      /* End Protected Region   [[702ae505-2f25-11f0-a641-656c88d7f94a]] */
    }

  }
  
  public static class AnyFunctions {

    private AnyFunctions() {}

    public static java.util.UUID randomGuid(final java.lang.Object any) {
      return DynamicResourceUtil.invoke(IAnyFunctionsImpl.class, AnyFunctionsImpl.INSTANCE, any).randomGuid(any);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,687a9337-070f-11ec-a1d2-b10f798ffb28,5WMd8kvPtDnSY7zi2Gzd6N6ywyo=] */
