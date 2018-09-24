package com.ruanmou.yt.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_user")
public class TUser implements Serializable {
    /**
     * 用户编号
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 名称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "user_pass")
    private String userPass;

    /**
     * 邮件
     */
    @Column(name = "user_email")
    private String userEmail;

    /**
     * 手机
     */
    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 找回密码的问题
     */
    @Column(name = "user_question")
    private String userQuestion;

    /**
     * 找回密码的答案
     */
    @Column(name = "user_answer")
    private String userAnswer;

    /**
     * 用户角色 0 - 管理员，1 - 普通用户
     */
    @Column(name = "user_role")
    private Short userRole;

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
     * 是否删除 0-正常、1-删除
     */
    @Column(name = "is_delete")
    private Short isDelete;

    private static final long serialVersionUID = 1L;

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
     * 获取名称
     *
     * @return user_name - 名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置名称
     *
     * @param userName 名称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取密码
     *
     * @return user_pass - 密码
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * 设置密码
     *
     * @param userPass 密码
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    /**
     * 获取邮件
     *
     * @return user_email - 邮件
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置邮件
     *
     * @param userEmail 邮件
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * 获取手机
     *
     * @return user_phone - 手机
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置手机
     *
     * @param userPhone 手机
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * 获取找回密码的问题
     *
     * @return user_question - 找回密码的问题
     */
    public String getUserQuestion() {
        return userQuestion;
    }

    /**
     * 设置找回密码的问题
     *
     * @param userQuestion 找回密码的问题
     */
    public void setUserQuestion(String userQuestion) {
        this.userQuestion = userQuestion == null ? null : userQuestion.trim();
    }

    /**
     * 获取找回密码的答案
     *
     * @return user_answer - 找回密码的答案
     */
    public String getUserAnswer() {
        return userAnswer;
    }

    /**
     * 设置找回密码的答案
     *
     * @param userAnswer 找回密码的答案
     */
    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer == null ? null : userAnswer.trim();
    }

    /**
     * 获取用户角色 0 - 管理员，1 - 普通用户
     *
     * @return user_role - 用户角色 0 - 管理员，1 - 普通用户
     */
    public Short getUserRole() {
        return userRole;
    }

    /**
     * 设置用户角色 0 - 管理员，1 - 普通用户
     *
     * @param userRole 用户角色 0 - 管理员，1 - 普通用户
     */
    public void setUserRole(Short userRole) {
        this.userRole = userRole;
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
     * 获取是否删除 0-正常、1-删除
     *
     * @return is_delete - 是否删除 0-正常、1-删除
     */
    public Short getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除 0-正常、1-删除
     *
     * @param isDelete 是否删除 0-正常、1-删除
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
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userPass=").append(userPass);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userQuestion=").append(userQuestion);
        sb.append(", userAnswer=").append(userAnswer);
        sb.append(", userRole=").append(userRole);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}