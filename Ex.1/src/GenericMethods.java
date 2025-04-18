public class GenericMethods {

    public static <T, U, V> void printThreeArguments(T arg1, String S, V arg3) {
        System.out.println(arg1);
        System.out.println("Hello World, i'm not a Generic Tyep");
        System.out.println(arg3);
    }
}


