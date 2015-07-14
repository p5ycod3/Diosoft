package com.company.Builder;

public class Person implements Comparable {

    private final String name;
    private final int age;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;

        int result = this.name.compareTo(person.name);
        if (result != 0) {
            return result;
        }

        result = this.age - person.age;
        if (result != 0) {
            return result / Math.abs(result);
        }

        return result;
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder() {

        }

        public Builder(Person original) {
            this.name = original.name;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

}


