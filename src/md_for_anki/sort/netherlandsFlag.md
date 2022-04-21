# zouf1
## 荷兰国旗

```java
	public static void main(String[] args) {
		int[] test = generateArray();

		printArray(test);
		int[] res = partition(test, 0, test.length - 1, 1);
		printArray(test);
		System.out.println(res[0]);
		System.out.println(res[1]);

	}

	public static int[] partition(int[] arr, int l, int r, int p) {
		int less = l - 1;
		int more = r + 1;
		while (l < more) {
			if (arr[l] < p) {
				swap(arr, ++less, l++);
			} else if (arr[l] > p) {
				swap(arr, --more, l);
			} else {
				l++;
			}
		}
		return new int[] { less + 1, more - 1 };
	}
```