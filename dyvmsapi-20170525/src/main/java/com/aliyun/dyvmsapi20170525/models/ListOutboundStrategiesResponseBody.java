// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListOutboundStrategiesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OutboundStrategies")
    public java.util.List<ListOutboundStrategiesResponseBodyOutboundStrategies> outboundStrategies;

    @NameInMap("Code")
    public String code;

    public static ListOutboundStrategiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundStrategiesResponseBody self = new ListOutboundStrategiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOutboundStrategiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOutboundStrategiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOutboundStrategiesResponseBody setOutboundStrategies(java.util.List<ListOutboundStrategiesResponseBodyOutboundStrategies> outboundStrategies) {
        this.outboundStrategies = outboundStrategies;
        return this;
    }
    public java.util.List<ListOutboundStrategiesResponseBodyOutboundStrategies> getOutboundStrategies() {
        return this.outboundStrategies;
    }

    public ListOutboundStrategiesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListOutboundStrategiesResponseBodyOutboundStrategies extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("SuccessRate")
        public Integer successRate;

        @NameInMap("Process")
        public Integer process;

        @NameInMap("GmtModifiedStr")
        public String gmtModifiedStr;

        @NameInMap("OutboundNum")
        public String outboundNum;

        @NameInMap("ModifierId")
        public Long modifierId;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("RobotName")
        public String robotName;

        @NameInMap("ModifierName")
        public String modifierName;

        @NameInMap("ResourceAllocation")
        public Integer resourceAllocation;

        @NameInMap("ExtAttr")
        public String extAttr;

        @NameInMap("NumType")
        public Integer numType;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("RobotId")
        public String robotId;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("RobotType")
        public Integer robotType;

        @NameInMap("RuleCode")
        public Long ruleCode;

        @NameInMap("name")
        public String name;

        @NameInMap("GmtCreateStr")
        public String gmtCreateStr;

        @NameInMap("Id")
        public Long id;

        public static ListOutboundStrategiesResponseBodyOutboundStrategies build(java.util.Map<String, ?> map) throws Exception {
            ListOutboundStrategiesResponseBodyOutboundStrategies self = new ListOutboundStrategiesResponseBodyOutboundStrategies();
            return TeaModel.build(map, self);
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setSuccessRate(Integer successRate) {
            this.successRate = successRate;
            return this;
        }
        public Integer getSuccessRate() {
            return this.successRate;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setProcess(Integer process) {
            this.process = process;
            return this;
        }
        public Integer getProcess() {
            return this.process;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setGmtModifiedStr(String gmtModifiedStr) {
            this.gmtModifiedStr = gmtModifiedStr;
            return this;
        }
        public String getGmtModifiedStr() {
            return this.gmtModifiedStr;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setOutboundNum(String outboundNum) {
            this.outboundNum = outboundNum;
            return this;
        }
        public String getOutboundNum() {
            return this.outboundNum;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setModifierId(Long modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public Long getModifierId() {
            return this.modifierId;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setRobotName(String robotName) {
            this.robotName = robotName;
            return this;
        }
        public String getRobotName() {
            return this.robotName;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setResourceAllocation(Integer resourceAllocation) {
            this.resourceAllocation = resourceAllocation;
            return this;
        }
        public Integer getResourceAllocation() {
            return this.resourceAllocation;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setExtAttr(String extAttr) {
            this.extAttr = extAttr;
            return this;
        }
        public String getExtAttr() {
            return this.extAttr;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setNumType(Integer numType) {
            this.numType = numType;
            return this;
        }
        public Integer getNumType() {
            return this.numType;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setRobotId(String robotId) {
            this.robotId = robotId;
            return this;
        }
        public String getRobotId() {
            return this.robotId;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setRobotType(Integer robotType) {
            this.robotType = robotType;
            return this;
        }
        public Integer getRobotType() {
            return this.robotType;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setRuleCode(Long ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public Long getRuleCode() {
            return this.ruleCode;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setGmtCreateStr(String gmtCreateStr) {
            this.gmtCreateStr = gmtCreateStr;
            return this;
        }
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
