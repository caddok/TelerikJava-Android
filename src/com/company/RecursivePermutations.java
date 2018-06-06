package com.company;

public class RecursivePermutations {
    public static void main(String[] args) {
        permute(new int[]{1, 2, 3, 4});
    }
    public static void permute(int[] arr){
        permuteHelper(arr, 0);
    }

    private static void permuteHelper(int[] arr, int index){
        if(index >= arr.length - 1){
            System.out.print("[");
            for(int i = 0; i < arr.length - 1; i++){
                System.out.print(arr[i] + ", ");
            }
            if(arr.length > 0)
                System.out.print(arr[arr.length - 1]);
            System.out.println("]");
            return;
        }

        for(int i = index; i < arr.length; i++){

            int trade = arr[index];
            arr[index] = arr[i];
            arr[i] = trade;

            permuteHelper(arr, index+1);

            trade = arr[index];
            arr[index] = arr[i];
            arr[i] = trade;
        }
    }
}
