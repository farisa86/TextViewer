"App.java"
/**
 * Created by Farisa on 9/3/2015
 */
public class App {
    public static void main(String[] args) {
        String text = "This is a simple test\nOne Two Three\nHello world!";
        for (int i = 0; i < text.length(); ++i) {
            System.out.println(text.charAt(i));
        }
        System.out.println();
    }
}
