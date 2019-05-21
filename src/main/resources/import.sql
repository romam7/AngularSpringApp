insert into usuarios (username, password, enabled, nombre, apellido, email) values ('roman', '$2a$10$GCvyBsDsxtq7CIgc.GDDKOop4ePeGZm2Azp/X1vP.JZLHflXp2KDq', 1, 'Roman','Badillo G', 'roman@mail.com');

insert into roles (nombre) values ('ROLE_ADMIN');
insert into roles (nombre) values ('ROLE_USER');

insert into usuarios_roles (usuario_id, role_id) values (1,2);

insert into regiones (id, nombre) values (1, 'Sudamerica');
insert into regiones (id, nombre) values (2, 'CentroAmerica');
insert into regiones (id, nombre) values (3, 'Europa');
insert into regiones (id, nombre) values (4, 'Asia');
insert into regiones (id, nombre) values (5, 'Africa');
insert into regiones (id, nombre) values (6, 'Antartida');

insert into clientes (apellido, email, created_at, nombre, region_id)  values ('Martinez', 'pedro@mail.com', '2018-05-25', 'Pedro', 1);
insert into clientes (apellido, email, created_at, nombre, region_id)  values ('Gonzalez', 'maria@mail.com', '2018-06-13', 'Maria', 2);
insert into clientes (apellido, email, created_at, nombre, region_id)  values ('Hernandez', 'jose@mail.com', '2017-02-02', 'Jose', 3);
insert into clientes (apellido, email, created_at, nombre, region_id)  values ('Herrera', 'arturo@mail.com', '2016-01-01', 'Arturo', 4);
insert into clientes (apellido, email, created_at, nombre, region_id)  values ('Perez', 'hector@mail.com', '2017-06-23', 'Hector', 5);
insert into clientes (apellido, email, created_at, nombre, region_id)  values ('Gomez', 'wendy@mail.com', '2017-02-02', 'Wendy', 6);
insert into clientes (apellido, email, created_at, nombre, region_id)  values ('Aguilar', 'dulce@mail.com', '2018-05-25', 'Dulce', 1);
insert into clientes (apellido, email, created_at, nombre, region_id)  values ('Sanchez', 'bibi@mail.com', '2018-06-13', 'Bibiana', 2);
insert into clientes (apellido, email, created_at, nombre, region_id)  values ('Quijano', 'ive@mail.com', '2015-05-27', 'Cynthia', 3);
insert into clientes (apellido, email, created_at, nombre, region_id)  values ('Ramirez', 'claudia@mail.com', '2018-05-25', 'Claudia', 4);
insert into clientes (apellido, email, created_at, nombre, region_id)  values ('Gonzalez', 'fati@mail.com', '2018-06-13', 'Fatima', 5);
insert into clientes (apellido, email, created_at, nombre, region_id)  values ('Vargas', 'sof@mail.com', '2015-05-27', 'Sofia', 6);