# 프론트엔드 구현 사항
- 이미지 클릭하면 /click POST, /leaderboard GET 요청, Ajax로 구현해서 페이지 새로고침 X
- 로그인 누르면 /login POST, 회원가입 누르면 /register POST 요청

# 백엔드 구현 사항
### /click POST : 소프트웨어학부 클릭수 +1
  1. ClickController에서 LeaderboardService.addClick() 호출
  2. LeaderboardService에서 data1의 click을 1 증가 (나중에 다른 Service로 메서드 옮기는게 나을듯)
### /leaderboard GET : 데이터 조회
  1. LeaderboardController에서 LeaderboardService.getSampleData() 호출
  2. LeaderboardService에서 data1, data2를 리스트에 담아서 반환
  3. 위에서 반환된 리스트를 LeaderboardController가 받아서 JSON으로 변환 후 클라이언트에게 전송
