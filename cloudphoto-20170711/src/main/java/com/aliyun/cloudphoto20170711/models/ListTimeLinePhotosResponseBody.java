// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListTimeLinePhotosResponseBody extends TeaModel {
    @NameInMap("Photos")
    public java.util.List<ListTimeLinePhotosResponseBodyPhotos> photos;

    @NameInMap("Action")
    public String action;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static ListTimeLinePhotosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTimeLinePhotosResponseBody self = new ListTimeLinePhotosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTimeLinePhotosResponseBody setPhotos(java.util.List<ListTimeLinePhotosResponseBodyPhotos> photos) {
        this.photos = photos;
        return this;
    }
    public java.util.List<ListTimeLinePhotosResponseBodyPhotos> getPhotos() {
        return this.photos;
    }

    public ListTimeLinePhotosResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListTimeLinePhotosResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTimeLinePhotosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTimeLinePhotosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTimeLinePhotosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListTimeLinePhotosResponseBodyPhotos extends TeaModel {
        @NameInMap("Remark")
        public String remark;

        @NameInMap("TakenAt")
        public Long takenAt;

        @NameInMap("State")
        public String state;

        @NameInMap("Height")
        public Long height;

        @NameInMap("ShareExpireTime")
        public Long shareExpireTime;

        @NameInMap("FileId")
        public String fileId;

        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Ctime")
        public Long ctime;

        @NameInMap("Mtime")
        public Long mtime;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Width")
        public Long width;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("IsVideo")
        public Boolean isVideo;

        @NameInMap("Title")
        public String title;

        @NameInMap("Like")
        public Long like;

        @NameInMap("Location")
        public String location;

        @NameInMap("Id")
        public Long id;

        public static ListTimeLinePhotosResponseBodyPhotos build(java.util.Map<String, ?> map) throws Exception {
            ListTimeLinePhotosResponseBodyPhotos self = new ListTimeLinePhotosResponseBodyPhotos();
            return TeaModel.build(map, self);
        }

        public ListTimeLinePhotosResponseBodyPhotos setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListTimeLinePhotosResponseBodyPhotos setTakenAt(Long takenAt) {
            this.takenAt = takenAt;
            return this;
        }
        public Long getTakenAt() {
            return this.takenAt;
        }

        public ListTimeLinePhotosResponseBodyPhotos setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListTimeLinePhotosResponseBodyPhotos setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public ListTimeLinePhotosResponseBodyPhotos setShareExpireTime(Long shareExpireTime) {
            this.shareExpireTime = shareExpireTime;
            return this;
        }
        public Long getShareExpireTime() {
            return this.shareExpireTime;
        }

        public ListTimeLinePhotosResponseBodyPhotos setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListTimeLinePhotosResponseBodyPhotos setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public ListTimeLinePhotosResponseBodyPhotos setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public ListTimeLinePhotosResponseBodyPhotos setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public ListTimeLinePhotosResponseBodyPhotos setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListTimeLinePhotosResponseBodyPhotos setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public ListTimeLinePhotosResponseBodyPhotos setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListTimeLinePhotosResponseBodyPhotos setIsVideo(Boolean isVideo) {
            this.isVideo = isVideo;
            return this;
        }
        public Boolean getIsVideo() {
            return this.isVideo;
        }

        public ListTimeLinePhotosResponseBodyPhotos setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListTimeLinePhotosResponseBodyPhotos setLike(Long like) {
            this.like = like;
            return this;
        }
        public Long getLike() {
            return this.like;
        }

        public ListTimeLinePhotosResponseBodyPhotos setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListTimeLinePhotosResponseBodyPhotos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
