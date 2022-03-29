# ⭐⭐ 기능개발

* `java.util.Queue`은 인터페이스
* `Queue`의 구현체로 `LinkedList`를 쓸 수 있음
* `queue.offer(e)`로 데이터 추가
* `queue.peek()`로 데이터 조회
* `queue.poll()`로 데이터 조회 + 삭제
* 문제가 생기면 예외를 일으키는 대신 `queue`의 `offer` 계열은 false를, `peek`이랑 `poll` 계열은 null을 반환
* `Math.ceil()`은 매개변수도 반환값도 `double`
* `Math.floor()`도 마찬가지

# ⭐ 다리를 지나는 트럭

* ❗️ 최적이 아닌 거 같아도 최선의 방법일 때가 있음
* `Queue`도 `for-each문`과 사용할 수 있음