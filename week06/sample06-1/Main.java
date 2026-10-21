//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner keyboard = new Scanner(System.in);

    int age;
    final int HEART = 65;
    final int DayofYear = 365;

    System.out.print("몇년 동안 사셨습니까?");
    age = keyboard.nextInt();

    int day = age * DayofYear;
    int hour = day * 24;
    int minute = hour * 60;

    long count = minute * HEART;

    System.out.printf("사람은 평균 분당 %d회 심장이 박동한다\n", HEART);
    System.out.printf("심장이 %d년 동안 박동한 회수는 %,d입니다.\n", age, count);


}
