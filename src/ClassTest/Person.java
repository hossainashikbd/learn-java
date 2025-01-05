package ClassTest;

public class Person {

    public class Address {
        private String city;
        private String state;

        public Address(String city, String state) {
            this.city = city;
            this.state = state;
        }

        public void printAddress() {
            System.out.println("City: " + city + ", State: " + state);
        }
    }
    public static void main(String[] args) {

        Person person = new Person();

        Address address = person.new Address("Mirpur", "Dhaka North");

        address.printAddress();
    }
}
