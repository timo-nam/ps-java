# ⭐ 최소직사각형

* `PriorityQueue`도 `Queue` 인터페이스로 받을 수 있음

# ⭐⭐ 피로도

* ❗️ `DFS 완전탐색` 복습하기 좋은 문제
* ![코테-3](https://user-images.githubusercontent.com/76807762/179000543-c99054a7-5d77-440f-880b-bb96b1745c09.jpg)

# ⭐⭐ 전력망을 둘로 나누기

* ❗️ `BFS`가 더 편한 예시
* `Math.abs()`는 절댓값 함수
* Java는 언제나 `Call by Value`
  ```java
  public static void main(String[] args) {
      Integer i = 8;
      changeValue(i);
      System.out.println(i); // 8
  }

  static void changeValue(Integer i) {
      i = 2; // i = new Integer(2)
  }
  ```

# ⭐⭐ 모음 사전

* ❗️ 이걸 완전탐색으로 풀면 B급
* `string.indexOf(int ch)`, `string.indexOf(String str)`은 가장 처음 나타나는 인덱스를 반환 없으면 -1 반환

# ⭐ 카펫

* ❗️ 근의 공식으로 풀어야 A급
* `Math.sqrt()`가 루트, 반환타입은 `double`

# ⭐ 모의고사

* ❗️ 최고 점수를 구한 다음 최고 득점자를 가려야 함
