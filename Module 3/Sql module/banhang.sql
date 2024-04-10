create database ss2 ;
use ss2;
create table ss2.customer(
cId int auto_increment primary key,
cName varchar(255) not null,
cAge int not null
);
create table ss2.oder(
oId int auto_increment primary key,
cId int,
oDate date,
oTotalPrice int ,
  FOREIGN KEY (cId) REFERENCES ss2.customer (cId)
);
create table ss2.product(
pId int auto_increment primary key,
pName varchar(255),
pPrice int 
);
create table ss2.odertatail(
oId int,
pId int,
odQty varchar(255),
foreign key (oId) references ss2.oder (oId),
foreign key (pId) references ss2.product(pId)
);



