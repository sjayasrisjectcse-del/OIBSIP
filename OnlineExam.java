import java.util.*;

class OnlineExam {

    static Scanner sc = new Scanner(System.in);
    static String username = "student";
    static String password = "1234";

    public static void main(String[] args) {

        System.out.println("---- ONLINE EXAMINATION SYSTEM ----");

        if(login()) {
            startExam();
        } else {
            System.out.println("Too many wrong attempts. Try again later!");
        }
    }

    static boolean login() {
        for(int i=1;i<=3;i++) {
            System.out.print("Enter Username: ");
            String u = sc.next();
            System.out.print("Enter Password: ");
            String p = sc.next();

            if(u.equals(username) && p.equals(password)) {
                System.out.println("Login Successful!\n");
                return true;
            } else {
                System.out.println("Wrong login! Attempts left: " + (3-i));
            }
        }
        return false;
    }

    static void startExam() {

        int score = 0;
        System.out.println("Exam Started!\n");

        System.out.println("1. Java is a ?");
        System.out.println("a) OS  b) Language  c) Browser  d) Game");
        String ans1 = sc.next();
        if(ans1.equalsIgnoreCase("b")) score++;

        System.out.println("2. Which keyword creates object?");
        System.out.println("a) class  b) new  c) void  d) static");
        String ans2 = sc.next();
        if(ans2.equalsIgnoreCase("b")) score++;

        System.out.println("3. JVM stands for?");
        System.out.println("a) Java Virtual Machine  b) Java Very Much  c) Just Virtual  d) None");
        String ans3 = sc.next();
        if(ans3.equalsIgnoreCase("a")) score++;

        System.out.println("\nExam Finished!");
        System.out.println("Your Score: " + score + "/3");
        System.out.println("Logout Successful.");
    }
}
