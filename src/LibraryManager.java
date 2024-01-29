import java.util.HashSet;
import java.util.Scanner;

public class LibraryManager extends SampleBooks {
    HashSet<Book> LibraryDataBase;
    LibraryManager(){
        LibraryDataBase=new HashSet<>();
        LibraryDataBase.add(book);
        LibraryDataBase.add(book1);
        LibraryDataBase.add(book2);


    }

    public void addingBooks(Book book){
        LibraryDataBase.add(book);

    }
    public void CheckingOutBook(String cobook){
        for(Book b:LibraryDataBase){
           if(b.Name.equalsIgnoreCase(cobook))b.Avaialble=false;
        }


    }
    public void displaingAllBooks(){
        for(Book b:LibraryDataBase){
            if(b.Avaialble){
                System.out.println("Book Name:"+b.Name+"--- Author Name:"+b.Author);
            }

        }
    }
    public void returningBooks(String reBook){
        for(Book b:LibraryDataBase){
            if(b.Name.equalsIgnoreCase(reBook))b.Avaialble=true;
        }

    }
    public void checkOutBooks(){
        for(Book b:LibraryDataBase){
            if(!b.Avaialble){
                System.out.println("Book Name:"+b.Name+"--- Author Name:"+b.Author);
            }

        }

    }
}
