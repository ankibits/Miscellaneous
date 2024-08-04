public class Main {
    public static void main(String[] args) {

        Item item1 = new Item(10); // memory reference = 50
        Item item2 = new Item(15); // memory reference = 100

        swap(item1, item2);
        System.out.println("After the swap method executes:");
        System.out.println("`Item1` color value = " + item1.getNumber());
        System.out.println("`Item2` color value = " + item2.getNumber());

        changeValue(item2);
        System.out.println("After the changeValue method executes:");
        System.out.println("`blue` color value = " + item2.getNumber());

    }

    //The values of o1 and o2 are swapped,
    // but because the values are copies of the item1 and item2 memory locations,
    // there is no change to the values of the item1 and item2 number values.
    // A copy get created here.
    public static void swap(Object o1, Object o2){
        Object temp = o1;
        o1 = o2;
        o2 = temp;
    }


    // the values of references get passed.
    private static void changeValue(Item item) { // item = 100
        item.setNumber(20); // item = 100
        item = new Item(25); // item = 200
        item.setNumber(25); // item = 200
    }
}