public class WeeklySales {
    public static void main(String[] args) {
        SalePerson[] salesPeople = new SalePerson[5];

        salesPeople[0] = new SalePerson("Alice", "Tan", 150);
        salesPeople[1] = new SalePerson("Bob", "Lee", 200);
        salesPeople[2] = new SalePerson("Clara", "Yeo", 150);
        salesPeople[3] = new SalePerson("Daniel", "Lim", 100);
        salesPeople[4] = new SalePerson("Amy", "Lee", 200);

        Sorting.insertionSort(salesPeople); // sorts using compareTo()

        System.out.println("Sorted salespeople (by total sales descending, name ascending):\n");
        for (SalePerson sp : salesPeople) {
            System.out.println(sp); // uses toString()
        }
    }
}
