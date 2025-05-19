public class Methods {
    //        Method - block of code designed to perform a particular task. e.g login(), logout(), convert()
//        declare a method
        /*
        Static - needed to be able to use the method in main.
        void - means the method doesn't return a value
        Methods can have parameters - they are methods variables.
        Return values - results from methods
         */

    static void welcome(String name, int age) {
        System.out.println("Hello " + name + " and you are " + age);
    }

    static double perc(double num, int percentage) { // double is the returned value
        return num * percentage / 100;
    }


    public static void main(String[] args) {
// Call our method in the main class
        welcome("Brian", 27); //values passed on params are arguments
        welcome("Lewis", 18);
        double result = perc(4, 25);
        double res = perc(10, 25);
        System.out.println(result);
        System.out.println(res);
    }
}
