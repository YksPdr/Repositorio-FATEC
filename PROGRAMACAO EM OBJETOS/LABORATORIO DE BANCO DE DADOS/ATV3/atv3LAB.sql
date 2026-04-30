CREATE DATABASE biblioteca;
GO

USE biblioteca;
GO

CREATE TABLE categoriaObra(
    codigo INT PRIMARY KEY IDENTITY(1,1),
    nome VARCHAR(100)
);

CREATE TABLE obra(
    codigo BIGINT PRIMARY KEY IDENTITY(1,1),
    isbn VARCHAR(30) UNIQUE,
    titulo VARCHAR(100) NOT NULL,
    autores VARCHAR(100) NOT NULL,
    palavrasChave VARCHAR(100),
    dataPublicacao DATE,
    numeroEdicao INT,
    editora VARCHAR(100),
    numeroPagina INT,
    categoria INT
);

ALTER TABLE obra
ADD CONSTRAINT FK_obra_categoria
FOREIGN KEY (categoria)
REFERENCES categoriaObra(codigo);

CREATE TABLE categoriaLeitor(
    codigo INT PRIMARY KEY IDENTITY(1,1),
    nome VARCHAR(100),
    dias INT DEFAULT 7
);

CREATE TABLE leitor(
    codigo BIGINT PRIMARY KEY IDENTITY(1,1),
    documento VARCHAR(30) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    endereco VARCHAR(100),
    cidade VARCHAR(100),
    estado CHAR(2),
    telefone VARCHAR(30) NOT NULL,
    email VARCHAR(100) UNIQUE,
    senha VARCHAR(100),
    categoria INT,
    dataNascimento DATE
);

ALTER TABLE leitor
ADD CONSTRAINT FK_leitor_categoria
FOREIGN KEY (categoria)
REFERENCES categoriaLeitor(codigo);

CREATE TABLE copia(
    codigo BIGINT PRIMARY KEY IDENTITY(1,1),
    obra BIGINT,
    status VARCHAR(50),
    obs VARCHAR(MAX)
);

ALTER TABLE copia
ADD CONSTRAINT FK_copia_obra
FOREIGN KEY (obra)
REFERENCES obra(codigo);

CREATE TABLE funcionario(
    codigo BIGINT PRIMARY KEY IDENTITY(1,1),
    nome VARCHAR(100) NOT NULL,
    endereco VARCHAR(100),
    cidade VARCHAR(100),
    estado VARCHAR(2),
    telefone VARCHAR(30) NOT NULL,
    dataNascimento DATE,
    email VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(100)
);

ALTER TABLE funcionario
ADD logradouro VARCHAR(100);

CREATE TABLE reserva(
    codigo BIGINT PRIMARY KEY IDENTITY(1,1),
    dataReserva DATE,
    dataPrevistaRetirada DATE,
    dataPrevistaDevolucao DATE,
    leitor BIGINT,
    obra BIGINT
);

ALTER TABLE reserva
ADD CONSTRAINT FK_reserva_leitor
FOREIGN KEY (leitor)
REFERENCES leitor(codigo);

ALTER TABLE reserva
ADD CONSTRAINT FK_reserva_obra
FOREIGN KEY (obra)
REFERENCES obra(codigo);

CREATE TABLE emprestimo(
    codigo BIGINT PRIMARY KEY IDENTITY(1,1),
    dataEmprestimo DATETIME,
    dataPrevistaDevolucao DATETIME,
    dataDevolucao DATETIME,
    multa DECIMAL(18,2) DEFAULT 0,
    obs VARCHAR(400),
    leitor BIGINT,
    copia BIGINT,
    funcionario BIGINT
);

ALTER TABLE emprestimo
ADD CONSTRAINT FK_emprestimo_leitor
FOREIGN KEY (leitor)
REFERENCES leitor(codigo);

ALTER TABLE emprestimo
ADD CONSTRAINT FK_emprestimo_copia
FOREIGN KEY (copia)
REFERENCES copia(codigo);

ALTER TABLE emprestimo
ADD CONSTRAINT FK_emprestimo_funcionario
FOREIGN KEY (funcionario)
REFERENCES funcionario(codigo);