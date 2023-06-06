# HeyDoctor
비대면 사전 진료 서비스 - 'HeyDoctor'

<h1> 1. 기획 의도</h1> <br>
<p align="center">
  <img width="981" src="https://github.com/hey-docter/hey-Doctor/assets/129862445/2c81e0a3-493a-4fc2-8c53-27e668ba332e">
</p>
<p align="center">
  <img width="981" src="https://github.com/hey-docter/hey-Doctor/assets/129862445/2c07b55e-9bb5-42bd-8d32-4a5ffb646e71">
</p>

  지방 지역의 병원 접근성 문제를 해결하기 위해 의사와의 간단한 상담과 방문 예약 진료를 통해 병원에 가기 힘든 사람들의 니즈를 해결하기 위해 만들게 되었습니다.
  
<h1> 2. 기대 효과</h1> <br>
  오지에 있거나 거동이 불편한 환자 방문 진료 가능<br>
  온라인 문답 시 다양한 소견<br>
  신뢰도 있는 전문의 답변<br>
  휴일 등 방문 진료를 통한 수익 창출<br>
  질문 문답으로 인한 병원, 및 의사의 광고 효과<br>
  
<h1> 3. 프로젝트 사용 툴</h1> <br>
- Java<br>
- Java Script<br>
- tomcat<br>
- jQuery<br>
- MyBatis<br>
- SpringBoot<br>
- ORACLE<br>
- IntelliJ<br>
- DBeaver<br>
- git, github<br>
- JSON<br>
- Ajax<br>
- JDK 11.0.15<br>
- NAVER Mail API<br>
- NAVER Login API<br>
- KAKAO Login API<br>
  
<h1> 4. ERD</h1> <br>
  <img width="1080" src="https://github.com/hey-docter/hey-Doctor/assets/129862445/1654317d-9cc6-4e6b-8f3b-46783e188b3e">

<h1> 5. 담당 업무</h1> <br>
  5-1 퍼블리싱
  <img width="981" src="https://github.com/hey-docter/hey-Doctor/assets/129862445/17b47e74-4cf8-42e0-976c-9de285bf5206">
  
  ▶ 진료희망 글 목록<br>
  출장의사 예약 목록<br>
  상세보기<br>
  예약보기<br>
  
  5-2 백엔드<br>
  <img width="981" src="https://github.com/hey-docter/hey-Doctor/assets/129862445/ea490151-db3c-422c-a7c8-5b8f4fdee3c8">
  
  ▶ 회원가입(이용자, 주니어)<br>
  아이디, 이메일 중복 검사<br>
  아이디, 이메일, 이름, 휴대폰 입력 형식 검사<br>
  필수 정보 입력 여부 검사<br>
  조건 충족 시 회원가입
  
  ▶ 로그인(이용자, 주니어)<br>
  아이디, 비밀번호 DB 비교 로그인 기능 구현<br>
  로그아웃 기능 구현<br>
  
  ▶ 비밀번호 찾기<br>
  사용자가 입력한 이메일과 DB 비교<br>
  정보 일치할 경우 SMTP API 이용하여 비밀번호 변경 링크 발송<br>
  비밀번호 변경 구현
  
  ▶ 메인페이지<br>
  게시글 목록들 보여주기
  
<h1> 6. 느낀점</h1> <br>
6-1. 어려웠던 부분<br>
📌MVC 단계를 순차적으로 진행하는 것이 어려웠다.<br>
✔ 단계가 익숙하지 않아 mapper부터 controller까지 진행하는 것이 어려웠지만, 단계별로 완성될 때마다 단위 테스트 등을 통해 진행하여 순서를 익혔다.


6-2. 문제를 해결했던 부분<br>
📌로그인에서의 생각의 전환<br>
🌩문제 상황🌩<br>
네이버 간편로그인을 할 경우, 로그인 토큰을 인식하고 자동 로그인이 되는 과정에서 흰 화면(callback.html)이 1~2초가량 무조건 노출되었다.

🚨문제 원인🚨<br>
기능 구현에는 문제가 없었으나, 서버 구동 속도가 느릴 경우 callback.html 화면이 비춰지며 보이는 현상이었다.

🚀해결 방법🚀<br>
네이버 로그인 API 설명 페이지에서는 로그인 페이지에서 데이터 이동 시 post로 callback.html로 이동시킨 후 로그인 컨트롤러로 이동할 수 있도록 설명되어 있었다. 그러나 로그인.html에서 바로 데이터를 넘겨받아 메인으로 이동하도록 하였다. 따라서 페이지 이동이 한 번 줄어들어 해당 증상이 없어졌다. 아주 간단한 생각의 전환이었지만 기다리는 사용자의 입장에서 생각해본 해결방법이었다.


