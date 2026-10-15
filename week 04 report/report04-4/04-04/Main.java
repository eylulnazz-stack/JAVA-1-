//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.printf("판매금액 입력 : ");
    int total = keyboard.nextInt();

    int amount = (int) (total / 1.1);
    int tax = total - amount;

    System.out.printf("판매금액 : %,d 원\n", total);
    System.out.printf("금액 : %,d 원\n", amount);
    System.out.printf("세금 : %,d 원\n", tax);
}
