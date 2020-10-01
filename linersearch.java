import java.util.*;
class LinearSearch
{
public static int LinearSearch(int array[],int k,,int search)
{
 int i=0;
for(i=0;i<k;i++)
{
if(array[i]==search)
{
 //Here program searches for the required data if the data is found then it
returns the place of data in the array otherwise it returns -1 which means not
found.
 return i;
}
}
return -1;
}
public static void main(String [] args)
{
 Scanner in=new Scanner(System.in);
System.out.println(“Enter the number of elements you want to have in
array”);
int k=in.nextInt();
int array[]=new int[k];
System.out.println(“Enter the elements”);
int i;
for(i=0;i<k;i++)
{ //Getting data from
user
array[i]=in.nextInt();
}
System.out.println(“Enter the element that you want to search in array”);
int search=in.nextInt();
// passing array ,integer k,and integer search
int place =LinearSearch(array,k,search);
System.out.println(“Data is present at place”+place);
}
}