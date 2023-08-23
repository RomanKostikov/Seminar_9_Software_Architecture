CREATE TABLE `Cloud` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`server_id` INT NOT NULL,
	`os_id` INT NOT NULL,
	`ip_address` INT NOT NULL,
	`total_price` DECIMAL NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Server` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`CPU` INT NOT NULL,
	`CPU_price` DECIMAL NOT NULL,
	`RAM` INT NOT NULL,
	`RAM_price` DECIMAL NOT NULL,
	`SSD` INT NOT NULL,
	`SSD_price` DECIMAL NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `IP_address` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`ip_address` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Operation_system` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(255) NOT NULL,
	`version` varchar NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Order` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`customer_id` INT NOT NULL,
	`cloud_ip` INT NOT NULL,
	`CPU` INT NOT NULL,
	`RAM` INT NOT NULL,
	`SSD` INT NOT NULL,
	`static_ip` BOOLEAN NOT NULL,
	`OS` varchar NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Customer` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`FIO` VARCHAR(255) NOT NULL,
	`email` VARCHAR(255) NOT NULL,
	`hash_password` INT NOT NULL,
	`address` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `Cloud` ADD CONSTRAINT `Cloud_fk0` FOREIGN KEY (`server_id`) REFERENCES `Server`(`id`);

ALTER TABLE `Cloud` ADD CONSTRAINT `Cloud_fk1` FOREIGN KEY (`os_id`) REFERENCES `Operation_system`(`id`);

ALTER TABLE `Cloud` ADD CONSTRAINT `Cloud_fk2` FOREIGN KEY (`ip_address`) REFERENCES `IP_address`(`id`);

ALTER TABLE `Order` ADD CONSTRAINT `Order_fk0` FOREIGN KEY (`customer_id`) REFERENCES `Customer`(`id`);

ALTER TABLE `Order` ADD CONSTRAINT `Order_fk1` FOREIGN KEY (`cloud_ip`) REFERENCES `Cloud`(`id`);







