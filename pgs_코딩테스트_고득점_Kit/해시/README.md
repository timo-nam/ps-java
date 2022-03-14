# ⭐⭐ 완주하지 못한 선수

* `java.util.HashMap`은 thread-`unsafe` 자료구조
* `java.util.Hashtable`은 thread-`safe` 자료구조
* `java.util.Map`은 `interface`
* `map.containsKey(key)`로 데이터 유무 확인
* `map.put(key, value)`로 데이터 추가
* `map.get(key)`로 데이터 조회
* `map.remove(key)`로 데이터 삭제
* `map.getOrDefault(key, defaultValue)` 용례 (아래 두 for 블록은 같은 로직)
  ```java
  for (String c : completion) {
    if (map.containsKey(c)) {
      map.put(c, map.get(c) + 1);
    } else {
      map.put(c, 1);
    }
  }

  for (String c : completion) {
    map.put(c, map.getOrDefault(c, 0) + 1);
  }
  ```

# ⭐⭐ 전화번호 목록

* `java.util.Set`은 `interface`
* `java.util.HashSet`은 구현체
* `set.contains(e)`로 데이터 유무 확인
* `set.add(e)`로 데이터 추가
* `set.remove(e)`로 데이터 삭제

# ⭐⭐ 위장

* `java.util.Map.Entry`
* `map.entrySet()`이 `Set<Map.Entry<K,V>>`를 반환
  ```java
  for (Map.Entry<String, Integer> e : map.entrySet()) {
    answer *= e.getValue() + 1;
  }
  ```
* `entry.getKey()`로 key 조회
* `entry.getValue()`로 value 조회