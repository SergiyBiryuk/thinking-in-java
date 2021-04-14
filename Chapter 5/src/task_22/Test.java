package task_22;

public class Test {
    public static void main(String[] args) {
        for (Money m : Money.values()) {
            switch (m) {
                case BYN:
                    System.out.println("Belarusian ruble");
                    break;
                case USD:
                    System.out.println("American dollar");
                    break;
                case RUB:
                    System.out.println("Russian ruble");
                    break;
                case EUR:
                    System.out.println("European euro");
                    break;
                case AUD:
                    System.out.println("Australian dollar");
                    break;
                case CHF:
                    System.out.println("Swiss frank");
                    break;
                default:
                    System.out.println("Another value");
            }
        }
    }
}

enum Money {
    BYN, USD, RUB, EUR, AUD, CHF
}
