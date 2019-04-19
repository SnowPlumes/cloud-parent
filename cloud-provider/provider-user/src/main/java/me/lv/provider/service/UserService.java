package me.lv.provider.service;

import me.lv.provider.model.domain.User;

/**
 * @author lv
 */
public interface UserService {

    /**
     * 获取用户
     *
     * @param userId 用户id
     * @return
     */
    User getUserById(Integer userId);
}
