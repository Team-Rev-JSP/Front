프로젝트 설명
-------------------
본 프로젝트는 학교의 JSP 수업 과제(명함 관리 프로젝트)를 위해서 진행되었다.

해당 저장소에는 프로젝트에서도 프론트와 관련된 코드들이 올라와 있다.

개발 환경
-------------------
해당 프로젝트와 유사한 기술스택을 사용할 예정인 분들을 위해서 테스트 해볼 수 있도록 개발 환경을 위한 설정

1. **IDEA** : IntelliJ IDEA 
2. **Version** : JAVA EE 8, Servlet 4.&#42;, JSP 2.3, Tomcat 9.&#42;    
  위 4개의 버전은 맞춰 줘야한다. 버전에 관한 자세한 설명은 링크 된 사이트를 참조 : [Java EE와 Servlet/JSP의 관계와 WAS 개념 정리](https://atoz-develop.tistory.com/entry/Java-EE%EC%99%80-Servlet-JSP%EC%9D%98-%EA%B4%80%EA%B3%84%EC%99%80-WAS-%EA%B0%9C%EB%85%90-%EC%A0%95%EB%A6%AC)
  
프로젝트 구조
---------------------------
프로젝트 구조는 크게 3가지로 나뉜다

 1. **lib** : 사용되는 라이브러리 파일이 들어있는 디렉토리
 2. **src** : java(servlet) 파일들이 들어있는 디렉토리
 3. **web** : jsp파일들이 들어있는 디렉토리. 프론트 작업과 관련된 파일들이 들어갈 예정
 
Branch 구분
---------------------------
개발을 진행하며 사용되는 브랜치 목록

1. **main** : 하나의 기능이 완성되거나 버그를 고칠 때 마다 해당 브랜치에 통합
2. **feature** : 기능 개발에 사용되는 브랜치
3. **hotfix** : 버그를 수정하는데 사용되는 브랜치
