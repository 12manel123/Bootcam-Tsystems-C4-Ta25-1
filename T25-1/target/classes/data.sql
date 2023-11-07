DROP table IF EXISTS Fabricantes;
DROP table IF EXISTS Articulos;

CREATE TABLE fabricantes (
    codigo INT PRIMARY KEY,
    nombre VARCHAR(100)
);

CREATE TABLE articulos (
    codigo INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio INT NOT NULL,
    fabricante INT NOT NULL,
    FOREIGN KEY (fabricante) REFERENCES fabricantes(codigo)
);

INSERT INTO fabricantes (codigo, nombre) VALUES
(1, 'Sony'),
(2, 'Samsung'),
(3, 'Apple');

INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES
(101, 'Televisor LED 55 pulgadas', 799, 1),
(102, 'Smartphone Galaxy S21', 899, 2),
(103, 'iPhone 13 Pro', 1099, 3),
(104, 'Barra de sonido Sony HT-X9000F', 349, 1),
(105, 'Tablet Galaxy Tab S7', 649, 2),
(106, 'AirPods Pro', 249, 3);

