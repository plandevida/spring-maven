drop table Player if exists;

create table Player(playerId varchar(50) primary key, playerFirstName varchar(50) not null, playerLastName varchar(50) not null );
