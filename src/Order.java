public class Order {

    public static void Clear2sec(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }

}
