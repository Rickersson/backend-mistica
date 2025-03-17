CREATE TABLE clientes(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(80) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    cpf VARCHAR(11),
    logradouro VARCHAR(255),
    numero VARCHAR(5),
    bairro VARCHAR(255),
    cidade VARCHAR(255),
    data_nascimento VARCHAR(255),
ativo tinyint,
    uf VARCHAR(2),
    cep VARCHAR(10),
    
    complemento VARCHAR(255)
);