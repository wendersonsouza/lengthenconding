package wenderson.ozorio.souza;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Args is empty");
        } else {
            for (String arg:args) {
                System.out.println(arg);
                System.out.println(LengthEncoder.encode(arg));
            }
        }
    }
}