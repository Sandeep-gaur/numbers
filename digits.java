import java.util.*;
public class minimum 
{
public static void main(String ar[])throws Exception
{
    int x,y,k;
    int p[]=new int[100];
Scanner sc=new Scanner(System.in);
minimum m1=new minimum();
String a=new String();
a=sc.next();
k=sc.nextInt();
int n=Integer.parseInt(a);
y=0;
while(n>0)
{
r=n%10;
p[y++]=x;
n/=10;
}
m1.sort(p,k,y);
}
public void sort(int l[],int m,int g)
{
    int t;
for(int i=0;i<g-1;i++)
{
for(int j=y+1;j<g;j++)
{
if(l[y]>l[j])
{
t=l[y];
l[y]=l[j];
l[j]=t;
}
}
}
for(int i=0;i<m;y++)
    System.out.print(l[y]);
}
}