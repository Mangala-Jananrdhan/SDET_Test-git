package org.example;

public class MyFirstJava {
    String firstName = null;

    public MyFirstJava() {
        firstName = new String("test");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstNameParam) {
        this.firstName = firstNameParam;
    }

    public static void main(String[] args) {
        MyFirstJava myFirstJavaObject = new MyFirstJava();
        myFirstJavaObject.setFirstName("mangala");
        System.out.println(myFirstJavaObject.getFirstName());
    }
}

