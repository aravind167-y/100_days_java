import java.util.Scanner;

public class StudentProfile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        double cgpa;

        System.out.print("Enter your Name: ");
        name = sc.nextLine();

        System.out.print("Enter your Age: ");
        age = sc.nextInt();

        System.out.print("Enter your CGPA: ");
        cgpa = sc.nextDouble();

        System.out.println("\n------ Student Profile ------");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("CGPA  : " + cgpa);

        sc.close();
        
    }
}
