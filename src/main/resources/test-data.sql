DROP TABLE IF EXISTS movies;

CREATE TABLE IF NOT EXISTS movies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    minutes INT NOT NULL,
    genre VARCHAR(50) NOT NULL,
    director VARCHAR (50) NOT NULL
    );

insert into movies (name, minutes, genre, director) values
                                              ('Dark Knight', 152, 'ACTION', 'Director 1'),
                                              ('Memento', 113, 'THRILLER', 'Director 1'),
                                              ('Matrix', 136, 'ACTION', 'Director 2'),
                                              ('Matrix 2', 136, 'ACTION', 'Director 2');