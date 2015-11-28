package net.fredericosilva.andlog;

import android.util.Log;
import com.google.common.base.Throwables;

/**
 * Created by fsilva <fredericojssilva@gmail.com>
 * on 28/11/2015 .
 */
public class Logger {
  private String mTag;

  public Logger(String tag) {
    mTag = tag;
  }

  public static Logger getInstance(String tag) {
    return new Logger(tag);
  }

  /*
  DEBUG
 */
  public final void d(String... messages) {
    Log.d(mTag, StringUtils.getComposedString(messages));
  }

  /*
    INFO
  */
  public final void i(String... messages) {
    Log.i(mTag, StringUtils.getComposedString(messages));
  }

  /*
  VERBOSE
  */
  public final void v(String... messages) {
    Log.v(mTag, StringUtils.getComposedString(messages));
  }

  /*
  WTF
  */
  public final void wtf(String... messages) {
    Log.wtf(mTag, StringUtils.getComposedString(messages));
  }

  /*
  WARN
  */
  public final void w(String... messages) {
    Log.w(mTag, StringUtils.getComposedString(messages));
  }

  /*
  ERROR
  */
  public final void e(String message, Throwable e) {
    e(StringUtils.getComposedString(message, Throwables.getStackTraceAsString(e)));
  }

  public final void e(String... message) {
    Log.e(mTag, StringUtils.getComposedString(message));
  }
}
