delete  from users;
delete  from user_extra_info;

select * from users;

create index last_login_time_index on user_extra_info(last_login_time);

show index from user_extra_info;

explain select user_id from user_extra_info where last_login_time < '2020-09-16 21:18:22';

explain select * from users where id in (select user_id from user_extra_info where last_login_time < '2020-09-16 21:18:22');

explain select * from users where id in (select user_id from user_extra_info where last_login_time < '2020-09-16 21:18:22') or id in (select user_id from user_extra_info where last_login_time < '-1') ;

show warnings;