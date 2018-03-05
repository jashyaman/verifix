create table
upload_log
( upload_id int,
upload_type text,
filename text,
uploader_id int,
upload_timestamp timestamp);


create table
project
( project_id int,
project_name text,
project_description text,
resource_group_id int,
project_owner_id text,
create_timestamp timestamp,
updater_id int,
updater_timestamp datetime);

-- Monday
create table
resource_group
( resource_group_id int,
resource_group_name text,
creator_id int,
create_timestamp timestamp,
updater_id int,
updater_timestamp datetime);

-- there can be only one timestamp in a record

create table
resource
( resource_version text,
resource_id int,
creator_id int,
create_timestamp timestamp,
updater_id int,
updater_timestamp datetime);


-- Tuesday
create table
res_rg_map
( res_rg_map_id int,
resource_version text,
resource_id int,
resource_group_id);

create table
role
( role_id int,
role_name text,
role_description text);

create table
role_group
( role_group_id int,
role_group_name text,
role_id int);

-- Wednesday
create table
user
( user_id int,
username text,
first_name text,
last_name text,
manager_id int,
role_group_id int);

create table
modification_log
( log_id int,
object_type text,
object_modified text,
modifier_id int
modification_timestamp timestamp);

-- Thursday
create table
credentials
( username text,
password text);
