package MotorEncapsulation;

public class encapTest {
    public static void main(String[] args) {
        encapDemo encap = new encapDemo();
        encap.setName("Iwan");
        encap.setAge(17);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());
    }
}
