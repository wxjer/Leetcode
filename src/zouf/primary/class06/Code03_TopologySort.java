package zouf.primary.class06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code03_TopologySort {

	// directed graph and no loop
	public static List<Node> sortedTopology(Graph graph) {
		//key :某个node
		//value :剩余的入度
		HashMap<Node, Integer> inMap = new HashMap<>();
		//入度为0的入队列
		Queue<Node> zeroInQueue = new LinkedList<>();
		for (Node node : graph.nodes.values()) {
			inMap.put(node, node.in);
			if (node.in == 0) {
				zeroInQueue.add(node);
			}
		}
		//拓扑排序的结果，依次加入
		List<Node> result = new ArrayList<>();
		while (!zeroInQueue.isEmpty()) {
			Node cur = zeroInQueue.poll();
			result.add(cur);//为0的加入result
			for (Node next : cur.nexts) {
				inMap.put(next, inMap.get(next) - 1);//每减少一个出度，将对应节点的入度减一
				if (inMap.get(next) == 0) {//同时检查这个节点是否入度为0
					zeroInQueue.add(next);
				}
			}
		}
		return result;
	}
}
