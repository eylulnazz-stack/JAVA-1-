//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    float exchange;
    int money;
    float dollar;


    System.out.print("달러에 대한 원화 환율을 입력 :");
    exchange = keyboard.nextFloat();
    System.out.print("원화 금액을 입력 :");
    money = keyboard.nextInt();
    dollar = money / exchange;

    System.out.printf("원화(\u28a9) %,d 원은 %,.2f 달러(\u0023) 입니다.\n", money, dollar);

}
