# zouf1
## 快排1.0

【1，2，3，4，5】
首先将数组划分为 <= num,>num的两块区域
然后将num与>区第一个数进行交换，这样保证num所在的位置也就是排完序的位置
然后用第一步递归处理剩下的小于区和大于区。

## 快排2.0

利用荷兰国旗方法，将数组划分为 <num, =num,>num 三个区域，
然后将num与=区第一个数交换，
然后依次递归处理<区，=区
比1.0优势在于第一步会顺便提前处理好=区

## 快排3.0

解决取数组最后一个值的时候偏差过大，从而采用随即法取一个数作为num用来比较
随机概率可使时间复杂度为nlogn

```java
	public static void quickSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		quickSort(arr, 0, arr.length - 1);
	}

	public static void quickSort(int[] arr, int l, int r) {
		if (l < r) {
			swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
			int[] p = partition(arr, l, r);
			quickSort(arr, l, p[0] - 1);
			quickSort(arr, p[1] + 1, r);
		}
	}

	public static int[] partition(int[] arr, int l, int r) {
		int less = l - 1;
		int more = r;
		while (l < more) {
			if (arr[l] < arr[r]) {
				swap(arr, ++less, l++);
			} else if (arr[l] > arr[r]) {
				swap(arr, --more, l);
			} else {
				l++;
			}
		}
		swap(arr, more, r);
		return new int[] { less + 1, more };
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
```