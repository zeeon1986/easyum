package lesson14;

public class Person {
    private int age;
    private String name;

    public Person() { }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) throws AgePersonException{
        if (age < 0 || age > 150) {
            throw new AgePersonException("age < 0 || age > 150");
        }
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
