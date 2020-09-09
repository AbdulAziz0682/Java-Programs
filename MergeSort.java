/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author TARUN VERMA
 */
public class MergeSort {
    int[] array;
    int[] tempMergeArr;
    int length;
    
    public static void main(String []arg)
    {
        int[] inputArr={48,36,13,52,19,94,21};
        System.out.print("Array before sort:-");
    for(int i:inputArr)
        {
            System.out.print(i+" ");
        }
        MergeSort ms=new MergeSort();
        ms.sort(inputArr);
        System.out.print("\nArray after sort:-");
        for(int i:inputArr)
        {
            System.out.print(i+" ");
        }
                
    }
    public void sort(int inputArr[])
    {
        this.array=inputArr;
        this.length=inputArr.length;
        this.tempMergeArr=new int[length];
        divideArray(0,length-1);
    }
    public void divideArray(int lowerindex,int higherindex)
    {
        if(lowerindex < higherindex)
        {
            int middle=lowerindex+(higherindex-lowerindex)/2;
            // it will sort the left side of an array
            divideArray(lowerindex,middle);
            // it will sort the right side of an array
            divideArray(middle+1,higherindex);
            mergeArray(lowerindex,middle,higherindex);
        }
    }
    public void mergeArray(int lowerindex,int middle,int higherindex)
    {
        for(int i=lowerindex;i<=higherindex;i++)
        {
            tempMergeArr[i]=array[i];
            
        }
        int i=lowerindex;
        int j=middle+1;
        int k=lowerindex;
        while(i<=middle && j<=higherindex)
        {
            if(tempMergeArr[i]<=tempMergeArr[j])
            {
                array[k]=tempMergeArr[j];
                i++;
            }
            else
            {
                array[k]=tempMergeArr[j];
                j++;
            }
            k++;
        }
        while(i<=middle)
        {
            array[k]=tempMergeArr[i];
            k++;
            i++;
        }
    }
}
