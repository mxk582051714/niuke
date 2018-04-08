package com.mxk.niuke1;

/*
*���ڶ������㷨���������ѡ�ʱ�临�Ӷ�ΪO(nlogk)
*����ÿ�������ʱ�临�Ӷ�ΪO(nlogn)��
*�����ð������ʱ�临�Ӷ�ΪO(n*k)
*/
import java.util.ArrayList;
import java.util.Arrays;

public class Test1_1 {
	
	
	public static void main(String []args) {
		Test1_1 test1=new Test1_1();
		int [] arr= {50,10,90,30,70,40,80,60,20};
		for(int j=arr.length/2-1;j>=0;j--){
			test1.adjustMaxHeapSort(arr,j,arr.length-1);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		// ���������������
		if (input == null || input.length <= 0 || input.length < k){
			return list;
		}
		// ��������
		for (int len = k / 2 - 1; len >= 0; len--) {
			adjustMaxHeapSort(input, len, k - 1);
		}
		// �ӵ�k��Ԫ�ؿ�ʼ�ֱ������ѵ����ֵ���Ƚϣ���������ֵС�����滻�������ѡ�
		// ���ն���ľ�����С��K������
		int tmp;
		for (int i = k; i < input.length; i++) {
			if (input[i] < input[0]) {
				tmp = input[0];
				input[0] = input[i];
				input[i] = tmp;
				adjustMaxHeapSort(input, 0, k - 1);
			}
		}
		for (int j = 0; j < k; j++) {
			list.add(input[j]);
		}
		return list;
	}
	// ��������
	public void adjustMaxHeapSort(int[] input, int pos, int length) {
		int temp;
		int child;
		for (temp = input[pos]; 2 * pos + 1 <= length; pos = child) {
			child = 2 * pos + 1;
			if (child < length && input[child] < input[child + 1]) {
				child++;
			}
			if (input[child] > temp) {
				input[pos] = input[child];
			} else {
				break;
			}
		}
		input[pos] = temp;
	}
}