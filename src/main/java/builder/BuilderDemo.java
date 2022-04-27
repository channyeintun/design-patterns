/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author channyeintun
 */
class Person {

    private String name;
    private String birthday;
    private int age;
    private String gender;

    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.birthday = builder.birthday;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    public String getName() {
        return this.name;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public static class PersonBuilder {

        private String name;
        private String birthday;
        private int age;
        private String gender;

        public PersonBuilder() {

        }

        PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        PersonBuilder birthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        PersonBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        Person build() {
            return new Person(this);
        }
    }
}

public class BuilderDemo {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder().name("Chan")
                .age(24).gender("male").birthday("1/2/2000").build();
        System.out.println(person.getName());
    }
}
