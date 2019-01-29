package me.lv.entity;

/**
 * @author lv
 */
public class UserRoleDO {
    private Integer id;
    private Integer parentId;
    private String roleName;
    private String des;

    public UserRoleDO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "UserRoleDO{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", roleName='" + roleName + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
