package com.ruanmou.yt.base.exception;

/**
 * 定义所有业务异常类的父类
 */
public class BaseBizException extends RuntimeException {
    private static final long serialVersionUID = -5875371379845226068L;

    /**
     * 数据库操作,insert返回0
     */
    public static final BaseBizException DB_INSERT_RESULT_0 = new BaseBizException(90040001, "数据库操作,insert返回0");

    /**
     * 数据库操作,update返回0
     */
    public static final BaseBizException DB_UPDATE_RESULT_0 = new BaseBizException(90040002, "数据库操作,update返回0");

    /**
     * 数据库操作,selectOne返回null
     */
    public static final BaseBizException DB_SELECTONE_IS_NULL = new BaseBizException(90040003, "数据库操作,selectOne返回null");

    /**
     * 数据库操作,list返回null
     */
    public static final BaseBizException DB_LIST_IS_NULL = new BaseBizException(90040004, "数据库操作,list返回null");

    /**
     * Token 验证不通过
     */
    public static final BaseBizException TOKEN_IS_ILLICIT = new BaseBizException(90040005, "Token 验证非法");
    /**
     * 会话超时　获取session时，如果是空，throws 下面这个异常 拦截器会拦截爆会话超时页面
     */
    public static final BaseBizException SESSION_IS_OUT_TIME = new BaseBizException(90040006, "会话超时");

    /**
     * 异常信息
     */
    protected String msg;

    /**
     * 具体异常码
     */
    protected int code;

    public BaseBizException(int code, String msgFormat, Object... args) {
        super(String.format(msgFormat, args));
        this.code = code;
        this.msg = String.format(msgFormat, args);
    }

    public BaseBizException() {
        super();
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    /**
     * 实例化异常
     *
     * @param msgFormat
     * @param args
     * @return
     */
    public BaseBizException newInstance(String msgFormat, Object... args) {
        return new BaseBizException(this.code, msgFormat, args);
    }

    public BaseBizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseBizException(Throwable cause) {
        super(cause);
    }

    public BaseBizException(String message) {
        super(message);
    }
}
