-- MySQL Script generated by MySQL Workbench
-- Sun Jun 16 15:12:03 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema vindiesel
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `vindiesel` ;

-- -----------------------------------------------------
-- Schema vindiesel
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `vindiesel` DEFAULT CHARACTER SET utf8 ;
SHOW WARNINGS;
USE `vindiesel` ;

-- -----------------------------------------------------
-- Table `destinatario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `destinatario` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `destinatario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `codigoPessoa` VARCHAR(18) NOT NULL,
  `endereco_id` INT NOT NULL,
  PRIMARY KEY (`id`));

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `dimensao`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dimensao` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `dimensao` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `comprimento` DECIMAL NULL,
  `largura` DECIMAL NULL,
  `altura` DECIMAL NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `encomenda`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `encomenda` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `encomenda` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigoRastreio` VARCHAR(255) NULL,
  `peso` DECIMAL(10,2) NOT NULL,
  `dimensao_id` INT NOT NULL,
  `valorNotaFiscal` DOUBLE(10,2) NOT NULL,
  PRIMARY KEY (`id`));

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `endereco`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `endereco` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `endereco` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cep` VARCHAR(8) NOT NULL,
  `estado` VARCHAR(2) NOT NULL,
  `cidade` VARCHAR(45) NOT NULL,
  `bairro` VARCHAR(45) NOT NULL,
  `rua` VARCHAR(45) NOT NULL,
  `complemento` VARCHAR(45) NULL,
  `numero` VARCHAR(10) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `entrega`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `entrega` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `entrega` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `valorTotal` DECIMAL(10,2) NOT NULL,
  `dataCadastro` DATETIME NOT NULL,
  `dataEntrega` DATETIME NULL,
  `entregue` TINYINT NOT NULL,
  `remetente_id` INT NOT NULL,
  `destinatario_id` INT NOT NULL,
  `encomenda_id` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `formaPagamento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `formaPagamento` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `formaPagamento` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `receita`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `receita` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `receita` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `dataCadastro` DATETIME NOT NULL,
  `dataPagamento` DATETIME NULL,
  `dataVencimento` DATE NOT NULL,
  `valorTotal` DECIMAL(9,2) NOT NULL,
  `valorRecebido` DECIMAL(9,2) NULL,
  `entrega_id` INT NOT NULL,
  `formaPagamento_id` INT NULL,
  PRIMARY KEY (`id`));

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `remetente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `remetente` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `remetente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `codigoPessoa` VARCHAR(18) NOT NULL,
  `endereco_id` INT NOT NULL,
  `telefone` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tipoTramite`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tipoTramite` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tipoTramite` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tipoUsuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tipoUsuario` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tipoUsuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `tipoPermissao` INT(2) NOT NULL,
  `ativo` TINYINT NOT NULL,
  PRIMARY KEY (`id`));

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tramite`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tramite` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tramite` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `datahora` DATETIME NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `observacao` TEXT NULL,
  `entrega_id` INT NOT NULL,
  `tipoTramite_id` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `usuario` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `dataNascimento` DATE NOT NULL,
  `telefone` VARCHAR(30) NULL,
  `email` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(15) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  `salario` DECIMAL(10,2) NOT NULL,
  `numeroPis` INT(20) NOT NULL,
  `ativo` TINYINT NOT NULL,
  `endereco_id` INT NOT NULL,
  `tipoUsuario_id` INT NOT NULL,
  PRIMARY KEY (`id`));

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

INSERT INTO `vindiesel`.`tipotramite` (`id`, `nome`) VALUES ('1', 'SAIU DE:');
INSERT INTO `vindiesel`.`tipotramite` (`id`, `nome`) VALUES ('2', 'FOI PARA:');
INSERT INTO `vindiesel`.`tipotramite` (`id`, `nome`) VALUES ('3', 'CHEGOU EM:');


INSERT INTO `vindiesel`.`formapagamento` (`id`, `nome`) VALUES ('1', 'DINHEIRO');
INSERT INTO `vindiesel`.`formapagamento` (`id`, `nome`) VALUES ('2', 'DEPOSITO EM CONTA');
INSERT INTO `vindiesel`.`formapagamento` (`id`, `nome`) VALUES ('3', 'BOLETO');


INSERT INTO `vindiesel`.`TipoUsuario` (`id`, `nome` , `tipoPermissao`, `ativo`) VALUES ('1', 'Administrador' , '1' , '1');
INSERT INTO `vindiesel`.`TipoUsuario` (`id`, `nome` , `tipoPermissao`, `ativo`) VALUES ('2', 'Caixa' ,'2' , '1');

INSERT INTO `vindiesel`.`endereco` (`id`, `cep`, `estado`, `cidade`, `bairro`, `rua`, `complemento`, `numero`) VALUES ('1', '88133810', 'SC', 'Palhoça', 'Jardim das Palmeiras', 'Dália', 'Casa Marrom', '538');
INSERT INTO `vindiesel`.`endereco` (`id`, `cep`, `estado`, `cidade`, `bairro`, `rua`, `complemento`, `numero`) VALUES ('2', '88130800', 'SC', 'Palhoça', 'Jardim Eldorado', 'Não sei o nome', 'Não sei', '500');

INSERT INTO `vindiesel`.`Usuario` (`id`, `nome`, `dataNascimento`, `telefone`, `email`, `cpf`, `senha`, `salario`, `numeroPis`, `ativo`, `endereco_id`, `tipoUsuario_id`) VALUES ('1', 'William Bigas Mauro', '1997-11-21', '(48)3033-7442', 'admin', '100.521.859-58', '1234', '1550.00', '123456', '1', '1', '1');
INSERT INTO `vindiesel`.`Usuario` (`id`, `nome`, `dataNascimento`, `telefone`, `email`, `cpf`, `senha`, `salario`, `numeroPis`, `ativo`, `endereco_id`, `tipoUsuario_id`) VALUES ('2', 'Agostinho Detófano Junior', '1996-02-12', '(48)9682-4700', 'funcionario', '100.521.859-64', '1234', '2000.00', '123987', '1', '2', '2');


select * from TipoUsuario;

select * from endereco;

select * from Usuario;

select * from remetente






