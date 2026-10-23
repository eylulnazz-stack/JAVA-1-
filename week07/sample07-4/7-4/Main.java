//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int salary;
    int tax;

    System.out.print("당신 급 입력 ");
    salary = keyboard.nextInt();
        if (salary <= 2000000) {
            tax = 0;
        } else if (salary <= 4000000) {
            tax = (int) ((salary - 2000000) * (10.0f / 100));
        } else if (salary <= 6000000) {
            tax = (int) ((salary - 2000000) * (8.0f / 100));
        } else if (salary <= 20000000) {
            tax = (int) ((salary - 2000000) * (6.0f / 100));
        } else {
            tax = (int) ((salary - 2000000) * (5.0f / 100));

        }
    System.out.printf("급액이 %,d원이면 %,d원 세금 납부\n", salary, tax);

}
