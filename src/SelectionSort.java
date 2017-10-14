import java.util.Scanner;

public class SelectionSort {
	public static void SelectionSort(){
		int[] array1 = {5,2,1,6,87,3,8};
		int min = array1[0];
		int i,j;
		for ( i =0; i < array1.length;i++){
			min = i;
			for (j = i+1; j < array1.length; j++){
				if (array1[j] < array1[min]){
					min = j;
				}
			}
			if(min != i){
				swapper(i,min,array1);
			}
		}
		System.out.print(array1[0]+ " ");
		System.out.print(array1[2]+ " ");
		System.out.print(array1[3]+ " ");
		System.out.print(array1[4]+ " ");
		System.out.print(array1[5]+ " ");
		System.out.print(array1[6]+ " ");
	}
	
	public static void swapper(int x, int y, int[] arr){
		int temp;
		temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		SelectionSort();
	}
}
