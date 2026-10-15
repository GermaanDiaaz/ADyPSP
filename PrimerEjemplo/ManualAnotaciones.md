# Manual de Anotaciones de OpenAPI

### Anotaciones a nivel de toda la API

### `@Tag`

* **Descripción:** Define una etiqueta para categorizar un conjunto de endpoints.
* **Ubicación:** Sobre la declaración de las clases controller.
* **Atributos:**
    * `name`: El nombre identificador del grupo en la interfaz gráfica.
    * `description`: Explicación sobre la funcionalidad que gestiona este controller.

---

### `@Operation`

* **Descripción:** Describe la operación a realizar dentro de la API.
* **Ubicación:** Sobre el método que maneja las peticiones del controller.
* **Atributos:**
    * `summary`: Resumen muy corto de la función del endpoint.
    * `description`: Explicación del comportamiento de la operación.

---

### `@ApiResponses y @ApiResponse`

* **Descripción @ApiResponses:** Contenedor que almacena todas las respuestas de la API.
* **Descripción @ApiResponse:** Documenta una respuesta http concreta.

* **Ubicación:** Sobre el método del controller.
* **Atributos:**
    * `description`: Breve explicación del motivo o contexto en que se devuelve.
    * `responseCode`: El codigo de estado de la respuesta http.

---

### `@OpenAPIDefinition`

* **Descripción :** Contenedor global de toda la especificación OpenAPI de la aplicación
* **Ubicación:** Sobre una clase de configuración.

---

### `@Info`

* **Descripción:** Contiene los detalles de la API.

* **Ubicación:** En la anotación @OpenAPIDefinition.
* **Atributos:**
    * `description`: Breve explicación del proposito de la API.
    * `version`: Version actual del proyecto.
    * `title`: Título de la API rest.
    * `contact`: Datos de contacto del responsable.
    * `license`: Info de la licencia bajo la que se publica.

---

### `@Contact`

* **Descripción:** Para intoducir los datos de contacto del responsable.

* **Ubicación:** En la anotación @Info.
* **Atributos:**
    * `email`: Email el responsable.
    * `name`: Nombre del responsable.

---

### `@License`

* **Descripción:** Para intoducir la información sobre la licencia.

* **Ubicación:** En la anotación @Info.
* **Atributos:**
    * `name`: Nombre oficial de la licencia.

---