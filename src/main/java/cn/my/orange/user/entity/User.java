package cn.my.orange.user.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private static final long serialVersionUID = 3878095274534074448L;

    /** 主键 **/
    private Long id;

    /** 用户代码 **/
    private String code;

    /** 用户名 **/
    private String name;

    /** 状态：-1-删除，0-停用，1-启用 **/
    private Integer status;

    /** 创建人id **/
    private Long creatorId;

    /** 创建时间 **/
    private Date createTime;

    /** 最后修改人  **/
    private Long updaterId;

    /** 最后修改时间 **/
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(Long updaterId) {
        this.updaterId = updaterId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
