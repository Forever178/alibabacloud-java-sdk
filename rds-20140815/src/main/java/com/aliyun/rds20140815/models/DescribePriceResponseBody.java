// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribePriceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public DescribePriceResponseBodyRules rules;

    @NameInMap("PriceInfo")
    public DescribePriceResponseBodyPriceInfo priceInfo;

    public static DescribePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceResponseBody self = new DescribePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePriceResponseBody setRules(DescribePriceResponseBodyRules rules) {
        this.rules = rules;
        return this;
    }
    public DescribePriceResponseBodyRules getRules() {
        return this.rules;
    }

    public DescribePriceResponseBody setPriceInfo(DescribePriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribePriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public static class DescribePriceResponseBodyRulesRule extends TeaModel {
        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        public static DescribePriceResponseBodyRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyRulesRule self = new DescribePriceResponseBodyRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribePriceResponseBodyRulesRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePriceResponseBodyRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribePriceResponseBodyRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribePriceResponseBodyRulesRule> rule;

        public static DescribePriceResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyRules self = new DescribePriceResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyRules setRule(java.util.List<DescribePriceResponseBodyRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoRuleIds extends TeaModel {
        @NameInMap("RuleId")
        public java.util.List<String> ruleId;

        public static DescribePriceResponseBodyPriceInfoRuleIds build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoRuleIds self = new DescribePriceResponseBodyPriceInfoRuleIds();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoRuleIds setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoCouponsCoupon extends TeaModel {
        @NameInMap("CouponNo")
        public String couponNo;

        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        @NameInMap("IsSelected")
        public String isSelected;

        public static DescribePriceResponseBodyPriceInfoCouponsCoupon build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoCouponsCoupon self = new DescribePriceResponseBodyPriceInfoCouponsCoupon();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoCouponsCoupon setCouponNo(String couponNo) {
            this.couponNo = couponNo;
            return this;
        }
        public String getCouponNo() {
            return this.couponNo;
        }

        public DescribePriceResponseBodyPriceInfoCouponsCoupon setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePriceResponseBodyPriceInfoCouponsCoupon setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePriceResponseBodyPriceInfoCouponsCoupon setIsSelected(String isSelected) {
            this.isSelected = isSelected;
            return this;
        }
        public String getIsSelected() {
            return this.isSelected;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoCoupons extends TeaModel {
        @NameInMap("Coupon")
        public java.util.List<DescribePriceResponseBodyPriceInfoCouponsCoupon> coupon;

        public static DescribePriceResponseBodyPriceInfoCoupons build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoCoupons self = new DescribePriceResponseBodyPriceInfoCoupons();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoCoupons setCoupon(java.util.List<DescribePriceResponseBodyPriceInfoCouponsCoupon> coupon) {
            this.coupon = coupon;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyPriceInfoCouponsCoupon> getCoupon() {
            return this.coupon;
        }

    }

    public static class DescribePriceResponseBodyPriceInfoActivityInfo extends TeaModel {
        @NameInMap("CheckErrMsg")
        public String checkErrMsg;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Success")
        public String success;

        public static DescribePriceResponseBodyPriceInfoActivityInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfoActivityInfo self = new DescribePriceResponseBodyPriceInfoActivityInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfoActivityInfo setCheckErrMsg(String checkErrMsg) {
            this.checkErrMsg = checkErrMsg;
            return this;
        }
        public String getCheckErrMsg() {
            return this.checkErrMsg;
        }

        public DescribePriceResponseBodyPriceInfoActivityInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribePriceResponseBodyPriceInfoActivityInfo setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

    public static class DescribePriceResponseBodyPriceInfo extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("RuleIds")
        public DescribePriceResponseBodyPriceInfoRuleIds ruleIds;

        @NameInMap("Coupons")
        public DescribePriceResponseBodyPriceInfoCoupons coupons;

        @NameInMap("ActivityInfo")
        public DescribePriceResponseBodyPriceInfoActivityInfo activityInfo;

        public static DescribePriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPriceInfo self = new DescribePriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribePriceResponseBodyPriceInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePriceResponseBodyPriceInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribePriceResponseBodyPriceInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribePriceResponseBodyPriceInfo setRuleIds(DescribePriceResponseBodyPriceInfoRuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public DescribePriceResponseBodyPriceInfoRuleIds getRuleIds() {
            return this.ruleIds;
        }

        public DescribePriceResponseBodyPriceInfo setCoupons(DescribePriceResponseBodyPriceInfoCoupons coupons) {
            this.coupons = coupons;
            return this;
        }
        public DescribePriceResponseBodyPriceInfoCoupons getCoupons() {
            return this.coupons;
        }

        public DescribePriceResponseBodyPriceInfo setActivityInfo(DescribePriceResponseBodyPriceInfoActivityInfo activityInfo) {
            this.activityInfo = activityInfo;
            return this;
        }
        public DescribePriceResponseBodyPriceInfoActivityInfo getActivityInfo() {
            return this.activityInfo;
        }

    }

}
