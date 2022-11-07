public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        int friendReturn = 22;
        int Temperature = 17;
 if (friendReturn >= 20 && friendReturn <= 40 && Temperature >= -20 && Temperature <= 30){
     System.out.println("Go to walk");
 }
 else if (friendReturn < 20 && Temperature >= 0 && Temperature <= 28){
     System.out.println("Go to walk");
 }
 else if (friendReturn > 45 && Temperature >= -10 && Temperature <= 25){
     System.out.println("Go to walk");
 }
 else System.out.println("Home");
    }

}
