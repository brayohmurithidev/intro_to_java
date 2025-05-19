public class Arrays {
    public static void main(String[] args) {
//        define arrays
        String[] names;
        int[] ages;

//   define the elements an array will hold - if items are not known.
        names = new String[10];
        ages = new int[10];

//assign values to indexes
        names[1] = "John";
        ages[1] = 20;

//        Print items
        System.out.println(names[1]);
        System.out.println(ages[1]);

//        For known items we can define all in one line.
        String[] cars = {"Mazda", "Toyota", "BMW", "Lexus", "Audi", "Honda"};
        System.out.println(cars.length); // gets the total number of items
        System.out.println(cars[0]);


//        Loop on arrays
//        1. For-loop
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

//        2. for each
        for (String car : cars) {
            System.out.println(car);
        }


    }
}
