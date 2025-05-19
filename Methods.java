public class Methods {
    //        Method - block of code designed to perform a particular task. e.g login(), logout(), convert()
//        declare a method
        /*
        Static - needed to be able to use the method in main.
        void - means the method doesn't return a value
         */
    static void welcome() {
        System.out.println("Hello World");
    }


    public static void main(String[] args) {
// Call our method in the main class
        welcome();
    }
}
