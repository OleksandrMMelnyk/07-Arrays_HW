package app;

/*Протягом певного періоду часу здійснювались закупівлі
товарів. Закупівельний набір містить найменування
товарів (як різних, так і однакових).
Реалізуйте функціонал, який виводить нумерований
перелік найменувань цих товарів, а також дає змогу
пошуку певного найменування товару в цьому переліку.
* */

public class Main {

    static String pattern;
    static int count;

    public static void main(String[] args) {
        String[] products = {"watch", "pc", "technique","pc", "smartphone", "laptop", "pc", "tablet"};
        System.out.println("Type products is:");
        for (int i = 0; i < products.length; ++i)  {
            String product = products[i];
            if (!product.equals("meat")) {
                System.out.println((i + 1) + ") " + product);
            }
        }
        pattern = "pc";
        System.out.println("Search product type " + pattern + ":");
        for (String product: products) {
            if (product.equals(pattern)) {
                count++;
                System.out.println(count + ") " + product);
            }
        }
        if (count > 0)
            System.out.println("-----------------------" +
                    "\nNumber of matches are " + count);
        if (count == 0)
            System.out.println("No data :(");
    }
}

