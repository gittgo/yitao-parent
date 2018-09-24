package com.ruanmou.yt.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_navicat")
public class TNavicat implements Serializable {
    /**
     * 货品编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 货品名称
     */
    @Column(name = "navicat_name")
    private String navicatName;

    /**
     * 货品简介
     */
    @Column(name = "navicat_bried")
    private String navicatBried;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    private Short isDelete;

    private static final long serialVersionUID = 1L;

    /**
     * 获取货品编号
     *
     * @return id - 货品编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置货品编号
     *
     * @param id 货品编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取货品名称
     *
     * @return navicat_name - 货品名称
     */
    public String getNavicatName() {
        return navicatName;
    }

    /**
     * 设置货品名称
     *
     * @param navicatName 货品名称
     */
    public void setNavicatName(String navicatName) {
        this.navicatName = navicatName == null ? null : navicatName.trim();
    }

    /**
     * 获取货品简介
     *
     * @return navicat_bried - 货品简介
     */
    public String getNavicatBried() {
        return navicatBried;
    }

    /**
     * 设置货品简介
     *
     * @param navicatBried 货品简介
     */
    public void setNavicatBried(String navicatBried) {
        this.navicatBried = navicatBried == null ? null : navicatBried.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否删除
     *
     * @return is_delete - 是否删除
     */
    public Short getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除
     *
     * @param isDelete 是否删除
     */
    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", navicatName=").append(navicatName);
        sb.append(", navicatBried=").append(navicatBried);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}