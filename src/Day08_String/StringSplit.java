package Day08_String;

public class StringSplit {
    public static void main(String[] args) {
        String s = "192.168.1.1";

        String[] split = s.split("\\.");

        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        
    }
}
