CREATE DATABASE IF NOT EXISTS provincesdb;

USE provincesdb;

CREATE TABLE IF NOT EXISTS provinces(
    value VARCHAR(255) NOT NULL,
    `display-name` VARCHAR(255) NOT NULL,
    PRIMARY KEY(value)
);