package com.ruanmou.yt.base.mapper;

import tk.mybatis.mapper.common.Mapper;

/**
 * 生成mapper接口类的父类
 * 方便项目后续维护和扩展
 * @param <T>
 */
public interface BaseMapper<T> extends Mapper<T> {
}
