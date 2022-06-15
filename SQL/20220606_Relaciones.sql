use generationg1;

CREATE TABLE direcciones(
    id int not null auto_increment,
    nombre varchar(15),
    numero int,
    ciudad varchar(15),
    region varchar(15),
    pais varchar(15),
    primary key (id)
    );

CREATE TABLE registros(
    id int NOT NULL AUTO_INCREMENT,
    codigo_registro Varchar(30) NOT NULL,
    rut Varchar(30) NOT NULL,
    PRIMARY KEY (id)
    );

CREATE TABLE cursos(
    id int NOT NULL AUTO_INCREMENT,
    nombre Varchar(30) NOT NULL,
    descripcion Varchar(30) NOT NULL,
    PRIMARY KEY (id)
    );

CREATE TABLE alumnos(
    id int NOT NULL AUTO_INCREMENT,
    nombre varchar(30) NOT NULL,
    apellido varchar(30) NOT NULL,
    edad int NOT NULL,
    registro_id int, 
    direccion_id int, 
    curso_id int,
    PRIMARY KEY (id)
);

ALTER TABLE alumnos
ADD FOREIGN KEY (direccion_id) REFERENCES direcciones(id);

ALTER TABLE alumnos
ADD FOREIGN KEY (curso_id) REFERENCES cursos(id);

ALTER TABLE alumnos
ADD FOREIGN KEY (registro_id) REFERENCES registros(id);

