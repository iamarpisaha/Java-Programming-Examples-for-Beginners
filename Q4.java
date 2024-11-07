/*Find ASCII value of a character*/
class Ascii{

    int getAsciiCode(char ch){
        return (int) ch;
    }
}
public class Q4 {
    public static void main(String[] args) {

        char c = args[0].charAt(0);
        Ascii c1 = new Ascii();
        
        System.out.println("Ascii value of " + c + ":" + c1.getAsciiCode(c));
    }
}
