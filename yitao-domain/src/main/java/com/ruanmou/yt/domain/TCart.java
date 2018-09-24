package com.ruanmou.yt.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_cart")
public class TCart implements Serializable {
    /**
     * 购物车编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 商品编号
     */
    @Column(name = "prod_id")
    private Long prodId;

    /**
     * 商品数量
     */
    private Integer quantity;

    /**
     * 购物车编号 0-勾选、1-未勾选
     */
    @Column(name = "is_checked")
    private Short isChecked;

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
     * 获取购物车编号
     *
     * @return id - 购物车编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置购物车编号
     *
     * @param id 购物车编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户编号
     *
     * @return user_id - 用户编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取商品编号
     *
     * @return prod_id - 商品编号
     */
    public Long getProdId() {
        return prodId;
    }

    /**
     * 设置商品编号
     *
     * @param prodId 商品编号
     */
    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取商品数量
     *
     * @return quantity - 商品数量
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 设置商品数量
     *
     * @param quantity 商品数量
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取购物车编号 0-勾选、1-未勾选
     *
     * @return is_checked - 购物车编号 0-勾选、1-未勾选
     */
    public Short getIsChecked() {
        return isChecked;
    }

    /**
     * 设置购物车编号 0-勾选、1-未勾选
     *
     * @param isChecked 购物车编号 0-勾选、1-未勾选
     */
    public void setIsChecked(Short isChecked) {
        this.isChecked = isChecked;
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
        sb.append(", userId=").append(userId);
        sb.append(", prodId=").append(prodId);
        sb.append(", quantity=").append(quantity);
        sb.append(", isChecked=").append(isChecked);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}