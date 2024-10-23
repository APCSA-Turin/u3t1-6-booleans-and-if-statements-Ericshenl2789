public class Main {
    public static void main(String[] args) {
        Rectangle rectA = new Rectangle(80, 100);
        Rectangle rectB = rectA;;
        System.out.println(rectA == rectB);
        System.out.println(rectA);
        System.out.println(rectB);
        
    }
}
