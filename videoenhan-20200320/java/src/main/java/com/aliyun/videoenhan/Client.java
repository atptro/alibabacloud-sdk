// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan;

import com.aliyun.tea.*;
import com.aliyun.videoenhan.models.*;

public class Client {

    public String _endpoint;
    public String _regionId;
    public String _protocol;
    public String _userAgent;
    public String _endpointType;
    public Integer _readTimeout;
    public Integer _connectTimeout;
    public String _httpProxy;
    public String _httpsProxy;
    public String _socks5Proxy;
    public String _socks5NetWork;
    public String _noProxy;
    public Integer _maxIdleConns;
    public String _openPlatformEndpoint;
    public com.aliyun.credentials.Client _credential;
    public Client(Config config) throws Exception {
        if (com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(config))) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("name", "ParameterMissing"),
                new TeaPair("message", "'config' can not be unset")
            ));
        }

        if (com.aliyun.teautil.Common.empty(config.regionId)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("name", "ParameterMissing"),
                new TeaPair("message", "'config.regionId' can not be empty")
            ));
        }

        if (com.aliyun.teautil.Common.empty(config.endpoint)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("name", "ParameterMissing"),
                new TeaPair("message", "'config.endpoint' can not be empty")
            ));
        }

        if (com.aliyun.teautil.Common.empty(config.type)) {
            config.type = "access_key";
        }

        com.aliyun.credentials.models.Config credentialConfig = com.aliyun.credentials.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", config.accessKeyId),
            new TeaPair("type", config.type),
            new TeaPair("accessKeySecret", config.accessKeySecret),
            new TeaPair("securityToken", config.securityToken)
        ));
        this._credential = new com.aliyun.credentials.Client(credentialConfig);
        this._endpoint = config.endpoint;
        this._protocol = config.protocol;
        this._regionId = config.regionId;
        this._userAgent = config.userAgent;
        this._readTimeout = config.readTimeout;
        this._connectTimeout = config.connectTimeout;
        this._httpProxy = config.httpProxy;
        this._httpsProxy = config.httpsProxy;
        this._noProxy = config.noProxy;
        this._socks5Proxy = config.socks5Proxy;
        this._socks5NetWork = config.socks5NetWork;
        this._maxIdleConns = config.maxIdleConns;
        this._endpointType = config.endpointType;
        this._openPlatformEndpoint = config.openPlatformEndpoint;
    }

    public java.util.Map<String, Object> _request(String action, String protocol, String method, String authType, java.util.Map<String, Object> query, java.util.Map<String, Object> body, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("retry", TeaConverter.buildMap(
                new TeaPair("retryable", runtime.autoretry),
                new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3))
            )),
            new TeaPair("backoff", TeaConverter.buildMap(
                new TeaPair("policy", com.aliyun.teautil.Common.defaultString(runtime.backoffPolicy, "no")),
                new TeaPair("period", com.aliyun.teautil.Common.defaultNumber(runtime.backoffPeriod, 1))
            )),
            new TeaPair("ignoreSSL", runtime.ignoreSSL)
        );

        TeaRequest _lastRequest = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                request_.protocol = com.aliyun.teautil.Common.defaultString(_protocol, protocol);
                request_.method = method;
                request_.pathname = "/";
                request_.query = com.aliyun.common.Common.query(TeaConverter.merge(Object.class,
                    TeaConverter.buildMap(
                        new TeaPair("Action", action),
                        new TeaPair("Format", "json"),
                        new TeaPair("RegionId", _regionId),
                        new TeaPair("Timestamp", com.aliyun.common.Common.getTimestamp()),
                        new TeaPair("Version", "2020-03-20"),
                        new TeaPair("SignatureNonce", com.aliyun.teautil.Common.getNonce())
                    ),
                    query
                ));
                if (!com.aliyun.teautil.Common.isUnset(body)) {
                    java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.anyifyMapValue(com.aliyun.common.Common.query(body));
                    request_.body = Tea.toReadable(com.aliyun.teautil.Common.toFormString(tmp));
                }

                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", com.aliyun.common.Common.getHost("videoenhan", _regionId, _endpoint)),
                    new TeaPair("user-agent", this.getUserAgent())
                );
                if (!com.aliyun.teautil.Common.equalString(authType, "Anonymous")) {
                    String accessKeyId = this.getAccessKeyId();
                    String accessKeySecret = this.getAccessKeySecret();
                    request_.query.put("SignatureMethod", "HMAC-SHA1");
                    request_.query.put("SignatureVersion", "1.0");
                    request_.query.put("AccessKeyId", accessKeyId);
                    request_.query.put("Signature", com.aliyun.common.Common.getSignature(request_, accessKeySecret));
                }

                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_);

                Object obj = com.aliyun.teautil.Common.readAsJSON(response_.body);
                java.util.Map<String, Object> res = com.aliyun.teautil.Common.assertAsMap(obj);
                if (com.aliyun.teautil.Common.is4xx(response_.statusCode) || com.aliyun.teautil.Common.is5xx(response_.statusCode)) {
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("message", res.get("Message")),
                        new TeaPair("data", res),
                        new TeaPair("code", res.get("Code"))
                    ));
                }

                return res;
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    continue;
                }
                throw e;
            }
        }

        throw new TeaUnretryableException(_lastRequest);
    }

    public GetAsyncJobResultResponse getAsyncJobResult(GetAsyncJobResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        return TeaModel.toModel(this._request("GetAsyncJobResult", "HTTPS", "POST", "AK", null, TeaModel.buildMap(request), runtime), new GetAsyncJobResultResponse());
    }

    public SuperResolveVideoResponse superResolveVideo(SuperResolveVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        return TeaModel.toModel(this._request("SuperResolveVideo", "HTTPS", "POST", "AK", null, TeaModel.buildMap(request), runtime), new SuperResolveVideoResponse());
    }

    public SuperResolveVideoResponse superResolveVideoAdvance(SuperResolveVideoAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.openplatform.models.Config authConfig = com.aliyun.openplatform.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform.Client authClient = new com.aliyun.openplatform.Client(authConfig);
        com.aliyun.openplatform.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videoenhan"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform.models.AuthorizeFileUploadResponse authResponse = authClient.authorizeFileUpload(authRequest, runtime);
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType)),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        com.aliyun.oss.models.PostObjectRequest uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ossClient.postObject(uploadRequest, ossRuntime);
        SuperResolveVideoRequest superResolveVideoreq = new SuperResolveVideoRequest();
        com.aliyun.common.Common.convert(request, superResolveVideoreq);
        superResolveVideoreq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        SuperResolveVideoResponse superResolveVideoResp = this.superResolveVideo(superResolveVideoreq, runtime);
        return superResolveVideoResp;
    }

    public EraseVideoLogoResponse eraseVideoLogo(EraseVideoLogoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        return TeaModel.toModel(this._request("EraseVideoLogo", "HTTPS", "POST", "AK", null, TeaModel.buildMap(request), runtime), new EraseVideoLogoResponse());
    }

    public EraseVideoLogoResponse eraseVideoLogoAdvance(EraseVideoLogoAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.openplatform.models.Config authConfig = com.aliyun.openplatform.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform.Client authClient = new com.aliyun.openplatform.Client(authConfig);
        com.aliyun.openplatform.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videoenhan"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform.models.AuthorizeFileUploadResponse authResponse = authClient.authorizeFileUpload(authRequest, runtime);
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType)),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        com.aliyun.oss.models.PostObjectRequest uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ossClient.postObject(uploadRequest, ossRuntime);
        EraseVideoLogoRequest eraseVideoLogoreq = new EraseVideoLogoRequest();
        com.aliyun.common.Common.convert(request, eraseVideoLogoreq);
        eraseVideoLogoreq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        EraseVideoLogoResponse eraseVideoLogoResp = this.eraseVideoLogo(eraseVideoLogoreq, runtime);
        return eraseVideoLogoResp;
    }

    public EraseVideoSubtitlesResponse eraseVideoSubtitles(EraseVideoSubtitlesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        return TeaModel.toModel(this._request("EraseVideoSubtitles", "HTTPS", "POST", "AK", null, TeaModel.buildMap(request), runtime), new EraseVideoSubtitlesResponse());
    }

    public EraseVideoSubtitlesResponse eraseVideoSubtitlesAdvance(EraseVideoSubtitlesAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.openplatform.models.Config authConfig = com.aliyun.openplatform.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform.Client authClient = new com.aliyun.openplatform.Client(authConfig);
        com.aliyun.openplatform.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videoenhan"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform.models.AuthorizeFileUploadResponse authResponse = authClient.authorizeFileUpload(authRequest, runtime);
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType)),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        com.aliyun.oss.models.PostObjectRequest uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ossClient.postObject(uploadRequest, ossRuntime);
        EraseVideoSubtitlesRequest eraseVideoSubtitlesreq = new EraseVideoSubtitlesRequest();
        com.aliyun.common.Common.convert(request, eraseVideoSubtitlesreq);
        eraseVideoSubtitlesreq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        EraseVideoSubtitlesResponse eraseVideoSubtitlesResp = this.eraseVideoSubtitles(eraseVideoSubtitlesreq, runtime);
        return eraseVideoSubtitlesResp;
    }

    public AbstractEcommerceVideoResponse abstractEcommerceVideo(AbstractEcommerceVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        return TeaModel.toModel(this._request("AbstractEcommerceVideo", "HTTPS", "POST", "AK", null, TeaModel.buildMap(request), runtime), new AbstractEcommerceVideoResponse());
    }

    public AbstractEcommerceVideoResponse abstractEcommerceVideoAdvance(AbstractEcommerceVideoAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.openplatform.models.Config authConfig = com.aliyun.openplatform.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform.Client authClient = new com.aliyun.openplatform.Client(authConfig);
        com.aliyun.openplatform.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videoenhan"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform.models.AuthorizeFileUploadResponse authResponse = authClient.authorizeFileUpload(authRequest, runtime);
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType)),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        com.aliyun.oss.models.PostObjectRequest uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ossClient.postObject(uploadRequest, ossRuntime);
        AbstractEcommerceVideoRequest abstractEcommerceVideoreq = new AbstractEcommerceVideoRequest();
        com.aliyun.common.Common.convert(request, abstractEcommerceVideoreq);
        abstractEcommerceVideoreq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        AbstractEcommerceVideoResponse abstractEcommerceVideoResp = this.abstractEcommerceVideo(abstractEcommerceVideoreq, runtime);
        return abstractEcommerceVideoResp;
    }

    public AbstractFilmVideoResponse abstractFilmVideo(AbstractFilmVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        return TeaModel.toModel(this._request("AbstractFilmVideo", "HTTPS", "POST", "AK", null, TeaModel.buildMap(request), runtime), new AbstractFilmVideoResponse());
    }

    public AbstractFilmVideoResponse abstractFilmVideoAdvance(AbstractFilmVideoAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.openplatform.models.Config authConfig = com.aliyun.openplatform.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform.Client authClient = new com.aliyun.openplatform.Client(authConfig);
        com.aliyun.openplatform.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videoenhan"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform.models.AuthorizeFileUploadResponse authResponse = authClient.authorizeFileUpload(authRequest, runtime);
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType)),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        com.aliyun.oss.models.PostObjectRequest uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ossClient.postObject(uploadRequest, ossRuntime);
        AbstractFilmVideoRequest abstractFilmVideoreq = new AbstractFilmVideoRequest();
        com.aliyun.common.Common.convert(request, abstractFilmVideoreq);
        abstractFilmVideoreq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        AbstractFilmVideoResponse abstractFilmVideoResp = this.abstractFilmVideo(abstractFilmVideoreq, runtime);
        return abstractFilmVideoResp;
    }

    public AdjustVideoColorResponse adjustVideoColor(AdjustVideoColorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        return TeaModel.toModel(this._request("AdjustVideoColor", "HTTPS", "POST", "AK", null, TeaModel.buildMap(request), runtime), new AdjustVideoColorResponse());
    }

    public AdjustVideoColorResponse adjustVideoColorAdvance(AdjustVideoColorAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.openplatform.models.Config authConfig = com.aliyun.openplatform.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform.Client authClient = new com.aliyun.openplatform.Client(authConfig);
        com.aliyun.openplatform.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "videoenhan"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform.models.AuthorizeFileUploadResponse authResponse = authClient.authorizeFileUpload(authRequest, runtime);
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType)),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.videoUrlObject),
            new TeaPair("contentType", "")
        ));
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        com.aliyun.oss.models.PostObjectRequest uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ossClient.postObject(uploadRequest, ossRuntime);
        AdjustVideoColorRequest adjustVideoColorreq = new AdjustVideoColorRequest();
        com.aliyun.common.Common.convert(request, adjustVideoColorreq);
        adjustVideoColorreq.videoUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        AdjustVideoColorResponse adjustVideoColorResp = this.adjustVideoColor(adjustVideoColorreq, runtime);
        return adjustVideoColorResp;
    }

    public String getUserAgent() throws Exception {
        String userAgent = com.aliyun.teautil.Common.getUserAgent(_userAgent);
        return userAgent;
    }

    public String getAccessKeyId() throws Exception {
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            return "";
        }

        String accessKeyId = _credential.getAccessKeyId();
        return accessKeyId;
    }

    public String getAccessKeySecret() throws Exception {
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            return "";
        }

        String secret = _credential.getAccessKeySecret();
        return secret;
    }
}
