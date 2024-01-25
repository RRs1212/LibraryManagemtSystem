import java.util.Scanner;

class LibraryManagementImply{
    public static int rotate;
    public void implementer(){
        System.out.println("<----------Welcome to RRs Library------------>");
        Scanner in=new Scanner(System.in);
        rotate=1;
        while(rotate!=0){
            System.out.println("Enter number for respective action");
            System.out.println("1.Addding Books 2.Checking Out Books 3.Returning Books 4.Display All books 5.Exit");
            System.out.println("Enter your Number:");
            int value=in.nextInt();
            if(value==1){
                System.out.println("Adding books");
            }
            else if(value==2){
                System.out.println("checking out books");
            }
            else if(value==3){
                System.out.println("Returning Books");
            }
            else if(value==4){
                System.out.println("displaying all books");
            }
            else if(value==5){
                System.out.println("Thank you for using my Rrs Library.Visit again!!!");
                rotate=0;
            }





        }

    }
}
public class Main {
    public static void main(String[] args) {
        LibraryManagementImply library=new LibraryManagementImply();
        library.implementer();
        System.out.println("hiiiii");



    }
}