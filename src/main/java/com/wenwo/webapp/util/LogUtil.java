package com.wenwo.webapp.util;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ZY
 */
@Slf4j
public class LogUtil {

    /**
     * 如果logback开启了debug模式，则输出debug日志，否则不输出该日志
     * @param msg 日志信息
     */
    public static void info(String msg) {
        if (log.isDebugEnabled()) {
            log.info(msg);
        }
    }

    /**
     * 如果logback开启了debug模式，则输出debug日志，否则不输出该日志
     * @param format 格式
     * @param args 参数
     */
    public static void info(String format, Object args) {
        if (log.isDebugEnabled()) {
            log.info(format, args);
        }
    }

}
