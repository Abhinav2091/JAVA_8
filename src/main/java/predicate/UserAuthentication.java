package predicate;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthentication {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the User Name : ");
        String uname = sc.next();
        System.out.println("Enter the Password : ");
        String pwd = sc.next();
        Predicate<User> p = user -> user.uname.equals("Robin") && user.pwd.equals("Singh");
        User u =  new User(uname,pwd);
        if(p.test(u))
            System.out.println("Authentic User");
            else
            System.out.println("Invalid User");
        }

    }

