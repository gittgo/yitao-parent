package com.ruanmou.yt.api;

import com.ruanmou.yt.domain.TUser;

/**
 * 用户服务接口定义
 */
public interface UserService {
    TUser getUserById(Long userId);
}
