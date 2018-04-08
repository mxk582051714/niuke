package com.mxk.����.��������;
import java.util.*;

public class KahnTopological
{
	private List<Integer> result;   // �����洢�����
	private Queue<Integer> setOfZeroIndegree;  // �����洢���Ϊ0�Ķ���
	private int[] indegrees;     // ��¼ÿ�����㵱ǰ�����
	private int edges;           //�ߵ�����
	private Digraph di;          //ͼ
	
	
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
		
		// �����Ϊ0�ļ��Ͻ��г�ʼ��
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
		while(!setOfZeroIndegree.isEmpty())   //���Ϊ0�ĵ�ļ���
		{
			int from = setOfZeroIndegree.poll();
			
			// ����ǰ������ӵ��������
			result.add(from);
			
			for(Integer to :di.getfromAdj(from)) {
				edges--;
				indegrees[to]--;
				if(0 == indegrees[to])   // ������Ϊ0����ô�������Ϊ0�ļ���
				{
					setOfZeroIndegree.offer(to);
				}
			}
		}
		// �����ʱͼ�л����ڱߣ���ô˵��ͼ�к��л�·
		if(0 != edges)
		{
			throw new IllegalArgumentException("Has Cycle !");
		}
	}
	
}


