package net.fredericosilva.andlog;

import android.text.TextUtils;

/**
 * Created by fsilva <fsilva@thinkingphones.com>
 * on 28/11/2015 .
 */
final class StringUtils {
  private StringUtils() {

  }

  protected static String getComposedString(String... messages) {
    return TextUtils.join("\n", messages);
  }
}
