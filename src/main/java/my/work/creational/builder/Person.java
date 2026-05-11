package my.work.creational.builder;

public class Person {

    private final String firstName;

    private final String lastName;

    private final int age;

    private final String phone;

    private final String city;

    private final String address;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.city = builder.city;
        this.address = builder.address;
    }

    public static Builder builder(String firstName, String lastName, int age) {
        return new Builder(firstName, lastName, age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder {

        private final String firstName;

        private final String lastName;

        private final int age;

        private String phone;

        private String city;

        private String address;

        public Builder(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}
