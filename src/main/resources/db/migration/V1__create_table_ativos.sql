CREATE TABLE ativos (
    id BIGSERIAL NOT NULL,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(255),
    localizacao VARCHAR(255),
    PRIMARY KEY (id)
);