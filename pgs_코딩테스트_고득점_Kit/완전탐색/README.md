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
