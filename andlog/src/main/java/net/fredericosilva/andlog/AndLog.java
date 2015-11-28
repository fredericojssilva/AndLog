package net.fredericosilva.andlog;

import android.util.Log;
import com.google.common.base.Throwables;

/**
 * Created by frederico <fredericojssilva@gmail.com>
 * on 29/10/2015 .
 */
public final class AndLog {
  public static boolean isDebug = true;

  private AndLog() {

  }

  public static void setDebugMode(boolean debug) {
    isDebug = debug;
  }

  public static Logger withTag(String tag) {
    return Logger.getInstance(tag);
  }

  /*
  DEBUG
   */
  public static void d(String... messages) {
    if (isDebug) {
      Logger.getInstance(getTag()).d(messages);
    }
  }

  /*
    INFO
  */
  public static void i(String... messages) {
    Logger.getInstance(getTag()).i(messages);
  }

  /*
  VERBOSE
  */
  public static void v(String... messages) {
    Logger.getInstance(getTag()).v(messages);
  }

  /*
  WTF
  */
  public static void wtf(String... messages) {
    if (isDebug) {
      Logger.getInstance(getTag()).wtf(messages);
    }
  }

  /*
  WARN
  */
  public static void w(String... messages) {
    Logger.getInstance(getTag()).w(messages);
  }

  /*
  ERROR
  */
  public static void e(String message, Throwable e) {
    Logger.getInstance(getTag())
        .e(StringUtils.getComposedString(message, Throwables.getStackTraceAsString(e)));
  }

  public static void e(String... message) {
    Logger.getInstance(getTag()).e(message);
  }

  public static void hereIam() {
    if (isDebug) {
      Log.d(getTag(), getCallerMethod() + " called");
    }
  }

  private static String getTag() {
    String className = new Exception().getStackTrace()[2].getClassName();

    return className.substring(className.lastIndexOf('.') + 1);
  }

  private static String getCallerMethod() {
    return new Exception().getStackTrace()[2].getMethodName();
  }
}
