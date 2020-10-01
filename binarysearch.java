import java.util.Scanner;
class binary
{
 int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r>=l) 
            { 
            int mid=l+(r-l)/2; 
  
           
            if (arr[mid]==x) 
                 {
                 return mid; 
                 }
             
            if(arr[mid]>x) 
                {
                return binarySearch(arr, l, mid - 1, x); 
                }
            
            if(arr[mid]<x)
             {
              return binarySearch(arr, mid + 1, r, x);
             }  
        } 
        
           
           return -1; 
          
  
}
 public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 int i,j,n;
 System.out.println("enter the value of n");
 n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the numbers");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("unsorted numbers are");
for(i=0;i<n;i++)
{
System.out.println(arr[i] );
}

for(i=0;i<n;i++)
{
for(j=0;j<n-1;j++)
{
if(arr[j]>arr[j+1])
{
int t;
t=arr[j];
arr[j]=arr[j+1];
arr[j+1]=t;
}
}
}
System.out.println("sorted numbers are");
for(i=0;i<n;i++)
{
System.out.println(arr[i] );
}

System.out.println("enter number to be searched:");
int x=sc.nextInt();
binary ob = new binary(); 
         
  int result = ob.binarySearch(arr, 0, n - 1, x); 
  if (result == -1) 
    System.out.println("number not present"); 
  else
    System.out.println("number found at index " + result); 
}

}