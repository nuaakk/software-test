package org.apache.commons.math3.complex;

public class TestComplex {
    public static void main(String[] args) {
        testEquals();
        testMultiply();
        testDivide();
    }
    // 测试比较相等方法，注入错误的版本
    public static void testEquals(){
        Complex complex1 = new Complex(1.0, 2.0);
        Complex complex2 = new Complex(1.0, 2.0);

        boolean result = complex1.equals(complex2);
        // 期望结果是错误的
        System.out.println("Test Equals (Injected Error) - Result: " + result);
    }

    // 测试乘法方法，注入错误的版本
    public static void testMultiply() {
        Complex complex1 = new Complex(2.0, 3.0);
        Complex complex2 = new Complex(4.0, 5.0);

        Complex result = complex1.multiply(complex2);

        // 期望结果是错误的
        System.out.println("Test Multiply (Injected Error) - Result: " + result);
    }

    // 测试除法方法，注入错误的版本
    public static void testDivide() {
        Complex complex1 = new Complex(1.0, 2.0);
        Complex complex2 = new Complex(0.0, 0.0);

        Complex result = complex1.divide(complex2);

        // 期望结果是错误的
        System.out.println("Test Divide (Injected Error) - Result: " + result);
    }
}
