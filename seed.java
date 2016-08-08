import java.util.Scanner;
public class seed{
    public static void main(String[] a)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int temp=num;
        int var=num;
        int sum=0;
        while(temp>0){
            var=var*(temp%10);
            sum=sum+(temp%10);
            temp=temp/10;

        }
        num=num*sum;
        if (num==var)
        {
            System.out.println(num/sum+"  the number is a seed number ");
        }
        else
            System.out.println(num/sum +" is not a seed number");
    }
}