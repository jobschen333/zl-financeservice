package com.meizhuliu.zl.finance.domian;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 用户对账总表
 * 实体类对应的数据表为：  account_record
 * @author hy-scrm
 * @date null
 */
@ApiModel(value ="AccountRecordDO")
public class AccountRecordDO {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "流水币")
    private BigDecimal billM;

    @ApiModelProperty(value = "账上m币")
    private BigDecimal accountM;

    @ApiModelProperty(value = "流水礼物总金额")
    private BigDecimal billGify;

    @ApiModelProperty(value = "账上礼物金额")
    private BigDecimal giftAmount;

    @ApiModelProperty(value = "日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern= "yyyy-MM-dd HH:mm:ss")
    private Date date;

    @ApiModelProperty(value = "1正常  2  异常")
    private Integer status;

    @ApiModelProperty(value = "")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern= "yyyy-MM-dd HH:mm:ss")
    private Date updateAt;

    @ApiModelProperty(value = "")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern= "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;

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

    public BigDecimal getBillM() {
        return billM;
    }

    public void setBillM(BigDecimal billM) {
        this.billM = billM;
    }

    public BigDecimal getAccountM() {
        return accountM;
    }

    public void setAccountM(BigDecimal accountM) {
        this.accountM = accountM;
    }

    public BigDecimal getBillGify() {
        return billGify;
    }

    public void setBillGify(BigDecimal billGify) {
        this.billGify = billGify;
    }

    public BigDecimal getGiftAmount() {
        return giftAmount;
    }

    public void setGiftAmount(BigDecimal giftAmount) {
        this.giftAmount = giftAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_record
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static AccountRecordDO.Builder builder() {
        return new AccountRecordDO.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table account_record
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table account_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private AccountRecordDO obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table account_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new AccountRecordDO();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column account_record.id
         *
         * @param id the value for account_record.id
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
         * This method sets the value of the database column account_record.user_id
         *
         * @param userId the value for account_record.user_id
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
         * This method sets the value of the database column account_record.bill_m
         *
         * @param billM the value for account_record.bill_m
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder billM(BigDecimal billM) {
            obj.setBillM(billM);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column account_record.account_m
         *
         * @param accountM the value for account_record.account_m
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder accountM(BigDecimal accountM) {
            obj.setAccountM(accountM);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column account_record.bill_gify
         *
         * @param billGify the value for account_record.bill_gify
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder billGify(BigDecimal billGify) {
            obj.setBillGify(billGify);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column account_record.gift_amount
         *
         * @param giftAmount the value for account_record.gift_amount
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder giftAmount(BigDecimal giftAmount) {
            obj.setGiftAmount(giftAmount);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column account_record.date
         *
         * @param date the value for account_record.date
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder date(Date date) {
            obj.setDate(date);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column account_record.status
         *
         * @param status the value for account_record.status
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder status(Integer status) {
            obj.setStatus(status);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column account_record.update_at
         *
         * @param updateAt the value for account_record.update_at
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder updateAt(Date updateAt) {
            obj.setUpdateAt(updateAt);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column account_record.created_at
         *
         * @param createdAt the value for account_record.created_at
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
         * This method corresponds to the database table account_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public AccountRecordDO build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table account_record
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        userId("user_id"),
        billM("bill_m"),
        accountM("account_m"),
        billGify("bill_gify"),
        giftAmount("gift_amount"),
        date("date"),
        status("status"),
        updateAt("update_at"),
        createdAt("created_at");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table account_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table account_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table account_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table account_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table account_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table account_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}