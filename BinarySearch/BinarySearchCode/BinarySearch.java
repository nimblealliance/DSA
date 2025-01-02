package com.rahul.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {

        int [] arr = {10,14,15,84,94,132,6565,55555};
        int [] arr2 = {55555,6565,132,94,84,15,14,10};
        System.out.println(binarySearchAsc(arr,55555));
        System.out.println(binarySearchDesc(arr2,55555));
        System.out.println(orderAgnosticBinarySearch(arr,55555));
        System.out.println(orderAgnosticBinarySearch(arr2,55555));
    }

    public static int binarySearchAsc(int [] arr , int target){
        int start=0;
        int end = arr.length-1;

        while (start<=end){

            int mid = (end + start)/2;

            if (target<arr[mid]){
                end = mid -1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearchDesc(int [] arr , int target){
        int start=0;
        int end = arr.length-1;

        while (start<=end){

            int mid = (end + start)/2;

            if (target>arr[mid]){
                end = mid -1;
            }
            else if (target<arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }


    public static int orderAgnosticBinarySearch(int [] arr , int target){
        int start=0;
        int end = arr.length-1;


        while (start<=end){

            int mid = (end + start)/2;

            if (arr[start]<arr[end]){
                if (target<arr[mid]){
                    end = mid -1;
                }
                else if (target>arr[mid]){
                    start=mid+1;
                }
                else {
                    return mid;
                }

            }
            else {
                if (target>arr[mid]){
                    end = mid -1;
                }
                else if (target<arr[mid]){
                    start=mid+1;
                }
                else {
                    return mid;
                }

            }

        }
        return -1;
    }
}
