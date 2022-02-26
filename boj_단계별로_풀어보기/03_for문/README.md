# ⭐ 15552. 빠른 A+B

* `StringBuilder`를 사용하면 출력을 조금 더 빨리할 수 있음
* `String`을 `+`로 묶는 거보다 `StringBuilder`의 `append()`를 사용하면 빠름
* `stringBuilder.append(number + "\n")`보다 `stringBuilder.append(number); stringBuilder.append("\n");`가 빠름
* `stringBuilder.append('\n')`보다 `stringBuilder.append("\n")`가 빠름

# ⭐ 2439. 별 찍기 - 2

* `stringBuilder.deleteCharAt(int index)`와 `stringBuilder.delete(index, index + 1)`은 같음
* `stringBuilder.length()`는 길이를 반환

# ⭐ 10871. X보다 작은 수

* 출력량이 적을 땐 `BufferedWriter` 보다 `StringBuilder` + `System.out.println()` 조합이 더 빠를 수 있음