📌운전면허 API 로딩 사건<br>

🌩문제 상황🌩
스캔한 운전면허증을 첨부할 경우 구글 클라우드 비전 api를 사용하여 운전면허증 취득일자를 인식한다. 데이터를 받는 과정에서 7초~10초 정도 소요되었다.

🚨문제 원인🚨
ajax에서 데이터를 받아 처리하는 과정이 많다보니 문제가 발생하였다. 취득일자를 문자열로 받아 int 타입으로 바꾸고, 이를 날짜 계산하여 시스템 날짜와 비교하여 5년 단위 기준으로 나눈다. 이후 5년이 지나지 않았을 경우 초보자, 5년이 넘었을 경우 베테랑으로 회원 구분을 하기 때문에 처리 과정이 많아 최종적인 데이터가 산출될 때까지 적지 않은 시간이 소요되었다.

🚀해결 방법🚀
운전연수 사이트인만큼 운전면허증의 취득일자를 받는 것은 필수적이었기 때문에 해당 과정이 필요했다. 따라서 사용자가 로딩 과정을 인식할 수 있도록 처리 시작부터 마지막 순간까지 로딩중 화면을 띄워 화면에서 진행경과를 알 수 있도록 하였다.


📌유지되지 않는 코스

🌩문제 상황🌩
첫번째 페이지에서 선택한 항목(코스)이 두번째 페이지까지 이어지지 않아 최종 연수 신청이 되지 않았다.

🚨문제 원인🚨
운전연수 신청은 총 두페이지로 나뉜다. 페이지 이동 시 컨트롤러에서 선택값을 세션에 담았으나 페이지 이동 시 폼에서 제출되지 않았다.

🚀해결 방법🚀
컨트롤러에서 addFlashAttribute 사용하여 값을 받아온 뒤 두번째 페이지에서 타임리프를 사용하여 input value를 받을 수 있도록 했다.
5-4. 총평
🌟 기획: 꺼진 불도 다시 보자
개발에는 끝이 없다는 사실을 알게 되었다. 전부 완료했다고 생각하였으나, 끝이 없었다. 프론트엔드 작업 중에도 처리가 됐을 경우보다 처리가 되지 않았을 때, 올바르지 못한 경로로 접근했을 때 등을 가정하여 자바스크립트와 제이쿼리로 화면 처리를 해야했으며, 백엔드 작업에서는 세션이 담기지 않았을 때 회원만 이용할 수 있는 메뉴 등에서는 어떻게 처리해야할지, 카카오 회원가입이 되어있지 않은 상태에서 카카오 로그인을 누를 경우 등 하나하나 다 기획하여 작업해야한다는 것을 알게 되었다. 사용자가 올바른 경로로만 서비스를 이용한다고 생각하는 것이 아니라, 여러 상황을 가정하여 여러 버튼을 눌러보고 오류를 확인해야 한다는 것을 깨닫게 되었다.
🌟 협업: 소통은 해도해도 모자르다
팀원들과의 소통에는 자신있었다. 그러나 사이의 원만함과 빈도수와는 별개로 프로젝트 진행 시 나의 작업 상황 진행과 오류 발생 부분, 백업을 어디까지 했는지 등 상세하고 자세하게 공유해야 한다는 것을 알게 되었다. 예를 들어 프로젝트 작업 중 깃허브에서 충돌이 발생하여 브랜치 생성 시 이 내용까지 공유하지 않으면, 다른 팀원들의 코드에도 영향을 미칠 수 있으며, 이 사실을 모르는 팀원이 직접 해결하기까지는 적지 않은 시간이 소요된다는 것을 알게 되었다. 따라서 프로젝트 종료 후 팀원들과 프로젝트 리뷰 시간을 가지고 다음 프로젝트 때 부족했던 점과 보완할 점을 의견을 나누며 다음 프로젝트에서 건설적인 방향으로 나아갈 수 있도록 하였다.
🌟 미래: 내일이 궁금한 개발자!
이번 프로젝트에서는 막연히 상상만 하던 api를 직접 구현해보았다. 특히나, 글자를 인식하는 구글 클라우드 비전 api를 사용해본 것이 매우 신기하고 재밌었다. 물론 시작은 어려웠지만, 주변의 도움과 혼자만의 코드 연구를 통하여 기능을 구현할 수 있었다. 하나하나 완성될 때마다 뿌듯함을 느낄 수 있었다. 이후 다음 프로젝트를 기획하면서 내가 구현했던 기능 뿐만 아니라 다른 api도 사용해보고 싶다는 갈증이 생겼다. 예를 들어 게시글 네이버 공유하기 api를 진행해보고 싶다.
