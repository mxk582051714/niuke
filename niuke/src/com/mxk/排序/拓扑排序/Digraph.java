package com.mxk.排序.拓扑排序;
import java.util.*;
public class Digraph {

	private int [] nodes;
	
	private ArrayList<int []> edgeslist;
	private ArrayList<ArrayList<Integer>> fromadj;   //出度list
	private ArrayList<ArrayList<Integer>> toadj;   //出度list
	
	public Digraph(int [] nodes) {
		this.nodes=nodes;
		this.fromadj=new ArrayList<>(nodes.length);
		this.toadj=new ArrayList<>(nodes.length);
		this.edgeslist=new ArrayList<>();
		for(int i=0;i<nodes.length;i++) {
			ArrayList<Integer> list=new ArrayList<>();
			this.toadj.add(list);
		}
		for(int i=0;i<nodes.length;i++) {
			ArrayList<Integer> list=new ArrayList<>();
			this.fromadj.add(list);
		}
		
	}
	
	//添加边
	public void addEdge(int from,int to) {
		int [] edge= {from,to};
		fromadj.get(from).add(to);
		toadj.get(to).add(from);
		edgeslist.add(edge);
	}
	
	//获取邻接点
	public ArrayList<Integer> getfromAdj(int to){
		return fromadj.get(to);
	}
	public ArrayList<Integer> gettoAdj(int to){
		return toadj.get(to);
	}
	
	public int[] getNodes() {
		return nodes;
	}

	public ArrayList<int[]> getEdgeslist() {
		return edgeslist;
	}

//	public ArrayList<ArrayList<Integer>> getAdj() {
//		return adj;
//	}

	
}
