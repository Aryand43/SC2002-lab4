public class SalePerson implements Comparable<SalePerson> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    // Format: <lastName>, <firstName> : <totalSales>
    public String toString() {
        return lastName + ", " + firstName + " : " + totalSales;
    }

    // Checks if first and last names match
    public boolean equals(Object obj) {
        if (!(obj instanceof SalePerson)) {
            return false;
        }
        SalePerson other = (SalePerson) obj;
        return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
    }

    // Compare by totalSales descending, tie-break on lastName ascending
    public int compareTo(SalePerson other) {
        if (this.totalSales != other.totalSales) {
            return other.totalSales - this.totalSales; // Descending
        } else {
            return this.lastName.compareTo(other.lastName); // Ascending
        }
    }
}
