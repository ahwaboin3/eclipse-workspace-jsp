-- 테이블 스페이스 설정
select tablespace_name, status, contents from dba_tablespaces;
select tablespace_name, sum(bytes),max(bytes) from dba_free_space
group by tablespace_name;
-- musthave 계정이 사용하는 테이블 스페이스도 확인
select username, default_tablespace from dba_users
where username in upper('musthave');