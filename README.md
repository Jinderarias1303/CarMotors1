# Sistema para el Taller Automotriz "CarMotors" 🚗🔧

## 🌟 Descripción
Este sistema está diseñado para gestionar las operaciones diarias de un taller automotriz. Con funcionalidades que cubren desde la gestión de inventarios, mantenimiento, atención al cliente, hasta la facturación y relaciones con proveedores, **CarMotors** busca optimizar la administración de recursos, mejorar la eficiencia del taller y ofrecer un mejor servicio a los clientes.

## 📚 Tecnologías Usadas
- **Java 17+** para el desarrollo de la aplicación
- **Maven** como gestor de dependencias
- **Hibernate/JPA** para la persistencia de datos
- **MySQL** como sistema de base de datos
- **DBeaver** para la gestión de la base de datos
- **NetBeans** o cualquier IDE compatible con Java

## 🛠️ Funcionalidades del Sistema

### 1. Gestión de Inventarios de Repuestos 📦

#### 1.1 Registro de Repuestos
- Registro de repuestos con detalles como nombre, tipo (mecánico, eléctrico, carrocería, consumo), marca y modelo, proveedor asociado, cantidad en stock, nivel mínimo, fecha de ingreso y vida útil estimada.

#### 1.2 Gestión de Lotes y Trazabilidad
- Identificación única de lotes, fecha de ingreso y proveedor. Se registra el uso de repuestos en cada trabajo, garantizando la trazabilidad de los productos.

#### 1.3 Control de Reabastecimiento
- Generación de órdenes de compra automáticas cuando los repuestos alcancen el nivel mínimo de stock.

#### 1.4 Reportes de Inventario
- Listados detallados y análisis de consumo de repuestos. Alertas sobre productos cercanos a su fecha de caducidad o agotamiento.

### 2. Gestión de Servicios de Mantenimiento 🔧

#### 2.1 Registro de Servicios
- Registro de los tipos de mantenimiento (preventivo o correctivo), vehículos atendidos (marca, modelo, placa), detalles del trabajo, repuestos utilizados y costo de mano de obra.

#### 2.2 Flujos de Trabajo
- **Recepción de vehículo**: Registro de datos del cliente y vehículo, inspección inicial y estimación de costos.
- **Ejecución del mantenimiento**: Asignación de tareas a técnicos y seguimiento en tiempo real.
- **Entrega del vehículo**: Verificación del trabajo realizado y generación de la orden de entrega firmada.

#### 2.3 Reportes de Mantenimiento
- Reportes sobre los servicios más solicitados, productividad de técnicos y el historial detallado de mantenimientos realizados.

### 3. Gestión de Clientes 👥

#### 3.1 Registro de Clientes
- Registro completo de los clientes, incluyendo nombre, identificación, teléfono y correo electrónico, con un historial detallado de servicios y facturación.

#### 3.2 Fidelización y Promociones
- Sistema de descuentos por volumen de servicios contratados y programa de recompensas para clientes frecuentes.

### 4. Factura Electrónica en Imagen 💳

#### **Generación de Factura Electrónica**
- El sistema generará automáticamente una factura visual en formato PDF o PNG cumpliendo con la normativa colombiana de la DIAN.

#### Elementos clave de la factura:
- Información del taller y cliente (nombre, NIT, dirección).
- Detalles de servicios realizados, repuestos utilizados, costos y totales.
- Número de factura, fecha de emisión y CUFE.
- Código QR con enlace al comprobante fiscal y firma digital.

### 5. Gestión de Proveedores 🏢

#### 5.1 Registro de Proveedores
- Información detallada de proveedores, incluyendo nombre, NIT, contacto y frecuencia de visitas, junto con los productos suministrados y sus fechas de entrega.

#### 5.2 Evaluación de Proveedores
- Sistema de calificación de proveedores basado en puntualidad, calidad y costos, con reportes de desempeño para optimizar futuras negociaciones.

### 6. Gestión de Actividades Especiales 🎯

#### 6.1 Campañas de Mantenimiento Preventivo
- Registro de promociones en temporadas específicas (por ejemplo, descuentos por cambio de aceite) y asignación automática de citas a clientes frecuentes según su historial.

#### 6.2 Inspecciones Técnicas Especializadas
- Registro de inspecciones específicas, como la pre-revisión técnico-mecánica. Se almacena el resultado (aprobado, reparaciones necesarias o rechazado) y se programan inspecciones futuras.

## 🛠️ Estructura de Carpetas

El proyecto sigue el patrón de arquitectura **MVC** (Modelo, Vista, Controlador) para separar las responsabilidades y facilitar el mantenimiento.

### 1. **Controlador (Controller) 🕹️**

#### ¿Qué va aquí?
Los controladores gestionan la lógica del negocio y el flujo de datos entre el modelo y la vista.

#### Ejemplo de clases:
- `ClienteController.java`
- `RepuestoController.java`
- `MantenimientoController.java`

### 2. **Modelo (Model) 🧩**

#### ¿Qué va aquí?
Las entidades del sistema. Son clases que representan los objetos que vamos a almacenar en la base de datos. Estas clases deben estar alineadas con las tablas de la base de datos.

#### Ejemplo de clases:
- `Cliente.java`
- `Repuesto.java`
- `Servicio.java`

#### ¿Por qué es importante?
Si usas herramientas como **DBeaver** para gestionar la base de datos, las tablas en la base de datos deben reflejarse en las clases Java. Puedes usar **Hibernate** o **JPA** para facilitar este proceso.

### 3. **Vista (View) 👀**

#### ¿Qué va aquí?
La capa de vista gestiona la interfaz de usuario. Es la parte que interactúa con el usuario final. Si el sistema es basado en consola, son las clases que muestran los mensajes. Si es una interfaz gráfica, gestiona las ventanas y vistas de los datos.

#### Ejemplo de clases:
- `ClienteView.java`
- `RepuestoView.java`
- `ServicioView.java`

### 4. **Servicio (Service) 💼**

#### ¿Qué va aquí?
La capa de servicio contiene la lógica de negocio. Aquí se definen las reglas y validaciones que deben cumplirse antes de pasar los datos al controlador o la vista.

#### Ejemplo de clases:
- `ClienteService.java`
- `RepuestoService.java`
- `MantenimientoService.java`

#### ¿Por qué es útil?
Esta capa también define métodos para interactuar con la base de datos a través del **repositorio**, sin que los controladores manejen directamente las consultas SQL o la lógica compleja.

### 5. **Repositorio (Repository) 📚**

#### ¿Qué va aquí?
Las clases de repositorio permiten acceder a la base de datos. Se pueden usar tecnologías como **JDBC**, **JPA** o **Hibernate** para manejar la persistencia de datos y realizar las consultas necesarias.

#### Ejemplo de clases:
- `ClienteRepository.java`
- `RepuestoRepository.java`
- `ServicioRepository.java`

#### ¿Por qué es importante?
Aquí se maneja la persistencia de datos. Las clases de repositorio se conectan directamente con las tablas de la base de datos para realizar operaciones **CRUD** (crear, leer, actualizar, eliminar) de los objetos.



📈 Roadmap
Funcionalidades a Implementar:
Mantenimiento preventivo con recordatorios automáticos.

Generación automática de reportes de productividad y ventas.

Mejoras Futuras:
Implementación de autenticación de usuarios.

Soporte para múltiples talleres en una sola instancia.

📝 Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.


asasa
