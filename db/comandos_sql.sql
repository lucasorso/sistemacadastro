CREATE TABLE produtos(codigo integer not null,descricao varchar(30) not null)

insert into produtos(codigo, descricao) values (1,'arroz');

insert into produtos(codigo, descricao)
values(2,'feijão')
;
insert into produtos(codigo, descricao)
values(3,'macarrão')
;
commit
;


select * from produtos


;

update produtos
set descricao = 'Arroz pré-cozido'
where codigo = 1
commit




Comandos lucas


// Criação  Pessoa

create table pessoa (
id integer identity primary key, 
nome varchar(30) not null,
cpf varchar(11) not null, 
rg varchar (10) not null, 
sexo varchar(30) not null
);


// Criação Endereço

create table endereco (
id integer identity primary key, 
rua varchar(30) not null,
cidade varchar(30) not null, 
cep varchar (30) not null, 
estado varchar(30) not null
);

// medico
create table medico (
id integer identity primary key, 
nome varchar(30) not null,
cpf varchar(30) not null, 
rg varchar (30) not null, 
especializacao varchar(30) not null,
email varchar(30) not null,
crm varchar(30) not null
);


// Criação de tabela de tabela de Relacionamento 
// Exemplo Professor Giba

create table pessoa_endereco(
id integer identity primary key, 
id_pessoa integer,
id_endereco integer
);

// Depois da Tabela criada altera a tabela

alter table pessoa_endereco
add FOREIGN KEY (id_endereco)
    REFERENCES endereco (id)