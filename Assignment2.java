//devplop a public java class and make sure nobody can creat any object of this cllass from outside

public class Assignment2 {//class1
    private String name;
    private int age;
    Assignment2(String name, int age){//constructer
        this.name=name;
        this.age=age;
    }
    Assignment2(Assignment2 c){//coppy of constructer
        this.name=c.getName();
        this.age=c.getAge();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}