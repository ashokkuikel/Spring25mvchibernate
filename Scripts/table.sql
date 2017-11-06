create database springtutorial;
create table testdata (id int not null auto_increment primary key,foo varchar(25), bar int);

create table offer(id int not null auto_increment primary key,name varchar(25), email varchar(25),text varchar(25));

insert into testdata values(null, 'hello', 12345);
insert into offer values(null,'sanjay','rauniyarsanjay@gmail.com','instructor');
insert into offer values(null,'rauniyar','rauniyar_sanjay@mail.com','instructor');