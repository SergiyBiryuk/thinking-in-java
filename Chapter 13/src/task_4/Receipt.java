package task_4;

import java.util.*;

public class Receipt {
    private double total = 0.0;
    private Formatter f = new Formatter(System.out);
    private String sss = "%-15s %5s %10s\n";
    private String ssd = "%-15s %5s %10.2f\n";
    private String sdd = "%-15.15s %5d %10.2f\n";
    public void printTitle() {
        f.format(sss, "Item", "Qty", "Price");
        f.format(sss, "----", "---", "-----");
    }
    public void print(String name, int qty, double price) {
        f.format(sdd, name, qty, price);
        total += price;
    }
    public void printTotal() {
        f.format(ssd, "Tax", "", total*0.06);
        f.format(sss, "", "", "-----");
        f.format(ssd, "Total", "", total*1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
