public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Сумма кредита 1 000 000, ставка 9,99%, срок 1год");
        System.out.println("Ежемесячный платеж:");
        System.out.println(service.calculate(1000_000, 9.99, 12));

        System.out.println();
        System.out.println("Сумма кредита 1 000 000, ставка 9,99%, срок 2год");
        System.out.println("Ежемесячный платеж:");
        System.out.println(service.calculate(1000_000, 9.99, 24));

        System.out.println();
        System.out.println("Сумма кредита 1 000 000, ставка 9,99%, срок 3год");
        System.out.println("Ежемесячный платеж:");
        System.out.println(service.calculate(1000_000, 9.99, 36));
    }
}