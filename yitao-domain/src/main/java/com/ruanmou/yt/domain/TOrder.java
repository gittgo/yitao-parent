package com.ruanmou.yt.domain;

import com.ruanmou.yt.base.entity.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "t_order")
public class TOrder extends BaseEntity {
    /**
     * 订单编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 实际支付金额
     */
    @Column(name = "payment_price")
    private BigDecimal paymentPrice;

    /**
     * 支付类型: 银行，支付宝，微信
     */
    @Column(name = "payment_type")
    private Short paymentType;

    /**
     * 实际支付金额
     */
    @Column(name = "order_status")
    private Short orderStatus;

    /**
     * 支付时间
     */
    @Column(name = "payment_time")
    private Date paymentTime;

    /**
     * 发货时间
     */
    @Column(name = "send_time")
    private Date sendTime;

    /**
     * 支付完成时间
     */
    @Column(name = "finish_time")
    private Date finishTime;

    /**
     * 支付关闭时间
     */
    @Column(name = "close_time")
    private Date closeTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取订单编号
     *
     * @return id - 订单编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置订单编号
     *
     * @param id 订单编号
     */
    public void setId(Long id) {
        this.id = id;
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
     * 获取实际支付金额
     *
     * @return payment_price - 实际支付金额
     */
    public BigDecimal getPaymentPrice() {
        return paymentPrice;
    }

    /**
     * 设置实际支付金额
     *
     * @param paymentPrice 实际支付金额
     */
    public void setPaymentPrice(BigDecimal paymentPrice) {
        this.paymentPrice = paymentPrice;
    }

    /**
     * 获取支付类型: 银行，支付宝，微信
     *
     * @return payment_type - 支付类型: 银行，支付宝，微信
     */
    public Short getPaymentType() {
        return paymentType;
    }

    /**
     * 设置支付类型: 银行，支付宝，微信
     *
     * @param paymentType 支付类型: 银行，支付宝，微信
     */
    public void setPaymentType(Short paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 获取实际支付金额
     *
     * @return order_status - 实际支付金额
     */
    public Short getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置实际支付金额
     *
     * @param orderStatus 实际支付金额
     */
    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取支付时间
     *
     * @return payment_time - 支付时间
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * 设置支付时间
     *
     * @param paymentTime 支付时间
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * 获取发货时间
     *
     * @return send_time - 发货时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 设置发货时间
     *
     * @param sendTime 发货时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获取支付完成时间
     *
     * @return finish_time - 支付完成时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置支付完成时间
     *
     * @param finishTime 支付完成时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 获取支付关闭时间
     *
     * @return close_time - 支付关闭时间
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * 设置支付关闭时间
     *
     * @param closeTime 支付关闭时间
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", paymentPrice=").append(paymentPrice);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", closeTime=").append(closeTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}