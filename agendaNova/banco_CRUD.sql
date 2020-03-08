create database agenda;

use agenda;

create table usuario(
id int not null auto_increment primary key,
nome varchar(30) not null,
senha varchar(6) not null,
email varchar(20)
);


create table telefone(
id int not null auto_increment primary key,
ddd int,
numero varchar(9),
tipo varchar(11),
id_usuario int not null 
);
alter table telefone add constraint fk_usuario foreign key(id_usuario) references usuario(id);

insert into usuario (nome,senha,email) values("robson","123","celular");
delete from usuario where id=9;
select * from usuario;
select * from telefone;
delete from telefone where id_usuario=1;

ALTER TABLE usuario modify nome varchar(50);
alter table usuario modify email varchar(50);
select * from usuario INNER JOIN telefone ON usuario.id=telefone.id_usuario;
drop table telefone;
update usuario set email="andre@recode.com" where id=10;
update usuario set email="andre@oi.com",senha="525" where id=10;