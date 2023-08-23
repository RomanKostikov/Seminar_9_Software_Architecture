# CloudsApi

All URIs are relative to *http://localhost:8080/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCloudById**](CloudsApi.md#cancelCloudById) | **DELETE** /clouds/{cloud_id} | Метод отмены заказа в облаке по ID
[**createCloud**](CloudsApi.md#createCloud) | **POST** /clouds | Создание заказа в облаке
[**getAllClouds**](CloudsApi.md#getAllClouds) | **GET** /clouds | Метод получения списка ресурсов на облаке
[**getCloud**](CloudsApi.md#getCloud) | **GET** /clouds/{cloud_id} | Метод получения заказа по ID

<a name="cancelCloudById"></a>
# **cancelCloudById**
> cancelCloudById(cloudId)

Метод отмены заказа в облаке по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
String cloudId = "cloudId_example"; // String | Идентификатор заказа в облаке
try {
    apiInstance.cancelCloudById(cloudId);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#cancelCloudById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| Идентификатор заказа в облаке |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json

<a name="createCloud"></a>
# **createCloud**
> Clouds createCloud(body)

Создание заказа в облаке

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
Error body = new Error(); // Error | 
try {
    Clouds result = apiInstance.createCloud(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#createCloud");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Error**](Error.md)|  | [optional]

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: adplication/json
 - **Accept**: adplication/json

<a name="getAllClouds"></a>
# **getAllClouds**
> Clouds getAllClouds()

Метод получения списка ресурсов на облаке

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
try {
    Clouds result = apiInstance.getAllClouds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#getAllClouds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json

<a name="getCloud"></a>
# **getCloud**
> Clouds getCloud(cloudId)

Метод получения заказа по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
String cloudId = "cloudId_example"; // String | Идентификатор заказа в облаке
try {
    Clouds result = apiInstance.getCloud(cloudId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#getCloud");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| Идентификатор заказа в облаке |

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json

