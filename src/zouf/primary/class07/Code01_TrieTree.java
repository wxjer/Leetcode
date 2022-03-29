package class07;

public class Code01_TrieTree {

	public static class TrieNode {
		public int path;
		public int end;
		public TrieNode[] nexts;

		public TrieNode() {
			path = 0;
			end = 0;
			nexts = new TrieNode[26];//26个字母  如果字符种类太多，可以用哈希表hashMap<Char,Node> 如果需要有序则TreeMap<Char,Node>
		}
	}

	public static class Trie {
		private TrieNode root;

		public Trie() {
			root = new TrieNode();
		}

		public void insert(String word) {
			if (word == null) {
				return;
			}
			char[] chs = word.toCharArray();
			TrieNode node = root;
			int index = 0;
			for (int i = 0; i < chs.length; i++) {//从左往右遍历字符
				index = chs[i] - 'a';
				if (node.nexts[index] == null) { //如果这个node下级没路则创建
					node.nexts[index] = new TrieNode();//根据字符决定路径
				}
				node = node.nexts[index];
				node.path++;//每路过一次path++
			}
			node.end++;//如果以该字母结束则end++
		}

		//删除
		public void delete(String word) {
			if (search(word) != 0) {//先确定是否已加入这个word
				char[] chs = word.toCharArray();
				TrieNode node = root;
				int index = 0;
				for (int i = 0; i < chs.length; i++) {
					index = chs[i] - 'a';
					if (--node.nexts[index].path == 0) {//遍历--path，
						node.nexts[index] = null; // 如果path 减成0了，意味着后续的路也没用了
						return;
					}
					node = node.nexts[index];
				}
				node.end--;//最后的字母end--
			}
		}

		//查询word加入过几次
		public int search(String word) {
			if (word == null) {
				return 0;
			}
			char[] chs = word.toCharArray();
			TrieNode node = root;
			int index = 0;
			for (int i = 0; i < chs.length; i++) {
				index = chs[i] - 'a';
				if (node.nexts[index] == null) {//如果node结束但是word还没结束 说明没加入过 直接return 0
					return 0;
				}
				node = node.nexts[index];
			}
			return node.end;
		}

		//所有加入的字符串中，有多少以pre开头
		public int prefixNumber(String pre) {
			if (pre == null) {
				return 0;
			}
			char[] chs = pre.toCharArray();
			TrieNode node = root;
			int index = 0;
			for (int i = 0; i < chs.length; i++) {
				index = chs[i] - 'a';
				if (node.nexts[index] == null) {
					return 0;
				}
				node = node.nexts[index];
			}
			return node.path;
		}
	}

	public static void main(String[] args) {
		Trie trie = new Trie();
		System.out.println(trie.search("zuo"));
		trie.insert("zuo");
		System.out.println(trie.search("zuo"));
		trie.delete("zuo");
		System.out.println(trie.search("zuo"));
		trie.insert("zuo");
		trie.insert("zuo");
		trie.delete("zuo");
		System.out.println(trie.search("zuo"));
		trie.delete("zuo");
		System.out.println(trie.search("zuo"));
		trie.insert("zuoa");
		trie.insert("zuoac");
		trie.insert("zuoab");
		trie.insert("zuoad");
		trie.delete("zuoa");
		System.out.println(trie.search("zuoa"));
		System.out.println(trie.prefixNumber("zuo"));

	}

}
