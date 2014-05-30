create table UserProfile (
  userId varchar(255) not null,
	providerId varchar(255) not null,
	providerUserId varchar(255),
	displayName varchar(255),
	profileUrl varchar(512),
	imageUrl varchar(512),
	accessToken varchar(255) not null,
	secret varchar(255),
	refreshToken varchar(255),
	expireTime bigint,
	primary key (userId, providerId));

-- create unique index UserConnectionRank on UserConnection(userId, providerId, rank);

create table TodoItem (
  id int not null,
  userId varchar(255) not null,
  title varchar(255) not null,
  content varchar(255),
  status smallint default 0,
  createDate datetime not null,
  startDate datetime,
  endDate datetime,
  primary key (id)
);
