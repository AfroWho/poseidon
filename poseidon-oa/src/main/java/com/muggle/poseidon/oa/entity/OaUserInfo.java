package com.muggle.poseidon.oa.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.muggle.poseidon.base.BaseBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author muggle
 * @since 2020-05-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="OaUserInfo对象", description="")
public class OaUserInfo extends BaseBean {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "银行卡号")
    private String bank;

    @ApiModelProperty(value = "生日")
    private LocalDateTime birth;

    @ApiModelProperty(value = "邮箱")
    private String eamil;

    @ApiModelProperty(value = "入职时间")
    private LocalDateTime hireTime;

    @ApiModelProperty(value = "身份证号码")
    private String idCard;

    @ApiModelProperty(value = "头像")
    private String imgPath;

    @ApiModelProperty(value = "未锁定")
    private Boolean accountNonLocked;

    @ApiModelProperty(value = "上次登录ip")
    private String lastLoginIp;

    @ApiModelProperty(value = "上次登录时间")
    private LocalDateTime lastLoginTime;

    private LocalDateTime gmtModified;

    private Long modifyUserId;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "真实姓名")
    private String realName;

    @ApiModelProperty(value = "用户薪水")
    private Float salary;

    @ApiModelProperty(value = "毕业院校")
    private String userSchool;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "学历")
    private String userEdu;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "个性签名")
    private String userSign;

    @ApiModelProperty(value = "电话")
    private String userTel;

    @ApiModelProperty(value = "在职天数")
    private Integer holiday;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "未过期")
    private Boolean accountNonExpired;

    @ApiModelProperty(value = "凭证有效")
    private Boolean credentialsNonExpired;

    @ApiModelProperty(value = "可用")
    private Boolean enabled;


}
