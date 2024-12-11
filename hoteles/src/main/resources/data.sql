-- Insertar Clientes
INSERT INTO Clientes (nombre, email, telefono)
VALUES
('Juan Pérez', 'juan.perez@example.com', '123456789'),
('María López', 'maria.lopez@example.com', '987654321'),
('Carlos García', 'carlos.garcia@example.com', '654123987'),
('Laura Sánchez', 'laura.sanchez@example.com', '321654987');

-- Insertar Hoteles
INSERT INTO Hoteles (nombre, ubicacion, estrellas)
VALUES
('Hotel Paraíso', 'Madrid, España', 5),
('Hotel Mar Azul', 'Barcelona, España', 4),
('Hotel Sol Dorado', 'Sevilla, España', 3),
('Hotel Luna Blanca', 'Granada, España', 4);

-- Insertar Reservas
INSERT INTO Reservas (cliente_id, hotel_id, fechaReserva, duracionDias, estado)
VALUES
(1, 1, '2024-12-20', 3, 'confirmada'),
(2, 2, '2024-12-22', 5, 'pendiente'),
(3, 3, '2024-12-25', 2, 'cancelada'),
(4, 4, '2024-12-28', 4, 'completada'),
(1, 3, '2024-12-30', 1, 'confirmada'),
(2, 1, '2025-01-02', 7, 'pendiente');