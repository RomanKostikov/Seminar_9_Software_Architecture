openapi: 3.0.0
info:
  title: Заказ ресурсов в облаке
  version: 0.0.1
servers:
  - url: http://localhost:8080/api/v1/
    description: Dev server
paths:
  /clouds:
    get:
      summary: Метод получения списка ресурсов на облаке
      tags:
        - Clouds
      operationId: getAllClouds
      responses:
        "200":
           description: Успешный ответ со списком ресурсов
           content:
             adplication/json:
               schema:
                 $ref: "#/components/schemas/Clouds"
        "default":
           description: Остальные ответы
           content:
             adplication/json:
               schema:
                 $ref: "#/components/schemas/Error"
    post:
      summary: Создание заказа в облаке
      tags:
        - Clouds
      operationId: CreateCloud
      requestBody: 
        content:
          adplication/json:
            schema:
              $ref: "#/components/schemas/Error"
      responses:
        "200":
           description: Успешный заказ
           content:
             adplication/json:
               schema:
                 $ref: "#/components/schemas/Clouds"
        "default":
           description: Все остальные ответы
           content:
             adplication/json:
               schema:
                 $ref: "#/components/schemas/Error"
  /clouds/{cloud_id}:
    delete:
      summary: Метод отмены заказа в облаке по ID
      tags: 
        - Clouds
      operationId: cancelCloudById
      parameters:
       - name: cloud_id
         in: path
         required: true
         description: Идентификатор заказа в облаке
         schema:
           type: string
         example: f102b615
      responses:
        "200":
           description: Успешная отмена заказа по ID
           content:
             adplication/json: {}
        "404":
           description: Заказ не найден
           content:
             adplication/json:
               schema:
                 $ref: "#/components/schemas/Error"
        "default":
           description: Все остальные ответы
           content:
             adplication/json:
               schema:
                 $ref: "#/components/schemas/Error"
    get:
      summary: Метод получения заказа по ID
      tags:
        - Clouds
      operationId: getCloud
      parameters:
       - name: cloud_id
         in: path
         required: true
         description: Идентификатор заказа в облаке
         schema:
           type: string
         example: f102b615
      responses:
        "200":
           description: Успешный ответ с заказом
           content:
             adplication/json:
               schema:
                 $ref: "#/components/schemas/Clouds"
        "404":
           description: Заказ не найден
           content:
             adplication/json:
               schema:
                 $ref: "#/components/schemas/Error"
        "default":
           description: Остальные ответы
           content:
             adplication/json:
               schema:
                 $ref: "#/components/schemas/Error"
components:
  schemas:
    Cloud:
      type: object
      required:
        - id_client
        - OS
        - RAM
        - CPU
        - HDD
      properties:
        cloud_id:
          type: string
          example: f102b615
        id_client:
          type: string
          example: f102b615
        OS:
          type: string
          enum:
            - Windows
            - Linux
          description: Операционная система сервера
        RAM:
          type: string
          example: 128
          description: Количество оперативной памяти
        CPU:
          type: string
          example: 8
          description: Количество ядер CPU
    Clouds:
      type: array
      items:
        $ref: "#/components/schemas/Cloud"
    Error:
      type: object
      required:
        - code
        - message
      properties:
        code:
          type: integer
        message:
          type: string