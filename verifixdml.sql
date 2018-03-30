


insert into
credentials 
(username, password) 
values
('24shyam7','comcast@123');

insert into
credentials 
(username, password) 
values
('manpreet0k','manpre@123');

insert into
role
(role_id, role_name, role_description)
values
(1011, 'ROLE_USER', 'user_role');

insert into
role_group
(role_group_id, role_group_name, role_id)
values
(101101, 'USER_LEVEL_ACCESS', 1011);

insert into
user
(user_id, username, first_name, last_name, manager_id, role_group_id)
values
(101, '24shyam7', 'Shyam', 'Raman', 0, 101101);

insert into
user
(user_id, username, first_name, last_name, manager_id, role_group_id)
values
(102, 'manpreet0k', 'Manpreet', 'Singh', 101, 101101);


insert into 
resource
( resource_version, resource_id, creator_id, create_timestamp, updater_id, updater_timestamp)
values
('ver1.0', 11001, 101, now(), null,null);

insert into
resource_group
(resource_group_id, resource_group_name, creator_id, create_timestamp, updater_id, updater_timestamp)
values
( 101101, 'default_group', '101', now(), null, null);

insert into 
res_rg_map
( res_rg_map_id, resource_version, resource_id, resource_group_id)
values
(1101, 'ver1.0', 11001, 101101);

insert into 
project
(project_id, project_name, project_description, resource_group_id,
project_owner_id, create_timestamp, updater_id, updater_timestamp)
values
(111001, 'sample project', 'sample project no description', 101101,
101, now(), null, null );



insert into 
project
(project_id, project_name, project_description, resource_group_id,
project_owner_id, create_timestamp, updater_id, updater_timestamp)
values
(111002, 'sample project2', 'sample project2 no description', 101101,
101, now(), null, null );
