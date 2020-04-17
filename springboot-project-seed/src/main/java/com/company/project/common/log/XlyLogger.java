package com.company.project.common.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

/**
*@author zizuo.zdh
*@Description TODO
*@Date 2018/12/14 11:47
*@Param
*@return
*
**/
public class XlyLogger {

  public static Logger get(Class<?> clazz) {
    return LoggerFactory.getLogger(clazz);
  }

  public static Logger get(String name) {
    return LoggerFactory.getLogger(name);
  }

  public static Logger get() {
    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
    return LoggerFactory.getLogger(stackTrace[2].getClassName());
  }


  public boolean isTraceEnabled() {
    return isTraceEnabled();
  }

  public void trace(String msg) {
    trace(msg);
  }

  public void trace(String format, Object arg) {
    trace(format, arg);
  }

  public void trace(String format, Object arg1, Object arg2) {
    trace(format, arg1, arg2);
  }

  public void trace(String format, Object... arguments) {
    trace(format, arguments);
  }

  public void trace(String msg, Throwable t) {
    trace(msg, t);
  }

  public boolean isTraceEnabled(Marker marker) {
    return isTraceEnabled();
  }

  public void trace(Marker marker, String msg) {
    trace(marker, msg);
  }

  public void trace(Marker marker, String format, Object arg) {
    trace(marker, format, arg);
  }

  public void trace(Marker marker, String format, Object arg1, Object arg2) {
    trace(marker, format, arg1, arg2);
  }

  public void trace(Marker marker, String format, Object... argArray) {
    trace(marker, format, argArray);
  }

  public void trace(Marker marker, String msg, Throwable t) {
    trace(marker, msg, t);
  }

  public boolean isDebugEnabled() {
    return isDebugEnabled();
  }

  public void debug(String msg) {
    debug(msg);
  }

  public void debug(String format, Object arg) {
    debug(format, arg);
  }

  public void debug(String format, Object arg1, Object arg2) {
    debug(format, arg1, arg2);
  }

  public void debug(String format, Object... arguments) {
    debug(format, arguments);
  }

  public void debug(String msg, Throwable t) {
    debug(msg, t);
  }

  public boolean isDebugEnabled(Marker marker) {
    return isDebugEnabled(marker);
  }

  public void debug(Marker marker, String msg) {
    debug(marker, msg);
  }

  public void debug(Marker marker, String format, Object arg) {
    debug(marker, format, arg);
  }

  public void debug(Marker marker, String format, Object arg1, Object arg2) {
    debug(marker, format, arg1, arg2);
  }

  public void debug(Marker marker, String format, Object... arguments) {
    debug(marker, format, arguments);
  }

  public void debug(Marker marker, String msg, Throwable t) {
    debug(marker, msg, t);
  }

  public boolean isInfoEnabled() {
    return isInfoEnabled();
  }

  public void info(String msg) {
    info(msg);
  }

  public void info(String format, Object arg) {
    info(format, arg);
  }

  public void info(String format, Object arg1, Object arg2) {
    info(format, arg1, arg2);
  }

  public void info(String format, Object... arguments) {
    info(format, arguments);
  }

  public void info(String msg, Throwable t) {
    info(msg, t);
  }

  public boolean isInfoEnabled(Marker marker) {
    return isInfoEnabled();
  }

  public void info(Marker marker, String msg) {
    info(marker, msg);
  }

  public void info(Marker marker, String format, Object arg) {
    info(marker, format, arg);
  }

  public void info(Marker marker, String format, Object arg1, Object arg2) {
    info(marker, format, arg1, arg2);
  }

  public void info(Marker marker, String format, Object... arguments) {
    info(marker, format, arguments);
  }

  public void info(Marker marker, String msg, Throwable t) {
    info(marker, msg, t);
  }

  public boolean isWarnEnabled() {
    return isWarnEnabled();
  }

  public void warn(String msg) {
    warn(msg);
  }

  public void warn(String format, Object arg) {
    warn(format, arg);
  }

  public void warn(String format, Object... arguments) {
    warn(format, arguments);
  }

  public void warn(String format, Object arg1, Object arg2) {
    warn(format, arg1, arg2);
  }

  public void warn(String msg, Throwable t) {
    warn(msg, t);
  }

  public boolean isWarnEnabled(Marker marker) {
    return isWarnEnabled(marker);
  }

  public void warn(Marker marker, String msg) {
    warn(marker, msg);
  }

  public void warn(Marker marker, String format, Object arg) {
    warn(marker, format, arg);
  }

  public void warn(Marker marker, String format, Object arg1, Object arg2) {
    warn(marker, format, arg1, arg2);
  }

  public void warn(Marker marker, String format, Object... arguments) {
    warn(marker, format, arguments);
  }

  public void warn(Marker marker, String msg, Throwable t) {
    warn(marker, msg, t);
  }

  public boolean isErrorEnabled() {
    return isErrorEnabled();
  }

  public void error(String msg) {
    error(msg);
  }

  public void error(String format, Object arg) {
    error(format, arg);
  }

  public void error(String format, Object arg1, Object arg2) {
    error(format, arg1, arg2);
  }

  public void error(String format, Object... arguments) {
    error(format, arguments);
  }

  public void error(String msg, Throwable t) {
    error(msg, t);
  }

  public boolean isErrorEnabled(Marker marker) {
    return isErrorEnabled(marker);
  }

  public void error(Marker marker, String msg) {
    error(marker, msg);
  }

  public void error(Marker marker, String format, Object arg) {
    error(marker, format, arg);
  }

  public void error(Marker marker, String format, Object arg1, Object arg2) {
    error(marker, format, arg1, arg2);
  }

  public void error(Marker marker, String format, Object... arguments) {
    error(marker, format, arguments);
  }

  public void error(Marker marker, String msg, Throwable t) {
    error(marker, msg, t);
  }
}
