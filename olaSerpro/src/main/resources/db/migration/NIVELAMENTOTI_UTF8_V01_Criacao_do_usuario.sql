declare
userexist integer;
begin
  select count(*) into userexist from dba_users where username='EXEMPLOSERPRO';
  if (userexist = 0) then
    execute immediate 'create user EXEMPLOSERPRO identified by 123456';
  end if;
end;
/

grant connect,resource to EXEMPLOSERPRO;