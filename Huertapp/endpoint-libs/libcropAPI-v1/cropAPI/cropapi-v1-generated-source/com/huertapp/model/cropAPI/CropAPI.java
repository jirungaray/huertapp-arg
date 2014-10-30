/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-10-28 17:08:27 UTC)
 * on 2014-10-30 at 05:06:24 UTC 
 * Modify at your own risk.
 */

package com.huertapp.model.cropAPI;

/**
 * Service definition for CropAPI (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link CropAPIRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class CropAPI extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the cropAPI library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://huertapp-arg.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "cropAPI/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public CropAPI(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  CropAPI(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getCropById".
   *
   * This request holds the parameters needed by the cropAPI server.  After setting any optional
   * parameters, call the {@link GetCropById#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetCropById getCropById(java.lang.Long id) throws java.io.IOException {
    GetCropById result = new GetCropById(id);
    initialize(result);
    return result;
  }

  public class GetCropById extends CropAPIRequest<com.huertapp.model.cropAPI.model.Crop> {

    private static final String REST_PATH = "getById";

    /**
     * Create a request for the method "getCropById".
     *
     * This request holds the parameters needed by the the cropAPI server.  After setting any optional
     * parameters, call the {@link GetCropById#execute()} method to invoke the remote operation. <p>
     * {@link
     * GetCropById#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetCropById(java.lang.Long id) {
      super(CropAPI.this, "GET", REST_PATH, null, com.huertapp.model.cropAPI.model.Crop.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetCropById setAlt(java.lang.String alt) {
      return (GetCropById) super.setAlt(alt);
    }

    @Override
    public GetCropById setFields(java.lang.String fields) {
      return (GetCropById) super.setFields(fields);
    }

    @Override
    public GetCropById setKey(java.lang.String key) {
      return (GetCropById) super.setKey(key);
    }

    @Override
    public GetCropById setOauthToken(java.lang.String oauthToken) {
      return (GetCropById) super.setOauthToken(oauthToken);
    }

    @Override
    public GetCropById setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetCropById) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetCropById setQuotaUser(java.lang.String quotaUser) {
      return (GetCropById) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetCropById setUserIp(java.lang.String userIp) {
      return (GetCropById) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetCropById setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetCropById set(String parameterName, Object value) {
      return (GetCropById) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertCrop".
   *
   * This request holds the parameters needed by the cropAPI server.  After setting any optional
   * parameters, call the {@link InsertCrop#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.huertapp.model.cropAPI.model.Crop}
   * @return the request
   */
  public InsertCrop insertCrop(com.huertapp.model.cropAPI.model.Crop content) throws java.io.IOException {
    InsertCrop result = new InsertCrop(content);
    initialize(result);
    return result;
  }

  public class InsertCrop extends CropAPIRequest<com.huertapp.model.cropAPI.model.Crop> {

    private static final String REST_PATH = "crop";

    /**
     * Create a request for the method "insertCrop".
     *
     * This request holds the parameters needed by the the cropAPI server.  After setting any optional
     * parameters, call the {@link InsertCrop#execute()} method to invoke the remote operation. <p>
     * {@link
     * InsertCrop#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.huertapp.model.cropAPI.model.Crop}
     * @since 1.13
     */
    protected InsertCrop(com.huertapp.model.cropAPI.model.Crop content) {
      super(CropAPI.this, "POST", REST_PATH, content, com.huertapp.model.cropAPI.model.Crop.class);
    }

    @Override
    public InsertCrop setAlt(java.lang.String alt) {
      return (InsertCrop) super.setAlt(alt);
    }

    @Override
    public InsertCrop setFields(java.lang.String fields) {
      return (InsertCrop) super.setFields(fields);
    }

    @Override
    public InsertCrop setKey(java.lang.String key) {
      return (InsertCrop) super.setKey(key);
    }

    @Override
    public InsertCrop setOauthToken(java.lang.String oauthToken) {
      return (InsertCrop) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertCrop setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertCrop) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertCrop setQuotaUser(java.lang.String quotaUser) {
      return (InsertCrop) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertCrop setUserIp(java.lang.String userIp) {
      return (InsertCrop) super.setUserIp(userIp);
    }

    @Override
    public InsertCrop set(String parameterName, Object value) {
      return (InsertCrop) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listCropsForGarden".
   *
   * This request holds the parameters needed by the cropAPI server.  After setting any optional
   * parameters, call the {@link ListCropsForGarden#execute()} method to invoke the remote operation.
   *
   * @param gardenId
   * @return the request
   */
  public ListCropsForGarden listCropsForGarden(java.lang.Long gardenId) throws java.io.IOException {
    ListCropsForGarden result = new ListCropsForGarden(gardenId);
    initialize(result);
    return result;
  }

  public class ListCropsForGarden extends CropAPIRequest<com.huertapp.model.cropAPI.model.CollectionResponseCrop> {

    private static final String REST_PATH = "crop/{gardenId}";

    /**
     * Create a request for the method "listCropsForGarden".
     *
     * This request holds the parameters needed by the the cropAPI server.  After setting any optional
     * parameters, call the {@link ListCropsForGarden#execute()} method to invoke the remote
     * operation. <p> {@link ListCropsForGarden#initialize(com.google.api.client.googleapis.services.A
     * bstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param gardenId
     * @since 1.13
     */
    protected ListCropsForGarden(java.lang.Long gardenId) {
      super(CropAPI.this, "GET", REST_PATH, null, com.huertapp.model.cropAPI.model.CollectionResponseCrop.class);
      this.gardenId = com.google.api.client.util.Preconditions.checkNotNull(gardenId, "Required parameter gardenId must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListCropsForGarden setAlt(java.lang.String alt) {
      return (ListCropsForGarden) super.setAlt(alt);
    }

    @Override
    public ListCropsForGarden setFields(java.lang.String fields) {
      return (ListCropsForGarden) super.setFields(fields);
    }

    @Override
    public ListCropsForGarden setKey(java.lang.String key) {
      return (ListCropsForGarden) super.setKey(key);
    }

    @Override
    public ListCropsForGarden setOauthToken(java.lang.String oauthToken) {
      return (ListCropsForGarden) super.setOauthToken(oauthToken);
    }

    @Override
    public ListCropsForGarden setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListCropsForGarden) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListCropsForGarden setQuotaUser(java.lang.String quotaUser) {
      return (ListCropsForGarden) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListCropsForGarden setUserIp(java.lang.String userIp) {
      return (ListCropsForGarden) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long gardenId;

    /**

     */
    public java.lang.Long getGardenId() {
      return gardenId;
    }

    public ListCropsForGarden setGardenId(java.lang.Long gardenId) {
      this.gardenId = gardenId;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListCropsForGarden setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListCropsForGarden setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListCropsForGarden set(String parameterName, Object value) {
      return (ListCropsForGarden) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeCrop".
   *
   * This request holds the parameters needed by the cropAPI server.  After setting any optional
   * parameters, call the {@link RemoveCrop#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public RemoveCrop removeCrop(java.lang.Long id) throws java.io.IOException {
    RemoveCrop result = new RemoveCrop(id);
    initialize(result);
    return result;
  }

  public class RemoveCrop extends CropAPIRequest<Void> {

    private static final String REST_PATH = "crop/{id}";

    /**
     * Create a request for the method "removeCrop".
     *
     * This request holds the parameters needed by the the cropAPI server.  After setting any optional
     * parameters, call the {@link RemoveCrop#execute()} method to invoke the remote operation. <p>
     * {@link
     * RemoveCrop#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveCrop(java.lang.Long id) {
      super(CropAPI.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveCrop setAlt(java.lang.String alt) {
      return (RemoveCrop) super.setAlt(alt);
    }

    @Override
    public RemoveCrop setFields(java.lang.String fields) {
      return (RemoveCrop) super.setFields(fields);
    }

    @Override
    public RemoveCrop setKey(java.lang.String key) {
      return (RemoveCrop) super.setKey(key);
    }

    @Override
    public RemoveCrop setOauthToken(java.lang.String oauthToken) {
      return (RemoveCrop) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveCrop setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveCrop) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveCrop setQuotaUser(java.lang.String quotaUser) {
      return (RemoveCrop) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveCrop setUserIp(java.lang.String userIp) {
      return (RemoveCrop) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveCrop setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveCrop set(String parameterName, Object value) {
      return (RemoveCrop) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateCrop".
   *
   * This request holds the parameters needed by the cropAPI server.  After setting any optional
   * parameters, call the {@link UpdateCrop#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.huertapp.model.cropAPI.model.Crop}
   * @return the request
   */
  public UpdateCrop updateCrop(com.huertapp.model.cropAPI.model.Crop content) throws java.io.IOException {
    UpdateCrop result = new UpdateCrop(content);
    initialize(result);
    return result;
  }

  public class UpdateCrop extends CropAPIRequest<com.huertapp.model.cropAPI.model.Crop> {

    private static final String REST_PATH = "crop";

    /**
     * Create a request for the method "updateCrop".
     *
     * This request holds the parameters needed by the the cropAPI server.  After setting any optional
     * parameters, call the {@link UpdateCrop#execute()} method to invoke the remote operation. <p>
     * {@link
     * UpdateCrop#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.huertapp.model.cropAPI.model.Crop}
     * @since 1.13
     */
    protected UpdateCrop(com.huertapp.model.cropAPI.model.Crop content) {
      super(CropAPI.this, "PUT", REST_PATH, content, com.huertapp.model.cropAPI.model.Crop.class);
    }

    @Override
    public UpdateCrop setAlt(java.lang.String alt) {
      return (UpdateCrop) super.setAlt(alt);
    }

    @Override
    public UpdateCrop setFields(java.lang.String fields) {
      return (UpdateCrop) super.setFields(fields);
    }

    @Override
    public UpdateCrop setKey(java.lang.String key) {
      return (UpdateCrop) super.setKey(key);
    }

    @Override
    public UpdateCrop setOauthToken(java.lang.String oauthToken) {
      return (UpdateCrop) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateCrop setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateCrop) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateCrop setQuotaUser(java.lang.String quotaUser) {
      return (UpdateCrop) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateCrop setUserIp(java.lang.String userIp) {
      return (UpdateCrop) super.setUserIp(userIp);
    }

    @Override
    public UpdateCrop set(String parameterName, Object value) {
      return (UpdateCrop) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link CropAPI}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link CropAPI}. */
    @Override
    public CropAPI build() {
      return new CropAPI(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link CropAPIRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCropAPIRequestInitializer(
        CropAPIRequestInitializer cropapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(cropapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}