package task_21;

public class Test {
    public static void main(String[] args) {
        for (Money m : Money.values()) {
            System.out.println(m + " " + m.ordinal());
        }
    }
}

enum Money {
    BYN, USD, RUB, EUR, AUD, CHF
}
