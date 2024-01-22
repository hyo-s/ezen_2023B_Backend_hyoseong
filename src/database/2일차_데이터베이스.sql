# - SQL의 주석처리 하는 방법
# 한줄주석	/*여러줄주석*/		-- 한줄주석

# - 한줄 명령어 끝마침 ; (세미콜론)
# - 명령어 단위 실행 : 실행할 명령어에 커서 위치하고 ctrl+Enter

# 1. 데이터베이스 확인
show databases;
	# 1-1 : 데이터베이스 확인 show databases;
    # 1-2 : (워크벤치) 왼쪽메뉴 -> Navigator 아래 탭에 [Schemas] 클릭 -> 새로고침 버튼

# 2. 데이터베이스 생성 : create database 사용할DB이름
create database sqldb;
# (워크벤치) 상단메뉴에서 4번째 아이콘 : create new schema

# 3. 데이터베이스가 (로컬)저장되는 위치
show variables like 'datadir';

# 4. 데이터베이스 삭제 : drop database 삭제할DB이름
drop database squldb;
# 만약에 데이터베이스가 존재하면 삭제, 존재하지 않으면 처리X
drop database if exists sqldb;

# 5. 사용할 데이터베이스 활성화 / 선택		use 사용할DB이름
	# 데이터베이스 안에 테이블을 저장할 수 있는데 테이블 조작하기 전에 먼저 데이터베이스 선택
use sqldb;

# 예1 : 데이터베이스 만들기=================================================================================== #

# 1. [데이터베이스 초기화] 데이터베이스 만들기 전에 혹시나 동일한 이름이 존재할 수 있기 때문에 삭제 먼저
drop database if exists test1;

# 2. [데이터베이스 생성] 여러개 테이블들을 저장할 데이터베이스 / 구역 만들기
create database test1;

# 3. [데이터베이스 확인] 생성된 데이터베이스 확인
show databases;

# 4. [데이터베이스 사용] 해당 데이터베이스를 선택해서 테이블 만들기 위해
use test1;
