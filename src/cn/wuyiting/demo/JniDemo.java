package cn.wuyiting.demo;

public class JniDemo {

    public native void testPrint(String s);

    public static void main(String[] args) {
        System.loadLibrary("TestJniDemo");
        JniDemo jniDemo = new JniDemo();
        jniDemo.testPrint("Hello from J");
    }
}
