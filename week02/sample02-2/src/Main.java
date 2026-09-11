//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String  name;
    int age;

    System.out.print("당신의 이름은 ?"); // prompt 문장
    name = keyboard.nextLine();
    System.out.printf("%s 님 나이는 ?", name); // prompt 문장
    age = keyboard.nextInt();


    System.out.printf("이름 : %s, 나이: %d\n", name, age);
}