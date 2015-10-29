package net.fredericosilva.andlog;

import android.util.Log;

/**
 * Created by frederico <fredericojssilva@gmail.com>
 * on 29/10/2015 .
 */
public class AndLog {
    public static boolean LOG_DEBUG_MESSAGES = true;

    /*
    DEBUG
     */
    public static void d(String message) {
        d(getTag(), message);
    }

    public static void d(String tag, String message) {
        if (LOG_DEBUG_MESSAGES) {
            Log.d(tag, message);
        }
    }

    /*
      INFO
    */
    public static void i(String message) {
        i(getTag(), message);
    }

    public static void i(String tag, String message) {
        if (LOG_DEBUG_MESSAGES) {
            Log.i(tag, message);
        }
    }
    /*
    VERBOSE
    */
    public static void v(String message) {
        v(getTag(), message);
    }

    public static void v(String tag, String message) {
        if (LOG_DEBUG_MESSAGES) {
            Log.v(tag, message);
        }
    }
    /*
    WTF
    */
    public static void wtf(String message) {
        wtf(getTag(), message);
    }

    public static void wtf(String tag, String message) {
        if (LOG_DEBUG_MESSAGES) {
            Log.wtf(tag, message);
        }
    }

    /*
    WARN
    */
    public static void w(String message) {
        w(getTag(), message);
    }

    public static void w(String tag, String message) {
        if (LOG_DEBUG_MESSAGES) {
            Log.w(tag, message);
        }
    }

    /*
    ERROR
    */
    public static void e(String message) {
        e(getTag(), message);
    }

    public static void e(String tag, String message) {
        if (LOG_DEBUG_MESSAGES) {
            Log.e(tag, message);
        }
    }

    private static String getTag() {
        return new Exception().getStackTrace()[1].getClassName();
    }
}
