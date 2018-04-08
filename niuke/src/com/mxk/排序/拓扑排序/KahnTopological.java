package com.mxk.排序.拓扑排序;
import java.util.*;

public class KahnTopological
{
	private List<Integer> result;   // 用来存储结果集
	private Queue<Integer> setOfZeroIndegree;  // 用来存储入度为0的顶点
	private int[] indegrees;     // 记录每个顶点当前的入度
	private int edges;           //边的数量
	private Digraph di;          //图
	
	
	public static void main(String[] args) {
		int [] nodes= {0,1,2,3,4,5,6,7,8,9,10,11,12};
		Digraph di=new Digraph(nodes);
		di.addEdge(0, 1);
		di.addEdge(0, 5);
		di.addEdge(0, 6);
		di.addEdge(2, 0);
		di.addEdge(2, 3);
		di.addEdge(3, 5);
		di.addEdge(5, 4);
		di.addEdge(6, 4);
		
		di.addEdge(8, 7);
		di.addEdge(7, 6);
		di.addEdge(6, 9);
		di.addEdge(9, 10);
		di.addEdge(9, 12);
		di.addEdge(9, 11);
		di.addEdge(11, 12);
		
		
		KahnTopological kt=new KahnTopological(di);
		for(Integer i:kt.result) {
			System.out.print(i+" ");
		}
	}
	
	
	public KahnTopological(Digraph di)
	{
		this.di = di;
		this.edges =di.getEdgeslist().size();
		this.indegrees = new int[di.getNodes().length];
		this.result = new ArrayList<Integer>();
		this.setOfZeroIndegree = new LinkedList<Integer>();
		
		// 对入度为0的集合进行初始化
		for(int node:di.getNodes()){
			ArrayList<Integer> adj=di.gettoAdj(node);
			indegrees[node]=adj.size();   
		}
		
		for(int i = 0; i < indegrees.length; i++)
		{
			if(0 == indegrees[i])
			{
				setOfZeroIndegree.offer(i);  
			}
		}
		process();
	}
	
	private void process()
	{
		while(!setOfZeroIndegree.isEmpty())   //入度为0的点的集合
		{
			int from = setOfZeroIndegree.poll();
			
			// 将当前顶点添加到结果集中
			result.add(from);
			
			for(Integer to :di.getfromAdj(from)) {
				edges--;
				indegrees[to]--;
				if(0 == indegrees[to])   // 如果入度为0，那么加入入度为0的集合
				{
					setOfZeroIndegree.offer(to);
				}
			}
		}
		// 如果此时图中还存在边，那么说明图中含有环路
		if(0 != edges)
		{
			throw new IllegalArgumentException("Has Cycle !");
		}
	}
	
}


