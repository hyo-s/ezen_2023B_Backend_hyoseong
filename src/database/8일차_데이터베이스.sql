# 1. 데이터베이스 생성
drop database if exists test6;
create database test6;
use test6;

# 2. 테이블 생성
	# 회원제기능, 카테고리게시물기능 댓글기능
    # 1. 저장할 데이터들을 선정
    # 2. 관심사 끼리 묶어서 데이터들을 테이블 설계
    # 3. 관계 설정 ( PK, FK )		* 테이블당 PK필드 1개 이상 권장.
		# PK : 식별가능한 데이터, 중복없고(unique) + NOT NULL (not null) => primary key
			# 1. auto_increment DB자동번호, 2. 직접 정의한다.
		# FK : (외래키) 	: PK필드와 연결된 필드
			# fpdl
/*
	제약조건
		1. not null
        2. unique
        3. default 값/함수
        4. primary key ( pk 필드명 )
        5. foreign key ( fk 필드명 ) references 참조할테이블명 ( 참조할pk필드명 )
        6. ( mysql ) auto_increment
			* pk일때만 가능
*/
drop table if exists 