//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.printf("몸무게 입력 : ");
    double weight = keyboard.nextDouble();

    double moon = weight * (16.5 / 100);

    System.out.printf("지구 몸무게 = %.2f kg\n", weight);
    System.out.printf("달 몸무게 = %.2f kg\n", moon);
}
