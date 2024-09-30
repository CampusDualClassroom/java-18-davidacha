package com.campusdual.classroom;

public class Exercise18 {

	public static void main(String[] args) {

	}

	public static int[] createAndInitializeArray(int num){
		int[] a=new int[num];
		for(int i=0;i<num;i++){
			a[i]=i+1;
		}
		return a;
	}

	public static void showInlineArray(int[] a){
		int contador=a.length;
		for(int i:a){
			contador--;
			System.out.print(i);
			if(contador!=0){
				System.out.print(" ");
			}
		}
	}

}
