public class WeeklySales {
    public static void main(String[] args) {
        SalePerson[] salesPeople = new SalePerson[5];

        salesPeople[0] = new SalePerson("Alice", "Tan", 150);
        salesPeople[1] = new SalePerson("Bob", "Lee", 200);
        salesPeople[2] = new SalePerson("Clara", "Yeo", 150);
        salesPeople[3] = new SalePerson("Daniel", "Lim", 100);
        salesPeople[4] = new SalePerson("Amy", "Lee", 200);

        // Sort using insertionSort which uses SalePerson.compareTo()
        Sorting.insertionSort(salesPeople);

        System.out.println("Sorted salespeople (Descending by Total Sales, Ascending by Last Name):\n");
        for (int i = 0; i < salesPeople.length; i++) {
            System.out.printf("%2d. %s\n", i + 1, salesPeople[i]);
        }
    }
}
