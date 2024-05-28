create database ProiectPao2024;

create user Tibi identified by 'parola'; grant all privileges on ProiectPao2024.* to Tibi;

create table if not exists author ( id int primary key auto_increment, name varchar(128), birthyear int, uniqueid int, nobooks int);

create table if not exists reader ( id int primary key auto_increment, name varchar(128), birthyear int);

create table if not exists book ( id int primary key auto_increment, name varchar(255), publisher varchar(255), pages int,  publishingyear int);

create table if not exists cd ( id int primary key auto_increment, name varchar(600), tracks int, genre varchar(50), publisher varchar(255), publishingyear int);

select * from cd;
select * from book;
select * from author;
select * from reader;

GRANT ALL ON proiectpao2024.* TO 'Tibi'@'%';

select * from mysql.user;

insert into cd (name, tracks, genre, publisher, publishingyear) values ("Metallica - Metallica", 12, "Metal", "Elektra", 1991);

delete from cd where id = 4;