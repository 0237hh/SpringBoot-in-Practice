-- CREATE TABLE COURSES
-- (
--  id INT NOT NULL,
--  name VARCHAR(100) NOT NULL,
--  category VARCHAR(20) NOT NULL,
--  rating INT NOT NULL,
--  description VARCHAR(1000) NOT NULL,
--  PRIMARY KEY (id)
-- );

CREATE TABLE authors (
    id BIGINT NOT NULL ,
    bio VARCHAR(255),
    name VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE authors_courses
(
    author_id BIGINT NOT NULL ,
    course_id BIGINT NOT NULL ,
    PRIMARY KEY (author_id, course_id)
);

DROP TABLE IF EXISTS COURSES;

CREATE TABLE courses
(
    id BIGINT NOT NULL ,
    category VARCHAR (255),
    description VARCHAR (255),
    name VARCHAR (255),
    rating INTEGER NOT NULL ,
    PRIMARY KEY (id)
);

ALTER TABLE authors_courses
ADD CONSTRAINT course_id_fk FOREIGN KEY (course_id)
REFERENCES courses(id);

ALTER TABLE authors_courses
ADD CONSTRAINT author_id_fk FOREIGN KEY (author_id)
REFERENCES authors(id);
