import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===== Grade Calculator =====");
        System.out.println();
        System.out.print("Enter Student Name: ");
        String name = in.nextLine();
        System.out.print("Java grade: ");
        double java = in.nextDouble();
        if (java > 100 || java < 0) {
            while (true) {
                System.out.print("Error, enter a number between (0-100): ");
                java = in.nextDouble();
                if (java <= 100 && java >= 0) {
                    break;
                }
            }
        }
        System.out.print("Math grade: ");
        double math = in.nextDouble();
        if (math > 100 || math < 0) {
            while (true) {
                System.out.print("Error, enter a number between (0-100): ");
                math = in.nextDouble();
                if (math <= 100 && math >= 0) {
                    break;
                }
            }
        }
        System.out.print("Cybersecurity grade: ");
        double cyber = in.nextDouble();
        if (cyber > 100 || cyber < 0) {
            while (true) {
                System.out.print("Error, enter a number between (0-100): ");
                cyber = in.nextDouble();
                if (cyber <= 100 && cyber >= 0) {
                    break;
                }
            }
        }
        System.out.print("English grade: ");
        double english = in.nextDouble();
        if (english > 100 || english < 0) {
            while (true) {
                System.out.print("Error, enter a number between (0-100): ");
                english = in.nextDouble();
                if (english <= 100 && english >= 0) {
                    break;
                }
            }
        }
        System.out.println("===== Result =====");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Java: " + java);
        System.out.println("Math: " + math);
        System.out.println("Cybersecurity: " + cyber);
        System.out.println("English: " + english);
        System.out.println("Total: " + (java+math+cyber+english));
        double avg = ((java+math+cyber+english)/4);
        System.out.println("Average: " + avg);
        if(avg >= 90){
            System.out.println("Grade : A");
        }else if(avg >= 80) {
            System.out.println("Grade : B");
        }else if(avg >= 70) {
            System.out.println("Grade : C");
        }else if(avg >= 60){
            System.out.println("Grade : D");
        }else {
            System.out.println("Grade : F");
        }
        if(avg >= 60) {
            System.out.println("Status: Pass");
        }else{
            System.out.println("Status: Fail");
        }
    }
}