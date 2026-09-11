//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;
    double height;
    float weight;

    System.out.print("당신의 이름은?");
    name = keyboard.nextLine();
    System.out.printf("%s 님 나이는 ?", name);
    age = keyboard.nextInt();
    System.out.printf("%s 님 키는? (예: 170.5)", name);
    height = keyboard.nextDouble();
    System.out.printf("%s 님 몸무게는? (예: 78.6", name);
    weight = keyboard.nextFloat();

    System.out.printf("%s님의 나이는 %d살 입니다.\n", name, age);
    System.out.printf("%s님의 키는 %.1f cm 입니다.\n", name, height);
    System.out.printf("%s님의 나이는 %.1f kg 입니다.\n", name, weight);


}
