package com.mxk.niuke1;

import java.util.Arrays;

public class Guibing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = { 9,4,2,7,12,5};
		 System.out.println("ԭ���飺"+Arrays.toString(a));
		 mergeSort(a, 0, a.length-1);
		 System.out.println("��������"+Arrays.toString(a));
	}

	public static void mergeSort(int[] a, int low, int high) {
		// �鲢�����������
		int mid = low + (high - low) / 2;
		if (low < high) { // ֻ�е���λlowС�ڸ�λhighʱ����˵��������ɲ��
			// ��ֳɵ���벿��
			mergeSort(a, low, mid); // ������ɵ���������
			// ��ֳɵ��Ұ벿��
			mergeSort(a, mid + 1, high);
			// ����ֺõ����������򲢺ϲ�
			merge(a, low, mid, high);
			System.out.println(Arrays.toString(a));
		}
	}

	// low���ڱ�ʶ��ָ�루������������Сֵ����mid���ڱ�ʶ��ָ�루�Ұ����������Сֵ����high�����ƶ�
	public static void merge(int[] a, int low, int mid, int high) {
		// �½���������
		int[] temp = new int[high - low + 1];
		int i = low; // ��ָ��
		int j = mid + 1; // ��ָ��
		int k = 0; // temp��������

		while (i <= mid && j <= high) { // �Ƚ�����ָ�룬��Ӧ�Ĵ�С****
			if (a[i] < a[j]) {
				temp[k] = a[i]; // ��ֵ��ָ�뿪ʼ�ƶ�
				k++;
				i++;
			} else {
				temp[k] = a[j];
				k++;
				j++;
			}
		}

		// ���������ʣ�ಿ�ָ�ֵ
		while (i <= mid) {
			temp[k] = a[i];
			k++;
			i++;
		}

		// ���Ұ�����ʣ�ಿ�ָ�ֵ
		while (j <= high) {
			temp[k] = a[j];
			k++;
			j++;
		}
		
		//��temp����������a����
		for(int m=0;m<temp.length;m++) {
			a[m+low]=temp[m];
		}
		

	}

}
