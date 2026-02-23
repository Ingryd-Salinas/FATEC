CREATE DATABASE comanda_digital;
USE comanda_digital;

CREATE TABLE endereco (
  endereco_id INT AUTO_INCREMENT PRIMARY KEY,
  rua VARCHAR(255) NOT NULL,
  numero VARCHAR(50),
  cep VARCHAR(20),
  cidade VARCHAR(100),
  estado VARCHAR(50),
  pais VARCHAR(100)
);

CREATE TABLE cliente (
  cliente_id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(200) NOT NULL,
  usuario VARCHAR(100) NOT NULL UNIQUE,
  cpf VARCHAR(20),
  rg VARCHAR(20),
  senha_hash VARCHAR(255),
  endereco_id INT,
  FOREIGN KEY (endereco_id) REFERENCES endereco(endereco_id)
);

CREATE TABLE cliente_email (
  email_id INT AUTO_INCREMENT PRIMARY KEY,
  cli_id INT NOT NULL,
  email VARCHAR(255) NOT NULL UNIQUE,
  FOREIGN KEY (cli_id) REFERENCES cliente(cliente_id)
);

CREATE TABLE cliente_telefone (
  tel_id INT AUTO_INCREMENT PRIMARY KEY,
  cli_id INT NOT NULL,
  telefone VARCHAR(50) NOT NULL UNIQUE,
  FOREIGN KEY (cli_id) REFERENCES cliente(cliente_id)
);

CREATE TABLE funcionario (
  fun_id INT AUTO_INCREMENT PRIMARY KEY,
  fun_nome VARCHAR(200),
  fun_cargo VARCHAR(100),
  fun_login VARCHAR(100) UNIQUE,
  fun_senha_hash VARCHAR(255)
);

CREATE TABLE codigo_qr (
  cod_id INT AUTO_INCREMENT PRIMARY KEY,
  cod_gerado VARCHAR(300) UNIQUE
);

CREATE TABLE comanda (
  com_id INT AUTO_INCREMENT PRIMARY KEY,
  cliente_id INT,
  funcionario_id INT,
  cod_id INT,
  com_status VARCHAR(50),
  com_subtotal DECIMAL(10,2),
  FOREIGN KEY (cliente_id) REFERENCES cliente(cliente_id),
  FOREIGN KEY (funcionario_id) REFERENCES funcionario(fun_id),
  FOREIGN KEY (cod_id) REFERENCES codigo_qr(cod_id)
);

CREATE TABLE produto (
  pro_id INT AUTO_INCREMENT PRIMARY KEY,
  pro_nome VARCHAR(200),
  pro_descricao TEXT,
  pro_valor DECIMAL(10,2)
);

CREATE TABLE itens_comanda (
  itens_comanda_id INT AUTO_INCREMENT PRIMARY KEY,
  comanda_id INT,
  itens_comanda_valor_unitario DECIMAL(10,2),
  itens_comanda_quantidade INT,
  itens_comanda_valor_total_item DECIMAL(10,2),
  itens_comanda_status_pedido VARCHAR(50),
  FOREIGN KEY (comanda_id) REFERENCES comanda(com_id)
);

CREATE TABLE itens_comanda_produto (
  itens_comanda_produto_id INT AUTO_INCREMENT PRIMARY KEY,
  itens_comanda_id INT,
  pro_id INT,
  FOREIGN KEY (itens_comanda_id) REFERENCES itens_comanda(itens_comanda_id),
  FOREIGN KEY (pro_id) REFERENCES produto(pro_id)
);

CREATE TABLE pagamento (
  pag_id INT AUTO_INCREMENT PRIMARY KEY,
  comanda_id INT UNIQUE,
  pag_valor_total DECIMAL(10,2),
  pag_forma_pagamento VARCHAR(100),
  pag_desconto DECIMAL(10,2),
  pag_acrescimo DECIMAL(10,2),
  FOREIGN KEY (comanda_id) REFERENCES comanda(com_id)
);

INSERT INTO endereco (rua, numero, cep, cidade, estado, pais) VALUES
('Rua das Flores', '123', '1234-567', 'São Paulo', 'SP', 'Brasil'),
('Av. Brasil', '666', '7654-321', 'Barueri', 'SP', 'Brasil'),
('Rua Bela Vista', '67', '1111-111', 'Curralinho', 'PA', 'Brasil');

