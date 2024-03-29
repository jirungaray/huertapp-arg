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
 * on 2014-10-30 at 05:06:11 UTC 
 * Modify at your own risk.
 */

package com.huertapp.model.gardenAPI;

/**
 * Service definition for GardenAPI (v1).
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
 * This service uses {@link GardenAPIRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class GardenAPI extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the gardenAPI library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "gardenAPI/v1/";

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
  public GardenAPI(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  GardenAPI(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "addGarden".
   *
   * This request holds the parameters needed by the gardenAPI server.  After setting any optional
   * parameters, call the {@link AddGarden#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.huertapp.model.gardenAPI.model.Garden}
   * @return the request
   */
  public AddGarden addGarden(com.huertapp.model.gardenAPI.model.Garden content) throws java.io.IOException {
    AddGarden result = new AddGarden(content);
    initialize(result);
    return result;
  }

  public class AddGarden extends GardenAPIRequest<com.huertapp.model.gardenAPI.model.Garden> {

    private static final String REST_PATH = "addGarden";

    /**
     * Create a request for the method "addGarden".
     *
     * This request holds the parameters needed by the the gardenAPI server.  After setting any
     * optional parameters, call the {@link AddGarden#execute()} method to invoke the remote
     * operation. <p> {@link
     * AddGarden#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.huertapp.model.gardenAPI.model.Garden}
     * @since 1.13
     */
    protected AddGarden(com.huertapp.model.gardenAPI.model.Garden content) {
      super(GardenAPI.this, "POST", REST_PATH, content, com.huertapp.model.gardenAPI.model.Garden.class);
    }

    @Override
    public AddGarden setAlt(java.lang.String alt) {
      return (AddGarden) super.setAlt(alt);
    }

    @Override
    public AddGarden setFields(java.lang.String fields) {
      return (AddGarden) super.setFields(fields);
    }

    @Override
    public AddGarden setKey(java.lang.String key) {
      return (AddGarden) super.setKey(key);
    }

    @Override
    public AddGarden setOauthToken(java.lang.String oauthToken) {
      return (AddGarden) super.setOauthToken(oauthToken);
    }

    @Override
    public AddGarden setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (AddGarden) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public AddGarden setQuotaUser(java.lang.String quotaUser) {
      return (AddGarden) super.setQuotaUser(quotaUser);
    }

    @Override
    public AddGarden setUserIp(java.lang.String userIp) {
      return (AddGarden) super.setUserIp(userIp);
    }

    @Override
    public AddGarden set(String parameterName, Object value) {
      return (AddGarden) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "deleteGarden".
   *
   * This request holds the parameters needed by the gardenAPI server.  After setting any optional
   * parameters, call the {@link DeleteGarden#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public DeleteGarden deleteGarden(java.lang.Long id) throws java.io.IOException {
    DeleteGarden result = new DeleteGarden(id);
    initialize(result);
    return result;
  }

  public class DeleteGarden extends GardenAPIRequest<Void> {

    private static final String REST_PATH = "garden/{id}";

    /**
     * Create a request for the method "deleteGarden".
     *
     * This request holds the parameters needed by the the gardenAPI server.  After setting any
     * optional parameters, call the {@link DeleteGarden#execute()} method to invoke the remote
     * operation. <p> {@link
     * DeleteGarden#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected DeleteGarden(java.lang.Long id) {
      super(GardenAPI.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public DeleteGarden setAlt(java.lang.String alt) {
      return (DeleteGarden) super.setAlt(alt);
    }

    @Override
    public DeleteGarden setFields(java.lang.String fields) {
      return (DeleteGarden) super.setFields(fields);
    }

    @Override
    public DeleteGarden setKey(java.lang.String key) {
      return (DeleteGarden) super.setKey(key);
    }

    @Override
    public DeleteGarden setOauthToken(java.lang.String oauthToken) {
      return (DeleteGarden) super.setOauthToken(oauthToken);
    }

    @Override
    public DeleteGarden setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (DeleteGarden) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public DeleteGarden setQuotaUser(java.lang.String quotaUser) {
      return (DeleteGarden) super.setQuotaUser(quotaUser);
    }

    @Override
    public DeleteGarden setUserIp(java.lang.String userIp) {
      return (DeleteGarden) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public DeleteGarden setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public DeleteGarden set(String parameterName, Object value) {
      return (DeleteGarden) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getGarden".
   *
   * This request holds the parameters needed by the gardenAPI server.  After setting any optional
   * parameters, call the {@link GetGarden#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetGarden getGarden(java.lang.Long id) throws java.io.IOException {
    GetGarden result = new GetGarden(id);
    initialize(result);
    return result;
  }

  public class GetGarden extends GardenAPIRequest<com.huertapp.model.gardenAPI.model.Garden> {

    private static final String REST_PATH = "garden/{id}";

    /**
     * Create a request for the method "getGarden".
     *
     * This request holds the parameters needed by the the gardenAPI server.  After setting any
     * optional parameters, call the {@link GetGarden#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetGarden#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetGarden(java.lang.Long id) {
      super(GardenAPI.this, "GET", REST_PATH, null, com.huertapp.model.gardenAPI.model.Garden.class);
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
    public GetGarden setAlt(java.lang.String alt) {
      return (GetGarden) super.setAlt(alt);
    }

    @Override
    public GetGarden setFields(java.lang.String fields) {
      return (GetGarden) super.setFields(fields);
    }

    @Override
    public GetGarden setKey(java.lang.String key) {
      return (GetGarden) super.setKey(key);
    }

    @Override
    public GetGarden setOauthToken(java.lang.String oauthToken) {
      return (GetGarden) super.setOauthToken(oauthToken);
    }

    @Override
    public GetGarden setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetGarden) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetGarden setQuotaUser(java.lang.String quotaUser) {
      return (GetGarden) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetGarden setUserIp(java.lang.String userIp) {
      return (GetGarden) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetGarden setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetGarden set(String parameterName, Object value) {
      return (GetGarden) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listGardens".
   *
   * This request holds the parameters needed by the gardenAPI server.  After setting any optional
   * parameters, call the {@link ListGardens#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListGardens listGardens() throws java.io.IOException {
    ListGardens result = new ListGardens();
    initialize(result);
    return result;
  }

  public class ListGardens extends GardenAPIRequest<com.huertapp.model.gardenAPI.model.CollectionResponseGarden> {

    private static final String REST_PATH = "garden";

    /**
     * Create a request for the method "listGardens".
     *
     * This request holds the parameters needed by the the gardenAPI server.  After setting any
     * optional parameters, call the {@link ListGardens#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListGardens#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListGardens() {
      super(GardenAPI.this, "GET", REST_PATH, null, com.huertapp.model.gardenAPI.model.CollectionResponseGarden.class);
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
    public ListGardens setAlt(java.lang.String alt) {
      return (ListGardens) super.setAlt(alt);
    }

    @Override
    public ListGardens setFields(java.lang.String fields) {
      return (ListGardens) super.setFields(fields);
    }

    @Override
    public ListGardens setKey(java.lang.String key) {
      return (ListGardens) super.setKey(key);
    }

    @Override
    public ListGardens setOauthToken(java.lang.String oauthToken) {
      return (ListGardens) super.setOauthToken(oauthToken);
    }

    @Override
    public ListGardens setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListGardens) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListGardens setQuotaUser(java.lang.String quotaUser) {
      return (ListGardens) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListGardens setUserIp(java.lang.String userIp) {
      return (ListGardens) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListGardens setCursor(java.lang.String cursor) {
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

    public ListGardens setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListGardens set(String parameterName, Object value) {
      return (ListGardens) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateGarden".
   *
   * This request holds the parameters needed by the gardenAPI server.  After setting any optional
   * parameters, call the {@link UpdateGarden#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.huertapp.model.gardenAPI.model.Garden}
   * @return the request
   */
  public UpdateGarden updateGarden(com.huertapp.model.gardenAPI.model.Garden content) throws java.io.IOException {
    UpdateGarden result = new UpdateGarden(content);
    initialize(result);
    return result;
  }

  public class UpdateGarden extends GardenAPIRequest<com.huertapp.model.gardenAPI.model.Garden> {

    private static final String REST_PATH = "garden";

    /**
     * Create a request for the method "updateGarden".
     *
     * This request holds the parameters needed by the the gardenAPI server.  After setting any
     * optional parameters, call the {@link UpdateGarden#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateGarden#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.huertapp.model.gardenAPI.model.Garden}
     * @since 1.13
     */
    protected UpdateGarden(com.huertapp.model.gardenAPI.model.Garden content) {
      super(GardenAPI.this, "PUT", REST_PATH, content, com.huertapp.model.gardenAPI.model.Garden.class);
    }

    @Override
    public UpdateGarden setAlt(java.lang.String alt) {
      return (UpdateGarden) super.setAlt(alt);
    }

    @Override
    public UpdateGarden setFields(java.lang.String fields) {
      return (UpdateGarden) super.setFields(fields);
    }

    @Override
    public UpdateGarden setKey(java.lang.String key) {
      return (UpdateGarden) super.setKey(key);
    }

    @Override
    public UpdateGarden setOauthToken(java.lang.String oauthToken) {
      return (UpdateGarden) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateGarden setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateGarden) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateGarden setQuotaUser(java.lang.String quotaUser) {
      return (UpdateGarden) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateGarden setUserIp(java.lang.String userIp) {
      return (UpdateGarden) super.setUserIp(userIp);
    }

    @Override
    public UpdateGarden set(String parameterName, Object value) {
      return (UpdateGarden) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link GardenAPI}.
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

    /** Builds a new instance of {@link GardenAPI}. */
    @Override
    public GardenAPI build() {
      return new GardenAPI(this);
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
     * Set the {@link GardenAPIRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setGardenAPIRequestInitializer(
        GardenAPIRequestInitializer gardenapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(gardenapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
