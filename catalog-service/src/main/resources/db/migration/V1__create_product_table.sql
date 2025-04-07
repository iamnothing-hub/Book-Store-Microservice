CREATE TABLE products (
  code VARCHAR(30) PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  description TEXT,
  image_url VARCHAR(255),
  price DECIMAL(10, 2) NOT NULL
);