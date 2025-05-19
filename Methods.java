public class Methods {
    //        Method - block of code designed to perform a particular task. e.g login(), logout(), convert()
//        declare a method
        /*
        Static - needed to be able to use the method in main.
        void - means the method doesn't return a value
         */
    //Methods can have parameters - they are methods variables.
    static void welcome(String name, int age) {
        System.out.println("Hello " + name + " and you are " + age);
    }


    public static void main(String[] args) {
// Call our method in the main class
        welcome("Brian", 27); //values passed on params are arguments
        welcome("Lewis", 18);
    }
}
