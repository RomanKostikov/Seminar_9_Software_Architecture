import connexion
import six

from swagger_server.models.clouds import Clouds  # noqa: E501
from swagger_server.models.error import Error  # noqa: E501
from swagger_server import util


def cancel_cloud_by_id(cloud_id):  # noqa: E501
    """Метод отмены заказа в облаке по ID

     # noqa: E501

    :param cloud_id: Идентификатор заказа в облаке
    :type cloud_id: str

    :rtype: None
    """
    return 'do some magic!'


def create_cloud(body=None):  # noqa: E501
    """Создание заказа в облаке

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: Clouds
    """
    if connexion.request.is_json:
        body = Error.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_all_clouds():  # noqa: E501
    """Метод получения списка ресурсов на облаке

     # noqa: E501


    :rtype: Clouds
    """
    return 'do some magic!'


def get_cloud(cloud_id):  # noqa: E501
    """Метод получения заказа по ID

     # noqa: E501

    :param cloud_id: Идентификатор заказа в облаке
    :type cloud_id: str

    :rtype: Clouds
    """
    return 'do some magic!'
