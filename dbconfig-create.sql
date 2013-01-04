create table inventar (
  id                        integer auto_increment not null,
  name                      varchar(255),
  kategorie                 varchar(255),
  status                    integer,
  preis                     double,
  kaution                   double,
  verwendung                varchar(255),
  last_update               datetime not null,
  constraint pk_inventar primary key (id))
;

create table inventar_kategories (
  id                        integer auto_increment not null,
  kategorie                 varchar(255),
  oberkategorie             varchar(255),
  last_update               datetime not null,
  constraint pk_inventar_kategories primary key (id))
;

create table Users (
  id                        integer auto_increment not null,
  name                      varchar(255),
  email                     varchar(255),
  password                  varchar(255),
  last_update               datetime not null,
  constraint pk_Users primary key (id))
;



