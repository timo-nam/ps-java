# ⭐⭐ K번째수

* `Arrays.copyOf(원시타입[] original, int newLength)`로 배열 깊은복사
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
* `i1`이 앞, `i2`가 뒤 `compare()`의 반환값이 `양수`면 자리를 바꿈
* 위와 아래의 `compare()`은 같은 기능을 수행
  ```java
  public int compare(Integer i1, Integer i2) {
    if (i1 > i2) {
      return 999;
    } else {
      return -999; // return 0; 
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