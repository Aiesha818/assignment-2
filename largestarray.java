class largestarray
{
public static void main(String args[])
{
int arr[]=new int[]{36,89,52,9,24};
int max=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
max=arr[i];
}
System.out.println("please enter the largest element of a given array:"+max);
}
}