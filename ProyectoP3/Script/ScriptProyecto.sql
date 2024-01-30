create database proyecto;
use proyecto;
CREATE TABLE Cliente (
    idCliente INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    correo VARCHAR(50),
    telefono VARCHAR(20)
);
CREATE TABLE Pedido (
    idPedido INT PRIMARY KEY,
    idInsumo INT,
    idCliente INT,
    idServicio INT,
    fecha DATE,
    estado VARCHAR(50),
    FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente),
    FOREIGN KEY (idServicio) REFERENCES Servicio(idServicio)
);
CREATE TABLE InsumoOdontologico (
    idInsumo INT PRIMARY KEY,
    idPromocion INT,
    nombre VARCHAR(50),
    descripcion TEXT,
    precio DECIMAL(10, 2),
    FOREIGN KEY (idPromocion) REFERENCES Promociones(idPromocion)
);
CREATE TABLE Servicio (
    idServicio INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    imagen LONGBLOB,
    precio DECIMAL(10, 2)
);
CREATE TABLE Promociones (
    idPromocion INT PRIMARY KEY,
    nombre VARCHAR(50),
    fechaInicio DATE,
    fechaFin DATE
);
select * from Pedido;
