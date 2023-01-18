Q1.
import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int limit1=sc.nextInt();
        int limit2=sc.nextInt();
        int sum=0;
        int count=0;
        for(int i=0;i<5;i++){
            if(arr[i]>limit1 && arr[i]<limit2){
                sum=sum+arr[i];
                count++;
            }
        }
        int avg=sum/count;
        System.out.println(avg);
    }
}


Q2.
import java.util.Scanner;
public class MyClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int i=n%10;
            n=n/10;
            sum=sum+i;
        }
        if(sum%3==0){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}


Q3.
import java.util.Scanner;
public class MyClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<5; i++){
            if(arr[i]%2!=0)
            {
                sum=sum+arr[i];
            }
        }
        if(sum>8 && sum<50){
            System.out.println("The sum is "+sum);
        }
        else{
            System.out.println("NA");
        }
    }
}
























// public class myclass {
//     public static void main(String[] args) {
//         box b1=new box();
//         b1.setDimenion(10,15,12);
//         b1.showDimension();
//     }
// }
// class box{
//     public int length,breadth,height;
//     public void setDimenion(int l,int b,int h)
//     {
//         length=l;
//         breadth=b;
//         height=h;
//     }
//     public void showDimension()
//     {
//         System.out.println("length "+length);
//         System.out.println("breadth "+breadth);
//         System.out.println("height "+height);
//     }
// }
