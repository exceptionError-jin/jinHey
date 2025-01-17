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
  
  ▶ 일반 회원가입<br>
  이메일 중복검사<br>
  이메일 인증 API<br>
  이름 이메일 비밀번호 등 입력 형식 검사<br>
  필수 정보 입력 여부 검사<br>
  필수체크 여부 검사<br>
  조건 충족 시 회원가입<br>
  
  ▶ 소셜 회원가입(네이버, 카카오)<br>
  카카오, 네이버, 일반 이메일비교 후 동일 이메일 가입 불가<br>
  조건 충족 시 회원가입<br>
  
  ▶ 로그인<br>
  아이디, 비밀번호 DB비교 로그인 기능 구현<br>
  로그아웃 기능 구현<br>
 
  
<h1> 6. 느낀점</h1> <br>
6-1. 어려웠던 부분<br>
📌MVC 단계를 순차적으로 진행하는 것이 어려웠습니다.<br>
✔ 아직 경험이 부족하여 mapper부터 controller까지의 진행이 어려웠지만, 단계별로 완성될 때마다 단위 테스트를 통해 순서를 익혀나갔습니다.<br>
단위 테스트를 통해 작은 단계의 완성을 경험하며 전체적인 개발 과정을 파악하는 데에 큰 도움이 되었습니다.<br>

6-2. 문제를 해결했던 부분<br>
📌소셜 로그인 API<br>
🌩문제 상황🌩<br>
네이버 로그인을 구현하던 도중 회원가입시 오류가 발생하는 문제를 마주쳤습니다.<br>

🚨문제 원인🚨<br>
문제의 원인은 mapper쪽에서 jdbcType을 지정하지 않다보니 문제가 생겼던 것입니다.<br>

🚀해결 방법🚀<br>
문제를 해결하기 위해 회원가입 부분의 mapper에서 jdbcType을 명시하고 실행하였더니 값이 정상적으로 입력되었습니다.<br>
이 문제를 해결하기 위해 IntelliJ에서 제공하는 콘솔 에러를 열심히 찾아보았습니다.<br>
콘솔 에러를 통해 문제가 발생한 부분을 확인하고 해결할 수 있었습니다. 또한, 다른 문제가 발생할 경우에도 콘솔 에러를 확인하여 어느 부분에서 문제가 발생했는지 쉽게 파악할 수 있었습니다.<br>
이러한 경험을 통해 개발 과정에서 문제를 해결하는 능력을 키웠으며, 이를 통해 향후 프로젝트에서 발생할 수 있는 다양한 상황에 대처할 수 있는 방법을 알게 되었습니다.<br>

5-4. 총평<br>
🌟 기획: 기획의 중요성을 깨닫고 성장하기<br>
이번 프로젝트에서는 이전보다 훨씬 세부적으로 기획을 진행하고 DB를 만들어 기획 수정이 거의 없을 것으로 예상했습니다. 그러나 테이블과 기획이 프로젝트 도중에 조금씩 수정되는 것을 보면서 여전히 많이 부족하다는 것을 깨달았습니다. 이를 통해 기획에 대한 중요성을 다시 한 번 깨닫게 되었고, 앞으로는 기획 단계에 더 많은 시간과 노력을 투자해야겠다고 생각합니다. 명확하고 체계적인 기획을 통해 프로젝트를 효율적으로 진행하고, 변경이나 수정 없이 완성도 높은 결과물을 만들고자 합니다. 다음 프로젝트에서는 더욱 발전된 기획 능력을 발휘하고, 팀원들과의 협업을 통해 더 나은 결과를 이끌어내고 싶습니다. 이번 경험을 통해 기획에 대한 중요성과 필요성을 깊이 인식하게 되었으며, 앞으로의 프로젝트에서는 기획에 더 많은 신경을 쓰고자 합니다.<br>

🌟 협업: 원활한 소통으로 팀 성과 향상시키기<br>
이번 프로젝트에서는 협업 과정에서 메신저를 주로 사용하여 소통하였습니다. 그러나 정보 전달이 미흡한 경우가 있었고, 이로 인해 일부 업무의 지연이 발생했습니다. 이를 반성하며 앞으로는 메신저를 효과적으로 활용하면서 소통에 더욱 신경을 써야겠다고 느꼈습니다. 개발자로서의 핵심 역량은 소통 능력이라고 생각하며, 이번 경험을 통해 소통 능력을 더욱 향상시키고자 합니다. 효율적인 소통을 통해 팀원들과의 원활한 협업을 실현하고, 팀의 성과를 더욱 높일 수 있도록 노력하며, 피드백을 주고받는 과정에서 상호간에 존중과 이해를 가지며 협업에 임하는 개발자가 될 것입니다.<br>

🌟 미래: 지속적인 성장과 다양한 경험 쌓기<br>
이번 프로젝트에서는 소셜 로그인 API를 사용하면서 많은 것을 배웠습니다. 초기에는 소셜 로그인 구현이 어려울 것으로 예상했지만, 노력을 통해 스스로 해결해낼 수 있었습니다. 이제는 다른 도전에도 자신감을 가지고 임할 수 있습니다. 앞으로의 프로젝트에서는 로그인 이외에도 다양한 경험을 통해 빠르게 성장하고, 지속적인 학습과 발전을 추구하며 개발자로서의 능력을 더욱 향상시키고 싶습니다. 새로운 기술을 습득하고, 혁신적인 아이디어를 통해 프로젝트에 가치를 더할 수 있도록 노력하며, 지속적인 성장과 발전을 위해 항상 새로운 도전을 감행하는 개발자가 되고싶습니다.
