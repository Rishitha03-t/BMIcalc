
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter height");
        double height=sc.nextDouble();
        System.out.println("enter weight");
        double weight=sc.nextDouble();
        double BMI=weight/(height*height);
        if (BMI<18.5) {
            System.out.println("you are underweight");
        }
        else if(BMI>25){
            System.out.println("you are overweight");
        }
        else{
            System.out.println("you are normal");
        }

    }
}
