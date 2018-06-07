package Lab3;

public class Test {

    public static void main(String[] args) {

        FIFOArray arr = new FIFOArray(10);
        arr.put(10);
        arr.put(20);
        arr.put(30);

        System.out.println(arr.get());
        System.out.println(arr.get());

        arr.put(40);
        arr.put(50);

        System.out.println(arr.get());
        System.out.println(arr.get());
        System.out.println(arr.get());

        System.out.println(arr.get());




    }
}
