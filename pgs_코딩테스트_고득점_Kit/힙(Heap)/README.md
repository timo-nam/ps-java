# ⭐⭐ 더 맵게

* `java.util.PriorityQueue`가 `Heap` 자료구조
* 자바는 기본적으로 `Min Heap`
* `pQ.add(e)`로 데이터 추가
* `pQ.isEmpty()`로 데이터 유무 확인
* `pQ.peek()`은 루트노드 반환
* `pQ.poll()`은 `peek()` + 루트노드 삭제

# ⭐⭐⭐ 디스크 컨트롤러

* ❗️ 문제가 매우 까다롭다. 처음부터 다시 풀면 또 틀릴 가능성이 높다.
* `PriorityQueue` 생성자의 인수로 적절한 `Comparator`를 줘서 정렬 조건을 바꿀 수 있다.
* `원시타입[]`은 더 이상 원시타입이 아니다.
* `람다식`으로 Comparator를 정의하면 `코드가 문명화`된다.