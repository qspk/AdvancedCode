package com.pk.myinterface;

public class PersonMain {

    public static void main(String[] args) {
        Person pi = new PersonImpl();
        pi.study();

        PersonImpl pi2 = (PersonImpl) pi;

        pi2.eat();
        pi2.sleep();
        pi2.study();


    }
}
