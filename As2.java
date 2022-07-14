public class As2 {
    String name;
    int age;
    private As2(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("SAIKAT");
    }
}
class As3{
    public static void main(String args[]){
        As2 cg = new As2("Arin",24);
        cg.display();
    }
}
