package com.ruanmou.yt.service.impl;

import com.ruanmou.yt.api.UserService;
import com.ruanmou.yt.domain.TUser;
import com.ruanmou.yt.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Value("${jdbc.url}")
    private String url;

    public UserServiceImpl() {
        System.out.println(url);
    }

    @Autowired
    private TUserMapper userMapper;

    public TUser getUserById(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
