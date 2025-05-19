public class Loops {
    public static void main(String[] args) {
//        While loops
        int num = 0;
        int sum = 0;
        while(num < 10){
            sum += num;
            num ++; // inclement
        }
        System.out.println(sum);

//        Do while - prints atleast once
        int x = 1;
        do{
            System.out.println(x);
            x ++;
        }while(x < 10);


//        For loops
        for(int i = 1; i < 5; i++){
            System.out.println(i);
        }



    }
}
