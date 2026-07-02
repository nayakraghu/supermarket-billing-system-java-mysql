CREATE DATABASE IF NOT EXISTS supermarket_db; USE supermarket_db;
CREATE TABLE IF NOT EXISTS users(id INT AUTO_INCREMENT PRIMARY KEY,username VARCHAR(50),password VARCHAR(50));
INSERT INTO users(username,password) VALUES('admin','admin123');
CREATE TABLE IF NOT EXISTS items(id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(100),category VARCHAR(100),brand VARCHAR(100),price DOUBLE,stock INT,added_date DATE);
INSERT INTO items(name,category,brand,price,stock,added_date) VALUES('Milk','Dairy','Amul',60,50,'2024-01-01'),('Bread','Bakery','Britannia',40,30,'2024-01-02'),('Rice','Grains','India Gate',80,100,'2024-01-03'),('Shampoo','Personal Care','Dove',200,0,'2024-01-04'),('Chips','Snacks','Lays',20,200,'2024-01-05');
