package com.ruanmou.yt.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_payment")
public class TPayment implements Serializable {
    /**
     * 支付编号
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
     * 订单号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 支付平台
     */
    @Column(name = "pay_platform")
    private Short payPlatform;

    /**
     * 支付流程账号
     */
    @Column(name = "pay_serial_number")
    private String paySerialNumber;

    /**
     * 订单状态:0-已取消-10-未付款，20-已付款，40-已发货，50-交易成功，60-交易关闭
     */
    @Column(name = "pay_status")
    private Short payStatus;

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
     * 获取支付编号
     *
     * @return id - 支付编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置支付编号
     *
     * @param id 支付编号
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
     * 获取支付平台
     *
     * @return pay_platform - 支付平台
     */
    public Short getPayPlatform() {
        return payPlatform;
    }

    /**
     * 设置支付平台
     *
     * @param payPlatform 支付平台
     */
    public void setPayPlatform(Short payPlatform) {
        this.payPlatform = payPlatform;
    }

    /**
     * 获取支付流程账号
     *
     * @return pay_serial_number - 支付流程账号
     */
    public String getPaySerialNumber() {
        return paySerialNumber;
    }

    /**
     * 设置支付流程账号
     *
     * @param paySerialNumber 支付流程账号
     */
    public void setPaySerialNumber(String paySerialNumber) {
        this.paySerialNumber = paySerialNumber == null ? null : paySerialNumber.trim();
    }

    /**
     * 获取订单状态:0-已取消-10-未付款，20-已付款，40-已发货，50-交易成功，60-交易关闭
     *
     * @return pay_status - 订单状态:0-已取消-10-未付款，20-已付款，40-已发货，50-交易成功，60-交易关闭
     */
    public Short getPayStatus() {
        return payStatus;
    }

    /**
     * 设置订单状态:0-已取消-10-未付款，20-已付款，40-已发货，50-交易成功，60-交易关闭
     *
     * @param payStatus 订单状态:0-已取消-10-未付款，20-已付款，40-已发货，50-交易成功，60-交易关闭
     */
    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
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
        sb.append(", orderNo=").append(orderNo);
        sb.append(", payPlatform=").append(payPlatform);
        sb.append(", paySerialNumber=").append(paySerialNumber);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}