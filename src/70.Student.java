
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Amit", 20);
        System.out.println(s1);
    }
}
