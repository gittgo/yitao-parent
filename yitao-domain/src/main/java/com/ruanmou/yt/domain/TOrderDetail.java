package com.ruanmou.yt.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "t_order_detail")
public class TOrderDetail implements Serializable {
    /**
     * 订单详情编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品编号
     */
    @Column(name = "prod_id")
    private Long prodId;

    /**
     * 订单号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 商品名称
     */
    @Column(name = "prod_name")
    private String prodName;

    /**
     * 商品单价
     */
    @Column(name = "prod_unit_price")
    private BigDecimal prodUnitPrice;

    /**
     * 商品数量
     */
    @Column(name = "prod_number")
    private Long prodNumber;

    /**
     * 商品总价
     */
    @Column(name = "prod_total_price")
    private BigDecimal prodTotalPrice;

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
     * 获取订单详情编号
     *
     * @return id - 订单详情编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置订单详情编号
     *
     * @param id 订单详情编号
     */
    public void setId(Long id) {
        this.id = id;
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
     * 获取订单号
     *
     * @return order_no - 订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单号
     *
     * @param orderNo 订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
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
     * 获取商品名称
     *
     * @return prod_name - 商品名称
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * 设置商品名称
     *
     * @param prodName 商品名称
     */
    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    /**
     * 获取商品单价
     *
     * @return prod_unit_price - 商品单价
     */
    public BigDecimal getProdUnitPrice() {
        return prodUnitPrice;
    }

    /**
     * 设置商品单价
     *
     * @param prodUnitPrice 商品单价
     */
    public void setProdUnitPrice(BigDecimal prodUnitPrice) {
        this.prodUnitPrice = prodUnitPrice;
    }

    /**
     * 获取商品数量
     *
     * @return prod_number - 商品数量
     */
    public Long getProdNumber() {
        return prodNumber;
    }

    /**
     * 设置商品数量
     *
     * @param prodNumber 商品数量
     */
    public void setProdNumber(Long prodNumber) {
        this.prodNumber = prodNumber;
    }

    /**
     * 获取商品总价
     *
     * @return prod_total_price - 商品总价
     */
    public BigDecimal getProdTotalPrice() {
        return prodTotalPrice;
    }

    /**
     * 设置商品总价
     *
     * @param prodTotalPrice 商品总价
     */
    public void setProdTotalPrice(BigDecimal prodTotalPrice) {
        this.prodTotalPrice = prodTotalPrice;
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
        sb.append(", prodId=").append(prodId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", userId=").append(userId);
        sb.append(", prodName=").append(prodName);
        sb.append(", prodUnitPrice=").append(prodUnitPrice);
        sb.append(", prodNumber=").append(prodNumber);
        sb.append(", prodTotalPrice=").append(prodTotalPrice);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}