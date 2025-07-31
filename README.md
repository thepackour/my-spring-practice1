# 20250731
## 백엔드 구현 사항
- 회원가입
  - 예외 처리 X
  - 검증 X
  - DB에 저장하는거만 구현
- localhost:8080/userlist 에서 DB에 저장된 내용 확인 가능

## TODO
- 도메인, DB 설계
  - 학과 별 클릭 수 추가
  - 그에 따라 기존 도메인 수정
- 회원가입 서비스 로직
  - 아이디, 비번 검증
  - 비번 해시
  - ...
- 로그인
  - 세션 기반?
  - 로그인된 사람만 클릭 가능하게
- 프론트엔드
  - 클릭하면 푸앙이 이미지 변경 (구현했던 분 파일 가져오면 될듯)
  - 그 이외에 뭔가 있어보이는거
- 기타
  - 예외 처리
  - 회원가입 성공 페이지로 리다이렉트
  - 통합할 DB 찾기
  - 공개 방안 (로컬 X, 외부에서 접속할 수 있게)

# 20250728
## 프론트엔드 구현 사항
- 이미지 클릭하면 /click POST, /leaderboard GET 요청, Ajax로 구현해서 페이지 새로고침 X
- 로그인 누르면 /login POST, 회원가입 누르면 /register POST 요청

## 백엔드 구현 사항
### /click POST : 소프트웨어학부 클릭수 +1
  1. ClickController에서 LeaderboardService.addClick() 호출
  2. LeaderboardService에서 data1의 click을 1 증가 (나중에 다른 Service로 메서드 옮기는게 나을듯)
### /leaderboard GET : 데이터 조회
  1. LeaderboardController에서 LeaderboardService.getSampleData() 호출
  2. LeaderboardService에서 data1, data2를 리스트에 담아서 반환
  3. 위에서 반환된 리스트를 LeaderboardController가 받아서 JSON으로 변환 후 클라이언트에게 전송
