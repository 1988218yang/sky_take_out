package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "员工修改密码接口")
public class PasswordEditDTO implements Serializable {

    //员工id
    @ApiModelProperty(value = "员工id")
    private Long empId;

    //旧密码
    @ApiModelProperty(value = "员工旧密码")
    private String oldPassword;

    //新密码
    @ApiModelProperty(value = "员工新密码")
    private String newPassword;

}
