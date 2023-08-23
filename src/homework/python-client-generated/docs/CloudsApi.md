# swagger_client.CloudsApi

All URIs are relative to *http://localhost:8080/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_cloud_by_id**](CloudsApi.md#cancel_cloud_by_id) | **DELETE** /clouds/{cloud_id} | Метод отмены заказа в облаке по ID
[**create_cloud**](CloudsApi.md#create_cloud) | **POST** /clouds | Создание заказа в облаке
[**get_all_clouds**](CloudsApi.md#get_all_clouds) | **GET** /clouds | Метод получения списка ресурсов на облаке
[**get_cloud**](CloudsApi.md#get_cloud) | **GET** /clouds/{cloud_id} | Метод получения заказа по ID

# **cancel_cloud_by_id**
> cancel_cloud_by_id(cloud_id)

Метод отмены заказа в облаке по ID

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CloudsApi()
cloud_id = 'cloud_id_example' # str | Идентификатор заказа в облаке

try:
    # Метод отмены заказа в облаке по ID
    api_instance.cancel_cloud_by_id(cloud_id)
except ApiException as e:
    print("Exception when calling CloudsApi->cancel_cloud_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud_id** | **str**| Идентификатор заказа в облаке | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_cloud**
> Clouds create_cloud(body=body)

Создание заказа в облаке

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CloudsApi()
body = swagger_client.Error() # Error |  (optional)

try:
    # Создание заказа в облаке
    api_response = api_instance.create_cloud(body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CloudsApi->create_cloud: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_clouds**
> Clouds get_all_clouds()

Метод получения списка ресурсов на облаке

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CloudsApi()

try:
    # Метод получения списка ресурсов на облаке
    api_response = api_instance.get_all_clouds()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CloudsApi->get_all_clouds: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cloud**
> Clouds get_cloud(cloud_id)

Метод получения заказа по ID

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CloudsApi()
cloud_id = 'cloud_id_example' # str | Идентификатор заказа в облаке

try:
    # Метод получения заказа по ID
    api_response = api_instance.get_cloud(cloud_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CloudsApi->get_cloud: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud_id** | **str**| Идентификатор заказа в облаке | 

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

