package arrays;

//Problem 1: Find the Maximum and Minimum in an Array
//Write a Java program to find the maximum and minimum elements in an array.

public class ArrayMaxMin {
    public static void main(String[]args){
        int[] arr = {3, 5, 1, 8, 2, 9};
        int max = arr[0];
        int min = arr[0];

        for(int num : arr){
            if(num > max){
                max = num;  // 9 > 8   max = 9
            }
            if(num < min){  // 9 < 1   min = 1
                min = num;
            }
        }
        System.out.println("Maximum value : " + max);
        System.out.println("Minimum value : " + min);
    }

}
