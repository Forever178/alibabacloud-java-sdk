// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515;

import com.aliyun.tea.*;
import com.aliyun.vcs20200515.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("vcs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public AddDataSourceResponse addDataSourceWithOptions(AddDataSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDataSource", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddDataSourceResponse());
    }

    public AddDataSourceResponse addDataSource(AddDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDataSourceWithOptions(request, runtime);
    }

    public AddDeviceResponse addDeviceWithOptions(AddDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDevice", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddDeviceResponse());
    }

    public AddDeviceResponse addDevice(AddDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDeviceWithOptions(request, runtime);
    }

    public AddMonitorResponse addMonitorWithOptions(AddMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddMonitor", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddMonitorResponse());
    }

    public AddMonitorResponse addMonitor(AddMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMonitorWithOptions(request, runtime);
    }

    public AddProfileResponse addProfileWithOptions(AddProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddProfile", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddProfileResponse());
    }

    public AddProfileResponse addProfile(AddProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addProfileWithOptions(request, runtime);
    }

    public AddProfileCatalogResponse addProfileCatalogWithOptions(AddProfileCatalogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddProfileCatalog", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddProfileCatalogResponse());
    }

    public AddProfileCatalogResponse addProfileCatalog(AddProfileCatalogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addProfileCatalogWithOptions(request, runtime);
    }

    public BindCorpGroupResponse bindCorpGroupWithOptions(BindCorpGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindCorpGroup", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new BindCorpGroupResponse());
    }

    public BindCorpGroupResponse bindCorpGroup(BindCorpGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindCorpGroupWithOptions(request, runtime);
    }

    public BindPersonResponse bindPersonWithOptions(BindPersonRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindPerson", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new BindPersonResponse());
    }

    public BindPersonResponse bindPerson(BindPersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindPersonWithOptions(request, runtime);
    }

    public BindUserResponse bindUserWithOptions(BindUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindUser", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new BindUserResponse());
    }

    public BindUserResponse bindUser(BindUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindUserWithOptions(request, runtime);
    }

    public CreateCorpResponse createCorpWithOptions(CreateCorpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCorp", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCorpResponse());
    }

    public CreateCorpResponse createCorp(CreateCorpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCorpWithOptions(request, runtime);
    }

    public CreateCorpGroupResponse createCorpGroupWithOptions(CreateCorpGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCorpGroup", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCorpGroupResponse());
    }

    public CreateCorpGroupResponse createCorpGroup(CreateCorpGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCorpGroupWithOptions(request, runtime);
    }

    public CreateUserResponse createUserWithOptions(CreateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUser", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUserResponse());
    }

    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    public CreateUserGroupResponse createUserGroupWithOptions(CreateUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUserGroup", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUserGroupResponse());
    }

    public CreateUserGroupResponse createUserGroup(CreateUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserGroupWithOptions(request, runtime);
    }

    public CreateVideoComposeTaskResponse createVideoComposeTaskWithOptions(CreateVideoComposeTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVideoComposeTask", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVideoComposeTaskResponse());
    }

    public CreateVideoComposeTaskResponse createVideoComposeTask(CreateVideoComposeTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVideoComposeTaskWithOptions(request, runtime);
    }

    public CreateVideoSummaryTaskResponse createVideoSummaryTaskWithOptions(CreateVideoSummaryTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVideoSummaryTask", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVideoSummaryTaskResponse());
    }

    public CreateVideoSummaryTaskResponse createVideoSummaryTask(CreateVideoSummaryTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVideoSummaryTaskWithOptions(request, runtime);
    }

    public DeleteChannelResponse deleteChannelWithOptions(DeleteChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteChannel", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteChannelResponse());
    }

    public DeleteChannelResponse deleteChannel(DeleteChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteChannelWithOptions(request, runtime);
    }

    public DeleteCorpGroupResponse deleteCorpGroupWithOptions(DeleteCorpGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCorpGroup", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCorpGroupResponse());
    }

    public DeleteCorpGroupResponse deleteCorpGroup(DeleteCorpGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCorpGroupWithOptions(request, runtime);
    }

    public DeleteDataSourceResponse deleteDataSourceWithOptions(DeleteDataSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDataSource", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDataSourceResponse());
    }

    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDataSourceWithOptions(request, runtime);
    }

    public DeleteDeviceResponse deleteDeviceWithOptions(DeleteDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDevice", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDeviceResponse());
    }

    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceWithOptions(request, runtime);
    }

    public DeleteDeviceForInstanceResponse deleteDeviceForInstanceWithOptions(DeleteDeviceForInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteDeviceForInstanceShrinkRequest request = new DeleteDeviceForInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.devices)) {
            request.devicesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.devices, "Devices", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDeviceForInstance", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDeviceForInstanceResponse());
    }

    public DeleteDeviceForInstanceResponse deleteDeviceForInstance(DeleteDeviceForInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceForInstanceWithOptions(request, runtime);
    }

    public DeleteIPCDeviceResponse deleteIPCDeviceWithOptions(DeleteIPCDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIPCDevice", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIPCDeviceResponse());
    }

    public DeleteIPCDeviceResponse deleteIPCDevice(DeleteIPCDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIPCDeviceWithOptions(request, runtime);
    }

    public DeleteNVRDeviceResponse deleteNVRDeviceWithOptions(DeleteNVRDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNVRDevice", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNVRDeviceResponse());
    }

    public DeleteNVRDeviceResponse deleteNVRDevice(DeleteNVRDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNVRDeviceWithOptions(request, runtime);
    }

    public DeleteProfileResponse deleteProfileWithOptions(DeleteProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteProfile", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteProfileResponse());
    }

    public DeleteProfileResponse deleteProfile(DeleteProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProfileWithOptions(request, runtime);
    }

    public DeleteProfileCatalogResponse deleteProfileCatalogWithOptions(DeleteProfileCatalogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteProfileCatalog", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteProfileCatalogResponse());
    }

    public DeleteProfileCatalogResponse deleteProfileCatalog(DeleteProfileCatalogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProfileCatalogWithOptions(request, runtime);
    }

    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteProject", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteProjectResponse());
    }

    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    public DeleteRecordsResponse deleteRecordsWithOptions(DeleteRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRecords", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRecordsResponse());
    }

    public DeleteRecordsResponse deleteRecords(DeleteRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRecordsWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUser", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserResponse());
    }

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public DeleteUserGroupResponse deleteUserGroupWithOptions(DeleteUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUserGroup", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserGroupResponse());
    }

    public DeleteUserGroupResponse deleteUserGroup(DeleteUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserGroupWithOptions(request, runtime);
    }

    public DeleteVideoSummaryTaskResponse deleteVideoSummaryTaskWithOptions(DeleteVideoSummaryTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVideoSummaryTask", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVideoSummaryTaskResponse());
    }

    public DeleteVideoSummaryTaskResponse deleteVideoSummaryTask(DeleteVideoSummaryTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVideoSummaryTaskWithOptions(request, runtime);
    }

    public DescribeDevicesResponse describeDevicesWithOptions(DescribeDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDevices", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDevicesResponse());
    }

    public DescribeDevicesResponse describeDevices(DescribeDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDevicesWithOptions(request, runtime);
    }

    public GetBodyOptionsResponse getBodyOptionsWithOptions(GetBodyOptionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBodyOptions", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetBodyOptionsResponse());
    }

    public GetBodyOptionsResponse getBodyOptions(GetBodyOptionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBodyOptionsWithOptions(request, runtime);
    }

    public GetCatalogListResponse getCatalogListWithOptions(GetCatalogListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCatalogList", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetCatalogListResponse());
    }

    public GetCatalogListResponse getCatalogList(GetCatalogListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCatalogListWithOptions(request, runtime);
    }

    public GetDeviceCaptureStrategyResponse getDeviceCaptureStrategyWithOptions(GetDeviceCaptureStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceCaptureStrategy", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetDeviceCaptureStrategyResponse());
    }

    public GetDeviceCaptureStrategyResponse getDeviceCaptureStrategy(GetDeviceCaptureStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceCaptureStrategyWithOptions(request, runtime);
    }

    public GetDeviceConfigResponse getDeviceConfigWithOptions(GetDeviceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceConfig", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetDeviceConfigResponse());
    }

    public GetDeviceConfigResponse getDeviceConfig(GetDeviceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceConfigWithOptions(request, runtime);
    }

    public GetDeviceLiveUrlResponse getDeviceLiveUrlWithOptions(GetDeviceLiveUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceLiveUrl", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetDeviceLiveUrlResponse());
    }

    public GetDeviceLiveUrlResponse getDeviceLiveUrl(GetDeviceLiveUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceLiveUrlWithOptions(request, runtime);
    }

    public GetDeviceVideoUrlResponse getDeviceVideoUrlWithOptions(GetDeviceVideoUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceVideoUrl", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetDeviceVideoUrlResponse());
    }

    public GetDeviceVideoUrlResponse getDeviceVideoUrl(GetDeviceVideoUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceVideoUrlWithOptions(request, runtime);
    }

    public GetFaceModelResultResponse getFaceModelResultWithOptions(GetFaceModelResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetFaceModelResult", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetFaceModelResultResponse());
    }

    public GetFaceModelResultResponse getFaceModelResult(GetFaceModelResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFaceModelResultWithOptions(request, runtime);
    }

    public GetFaceOptionsResponse getFaceOptionsWithOptions(GetFaceOptionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetFaceOptions", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetFaceOptionsResponse());
    }

    public GetFaceOptionsResponse getFaceOptions(GetFaceOptionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFaceOptionsWithOptions(request, runtime);
    }

    public GetInventoryResponse getInventoryWithOptions(GetInventoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInventory", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetInventoryResponse());
    }

    public GetInventoryResponse getInventory(GetInventoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInventoryWithOptions(request, runtime);
    }

    public GetMonitorListResponse getMonitorListWithOptions(GetMonitorListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMonitorList", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetMonitorListResponse());
    }

    public GetMonitorListResponse getMonitorList(GetMonitorListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMonitorListWithOptions(request, runtime);
    }

    public GetMonitorResultResponse getMonitorResultWithOptions(GetMonitorResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMonitorResult", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetMonitorResultResponse());
    }

    public GetMonitorResultResponse getMonitorResult(GetMonitorResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMonitorResultWithOptions(request, runtime);
    }

    public GetPersonDetailResponse getPersonDetailWithOptions(GetPersonDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPersonDetail", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetPersonDetailResponse());
    }

    public GetPersonDetailResponse getPersonDetail(GetPersonDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPersonDetailWithOptions(request, runtime);
    }

    public GetPersonListResponse getPersonListWithOptions(GetPersonListRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetPersonListShrinkRequest request = new GetPersonListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.corpIdList)) {
            request.corpIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.corpIdList, "CorpIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.personIdList)) {
            request.personIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.personIdList, "PersonIdList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPersonList", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetPersonListResponse());
    }

    public GetPersonListResponse getPersonList(GetPersonListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPersonListWithOptions(request, runtime);
    }

    public GetProfileDetailResponse getProfileDetailWithOptions(GetProfileDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetProfileDetail", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetProfileDetailResponse());
    }

    public GetProfileDetailResponse getProfileDetail(GetProfileDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getProfileDetailWithOptions(request, runtime);
    }

    public GetProfileListResponse getProfileListWithOptions(GetProfileListRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetProfileListShrinkRequest request = new GetProfileListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.personIdList)) {
            request.personIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.personIdList, "PersonIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.profileIdList)) {
            request.profileIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.profileIdList, "ProfileIdList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetProfileList", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetProfileListResponse());
    }

    public GetProfileListResponse getProfileList(GetProfileListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getProfileListWithOptions(request, runtime);
    }

    public GetUserDetailResponse getUserDetailWithOptions(GetUserDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserDetail", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserDetailResponse());
    }

    public GetUserDetailResponse getUserDetail(GetUserDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserDetailWithOptions(request, runtime);
    }

    public GetVideoComposeResultResponse getVideoComposeResultWithOptions(GetVideoComposeResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideoComposeResult", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoComposeResultResponse());
    }

    public GetVideoComposeResultResponse getVideoComposeResult(GetVideoComposeResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoComposeResultWithOptions(request, runtime);
    }

    public GetVideoSummaryTaskResultResponse getVideoSummaryTaskResultWithOptions(GetVideoSummaryTaskResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideoSummaryTaskResult", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoSummaryTaskResultResponse());
    }

    public GetVideoSummaryTaskResultResponse getVideoSummaryTaskResult(GetVideoSummaryTaskResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoSummaryTaskResultWithOptions(request, runtime);
    }

    public InvokeMotorModelResponse invokeMotorModelWithOptions(InvokeMotorModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InvokeMotorModel", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new InvokeMotorModelResponse());
    }

    public InvokeMotorModelResponse invokeMotorModel(InvokeMotorModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeMotorModelWithOptions(request, runtime);
    }

    public ListAccessNumberResponse listAccessNumberWithOptions(ListAccessNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAccessNumber", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListAccessNumberResponse());
    }

    public ListAccessNumberResponse listAccessNumber(ListAccessNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAccessNumberWithOptions(request, runtime);
    }

    public ListBodyAlgorithmResultsResponse listBodyAlgorithmResultsWithOptions(ListBodyAlgorithmResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBodyAlgorithmResults", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListBodyAlgorithmResultsResponse());
    }

    public ListBodyAlgorithmResultsResponse listBodyAlgorithmResults(ListBodyAlgorithmResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBodyAlgorithmResultsWithOptions(request, runtime);
    }

    public ListCorpGroupMetricsResponse listCorpGroupMetricsWithOptions(ListCorpGroupMetricsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCorpGroupMetrics", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListCorpGroupMetricsResponse());
    }

    public ListCorpGroupMetricsResponse listCorpGroupMetrics(ListCorpGroupMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCorpGroupMetricsWithOptions(request, runtime);
    }

    public ListCorpGroupsResponse listCorpGroupsWithOptions(ListCorpGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCorpGroups", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListCorpGroupsResponse());
    }

    public ListCorpGroupsResponse listCorpGroups(ListCorpGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCorpGroupsWithOptions(request, runtime);
    }

    public ListCorpMetricsResponse listCorpMetricsWithOptions(ListCorpMetricsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCorpMetrics", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListCorpMetricsResponse());
    }

    public ListCorpMetricsResponse listCorpMetrics(ListCorpMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCorpMetricsWithOptions(request, runtime);
    }

    public ListCorpsResponse listCorpsWithOptions(ListCorpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCorps", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListCorpsResponse());
    }

    public ListCorpsResponse listCorps(ListCorpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCorpsWithOptions(request, runtime);
    }

    public ListDeviceGroupsResponse listDeviceGroupsWithOptions(ListDeviceGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDeviceGroups", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListDeviceGroupsResponse());
    }

    public ListDeviceGroupsResponse listDeviceGroups(ListDeviceGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceGroupsWithOptions(request, runtime);
    }

    public ListDevicesResponse listDevicesWithOptions(ListDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDevices", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListDevicesResponse());
    }

    public ListDevicesResponse listDevices(ListDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDevicesWithOptions(request, runtime);
    }

    public ListEventAlgorithmDetailsResponse listEventAlgorithmDetailsWithOptions(ListEventAlgorithmDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEventAlgorithmDetails", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListEventAlgorithmDetailsResponse());
    }

    public ListEventAlgorithmDetailsResponse listEventAlgorithmDetails(ListEventAlgorithmDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEventAlgorithmDetailsWithOptions(request, runtime);
    }

    public ListEventAlgorithmResultsResponse listEventAlgorithmResultsWithOptions(ListEventAlgorithmResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEventAlgorithmResults", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListEventAlgorithmResultsResponse());
    }

    public ListEventAlgorithmResultsResponse listEventAlgorithmResults(ListEventAlgorithmResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEventAlgorithmResultsWithOptions(request, runtime);
    }

    public ListFaceAlgorithmResultsResponse listFaceAlgorithmResultsWithOptions(ListFaceAlgorithmResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFaceAlgorithmResults", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListFaceAlgorithmResultsResponse());
    }

    public ListFaceAlgorithmResultsResponse listFaceAlgorithmResults(ListFaceAlgorithmResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFaceAlgorithmResultsWithOptions(request, runtime);
    }

    public ListMetricsResponse listMetricsWithOptions(ListMetricsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMetrics", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListMetricsResponse());
    }

    public ListMetricsResponse listMetrics(ListMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMetricsWithOptions(request, runtime);
    }

    public ListMotorAlgorithmResultsResponse listMotorAlgorithmResultsWithOptions(ListMotorAlgorithmResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMotorAlgorithmResults", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListMotorAlgorithmResultsResponse());
    }

    public ListMotorAlgorithmResultsResponse listMotorAlgorithmResults(ListMotorAlgorithmResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMotorAlgorithmResultsWithOptions(request, runtime);
    }

    public ListNVRChannelDeviceResponse listNVRChannelDeviceWithOptions(ListNVRChannelDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNVRChannelDevice", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListNVRChannelDeviceResponse());
    }

    public ListNVRChannelDeviceResponse listNVRChannelDevice(ListNVRChannelDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNVRChannelDeviceWithOptions(request, runtime);
    }

    public ListNVRDeviceResponse listNVRDeviceWithOptions(ListNVRDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNVRDevice", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListNVRDeviceResponse());
    }

    public ListNVRDeviceResponse listNVRDevice(ListNVRDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNVRDeviceWithOptions(request, runtime);
    }

    public ListPersonsResponse listPersonsWithOptions(ListPersonsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPersons", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListPersonsResponse());
    }

    public ListPersonsResponse listPersons(ListPersonsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPersonsWithOptions(request, runtime);
    }

    public ListPersonTraceResponse listPersonTraceWithOptions(ListPersonTraceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPersonTrace", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListPersonTraceResponse());
    }

    public ListPersonTraceResponse listPersonTrace(ListPersonTraceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPersonTraceWithOptions(request, runtime);
    }

    public ListPersonTraceDetailsResponse listPersonTraceDetailsWithOptions(ListPersonTraceDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPersonTraceDetails", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListPersonTraceDetailsResponse());
    }

    public ListPersonTraceDetailsResponse listPersonTraceDetails(ListPersonTraceDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPersonTraceDetailsWithOptions(request, runtime);
    }

    public ListPersonVisitCountResponse listPersonVisitCountWithOptions(ListPersonVisitCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPersonVisitCount", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListPersonVisitCountResponse());
    }

    public ListPersonVisitCountResponse listPersonVisitCount(ListPersonVisitCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPersonVisitCountWithOptions(request, runtime);
    }

    public ListSubscribeDeviceResponse listSubscribeDeviceWithOptions(ListSubscribeDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSubscribeDevice", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListSubscribeDeviceResponse());
    }

    public ListSubscribeDeviceResponse listSubscribeDevice(ListSubscribeDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSubscribeDeviceWithOptions(request, runtime);
    }

    public ListUserGroupsResponse listUserGroupsWithOptions(ListUserGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserGroups", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserGroupsResponse());
    }

    public ListUserGroupsResponse listUserGroups(ListUserGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserGroupsWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListUsersShrinkRequest request = new ListUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.personList)) {
            request.personListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.personList, "PersonList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userList)) {
            request.userListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userList, "UserList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsers", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public RecognizeFaceQualityResponse recognizeFaceQualityWithOptions(RecognizeFaceQualityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeFaceQuality", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new RecognizeFaceQualityResponse());
    }

    public RecognizeFaceQualityResponse recognizeFaceQuality(RecognizeFaceQualityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeFaceQualityWithOptions(request, runtime);
    }

    public RecognizeImageResponse recognizeImageWithOptions(RecognizeImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeImage", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new RecognizeImageResponse());
    }

    public RecognizeImageResponse recognizeImage(RecognizeImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeImageWithOptions(request, runtime);
    }

    public RegisterDeviceResponse registerDeviceWithOptions(RegisterDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterDevice", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterDeviceResponse());
    }

    public RegisterDeviceResponse registerDevice(RegisterDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerDeviceWithOptions(request, runtime);
    }

    public ReportDeviceCapacityResponse reportDeviceCapacityWithOptions(ReportDeviceCapacityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportDeviceCapacity", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new ReportDeviceCapacityResponse());
    }

    public ReportDeviceCapacityResponse reportDeviceCapacity(ReportDeviceCapacityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportDeviceCapacityWithOptions(request, runtime);
    }

    public SaveVideoSummaryTaskVideoResponse saveVideoSummaryTaskVideoWithOptions(SaveVideoSummaryTaskVideoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveVideoSummaryTaskVideo", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SaveVideoSummaryTaskVideoResponse());
    }

    public SaveVideoSummaryTaskVideoResponse saveVideoSummaryTaskVideo(SaveVideoSummaryTaskVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveVideoSummaryTaskVideoWithOptions(request, runtime);
    }

    public SearchBodyResponse searchBodyWithOptions(SearchBodyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchBodyShrinkRequest request = new SearchBodyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.optionList)) {
            request.optionListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.optionList, "OptionList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchBody", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SearchBodyResponse());
    }

    public SearchBodyResponse searchBody(SearchBodyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchBodyWithOptions(request, runtime);
    }

    public SearchFaceResponse searchFaceWithOptions(SearchFaceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchFaceShrinkRequest request = new SearchFaceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.optionList)) {
            request.optionListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.optionList, "OptionList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchFace", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SearchFaceResponse());
    }

    public SearchFaceResponse searchFace(SearchFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchFaceWithOptions(request, runtime);
    }

    public SearchObjectResponse searchObjectWithOptions(SearchObjectRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchObjectShrinkRequest request = new SearchObjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceList)) {
            request.deviceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceList, "DeviceList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.conditions)) {
            request.conditionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.conditions, "Conditions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imagePath)) {
            request.imagePathShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imagePath, "ImagePath", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchObject", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SearchObjectResponse());
    }

    public SearchObjectResponse searchObject(SearchObjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchObjectWithOptions(request, runtime);
    }

    public StopMonitorResponse stopMonitorWithOptions(StopMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopMonitor", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new StopMonitorResponse());
    }

    public StopMonitorResponse stopMonitor(StopMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopMonitorWithOptions(request, runtime);
    }

    public SubscribeDeviceEventResponse subscribeDeviceEventWithOptions(SubscribeDeviceEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubscribeDeviceEvent", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SubscribeDeviceEventResponse());
    }

    public SubscribeDeviceEventResponse subscribeDeviceEvent(SubscribeDeviceEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.subscribeDeviceEventWithOptions(request, runtime);
    }

    public SubscribeSpaceEventResponse subscribeSpaceEventWithOptions(SubscribeSpaceEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubscribeSpaceEvent", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SubscribeSpaceEventResponse());
    }

    public SubscribeSpaceEventResponse subscribeSpaceEvent(SubscribeSpaceEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.subscribeSpaceEventWithOptions(request, runtime);
    }

    public SyncDeviceTimeResponse syncDeviceTimeWithOptions(SyncDeviceTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncDeviceTime", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new SyncDeviceTimeResponse());
    }

    public SyncDeviceTimeResponse syncDeviceTime(SyncDeviceTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncDeviceTimeWithOptions(request, runtime);
    }

    public UnbindCorpGroupResponse unbindCorpGroupWithOptions(UnbindCorpGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindCorpGroup", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindCorpGroupResponse());
    }

    public UnbindCorpGroupResponse unbindCorpGroup(UnbindCorpGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindCorpGroupWithOptions(request, runtime);
    }

    public UnbindPersonResponse unbindPersonWithOptions(UnbindPersonRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindPerson", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindPersonResponse());
    }

    public UnbindPersonResponse unbindPerson(UnbindPersonRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindPersonWithOptions(request, runtime);
    }

    public UnbindUserResponse unbindUserWithOptions(UnbindUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindUser", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindUserResponse());
    }

    public UnbindUserResponse unbindUser(UnbindUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindUserWithOptions(request, runtime);
    }

    public UnsubscribeDeviceEventResponse unsubscribeDeviceEventWithOptions(UnsubscribeDeviceEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnsubscribeDeviceEvent", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UnsubscribeDeviceEventResponse());
    }

    public UnsubscribeDeviceEventResponse unsubscribeDeviceEvent(UnsubscribeDeviceEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unsubscribeDeviceEventWithOptions(request, runtime);
    }

    public UnsubscribeSpaceEventResponse unsubscribeSpaceEventWithOptions(UnsubscribeSpaceEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnsubscribeSpaceEvent", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UnsubscribeSpaceEventResponse());
    }

    public UnsubscribeSpaceEventResponse unsubscribeSpaceEvent(UnsubscribeSpaceEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unsubscribeSpaceEventWithOptions(request, runtime);
    }

    public UpdateCorpResponse updateCorpWithOptions(UpdateCorpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCorp", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCorpResponse());
    }

    public UpdateCorpResponse updateCorp(UpdateCorpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCorpWithOptions(request, runtime);
    }

    public UpdateDeviceResponse updateDeviceWithOptions(UpdateDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDevice", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDeviceResponse());
    }

    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceWithOptions(request, runtime);
    }

    public UpdateDeviceCaptureStrategyResponse updateDeviceCaptureStrategyWithOptions(UpdateDeviceCaptureStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDeviceCaptureStrategy", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDeviceCaptureStrategyResponse());
    }

    public UpdateDeviceCaptureStrategyResponse updateDeviceCaptureStrategy(UpdateDeviceCaptureStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceCaptureStrategyWithOptions(request, runtime);
    }

    public UpdateMonitorResponse updateMonitorWithOptions(UpdateMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMonitor", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMonitorResponse());
    }

    public UpdateMonitorResponse updateMonitor(UpdateMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMonitorWithOptions(request, runtime);
    }

    public UpdateProfileResponse updateProfileWithOptions(UpdateProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateProfile", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateProfileResponse());
    }

    public UpdateProfileResponse updateProfile(UpdateProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProfileWithOptions(request, runtime);
    }

    public UpdateProfileCatalogResponse updateProfileCatalogWithOptions(UpdateProfileCatalogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateProfileCatalog", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateProfileCatalogResponse());
    }

    public UpdateProfileCatalogResponse updateProfileCatalog(UpdateProfileCatalogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProfileCatalogWithOptions(request, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateUser", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateUserResponse());
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    public UpdateUserGroupResponse updateUserGroupWithOptions(UpdateUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateUserGroup", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateUserGroupResponse());
    }

    public UpdateUserGroupResponse updateUserGroup(UpdateUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserGroupWithOptions(request, runtime);
    }

    public UploadFileResponse uploadFileWithOptions(UploadFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadFile", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UploadFileResponse());
    }

    public UploadFileResponse uploadFile(UploadFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadFileWithOptions(request, runtime);
    }

    public UploadImageResponse uploadImageWithOptions(UploadImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadImage", "2020-05-15", "HTTPS", "POST", "AK", "json", req, runtime), new UploadImageResponse());
    }

    public UploadImageResponse uploadImage(UploadImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadImageWithOptions(request, runtime);
    }
}
