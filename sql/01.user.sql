-- Create the user 
create user wf
  identified by kingstar
  default tablespace TS_YKT_CUR
  temporary tablespace TEMP
  profile DEFAULT
  quota unlimited on ts_ykt_cur;
-- Grant/Revoke role privileges 
grant connect to wf;
grant resource to wf;
grant create any index to wf;
grant create any table to wf;
grant create any view to wf;
grant create any procedure to wf;
grant create trigger to wf;
grant unlimited tablespace to wf;