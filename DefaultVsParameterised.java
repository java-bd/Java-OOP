class Main {

    public static void main(String[] args) {
        Person person = new Person(); // will get error as defautl empty constructor is not given
    }
}

class Person {

    String firstName;
    String lastName;
    int age;

    public Person(String f, String l, int a) {
        firstName = f;
        lastName = l;
        age = a;
    }
}
