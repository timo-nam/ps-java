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

# ⭐⭐ 이중우선순위큐

* `java.util.Deque`은 인터페이스
* `Deque`의 구현체로 `LinkedList`를 쓸 수 있음
* `deque.offerFirst(e)` & `deque.offerLast(e)`로 데이터 추가
* `deque.peekFirst()` & `deque.peekLast()`로 데이터 조회
* `deque.pollFirst()` & `deque.pollLast()`로 데이터 조회 + 삭제
* 문제가 생기면 예외를 일으키는 대신 `deque`의 `offer` 계열은 false를, `peek`이랑 `poll` 계열은 null을 반환
* `list.sort(Comparator.naturalOrder())`로 오름차순 정렬
* `java.util.TreeMap`은 트리로 구현한 `순서가 있는` 맵
* PriorityQueue와 유사하게 기본적으로 `first에서 last 방향으로 오름차순`
* `treeMap.firstKey()` & `treeMap.lastKey()`로 키 조회
* `treeMap.firstEntry()` & `treeMap.lastEntry()`로 엔트리 조회
* `treeMap.pollFirstEntry()` & `treeMap.pollLastKey()`로 엔트리 조회 + 삭제