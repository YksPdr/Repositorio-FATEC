CREATE TABLE Oficina(
	codigoOficina int primary key,
	cnpj char(14) not null,
	nome varchar(60),
	responsavel varchar(60),
	telefone char(11),
	email varchar(100)
);

CREATE TABLE Teste(
	codigoTeste int primary key,
	pontuacao decimal(5,2),
	resultado varchar(100),
	recomendacoes text
);

CREATE TABLE Maquina(
	numeroRegistro int primary key,
	anoFabricacao date,
	horasUso int,
	modelo varchar(100)
);

CREATE TABLE Modelo(
	codigoModelo int primary key,
	tipo varchar(50),
	peso decimal(10,2),
	fabricante varchar(100),
	horaTeste int
);

CREATE TABLE Fabricante (
	codigoFabricante int primary key,
	nome varchar(60),
	telefone char(11),
	email varchar(100),
	responsavel varchar(60)
);

CREATE TABLE Tecnico (
	codigoFuncional int primary key,
	endereco varchar(255),
	telefone char(11),
	salario decimal(10,2),
	qualificacao varchar(175)
);

ALTER TABLE Teste
ADD codigoOficina int;

ALTER TABLE Teste
ADD CONSTRAINT FK_Teste_Oficina
FOREIGN KEY (codigoOficina)
REFERENCES Oficina(codigoOficina);

ALTER TABLE Maquina
ADD codigoModelo int;

ALTER TABLE Maquina
ADD CONSTRAINT FK_Maquina_Modelo
FOREIGN KEY (codigoModelo)
REFERENCES Modelo(codigoModelo);

ALTER TABLE Tecnico
ADD codigoOficina int;

ALTER TABLE Tecnico
ADD CONSTRAINT FK_Tecnico_Oficina
FOREIGN KEY (codigoOficina)
REFERENCES Oficina(codigoOficina);

ALTER TABLE Teste
ADD codigoFuncional int

ALTER TABLE Teste
ADD CONSTRAINT FK_Teste_Tecnico
FOREIGN KEY (codigoFuncional)
REFERENCES Tecnico(codigoFuncional);

CREATE TABLE OficinaModelo(
	codigoOficina int,
	codigoModelo int,
	primary key (codigoOficina, codigoModelo),
	foreign key (codigoOficina) references Oficina(codigoOficina),
	foreign key (codigoModelo) references Modelo(codigoModelo)
);

CREATE TABLE Especialista(
    codigoFuncional int,
    codigoModelo int,
    primary key (codigoFuncional, codigoModelo),
    foreign key (codigoFuncional) references Tecnico(codigoFuncional),
    foreign key (codigoModelo) references Modelo(codigoModelo)
);