package com.practics.cloneable;

public class Person implements Cloneable{

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

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

//    @Override
//    public String toString() {
//        return "Person{name='" + name + "', age=" + age + "}";
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Person orignal = new Person("Rakesh", 25);
        System.out.println("Orignal :" + orignal.toString());



        Person clone = (Person) orignal.clone();
        clone.setName("Rajesh");
        System.out.println("Clone :" + clone);


    }
}
