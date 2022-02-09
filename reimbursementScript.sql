create type roleEnum as enum ('EMPLOYEE','FINANCE MANAGER');
create type eventEnum as enum ('University Course','Seminar','Certification Preparation Class','Certification','Technical Training','Other');
create type statusEnum  as enum ('PENDING', 'APPROVED','DENIED');
create table users(
id serial primary key,
first_name varchar(40) not null,
last_name varchar (40) not null,
email varchar (30) not null unique,
phone_number varchar(12) not null,
address text not null,
user_name varchar (20) not null unique,
password varchar (20)not null unique,
role roleEnum not null
);

create table reimbursement(
id serial primary key,
user_id int references users(id) on delete cascade,
eventType eventEnum not null,
eventLocation varchar not null,
eventDate timestamp  not null,
grade varchar,
eventcost decimal not null check (eventcost>0 or eventcost<=1000),
description text,
createdDate timestamp not null default CURRENT_TIMESTAMP,
status statusEnum  not null default 'PENDING',
payableCost decimal not null check (payableCost= eventcost or payableCost<=1000) default(0.00),
resolvedDate timestamp check (resolvedDate  > eventDate),
uploadFile bytea
);
select * from users;
select * from reimbursement;


drop table reimbursement ;
create table reimbursement(
id serial primary key,
user_id int references users(id) on delete cascade,
eventType eventEnum not null,
eventLocation varchar not null,
eventDate timestamp  not null,
grade varchar,
eventcost decimal not null,
description text,
createdDate timestamp not null default CURRENT_TIMESTAMP,
status statusEnum  not null default 'PENDING',
payableCost decimal not null default '0.00',
resolvedDate timestamp,
uploadFile bytea
);

--to drop entity or elements from table 


--insert the valuses bellow for the both table 

insert into users values
(default, 'abdul', 'alim', 'aalim@email.com', '1234567834','123 Park Ave, NY NY 11101','alim1','pass1', 'FINANCE MANAGER'),
(default, 'Dan', 'Fleeman', 'dfleman@email.com', '1237865687','225 Forest Ave, Brooklyn  NY 11243','dan12','pass2', 'EMPLOYEE'),
(default, 'David', 'Holfman', 'dhofman@email.com', '1237658907','224 Madison Ave, NY NY 11101','uangel','pass3', 'EMPLOYEE'),
(default, 'Jacob', 'Coffin', 'jcoffin@email.com', '6465768769','202 Bradly Ave, Queens NY 11104','uange2','pass4', 'EMPLOYEE'),
(default, 'Jacob', 'Bonsey', 'jbonsey@email.com', '3478978765','224 Petter Ave, Longisland NY 11101','uange3','pass5', 'EMPLOYEE'),
(default, 'Zee', 'Bintay', 'zbintay@email.com', '4579874321','224 Fork Ave, Bronx NY 14563','uange4','pass8', 'EMPLOYEE'),
(default, 'Angela', 'White', 'awhite@email.com', '1234354534','2234 Jefferson Ave, SI NY 11101','uange5','pass9', 'EMPLOYEE'),
(default, 'Angela', 'Black', 'ablack@email.com', '1234325645','5645 Washington Ave, Riverdale NY 11453','uange6','pass12', 'EMPLOYEE'),
(default, 'Angela', 'Blue', 'ablue@email.com', '1236566789','224 Union Ave, Parkchester NY 11656','uange7','pass21', 'EMPLOYEE'),
(default, 'Brown', 'Frost', 'angela@email.com', '2345456789','2124 Madison Ave, Yomkers NY 13452','uange8','pass23', 'EMPLOYEE');

insert into reimbursement values 
(default,'1','Certification Preparation Class','Florida','2022-3-15','','400','This is required certificatin for the position',default,default,default),
(default,'2','Certification','New York','2022-3-15','','400','This is required certificatin for the position',default,default,default),
(default,'3','Seminar','New York','2022-2-15','','420','This is one going skill development seminar',default,default,default),
(default,'3','Technical Training','Boston','2022-3-5','','600','This is required for the current position',default,default,default),
(default,'7','Other','Vargina','2022-2-19','','200','Visiting another office',default,default,default),
(default,'6','University Course','Texas','2022-3-22','','700','This is skill development course for the new technologies',default,default,default)
;
insert into reimbursement values 
(default,'University Course','Texas','2022-2-22','','500','This is skill development course for the new technologies',default,default,default);
select * from reimbursement;

--to generate data such as CSV mockaroo.com
--updates values from different tables: https://www.postgresqltutorial.com/postgresql-update-join/
