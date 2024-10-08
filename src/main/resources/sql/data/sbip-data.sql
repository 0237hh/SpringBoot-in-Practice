INSERT INTO COURSES (ID, NAME, CATEGORY, RATING, DESCRIPTION)
VALUES ( 1, 'Rapid Spring Boot Application Development', 'Spring', 4,
        'Spring Boot gives all the power of the Spring Framework without all of the complexities' );

INSERT INTO COURSES (ID, NAME, CATEGORY, RATING, DESCRIPTION)
VALUES ( 2, 'Getting Started with Spring Security DSL', 'Spring', 3,
        'Learn Spring Security DSL in easy steps');

INSERT INTO COURSES (ID, NAME, CATEGORY, RATING, DESCRIPTION)
VALUES ( 3, 'Scalable, Cloud Native Data Applications', 'Spring', 4,
        'Manage Cloud based applications with Spring Boot');

INSERT INTO COURSES (ID, NAME, CATEGORY, RATING, DESCRIPTION)
VALUES ( 4, 'Fully Reactive: Spring, Kotlin, and JavaFX Playing Together', 'Spring',
         3, 'Unleash the power of Reactive Spring with Kotlin and Spring Boot');

INSERT INTO COURSES (ID, NAME, CATEGORY, RATING, DESCRIPTION)
VALUES ( 5, 'Getting Started with Spring Cloud Kubernetes', 'Spring', 5,
        'Master Spring Boot application deployment with Kubernetes');

INSERT INTO AUTHORS (ID, BIO, NAME)
VALUES ( 1, 'Author of several Spring Boot courses', 'John Doe');

INSERT INTO AUTHORS (ID, BIO, NAME)
VALUES ( 2, 'Steve Muller','Author of several popular Spring and Python courses');

INSERT INTO AUTHORS_COURSES (AUTHOR_ID, COURSE_ID) VALUES ( 1, 1);
INSERT INTO AUTHORS_COURSES (AUTHOR_ID, COURSE_ID) VALUES ( 1, 2);
INSERT INTO AUTHORS_COURSES (AUTHOR_ID, COURSE_ID) VALUES ( 2, 1);
INSERT INTO AUTHORS_COURSES (AUTHOR_ID, COURSE_ID) VALUES ( 2, 2);
INSERT INTO AUTHORS_COURSES (AUTHOR_ID, COURSE_ID) VALUES ( 2, 3);

INSERT INTO USERS (username, password, enabled) VALUES ( 'user', 'p@ssw0rd', true);
INSERT INTO USERS (USERNAME, PASSWORD, ENABLED) VALUES ( 'admin', 'pa$$w0rd', true);

INSERT INTO AUTHORITIES (username, authority) VALUES ( 'user', 'USER' );
INSERT INTO AUTHORITIES (USERNAME, AUTHORITY) VALUES ( 'admin', 'ADMIN' );

INSERT INTO CT_USERS (ID, FIRST_NAME, LAST_NAME, PASSWORD, USERNAME, VERIFIED, LOCKED, ACC_CRED_EXPIRED)
VALUES ( 1, 'John', 'jsocket', 'password', 'jsocket@example.com', TRUE, FALSE, FALSE);

INSERT INTO CT_USERS (ID, FIRST_NAME, LAST_NAME, PASSWORD, USERNAME, VERIFIED, LOCKED, ACC_CRED_EXPIRED)
VALUES ( 2, 'Steve', 'smith', 'password', 'smith@example.com', false, false, false );