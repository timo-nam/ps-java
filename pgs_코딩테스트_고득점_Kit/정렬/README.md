# ⭐⭐ K번째수

* `Arrays.copyOf(타입[] original, int newLength)`로 배열 깊은복사
* `Arrays.sort(Object[] a, int fromIndex, int toIndex)`로 구간 정렬

# ⭐⭐⭐ 가장 큰 수

* ❗️ 입력의 `numbers[]`의 원소가 모두 `0`인 경우를 고려
* `Arrays.sort(T[] a, Comparator<? super T> c)` 용례
* `java.util.Comparator` 인터페이스 필요
* `Comparator`은 원시타입 배열에는 사용 불가
  ```java
  Arrays.sort(Integer[] ary, new Comparator<Integer>() {
    @Override
    public int compare(Integer i1, Integer i2) {
      return i1 - i2;
    }
  });
  ```
* `i1`이 앞, `i2`가 뒤
* `compare()`의 반환값은 선후관계만 정의, 그걸 갖고 어떻게 정렬하는 건 알고리즘의 역할
* 반환값이 `양수`: i1이 i2보다 먼저
* 반환값이 `0`: i1과 i2는 같은 순서
* 반환값이 `음수`: i1이 i2보다 나중
* 위와 아래의 `compare()`은 같은 기능을 수행
  ```java
  public int compare(Integer i1, Integer i2) {
    if (i1 > i2) {
      return 999;
    } else if (i1 == i2) {
      return 0; 
    } else { // i1 < i2
      return -999
    }
  }
  ```
* `string.compareTo(another)`에서
  | 사전순서 | 반환값 |
  | ---- | --- |
  | `string` < `another` | 음수 |
  | `string` == `another` | 0 |
  | `string` > `another` | 양수 |
* `stringBuilder.charAt(int index)`는 'index + 1'번째 `char`를 반환

# ⭐⭐ H-Index

* ❗️ 가능한 최댓값, 경계에 있는 수, 극단적인 테스트 케이스를 고려하는 수학적인 부분이 중요
