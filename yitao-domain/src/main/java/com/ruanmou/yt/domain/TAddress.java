package com.ruanmou.yt.domain;

import com.ruanmou.yt.base.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "t_address")
public class TAddress extends BaseEntity {
    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 收货人
     */
    @Column(name = "receive_name")
    private String receiveName;

    /**
     * 收货固定电话
     */
    @Column(name = "receive_tel")
    private String receiveTel;

    /**
     * 收货人手机
     */
    @Column(name = "receive_phone")
    private String receivePhone;

    /**
     * 省份
     */
    @Column(name = "receive_province")
    private String receiveProvince;

    /**
     * 城市
     */
    @Column(name = "receive_city")
    private String receiveCity;

    /**
     * 区/县
     */
    @Column(name = "receive_county")
    private String receiveCounty;

    /**
     * 详细地址
     */
    @Column(name = "receive_address")
    private String receiveAddress;

    /**
     * 邮编
     */
    @Column(name = "receive_zip")
    private String receiveZip;


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
     * 获取收货人
     *
     * @return receive_name - 收货人
     */
    public String getReceiveName() {
        return receiveName;
    }

    /**
     * 设置收货人
     *
     * @param receiveName 收货人
     */
    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    /**
     * 获取收货固定电话
     *
     * @return receive_tel - 收货固定电话
     */
    public String getReceiveTel() {
        return receiveTel;
    }

    /**
     * 设置收货固定电话
     *
     * @param receiveTel 收货固定电话
     */
    public void setReceiveTel(String receiveTel) {
        this.receiveTel = receiveTel == null ? null : receiveTel.trim();
    }

    /**
     * 获取收货人手机
     *
     * @return receive_phone - 收货人手机
     */
    public String getReceivePhone() {
        return receivePhone;
    }

    /**
     * 设置收货人手机
     *
     * @param receivePhone 收货人手机
     */
    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone == null ? null : receivePhone.trim();
    }

    /**
     * 获取省份
     *
     * @return receive_province - 省份
     */
    public String getReceiveProvince() {
        return receiveProvince;
    }

    /**
     * 设置省份
     *
     * @param receiveProvince 省份
     */
    public void setReceiveProvince(String receiveProvince) {
        this.receiveProvince = receiveProvince == null ? null : receiveProvince.trim();
    }

    /**
     * 获取城市
     *
     * @return receive_city - 城市
     */
    public String getReceiveCity() {
        return receiveCity;
    }

    /**
     * 设置城市
     *
     * @param receiveCity 城市
     */
    public void setReceiveCity(String receiveCity) {
        this.receiveCity = receiveCity == null ? null : receiveCity.trim();
    }

    /**
     * 获取区/县
     *
     * @return receive_county - 区/县
     */
    public String getReceiveCounty() {
        return receiveCounty;
    }

    /**
     * 设置区/县
     *
     * @param receiveCounty 区/县
     */
    public void setReceiveCounty(String receiveCounty) {
        this.receiveCounty = receiveCounty == null ? null : receiveCounty.trim();
    }

    /**
     * 获取详细地址
     *
     * @return receive_address - 详细地址
     */
    public String getReceiveAddress() {
        return receiveAddress;
    }

    /**
     * 设置详细地址
     *
     * @param receiveAddress 详细地址
     */
    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress == null ? null : receiveAddress.trim();
    }

    /**
     * 获取邮编
     *
     * @return receive_zip - 邮编
     */
    public String getReceiveZip() {
        return receiveZip;
    }

    /**
     * 设置邮编
     *
     * @param receiveZip 邮编
     */
    public void setReceiveZip(String receiveZip) {
        this.receiveZip = receiveZip == null ? null : receiveZip.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", receiveName=").append(receiveName);
        sb.append(", receiveTel=").append(receiveTel);
        sb.append(", receivePhone=").append(receivePhone);
        sb.append(", receiveProvince=").append(receiveProvince);
        sb.append(", receiveCity=").append(receiveCity);
        sb.append(", receiveCounty=").append(receiveCounty);
        sb.append(", receiveAddress=").append(receiveAddress);
        sb.append(", receiveZip=").append(receiveZip);
        sb.append("]");
        return sb.toString();
    }
}