-- 자료형 게시판 테이블 생성
create table mvcboard(
    idx number primary key,
    name varchar2(50) not null,
    title varchar2(200) not null,
    content varchar2(2000) not null,
    postdate date default sysdate not null,
    ofile varchar2(200),
    sfile varchar2(30),
    downcount number(5) default 0 not null,
    pass varchar2(50) not null,
    visitcount number default 0 not null
);

-- idx값을 위한 1씩 증가하는 시퀀스 객체 생성
create sequence seq_mvcboard_num
    increment by 1
    start with 1
    minvalue 1
    nomaxvalue
    nocycle
    nocache;

-- 테스트 데이터 입력
insert into mvcboard( idx, name, title, content, pass)
values(seq_mvcboard_num.nextval,
    '김유신','자료실 제목1 입니다', '내용', '1234');
insert into mvcboard( idx, name, title, content, pass)
values(seq_mvcboard_num.nextval,
    '장보고','자료실 제목2 입니다', '내용', '1234');
insert into mvcboard( idx, name, title, content, pass)
values(seq_mvcboard_num.nextval,
    '이순신','자료실 제목3 입니다', '내용', '1234');
insert into mvcboard( idx, name, title, content, pass)
values(seq_mvcboard_num.nextval,
    '강감찬','자료실 제목4 입니다', '내용', '1234');
insert into mvcboard( idx, name, title, content, pass)
values(seq_mvcboard_num.nextval,
    '대조영','자료실 제목5 입니다', '내용', '1234');
insert into mvcboard( idx, name, title, content, pass)
values(seq_mvcboard_num.nextval,
    '문익점','자료실 제목6 입니다', '내용', '1234');
insert into mvcboard( idx, name, title, content, pass)
values(seq_mvcboard_num.nextval,
    '세종대왕','자료실 제목7 입니다', '내용', '1234');
select * from mvcboard;

commit;

-- 제목 검색 기능
select * from board where title like '%제목1%';

select * from mvcboard where title like '%제목2%' order by idx desc;

-- idx를 이용하여 게시글 한개 가져오기
select * from mvcboard where idx=10;











