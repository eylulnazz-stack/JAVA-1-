//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int radius;
    double 원의면적;

    System.out.print("원의 반지름 입력(장수형)");
    radius = keyboard.nextInt();

    원의면적 = 3.141592 * radius * radius;

    System.out.printf("원의 반지름 : %,d cm, 원의 면적 : %,.2f \u33a0\n", radius, 원의면적);

}
