drop database if exists carmotors;
create database if not exists carmotors;
use carmotors;

-- tabla cliente
drop table if exists cliente;
create table cliente (
  id int primary key auto_increment,
  nro_identidad bigint not null,
  nombre varchar(50) not null,
  telefono varchar(25) not null,
  correo varchar(100) not null
);

-- tabla proveedor
drop table if exists proveedor;
create table proveedores (
  id_proveedor int primary key auto_increment,
  nombre_proveedor varchar(65) not null,
  telefono bigint not null,
  frecuencia_suministro int default 1
);

-- tabla repuesto (inventario)
drop table if exists repuesto;
create table repuesto (
  id_repuesto int primary key auto_increment,
  nombre_repuesto varchar(50) not null,
  tipo_repuesto enum('mecanico', 'electrico', 'carroceria', 'consumo') not null,
  marca_modelo varchar(65) not null,
  id_proveedor int,
  stock int not null,
  fecha_ingreso date not null,
  vida_util_meses int not null,
  estado enum('disponible', 'reservado', 'fuera_servicio') default 'disponible',
  foreign key (id_proveedor) references proveedores(id_proveedor)
);

-- tabla vehiculo
drop table if exists vehiculo;
create table vehiculo (
  placa varchar(10) primary key not null,
  id_dueño int not null,
  tipo_vehiculo enum('automovil', 'motocicleta', 'suv', 'camioneta') not null,
  marca varchar(35) not null,
  modelo varchar(35) not null,
  foreign key (id_dueño) references cliente(id)
);

-- tabla mantenimiento
drop table if exists mantenimiento;
create table mantenimiento (
  id_mantenimiento int primary key auto_increment,
  id_vehiculo varchar(10) not null,
  fecha date not null,
  detalles text not null,
  valor_mantenimiento decimal(10,2) not null,
  estado enum('pendiente', 'en_proceso', 'completado', 'entregado') not null,
  foreign key (id_vehiculo) references vehiculo(placa)
);

-- tabla mantenimiento_repuesto (repuestos usados)
drop table if exists mantenimiento_repuesto;
create table mantenimiento_repuesto (
  id_mantenimiento_repuesto int primary key auto_increment,
  id_mantenimiento int not null,
  id_repuesto int not null,
  cantidad_usada int not null,
  foreign key (id_mantenimiento) references mantenimiento(id_mantenimiento),
  foreign key (id_repuesto) references repuesto(id_repuesto)
);

-- tabla factura
drop table if exists factura;
create table factura (
  id_factura int primary key auto_increment,
  id_mantenimiento int not null,
  id_cliente int not null,
  fecha_emision date not null,
  subtotal decimal(10,2) not null,
  impuestos decimal(10,2) not null,
  total decimal(10,2) not null,
  cufe varchar(100),
  qr_code text,
  foreign key (id_mantenimiento) references mantenimiento(id_mantenimiento),
  foreign key (id_cliente) references cliente(id)
);
