package cleon.common.resources.metamodel.spec.literals;

import ch.actifsource.util.log.Logger;

/**
 * Thin wrapper around Actifsource Logger adding String.format()-style parameterized logging.
 * Usage: Log.info("Processing %s children for %s", count, node);
 */
public final class Log {

    private static final Logger LOGGER = Logger.instance();

    private Log() {}

    public static void info(String template, Object... args) {
        LOGGER.logInfo(String.format(template, args));
    }

    public static void debug(String template, Object... args) {
        LOGGER.logVerbose(String.format(template, args));
    }

    public static void error(String template, Object... args) {
        if (args != null && args.length > 0 && args[args.length - 1] instanceof Throwable t) {
            var reducedArgs = new Object[args.length - 1];
            System.arraycopy(args, 0, reducedArgs, 0, reducedArgs.length);
            LOGGER.logError(String.format(template, reducedArgs) + "\n" + stackTraceOf(t));
        } else {
            LOGGER.logError(String.format(template, args));
        }
    }

    private static String stackTraceOf(Throwable t) {
        var sb = new StringBuilder();
        for (var element : t.getStackTrace()) {
            sb.append("  at ").append(element).append("\n");
        }
        return sb.toString();
    }
}