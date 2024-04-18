public class Main {
    public static void main(String[] args) {

        Person pascal = new Person("Pascal", 12, 3, 1997);
        System.out.println(pascal);
        Simple_Date my_Date = new Simple_Date(9, 2, 1996);
        Person matt = new Person("Matt", my_Date);
        System.out.println(matt);
    }
}