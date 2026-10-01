//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);

    double celsius;
    double fahrenheit;

    System.out.print("섭씨 온도를 입력하세요 : ");
    celsius = keyboard.nextDouble();

    fahrenheit = celsius * 9 / 5 + 32;

    System.out.printf("화씨 온도 : %.1f ℉\n", fahrenheit);
}
