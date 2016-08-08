  import java.util.Scanner;

    public class Sum_Zero 

    {

        public static void main(String[] args) 

        {

            int n, TEMP = 0, min2 = 1, Total, minimum;

            Scanner s = new Scanner(System.in);

            n = s.nextInt();

            int a[] = new int[n];

            for(int i = 0; i < n; i++)

            {

                a[i] = s.nextInt();

            }

            minimum=Math.abs(a[0] + a[1]);

            for(int i = 0; i < n; i++)

            {

                for(int j = i + 1; j < n; j++)

                {

                    Total = Math.abs(a[i] + a[j]);

                    if(Total < minimum)

                    {

                        TEMP = i;

                        min2 = j;

                        minimum = Total;

                    }

                }

            }

            System.out.println("Element 1:"+a[TEMP]); 

            System.out.println("Element 2:"+a[min2]);

        }

    }