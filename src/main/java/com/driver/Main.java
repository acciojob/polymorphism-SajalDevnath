package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p = new Product();
        System.out.println("Product of 3 and 4: " + p.product(3, 4));
        System.out.println("Product of 3, 4, and 5: " + p.product(3, 4, 5));
        System.out.println("Product of 3.5 and 4.5: " + p.product(3.5, 4.5));
    }
    static class Product {
        public int product(int x, int y) {
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x * y * z;
        }
        public double product(double x, double y) {
            return x * y;
        }
    }
}
