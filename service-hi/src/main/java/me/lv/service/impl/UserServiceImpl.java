package me.lv.service.impl;

import me.lv.dao.cluster.UserDao;
import me.lv.dao.master.UserRoleDao;
import me.lv.dto.UserDTO;
import me.lv.entity.UserDO;
import me.lv.entity.UserRoleDO;
import me.lv.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lv
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public UserDTO getUser() {
        UserDO userDO = userDao.getUserById(2);
        UserRoleDO userRoleDO = userRoleDao.getUserRoleById(1);
        UserDTO user = new UserDTO();
        BeanUtils.copyProperties(userDO, user);
        BeanUtils.copyProperties(userRoleDO, user);
        return user;
    }
}
