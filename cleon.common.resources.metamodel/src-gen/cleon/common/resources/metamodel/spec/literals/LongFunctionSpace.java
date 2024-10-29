package cleon.common.resources.metamodel.spec.literals;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[349cbde4-ff3c-11eb-bfe7-29eb44ce217c,imports]] */
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
/* End Protected Region   [[349cbde4-ff3c-11eb-bfe7-29eb44ce217c,imports]] */

public class LongFunctionSpace {

  /* Begin Protected Region [[349cbde4-ff3c-11eb-bfe7-29eb44ce217c]] */
  
  /* End Protected Region   [[349cbde4-ff3c-11eb-bfe7-29eb44ce217c]] */


  public static interface ILongLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4f796b7f-ff3c-11eb-bfe7-29eb44ce217c")
    public java.lang.String humanReadableByteCountBin();

    @IDynamicResourceExtension.MethodId("b670f2c2-ff3f-11eb-bfe7-29eb44ce217c")
    public java.lang.String humanReadableByteCountSI();

  }
  
  public static interface ILongLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4f796b7f-ff3c-11eb-bfe7-29eb44ce217c")
    public java.lang.String humanReadableByteCountBin(final java.lang.Long longLiteral);

    @IDynamicResourceExtension.MethodId("b670f2c2-ff3f-11eb-bfe7-29eb44ce217c")
    public java.lang.String humanReadableByteCountSI(final java.lang.Long longLiteral);

  }
  
  public static class LongLiteralFunctionsImpl implements ILongLiteralFunctionsImpl {

    public static final ILongLiteralFunctionsImpl INSTANCE = new LongLiteralFunctionsImpl();

    private LongLiteralFunctionsImpl() {}

    @Override
    public java.lang.String humanReadableByteCountBin(final java.lang.Long longLiteral) {
      /* Begin Protected Region [[4f796b7f-ff3c-11eb-bfe7-29eb44ce217c]] */
        long absB = longLiteral == Long.MIN_VALUE ? Long.MAX_VALUE : Math.abs(longLiteral);
        if (absB < 1024) {
            return longLiteral + " B";
        }
        long value = absB;
        CharacterIterator ci = new StringCharacterIterator("KMGTPE");
        for (int i = 40; i >= 0 && absB > 0xfffccccccccccccL >> i; i -= 10) {
            value >>= 10;
            ci.next();
        }
        value *= Long.signum(longLiteral);
        return String.format("%.1f %ciB", value / 1024.0, ci.current());   
      /* End Protected Region   [[4f796b7f-ff3c-11eb-bfe7-29eb44ce217c]] */
    }

    @Override
    public java.lang.String humanReadableByteCountSI(final java.lang.Long longLiteral) {
      /* Begin Protected Region [[b670f2c2-ff3f-11eb-bfe7-29eb44ce217c]] */
    	var bytes = longLiteral;
        if (-1000 < bytes && bytes < 1000) {
            return bytes + " B";
        }
        CharacterIterator ci = new StringCharacterIterator("kMGTPE");
        while (bytes <= -999_950 || bytes >= 999_950) {
        	bytes /= 1000;
            ci.next();
        }
        return String.format("%.1f %cB", bytes / 1000.0, ci.current());   
      /* End Protected Region   [[b670f2c2-ff3f-11eb-bfe7-29eb44ce217c]] */
    }

  }
  
  public static class LongLiteralFunctions {

    private LongLiteralFunctions() {}

    public static java.lang.String humanReadableByteCountBin(final java.lang.Long longLiteral) {
      return DynamicResourceUtil.invoke(ILongLiteralFunctionsImpl.class, LongLiteralFunctionsImpl.INSTANCE, longLiteral).humanReadableByteCountBin(longLiteral);
    }

    public static java.lang.String humanReadableByteCountSI(final java.lang.Long longLiteral) {
      return DynamicResourceUtil.invoke(ILongLiteralFunctionsImpl.class, LongLiteralFunctionsImpl.INSTANCE, longLiteral).humanReadableByteCountSI(longLiteral);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,349cbde4-ff3c-11eb-bfe7-29eb44ce217c,P0a6MNHs+O98rtxkze8Vb7L/u74=] */
