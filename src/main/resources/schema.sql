CREATE TABLE IF NOT EXISTS movies (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    genre VARCHAR(100) NOT NULL,
    is_popular BOOLEAN NOT NULL,
    release_date DATE,
    poster_url VARCHAR(255)
);
