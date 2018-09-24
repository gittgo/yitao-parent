package com.ruanmou.yt.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_category")
public class TCategory implements Serializable {
    /**
     * 分类编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 分类名称
     */
    @Column(name = "category_name")
    private String categoryName;

    /**
     * 父分类编号
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 分类级别
     */
    @Column(name = "category_level")
    private Byte categoryLevel;

    /**
     * 排序 按照降序排列，如果两个排序号相同（ 按照自然排序方式）
     */
    @Column(name = "category_sort")
    private Byte categorySort;

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
     * 获取分类编号
     *
     * @return id - 分类编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置分类编号
     *
     * @param id 分类编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取分类名称
     *
     * @return category_name - 分类名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 设置分类名称
     *
     * @param categoryName 分类名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * 获取父分类编号
     *
     * @return parent_id - 父分类编号
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父分类编号
     *
     * @param parentId 父分类编号
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取分类级别
     *
     * @return category_level - 分类级别
     */
    public Byte getCategoryLevel() {
        return categoryLevel;
    }

    /**
     * 设置分类级别
     *
     * @param categoryLevel 分类级别
     */
    public void setCategoryLevel(Byte categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    /**
     * 获取排序 按照降序排列，如果两个排序号相同（ 按照自然排序方式）
     *
     * @return category_sort - 排序 按照降序排列，如果两个排序号相同（ 按照自然排序方式）
     */
    public Byte getCategorySort() {
        return categorySort;
    }

    /**
     * 设置排序 按照降序排列，如果两个排序号相同（ 按照自然排序方式）
     *
     * @param categorySort 排序 按照降序排列，如果两个排序号相同（ 按照自然排序方式）
     */
    public void setCategorySort(Byte categorySort) {
        this.categorySort = categorySort;
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
        sb.append(", categoryName=").append(categoryName);
        sb.append(", parentId=").append(parentId);
        sb.append(", categoryLevel=").append(categoryLevel);
        sb.append(", categorySort=").append(categorySort);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}