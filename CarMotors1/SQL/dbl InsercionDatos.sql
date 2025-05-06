use carmotors;
/** clientes **/
INSERT INTO cliente (nro_identidad, nombre, telefono, correo) VALUES 
(1023456789, 'Camila Rodríguez', '3115678923', 'camila.rodri@gmail.com'),
(1122334455, 'Juan Pérez', '3001122334', 'juan.perez@gmail.com'),
(2233445566, 'Laura Martínez', '3153344556', 'laura.mtz@hotmail.com'),
(3344556677, 'Santiago Gómez', '3225566778', 'santi.gomez@outlook.com'),
(4455667788, 'Valentina López', '3107788990', 'valen.lopez@gmail.com'),
(5566778899, 'Carlos Ramírez', '3138899001', 'c.ramirez@yahoo.com'),
(6677889900, 'Isabella Torres', '3209001122', 'isatorres@gmail.com'),
(7788990011, 'Mateo Herrera', '3012233445', 'mateoh@hotmail.com'),
(8899001122, 'Sofía Castro', '3145566778', 'sofi.castro@gmail.com'),
(9900112233, 'Andrés Muñoz', '3166677889', 'andres.munoz@correo.com');

/** Proveedores **/
INSERT INTO proveedores (nombre_proveedor, telefono, frecuencia_suministro) VALUES
('Repuestos Express S.A.', 3114455667, 2),
('MotoPartes del Norte', 3009988776, 1),
('Autotec Colombia', 3123344556, 3),
('Distribuidora Eléctrica Andina', 3152233445, 2),
('Suministros Carrocería S.A.S.', 3015566778, 1),
('Central Lubricantes', 3167788990, 4),
('TecnoRepuestos Medellín', 3146677889, 3),
('Grupo MotorParts', 3103344556, 2),
('ElectroAutos Cali', 3172233445, 5),
('Insumos Vehiculares Bogotá', 3185566778, 1);

/** repuestos **/
INSERT INTO repuesto (nombre_repuesto, tipo_repuesto, marca_modelo, id_proveedor, stock, fecha_ingreso, vida_util_meses, estado) VALUES
('Filtro de Aceite', 'consumo', 'ACDelco 55594651', 1, 30, '2025-04-01', 12, 'disponible'),
('Batería 12V', 'electrico', 'Bosch S4 45Ah', 2, 15, '2025-03-15', 24, 'disponible'),
('Disco de Freno', 'mecanico', 'TRW DF2805', 3, 20, '2025-03-20', 36, 'reservado'),
('Retrovisor Izquierdo', 'carroceria', 'Renault Logan 2022', 4, 10, '2025-04-10', 60, 'disponible'),
('Aceite 10W40', 'consumo', 'Mobil Super 10W40', 5, 50, '2025-03-01', 18, 'disponible'),
('Bobina de Encendido', 'electrico', 'Delphi GN10328', 6, 12, '2025-02-25', 36, 'disponible'),
('Parachoques Trasero', 'carroceria', 'Mazda 3 2018', 7, 5, '2025-04-05', 60, 'fuera_servicio'),
('Pastillas de Freno', 'mecanico', 'Brembo P85163', 8, 25, '2025-04-12', 24, 'disponible'),
('Bujía NGK', 'electrico', 'NGK BKR6E', 9, 40, '2025-03-28', 24, 'reservado'),
('Filtro de Aire', 'consumo', 'Mann C30130', 10, 35, '2025-04-08', 12, 'disponible');

/** vehiculo **/
INSERT INTO vehiculo (placa, id_dueño, tipo_vehiculo, marca, modelo) VALUES
('ABC123', 1, 'automovil', 'Chevrolet', 'Onix 2020'),
('XYZ456', 2, 'motocicleta', 'Yamaha', 'FZ25 2021'),
('JKL789', 3, 'automovil', 'Renault', 'Sandero 2019'),
('DEF321', 4, 'camioneta', 'Toyota', 'Hilux 2022'),
('GHI654', 5, 'automovil', 'Mazda', '3 2018'),
('LMN987', 6, 'suv', 'Kia', 'Sportage 2023'),
('QRS246', 7, 'automovil', 'Hyundai', 'Accent 2020'),
('TUV135', 8, 'motocicleta', 'Honda', 'CBR500R 2022'),
('WXY864', 9, 'automovil', 'Volkswagen', 'Polo 2017'),
('ZAB579', 10, 'suv', 'Nissan', 'X-Trail 2021');


/** mantenimiento **/
INSERT INTO mantenimiento (id_vehiculo, fecha, detalles, valor_mantenimiento, estado) VALUES
('ABC123', '2025-04-10', 'Cambio de aceite y filtro.', 150000, 'completado'),
('XYZ456', '2025-04-12', 'Ajuste de frenos y limpieza.', 80000, 'entregado'),
('JKL789', '2025-04-15', 'Reemplazo de batería.', 250000, 'completado'),
('DEF321', '2025-04-17', 'Inspección general y alineación.', 180000, 'en_proceso'),
('GHI654', '2025-04-18', 'Cambio de pastillas de freno.', 130000, 'pendiente'),
('LMN987', '2025-04-19', 'Revisión de sistema eléctrico.', 110000, 'en_proceso'),
('QRS246', '2025-04-20', 'Cambio de bujías y filtro de aire.', 95000, 'completado'),
('TUV135', '2025-04-21', 'Revisión de luces y recarga de batería.', 60000, 'pendiente'),
('WXY864', '2025-04-22', 'Reemplazo de retrovisor.', 70000, 'entregado'),
('ZAB579', '2025-04-23', 'Cambio de aceite y revisión general.', 160000, 'completado');

/** mantenimiento_repuesto **/
INSERT INTO mantenimiento_repuesto (id_mantenimiento, id_repuesto, cantidad_usada) VALUES
(1, 1, 1),  -- filtro de aceite
(1, 5, 1),  -- aceite
(2, 8, 1),  -- pastillas de freno
(3, 2, 1),  -- batería
(4, 4, 1),  -- retrovisor
(5, 8, 1),  -- pastillas de freno
(6, 6, 1),  -- bobina de encendido
(7, 9, 4),  -- bujías
(7, 10, 1), -- filtro de aire
(9, 4, 1);  -- retrovisor

/** factura **/
INSERT INTO factura (id_mantenimiento, id_cliente, fecha_emision, subtotal, impuestos, total, cufe, qr_code) VALUES
(1, 1, '2025-04-10', 150000, 28500, 178500, 'CUFE123ABC001', 'QR001'),
(2, 2, '2025-04-12', 80000, 15200, 95200, 'CUFE123ABC002', 'QR002'),
(3, 3, '2025-04-15', 250000, 47500, 297500, 'CUFE123ABC003', 'QR003'),
(4, 4, '2025-04-17', 180000, 34200, 214200, 'CUFE123ABC004', 'QR004'),
(5, 5, '2025-04-18', 130000, 24700, 154700, 'CUFE123ABC005', 'QR005'),
(6, 6, '2025-04-19', 110000, 20900, 130900, 'CUFE123ABC006', 'QR006'),
(7, 7, '2025-04-20', 95000, 18050, 113050, 'CUFE123ABC007', 'QR007'),
(8, 8, '2025-04-21', 60000, 11400, 71400, 'CUFE123ABC008', 'QR008'),
(9, 9, '2025-04-22', 70000, 13300, 83300, 'CUFE123ABC009', 'QR009'),
(10, 10, '2025-04-23', 160000, 30400, 190400, 'CUFE123ABC010', 'QR010');


