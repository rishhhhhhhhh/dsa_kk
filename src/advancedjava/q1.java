package advancedjava;
import java.beans.*;

class Person implements java.io.Serializable {
    private String name;
    private int age;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Program5 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jeon Jungkook");
        person.setAge(20);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
