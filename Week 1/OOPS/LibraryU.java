interface LibraryUser {
    void registerAccount();
    void requestBook();
}
// for kid user
class KidUser implements LibraryUser{
    int age;
    String bookType;
    public void registerAccount(){
        if(age<12){
            System.out.println("you have successfully registerd under a kid Account");
        }
        else{
            System.out.println(" Sorry age must be less than 12 to register as a kid ");
        }
    }
    public void requestBook(){
        if(bookType.equalsIgnoreCase("kids")){
            System.out.println("Book Issued successfully ,please return the book with in 10 days");
        }else{
            System.out.println("Oops you are allowed to  take only kids books");
        }
    }
}


// for Adult user
class AdultUser implements LibraryUser{
    int age;
    String bookType;
    public void registerAccount(){
    if(age>12){
        System.out.println("You have successfult registerd under an adult Account");
    }
    else{
        System.out.println("Sorry age must be greater than 12 to registerd as a adult");
    }
 }
 public void requestBook(){
    if(bookType.equalsIgnoreCase("Fiction")){
            System.out.println("Book Issued successfully ,please return the book with in 7 days");
        }else{
            System.out.println("Oops you are allowed to  take only adult fiction  books");
  }
 }
}
public class LibraryU{

    public static void main(String[] args) {

        System.out.println("case1: KidUser ");

        KidUser kid = new KidUser();

        kid.age = 10;
        kid.registerAccount();

        kid.age = 18;
        kid.registerAccount();

        kid.bookType = "Kids";
        kid.requestBook();

        kid.bookType = "Fiction";
        kid.requestBook();

        System.out.println("\n Case2: Adult user");

        AdultUser adult = new AdultUser();

        adult.age = 5;
        adult.registerAccount();

        adult.age = 23;
        adult.registerAccount();

        adult.bookType = "Kids";
        adult.requestBook();

        adult.bookType = "Fiction";
        adult.requestBook();
    }
}