### Hibernate Relations Project

Descripción:
Este proyecto demuestra el uso de **Hibernate** en Java para manipular una base de datos MySQL. Se centra en gestionar una base de datos con tablas relacionadas mediante claves primarias y foráneas, representando **clientes** y **pedidos**.

Funcionalidades:
- CRUD (Crear, Leer, Actualizar, Eliminar) para la entidad **Cliente**.
- CRUD para la entidad **Pedido**.
- Implementación de relaciones entre **clientes** y **pedidos**.

Estructura del Proyecto:
- src/main/java/es/pildoras/hibernateConnection/Client.java: Clase para gestionar clientes.
- src/main/java/es/pildoras/hibernateConnection/ClientDelete.java: Clase para eliminar clientes.
- src/main/java/es/pildoras/hibernateConnection/ClientInsert.java: Clase para insertar nuevos clientes.
- src/main/java/es/pildoras/hibernateConnection/ObtainClient.java: Clase para obtener datos de clientes.
- src/main/java/es/pildoras/hibernateConnection/Orderd.java: Clase para gestionar pedidos.
- src/main/resources/hibernate.cfg.xml: Configuración de Hibernate y conexión a la base de datos.

Estado del Proyecto:
Este proyecto está en proceso de finalización. Actualmente, las funcionalidades básicas de CRUD y las relaciones entre tablas están implementadas, pero aún se están refinando algunos detalles.

Requisitos:
- JDK 8+
- Maven
- MySQL

Licencia:
Este proyecto está bajo la Licencia MIT.
