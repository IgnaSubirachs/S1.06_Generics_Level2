public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ignasi","Subirachs", 36) ;
        GenericMethods.printArguments(person1, "Hello world", 3.14,"$",false,true, 25);
    }
}
