create database sinhvien;
use sinhvien;
create table sinhvien.class(
classId int not null auto_increment primary key,
className varchar(60) not null,
startDate datetime not null ,
Status bit
);
create table sinhvien.student(
studentId int not null auto_increment primary key,
studentName varchar (30) not null,
Address varchar (50),
Phone varchar (20),
Status bit,
classId int not null

);
create table sinhvien.subject(
subId int not null auto_increment primary key,
subName varchar(30) not null ,
credit Tinyint not null default 1 check(credit>=1),
status   bit default 1
);
create table sinhvien.mark(
markId int not null auto_increment primary key,
subId int not null ,
studentId int not null ,
mark float default 0 check (mark between 0 and 100),
examtimes tinyint default 1,
unique(subId,studentId),
foreign key (subId) references sinhvien.subject(subId),
foreign key (studentId) references sinhvien.student(studentId)
);





