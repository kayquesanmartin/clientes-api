CREATE TABLE tb_cliente (
    id_cliente VARCHAR(36) NOT NULL PRIMARY KEY,
    cliente_nome VARCHAR(20) NOT NULL,
    cliente_sobrenome VARCHAR(30) NOT NULL,
    cliente_cpf VARCHAR(11) NOT NULL UNIQUE,
    cliente_data_nascimento DATE NOT NULL,
    cliente_email VARCHAR(150) NOT NULL UNIQUE,
    cliente_telefone VARCHAR(20)
);