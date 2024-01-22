package org.example._2024_01_17;

public class Main {
    public int[][] createArr1(int size) {
        return new int[size][size];
    }

    public static void main(String[] args) {
//        try () {
//            new MethodTest().mTest();
//        } catch (ExceptionTest e) {
//            throw new RuntimeException(e);
//        } finally {
//
//        }


    }
}

class ExceptionTest extends RuntimeException {
    public ExceptionTest(String message) {
        super(message);
    }
}

class MethodTest {
    public void mTest() throws ExceptionTest {

    }
}