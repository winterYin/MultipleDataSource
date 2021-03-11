package com.yinc.entity;

import java.math.BigDecimal;
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
 * 订单/退货单
 * </p>
 *
 * @author yinC
 * @since 2021-03-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Saleorders对象", description="订单/退货单")
public class Saleorders implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单ID代码")
    private Long oid;

    @ApiModelProperty(value = "零售商ID")
    @TableField("entId")
    private Long entId;

    @ApiModelProperty(value = "经营公司")
    @TableField("busCompany")
    private String busCompany;

    @ApiModelProperty(value = "分片字段")
    @TableField("shardingCode")
    private String shardingCode;

    @ApiModelProperty(value = "订单号")
    @TableField("orderNo")
    private String orderNo;

    @ApiModelProperty(value = "母订单号,批发单号(取决于订单类型)")
    @TableField("parentOrderNo")
    private String parentOrderNo;

    @ApiModelProperty(value = "原单号")
    @TableField("sourceNo")
    private String sourceNo;

    @ApiModelProperty(value = "订单渠道")
    private String channel;

    @ApiModelProperty(value = "外部订单号")
    @TableField("channelSheetNo")
    private String channelSheetNo;

    @ApiModelProperty(value = "类据类型 见字典")
    @TableField("sheetTypeCode")
    private String sheetTypeCode;

    @ApiModelProperty(value = "支付状态 ")
    @TableField("payState")
    private Integer payState;

    @ApiModelProperty(value = "订单状态|退货单状态  见字典")
    @TableField("orderState")
    private Integer orderState;

    @ApiModelProperty(value = "终端号")
    @TableField("terminalNo")
    private String terminalNo;

    @ApiModelProperty(value = "终端流水号")
    @TableField("terminalSno")
    private String terminalSno;

    @ApiModelProperty(value = "POS唯一键判断;用于防止订单重复上传")
    @TableField("posId")
    private String posId;

    @ApiModelProperty(value = "终端操作员(收银员)")
    @TableField("terminalOperator")
    private String terminalOperator;

    @ApiModelProperty(value = "收银员名称")
    @TableField("terminalOperatorName")
    private String terminalOperatorName;

    @ApiModelProperty(value = "原销售门店编号")
    @TableField("saleMarketCode")
    private String saleMarketCode;

    @ApiModelProperty(value = "原销售门店名称")
    @TableField("saleMarket")
    private String saleMarket;

    @ApiModelProperty(value = "业务发生门店编号")
    @TableField("returnMarketCode")
    private String returnMarketCode;

    @ApiModelProperty(value = "业务发生门店名称")
    @TableField("returnMarket")
    private String returnMarket;

    @ApiModelProperty(value = "退货申请类别？(1.退货退款，2.仅退款，3.仅退货)")
    @TableField("billSubType")
    private Integer billSubType;

    @ApiModelProperty(value = "实物退货方式ID（参考数据字典设置）")
    @TableField("returnTypeId")
    private Long returnTypeId;

    @ApiModelProperty(value = "实物退货方式")
    @TableField("returnType")
    private String returnType;

    @ApiModelProperty(value = "退货原因编码")
    @TableField("buyerReturnReasonCode")
    private Integer buyerReturnReasonCode;

    @ApiModelProperty(value = "商品数量|实际退货数量")
    @TableField("returnQty")
    private Double returnQty;

    @ApiModelProperty(value = "实退金额")
    @TableField("returnAmount")
    private BigDecimal returnAmount;

    @ApiModelProperty(value = "退款方式（0-自动退款/1-人工转账）")
    @TableField("refundType")
    private Integer refundType;

    @ApiModelProperty(value = "出库门店编号")
    @TableField("logisticsStoreCode")
    private String logisticsStoreCode;

    @ApiModelProperty(value = "促销折扣")
    @TableField("popDiscountValue")
    private BigDecimal popDiscountValue;

    @ApiModelProperty(value = "人工折扣,团购折扣")
    @TableField("adjustDiscountValue")
    private BigDecimal adjustDiscountValue;

    @ApiModelProperty(value = "会员折扣")
    @TableField("customDiscountValue")
    private BigDecimal customDiscountValue;

    @ApiModelProperty(value = "支付折扣")
    @TableField("payDiscountValue")
    private BigDecimal payDiscountValue;

    @ApiModelProperty(value = "套餐折扣")
    @TableField("mealDiscountValue")
    private BigDecimal mealDiscountValue;

    @ApiModelProperty(value = "学子卡折扣")
    @TableField("studentCardDiscountValue")
    private BigDecimal studentCardDiscountValue;

    @ApiModelProperty(value = "优惠金额")
    @TableField("totalDiscountValue")
    private BigDecimal totalDiscountValue;

    @ApiModelProperty(value = "优惠券金额")
    @TableField("totalCouponValue")
    private BigDecimal totalCouponValue;

    @ApiModelProperty(value = "收银损溢")
    @TableField("overageValue")
    private BigDecimal overageValue;

    @ApiModelProperty(value = "四舍五入收银损溢")
    @TableField("roundUpOverageValue")
    private BigDecimal roundUpOverageValue;

    @ApiModelProperty(value = "找零金额")
    @TableField("changeValue")
    private BigDecimal changeValue;

    @ApiModelProperty(value = "是否尾款订单")
    @TableField("codPay")
    private Boolean codPay;

    @ApiModelProperty(value = "重量")
    private Double weight;

    @ApiModelProperty(value = "应收运费")
    @TableField("logisticsFreight")
    private BigDecimal logisticsFreight;

    @ApiModelProperty(value = "实际运费")
    @TableField("freightFact")
    private BigDecimal freightFact;

    @ApiModelProperty(value = "应收金额")
    @TableField("oughtPay")
    private BigDecimal oughtPay;

    @ApiModelProperty(value = "实付金额")
    @TableField("factPay")
    private BigDecimal factPay;

    @ApiModelProperty(value = "原始金额")
    @TableField("originalPay")
    private BigDecimal originalPay;

    @ApiModelProperty(value = "上传ERP状态 1-已经上传erp 0待上传")
    @TableField("uploadErp")
    private Integer uploadErp;

    @ApiModelProperty(value = "上传ERP类型")
    @TableField("uploadErpType")
    private Integer uploadErpType;

    @ApiModelProperty(value = "是否冷藏存放")
    @TableField("coldStorage")
    private Boolean coldStorage;

    @ApiModelProperty(value = "是否需要人工审核")
    @TableField("manulAudit")
    private Boolean manulAudit;

    @ApiModelProperty(value = "是否员工购物")
    @TableField("staffShopping")
    private Boolean staffShopping;

    @ApiModelProperty(value = "是否后厨打印")
    @TableField("hasBackPrint")
    private Boolean hasBackPrint;

    @ApiModelProperty(value = "自动审核不通过原因")
    @TableField("autoAuditDenyReason")
    private String autoAuditDenyReason;

    @ApiModelProperty(value = "客服备注")
    @TableField("callerRemark")
    private String callerRemark;

    @ApiModelProperty(value = "取消原因编码")
    @TableField("cancelReasonCode")
    private Integer cancelReasonCode;

    @ApiModelProperty(value = "退货银行卡号")
    @TableField("buyerReturnBankcard")
    private String buyerReturnBankcard;

    @ApiModelProperty(value = "退货授权卡号")
    private String thsq;

    @ApiModelProperty(value = "员工授权卡号")
    private String ghsq;

    @ApiModelProperty(value = "顾客授权卡号")
    private String hysq;

    @ApiModelProperty(value = "总折扣授权卡号")
    private String sqkh;

    @ApiModelProperty(value = "营销单号")
    @TableField("calcBillId")
    private String calcBillId;

    @ApiModelProperty(value = "会员卡号|会员识别码")
    @TableField("cusCode")
    private String cusCode;

    @ApiModelProperty(value = "员工工号")
    @TableField("staffNo")
    private String staffNo;

    @ApiModelProperty(value = "客户账号ID")
    private String uid;

    @ApiModelProperty(value = "客户姓名")
    @TableField("userName")
    private String userName;

    @ApiModelProperty(value = "会员ID")
    @TableField("consumersId")
    private String consumersId;

    @ApiModelProperty(value = "入会类型(1-POS入会;2-APP入会)")
    @TableField("joinCusType")
    private Integer joinCusType;

    @ApiModelProperty(value = "性别 1-man 2-women 3-other")
    private Integer gender;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "配送方式 0-配送 1-自提 2-厂送")
    @TableField("logisticsMode")
    private Integer logisticsMode;

    @ApiModelProperty(value = "配送物流方式 0-飞速达，1-半日达，2-次日达")
    @TableField("deliveryMode")
    private Integer deliveryMode;

    @ApiModelProperty(value = "营销状态")
    @TableField("invoiceStatus")
    private String invoiceStatus;

    @ApiModelProperty(value = "错误消息")
    @TableField("invoiceMsg")
    private String invoiceMsg;

    @ApiModelProperty(value = "下单时间")
    @TableField("saleDate")
    private LocalDateTime saleDate;

    @ApiModelProperty(value = "支付时间")
    @TableField("payDate")
    private LocalDateTime payDate;

    @ApiModelProperty(value = "订单班次")
    @TableField("orderShift")
    private String orderShift;

    @ApiModelProperty(value = "记账日期")
    @TableField("billDate")
    private LocalDate billDate;

    @ApiModelProperty(value = "接收时间")
    @TableField("receiveDate")
    private LocalDateTime receiveDate;

    @ApiModelProperty(value = "语言类型")
    private String lang;

    @ApiModelProperty(value = "创建人")
    private String creator;

    @ApiModelProperty(value = "创建日期")
    @TableField("createDate")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "最后更新时间")
    @TableField("lastDate")
    private LocalDateTime lastDate;


}
