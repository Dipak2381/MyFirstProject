/**
 * Created by DIPAK on 3/17/2017.
 */
public class Test
{
   // public static void main(String[] args) {
//        int x=10;
//       x System.out.println(x++);//10 (11)
//        System.out.println(++x);//12
//        System.out.println(x--);//12 (11)
//        System.out.println(--x);//10

//        int a=10;
//        int b=10;
//        System.out.println(a-- + ++a);//10+12=22
//                          (10 +10)
//        System.out.println(b-- + b++);//10+11=21
//                       (10+9)
//
//        System.out.println(10*10/5+3-1*4/2);
//       int aa=0;
//        aa:
//        for(int i=1;i<=3;i++){
//            bb:
//            for(int j=1;j<=3;j++)
//            {
//                if(i==3&&j==3){
//                    break aa;
//                }
//                System.out.println(i+" "+j);
//

            static void min(int arr[])
            {
                int min = arr[0];
                for (int i = 1; i < arr.length; i++)
                    if (min > arr[i])
                        min = arr[i];
                System.out.println(min);
            }

            public static void main(String args[])
            {

                int a[] = {33, 3, 4, 5};
                min(a);//passing array to method
            }
        }