INSERT INTO cliente (nome, usuario, cpf, rg, senha_hash, endereco_id) VALUES
('Kauê Jerônimo', 'kaue', '666.666.666.66', '66.666.666-6', 'HASH_EXEMPLO_1', 1),
('Isabela Alves', 'isa', '123.456.789.10', '12.345.678-9', 'HASH_EXEMPLO_2', 2),
('Ingryd Salinas', 'ingrydyãhn', '400.289.221.23', '98.765.432-1', 'HASH_EXEMPLO_3', 3);

INSERT INTO cliente_email (cli_id, email) VALUES
(1, 'kaue@email.com'),
(2, 'isa@email.com'),
(3, 'paraguaio@email.com');

INSERT INTO cliente_telefone (cli_id, telefone) VALUES
(1, '+55 11 90000-0000'),
(2, '+55 11 91234-5678'),
(3, '+55 91 94002-8922');

INSERT INTO funcionario (fun_nome, fun_cargo, fun_login, fun_senha_hash) VALUES
('Gabriel Montanha', 'Outdoor humano', 'montanha', 'HASH1'),
('Rubi Perez', 'Gerente', 'rubi', 'HASH2'),
('Raphael Fillupi', 'Cozinheiro', 'rapha', 'HASH3');

INSERT INTO codigo_qr (cod_gerado) VALUES
('QR-ABC-0001'),
('QR-DEF-0002'),
('QR-GHI-0003');

INSERT INTO produto (pro_nome, pro_descricao, pro_valor) VALUES
('Cerveja Pilsen 350ml', 'Bebida gelada.', 8.50),
('Hambúrguer de Siri', 'Pão, carne de siri, queijo, tomate etc.', 22.00),
('Suco Natural', 'Suco do dia.', 7.50),
('Batata Frita', 'Porção individual.', 15.00),
('Refrigerante Lata', 'Diversos sabores.', 6.00);

INSERT INTO comanda (cliente_id, funcionario_id, cod_id, com_status, com_subtotal) VALUES
(1, 1, 1, 'aberta', 39.00),
(2, 1, 2, 'aberta', 30.50),
(3, 2, 3, 'encerrada', 59.00);

INSERT INTO itens_comanda (comanda_id, itens_comanda_valor_unitario, itens_comanda_quantidade, itens_comanda_valor_total_item, itens_comanda_status_pedido) VALUES
(1, 22.00, 1, 22.00, 'na_fila'),
(1, 8.50, 2, 17.00, 'pronto'),
(2, 7.50, 1, 7.50, 'em_preparo'),
(2, 15.00, 1, 15.00, 'na_fila'),
(3, 22.00, 2, 44.00, 'entregue'),
(3, 6.00, 1, 6.00, 'entregue'),
(3, 9.00, 1, 9.00, 'entregue');

INSERT INTO itens_comanda_produto (itens_comanda_id, pro_id) VALUES
(1, 2),
(2, 1),
(3, 3),
(4, 4),
(5, 2),
(6, 5),
(7, 1);

INSERT INTO pagamento (comanda_id, pag_valor_total, pag_forma_pagamento, pag_desconto, pag_acrescimo) VALUES
(3, 59.00, 'Pix', 0.00, 0.00),
(1, 39.00, 'Dinheiro', 0.00, 0.00);

SELECT * FROM cliente;

SELECT c.com_id, cli.nome
FROM comanda c
JOIN cliente cli ON cli.cliente_id = c.cliente_id;

SELECT pro_nome, pro_valor
FROM produto
ORDER BY pro_valor DESC;

SELECT *
FROM itens_comanda
WHERE comanda_id = 1;

SELECT p.pro_nome
FROM itens_comanda_produto icp
JOIN produto p ON p.pro_id = icp.pro_id
JOIN itens_comanda i ON i.itens_comanda_id = icp.itens_comanda_id
WHERE i.comanda_id = 3;

UPDATE itens_comanda
SET itens_comanda_status_pedido = 'entregue'
WHERE itens_comanda_id = 3;

DELETE FROM cliente_telefone
WHERE tel_id = 1;

SELECT *
FROM comanda
WHERE com_status = 'aberta';

SELECT p.pro_nome, SUM(i.itens_comanda_quantidade) AS total_vendido
FROM itens_comanda_produto icp
JOIN produto p ON p.pro_id = icp.pro_id
JOIN itens_comanda i ON i.itens_comanda_id = icp.itens_comanda_id
GROUP BY p.pro_nome;

SELECT fun_nome
FROM funcionario
ORDER BY fun_nome ASC;