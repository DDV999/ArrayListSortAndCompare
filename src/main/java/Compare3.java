import java.util.Arrays;
import java.util.Comparator;

class Compare3 {
    private String name;
    private float price;
    private float quantity;

    public Compare3(String name, float price, float quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Наименование '" + name + "', цена - "
                + String.valueOf(price)
                + ", количество - "
                + String.valueOf(quantity);
    }

    public static void main(String[] args) {
        Compare3[] products = new Compare3[3];

        // заполним объект Product содержимым
        products[0] = new Compare3("Молоко", 35.56f,900.00f);
        products[1] = new Compare3("Кофе"  ,199.50f, 90.00f);
        products[2] = new Compare3("Чай"   , 78.50f,150.00f);

        // выведем данные без сортировки
        System.out.println("~~~~~ без сортировки");
        for(Compare3 product : products)
            System.out.println(product.toString());

        // Сортировка по цене
        Arrays.sort(products, new SortedByPrice());
        System.out.println("\n~~~ сортировка по цене");

        for(Compare3 product : products)
            System.out.println(product.toString());

        // Сортировка по названию
        Arrays.sort(products, new SortedByName());
        System.out.println("\n~~~ сортировка по названию");

        for(Compare3 product : products)
            System.out.println(product.toString());
    }
}

// сортировка по названию
class SortedByName implements Comparator<Compare3>
{
    public int compare(Compare3 obj1, Compare3 obj2)
    {
        String str1 = obj1.getName();
        String str2 = obj2.getName();

        return str1.compareTo(str2);
    }
}

// сортировка по цене
class SortedByPrice implements Comparator<Compare3>
{
    public int compare(Compare3 obj1, Compare3 obj2)
    {
        float price1 = obj1.getPrice();
        float price2 = obj2.getPrice();

        if (price1 > price2) {
            return 1;
        } else if (price1 < price2) {
            return -1;
        } else {
            return 0;
        }
    }
}