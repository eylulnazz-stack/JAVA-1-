//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int radius;
    int width;
    int length;
    double 원의면적;
    double 정사각형의면적;
    double 구하는면적;
    System.out.print("원의 반지름 입력(장수형)");
    radius = keyboard.nextInt();
    System.out.print("정사각형의 너비 입력");
    width = keyboard.nextInt();
    System.out.print("정사각형의 길이 입력");
    length = keyboard.nextInt();
    원의면적 = 3.141592 * radius * radius;
    정사각형의면적 = width * length;
    구하는면적 = 원의면적 - 정사각형의면적;
    System.out.printf("원의 반지름 : %,d cm, 원의 면적 : %,.2f \u33a0\n", radius, 원의면적);
    System.out.printf("정사각형의 너비 : %,d cm, 정사각형의 길이 : %,d cm, 정사각형의 면적 : %,.2f \u33a0\n", width, length, 정사각형의면적);
    System.out.printf("구하는 면적 : %,.2f \u33a0\n", 구하는면적);
}

