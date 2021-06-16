package com.meizhuliu.zl.finance.domian;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 用户账户记录流水表
 * 实体类对应的数据表为：  user_account_detail
 * @author hy-scrm
 * @date null
 */
@ApiModel(value ="UserAccountDetailDO")
public class UserAccountDetailDO {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "流水类型 1-收入 2-支出 3-在途")
    private Boolean type;

    @ApiModelProperty(value = "金额类型 1-m币 2-余额")
    private Boolean moneyType;

    @ApiModelProperty(value = "金额")
    private BigDecimal decimal;

    @ApiModelProperty(value = "当前账户额度(根据类型区分)")
    private BigDecimal balance;

    @ApiModelProperty(value = "描述")
    private String desc;

    @ApiModelProperty(value = "")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern= "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;

    @ApiModelProperty(value = "")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern= "yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;

    @ApiModelProperty(value = "")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern= "yyyy-MM-dd HH:mm:ss")
    private Date deletedAt;

    @ApiModelProperty(value = "触发操作类型(正数表示收益，负数表示支出)，1学习收益，2树木收益,-1兑换礼物，-2购买树苗. 全部类型查看`UserAccountEnum`类", dataType = "java.lang.Integer")
    private Byte actionType;

    @ApiModelProperty(value = "手续费")
    private BigDecimal fee;

    @ApiModelProperty(value = "聚合ID")
    private Long closeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(Boolean moneyType) {
        this.moneyType = moneyType;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Byte getActionType() {
        return actionType;
    }

    public void setActionType(Byte actionType) {
        this.actionType = actionType;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Long getCloseId() {
        return closeId;
    }

    public void setCloseId(Long closeId) {
        this.closeId = closeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static UserAccountDetailDO.Builder builder() {
        return new UserAccountDetailDO.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_account_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user_account_detail
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private UserAccountDetailDO obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_account_detail
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new UserAccountDetailDO();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user_account_detail.id
         *
         * @param id the value for user_account_detail.id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder id(Long id) {
            obj.setId(id);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user_account_detail.user_id
         *
         * @param userId the value for user_account_detail.user_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder userId(Long userId) {
            obj.setUserId(userId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user_account_detail.type
         *
         * @param type the value for user_account_detail.type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder type(Boolean type) {
            obj.setType(type);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user_account_detail.money_type
         *
         * @param moneyType the value for user_account_detail.money_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder moneyType(Boolean moneyType) {
            obj.setMoneyType(moneyType);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user_account_detail.decimal
         *
         * @param decimal the value for user_account_detail.decimal
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder decimal(BigDecimal decimal) {
            obj.setDecimal(decimal);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user_account_detail.balance
         *
         * @param balance the value for user_account_detail.balance
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder balance(BigDecimal balance) {
            obj.setBalance(balance);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user_account_detail.desc
         *
         * @param desc the value for user_account_detail.desc
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder desc(String desc) {
            obj.setDesc(desc);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user_account_detail.created_at
         *
         * @param createdAt the value for user_account_detail.created_at
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder createdAt(Date createdAt) {
            obj.setCreatedAt(createdAt);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user_account_detail.updated_at
         *
         * @param updatedAt the value for user_account_detail.updated_at
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder updatedAt(Date updatedAt) {
            obj.setUpdatedAt(updatedAt);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user_account_detail.deleted_at
         *
         * @param deletedAt the value for user_account_detail.deleted_at
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder deletedAt(Date deletedAt) {
            obj.setDeletedAt(deletedAt);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user_account_detail.action_type
         *
         * @param actionType the value for user_account_detail.action_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder actionType(Byte actionType) {
            obj.setActionType(actionType);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user_account_detail.fee
         *
         * @param fee the value for user_account_detail.fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder fee(BigDecimal fee) {
            obj.setFee(fee);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user_account_detail.close_id
         *
         * @param closeId the value for user_account_detail.close_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder closeId(Long closeId) {
            obj.setCloseId(closeId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_account_detail
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public UserAccountDetailDO build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table user_account_detail
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        userId("user_id"),
        type("type"),
        moneyType("money_type"),
        decimal("decimal"),
        balance("balance"),
        desc("desc"),
        createdAt("created_at"),
        updatedAt("updated_at"),
        deletedAt("deleted_at"),
        actionType("action_type"),
        fee("fee"),
        closeId("close_id");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user_account_detail
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_account_detail
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_account_detail
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_account_detail
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_account_detail
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_account_detail
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}