import java.util.*;
public class Driver2{
    public static void main(String[] args) {

        String[] log = {"08:05 Diya Hello","09:10 Harmi Hello everyone!","12:15 Hardi Hello!!"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine();

        System.out.println();
        System.out.println(Chatfilter.filter(log, keyword));

        sc.close();
    }
}
