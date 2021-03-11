package com.yinc.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author yinC
 * @since 2021-03-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Operuser对象", description="")
public class Operuser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "员工卡号")
    private String cardno;

    @ApiModelProperty(value = "工号")
    private String gh;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "密码")
    private String passwd;

    @ApiModelProperty(value = "门店号")
    private String mkt;

    @ApiModelProperty(value = "经营公司")
    @TableField("erpCode")
    private String erpCode;

    @ApiModelProperty(value = "密码标识")
    private String passwdflg;

    @ApiModelProperty(value = "员工类别，1-收银员，2-营业员，3-维护员，4-授权员工")
    private String ghtype;

    @ApiModelProperty(value = "卡号类型(1-临时卡,0-正常卡)")
    private String cardtype;

    @ApiModelProperty(value = "有效期")
    private LocalDate maxdate;

    @ApiModelProperty(value = "是否允许登录pos（y/n）")
    private String isloginpos;

    @ApiModelProperty(value = "是否允许登录erp（y/n）")
    private String isloginerp;

    @ApiModelProperty(value = "pos角色")
    private String posrole;

    @ApiModelProperty(value = "永旺专用 level=1,2对应经理（manager),3,8对应主管（supervisor),4对应收银员(cashier)")
    private Long level;

    @ApiModelProperty(value = "erp角色")
    private String erprole;

    @ApiModelProperty(value = "营业员营业柜组")
    private String yyygz;

    @ApiModelProperty(value = "备注")
    private String memo;

    private Long phKey;

    @ApiModelProperty(value = "删除状态标记")
    private String statu;

    private Long phTimestamp;

    @ApiModelProperty(value = "渠道id")
    @TableField("entId")
    private Long entId;

    @ApiModelProperty(value = "时间戳")
    private Long tmdd;

    @ApiModelProperty(value = "员工工号")
    private String employeeno;

    @ApiModelProperty(value = "修改密码时间")
    private LocalDateTime pwddate;

    @TableField("updateDate")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "授权角色")
    private String authrole;


}
