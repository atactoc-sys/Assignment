public class Finalvaruable {
    final int carspeed = 60;
    void run(){
        carspeed = 90;
    }
    public static void main(String args[]){
        Finalvaruable c = new Finalvaruable();
            c.run();

    }
}
