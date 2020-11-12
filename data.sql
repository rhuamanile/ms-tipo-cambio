CREATE TABLE tbl_tipo_cambio (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  moneda_origen VARCHAR(20) NOT NULL,
  moneda_destino VARCHAR(20) NOT NULL,
  tipo_cambio DOUBLE DEFAULT NULL
);

INSERT INTO tbl_tipo_cambio(moneda_origen,moneda_destino,tipo_cambio)VALUES('soles','dolares',3.52);
INSERT INTO tbl_tipo_cambio(moneda_origen,moneda_destino,tipo_cambio)VALUES('dolares','soles',3.50);
INSERT INTO tbl_tipo_cambio(moneda_origen,moneda_destino,tipo_cambio)VALUES('soles','euro',4.30);  
INSERT INTO tbl_tipo_cambio(moneda_origen,moneda_destino,tipo_cambio)VALUES('euro','soles',2.20); 
INSERT INTO tbl_tipo_cambio(moneda_origen,moneda_destino,tipo_cambio)VALUES('dolares','euro',3.30);  
INSERT INTO tbl_tipo_cambio(moneda_origen,moneda_destino,tipo_cambio)VALUES('euro','dolares',3.90);   
	  