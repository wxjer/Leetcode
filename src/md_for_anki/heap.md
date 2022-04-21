# zouf1
## 堆结构

1，堆结构就是用数组实现的完全二叉树结构 
2，完全二叉树中如果每棵子树的最大值都在顶部就是大根堆 
3，完全二叉树中如果每棵子树的最小值都在顶部就是小根堆 
4，堆结构的heapInsert与heapify操作 
5，堆结构的增大和减少
6，优先级队列结构，就是堆结构

将堆用数组的顺序来排列，从0出发连续的一段，
i位置的：左节点：2\*i+1，右节点 2\*1 +2，父节点（i-1)/2

## 大根堆
每个子树最大值都是根节点

## 小根堆
同大根堆

## 构建大根堆

利用一个连续的数组来表示堆
每次加入节点，将其与父节点(i-1)/2比较

heapinsert
```java
	public static void heapInsert(int[] arr, int index) {
		while (arr[index] > arr[(index - 1) / 2]) {
			swap(arr, index, (index - 1) /2);
			index = (index - 1)/2 ;
		}
	}
``` 

## 大根堆最大值
index = 0

## 去掉大根堆最大值并保持大根堆（heapify）
```java
	public static void heapify(int[] arr, int index, int size) {
		int left = index * 2 + 1;
		while (left < size) {
			int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
			largest = arr[largest] > arr[index] ? largest : index;
			if (largest == index) {
				break;
			}
			swap(arr, largest, index);
			index = largest;
			left = index * 2 + 1;
		}
	}
```


## 完全二叉树

若设二叉树的深度为h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数，第 h 层所有的结点都连续集中在最左边，这就是完全二叉树（从左到右节点是满的，没有断开）
  A  
B
    
  A

