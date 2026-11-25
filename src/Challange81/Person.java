package Challange81;

import java.util.Objects;
  class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {

        // 1. Check same reference
        if (this == obj)
            return true;

        // 2. Check null and class type
        if (obj == null || getClass() != obj.getClass())
            return false;

        // 3. Type cast
        Person person = (Person) obj;

        // 4. Compare attributes
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
