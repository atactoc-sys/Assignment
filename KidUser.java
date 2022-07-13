package in.interf;

public class KidUser implements LibraryUser {
    int age;
    String booktype;
    KidUser(int age, String booktype ){
        this.age = age;
        this.booktype = booktype;
    }
    @Override
    public void registerAccount(){
        if (age < 12){
            System.out.println("You successfully registered under a Kids account");
        }
        else {
            System.out.println("Sorry, Age must be less than 12 to register as a Kid");
        }
    }

    @Override
    public void requestBook() {
        if (age < 12 && booktype == "Kids"){
            System.out.println("Book issued successfully,please return the book with in 10 days");
        }
        else {
            System.out.println("Oops, you are allowed to take only kids book");
        }

    }
}
