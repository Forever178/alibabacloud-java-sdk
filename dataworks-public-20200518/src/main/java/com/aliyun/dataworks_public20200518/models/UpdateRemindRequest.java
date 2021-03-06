// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateRemindRequest extends TeaModel {
    @NameInMap("RemindId")
    @Validation(required = true)
    public Long remindId;

    @NameInMap("RemindName")
    public String remindName;

    @NameInMap("DndEnd")
    public String dndEnd;

    @NameInMap("RemindUnit")
    public String remindUnit;

    @NameInMap("NodeIds")
    public String nodeIds;

    @NameInMap("BaselineIds")
    public String baselineIds;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("BizProcessIds")
    public String bizProcessIds;

    @NameInMap("RemindType")
    public String remindType;

    @NameInMap("MaxAlertTimes")
    public Integer maxAlertTimes;

    @NameInMap("AlertInterval")
    public Integer alertInterval;

    @NameInMap("Detail")
    public String detail;

    @NameInMap("AlertUnit")
    public String alertUnit;

    @NameInMap("AlertMethods")
    public String alertMethods;

    @NameInMap("AlertTargets")
    public String alertTargets;

    @NameInMap("UseFlag")
    public Boolean useFlag;

    @NameInMap("RobotUrls")
    public String robotUrls;

    public static UpdateRemindRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRemindRequest self = new UpdateRemindRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRemindRequest setRemindId(Long remindId) {
        this.remindId = remindId;
        return this;
    }
    public Long getRemindId() {
        return this.remindId;
    }

    public UpdateRemindRequest setRemindName(String remindName) {
        this.remindName = remindName;
        return this;
    }
    public String getRemindName() {
        return this.remindName;
    }

    public UpdateRemindRequest setDndEnd(String dndEnd) {
        this.dndEnd = dndEnd;
        return this;
    }
    public String getDndEnd() {
        return this.dndEnd;
    }

    public UpdateRemindRequest setRemindUnit(String remindUnit) {
        this.remindUnit = remindUnit;
        return this;
    }
    public String getRemindUnit() {
        return this.remindUnit;
    }

    public UpdateRemindRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

    public UpdateRemindRequest setBaselineIds(String baselineIds) {
        this.baselineIds = baselineIds;
        return this;
    }
    public String getBaselineIds() {
        return this.baselineIds;
    }

    public UpdateRemindRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateRemindRequest setBizProcessIds(String bizProcessIds) {
        this.bizProcessIds = bizProcessIds;
        return this;
    }
    public String getBizProcessIds() {
        return this.bizProcessIds;
    }

    public UpdateRemindRequest setRemindType(String remindType) {
        this.remindType = remindType;
        return this;
    }
    public String getRemindType() {
        return this.remindType;
    }

    public UpdateRemindRequest setMaxAlertTimes(Integer maxAlertTimes) {
        this.maxAlertTimes = maxAlertTimes;
        return this;
    }
    public Integer getMaxAlertTimes() {
        return this.maxAlertTimes;
    }

    public UpdateRemindRequest setAlertInterval(Integer alertInterval) {
        this.alertInterval = alertInterval;
        return this;
    }
    public Integer getAlertInterval() {
        return this.alertInterval;
    }

    public UpdateRemindRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public UpdateRemindRequest setAlertUnit(String alertUnit) {
        this.alertUnit = alertUnit;
        return this;
    }
    public String getAlertUnit() {
        return this.alertUnit;
    }

    public UpdateRemindRequest setAlertMethods(String alertMethods) {
        this.alertMethods = alertMethods;
        return this;
    }
    public String getAlertMethods() {
        return this.alertMethods;
    }

    public UpdateRemindRequest setAlertTargets(String alertTargets) {
        this.alertTargets = alertTargets;
        return this;
    }
    public String getAlertTargets() {
        return this.alertTargets;
    }

    public UpdateRemindRequest setUseFlag(Boolean useFlag) {
        this.useFlag = useFlag;
        return this;
    }
    public Boolean getUseFlag() {
        return this.useFlag;
    }

    public UpdateRemindRequest setRobotUrls(String robotUrls) {
        this.robotUrls = robotUrls;
        return this;
    }
    public String getRobotUrls() {
        return this.robotUrls;
    }

}
