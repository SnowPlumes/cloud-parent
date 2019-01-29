package me.lv.dao.master;

import me.lv.entity.UserRoleDO;

/**
 * @author lv
 */
public interface UserRoleDao {

    /**
     * 获取
     *
     * @param id
     * @return
     */
    UserRoleDO getUserRoleById(Integer id);
}
