package com.heap;


public class Heap {
    public static void heapify(int[] A, int i, int size)
    {
        int largest=i;
        int L=2*i+1;
        int R=2*i+2;
        if(L<size&&A[L]>A[largest])
        largest=L;
        if(R<size&&A[R]>A[largest])
        largest=R;
        if(largest!=i)
        {
            int temp=A[i];
            A[i]=A[largest];
            A[largest]=temp;
            heapify(A,largest,size);
        }
    }
    public static void buildHeap(int[] A, int size)
    {
        for(int i=(size/2-1);i>=0;i--)
        {
            heapify(A,i,size);
        }
    }
    public static void heapSort(int[] A, int size)
    {
        for(int n=size-1; n>0; n--)
        {
            int max=A[0];
            A[0]=A[n];
            A[n]=max;
            heapify(A,0,n);
        }
    }
    public static void main(String[] args) {
        int[] arr =new int[]{1,2,3,4,6,8,9};
        buildHeap(arr,arr.length);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        heapSort(arr, arr.length);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
