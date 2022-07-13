package in.interf;

public class AdultUser implements LibraryUser {
    int age;
    String booktype;
    AdultUser(int age, String booktype){
        this.age = age;
        this.booktype = booktype;
    }


    @Override
    public void registerAccount() {
        if (age > 12){
            System.out.println("You successfully registered under a Adult account");
        }
        else {
            System.out.println("Sorry, Age must be greater than 12 to register as a Adult");
        }

    }

    @Override
    public void requestBook() {
        if (age > 12 && booktype == "Fiction"){
            System.out.println("Book issued successfully,please return the book with in 7 days");
        }
        else {
            System.out.println("Oops, you are allowed to take only adult fiction book");
        }

    }
}
