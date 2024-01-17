import java.util.*;
class Even
{
  public static void main(String arg[])
  {
    int i,sum=0,size;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter limit");
    size=sc.nextInt();
    int a[]=new int[size];
    System.out.println("enter number:");
    for(i=0;i<size;i++)
    {
      a[i]=sc.nextInt();
    }
    for(i=0;i<size;i++)
    {
    if(a[i]%2==0)
    {
      sum=sum+a[i];
    }
    }
    System.out.println("sum of even no="+sum);
  }
}