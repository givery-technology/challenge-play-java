# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  id                        integer primary key AUTOINCREMENT,
  email                     varchar(255),
  password                  varchar(255))
;




# --- !Downs

PRAGMA foreign_keys = OFF;

drop table user;

PRAGMA foreign_keys = ON;

