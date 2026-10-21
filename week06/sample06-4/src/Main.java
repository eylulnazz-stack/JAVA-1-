//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    final int LIFE = 7;
    int year;
    int cig;
    final int FEE = 3000;

    System.out.print("당신은 몇년동안 담배를 피웠나요?");
    year = keyboard.nextInt();
    System.out.print("당신은 담배를 하루에 몇 개피 담배를 피우나요?");
    cig = keyboard.nextInt();

    int day = year * 365;
    int count = day * cig;
    int minute = count * LIFE;
    int hour = minute / 60;
    minute -= (hour * 60);
    int day1 = hour / 24;
    hour -= (hour * 24);

    int gap = count / 20 + ((count % 20 != 0 ) ? 1 : 0);
    int momey = gap * FEE;
    System.out.printf("담배를 1 개피씩 피우면, 수명이 %d분 단촉됨\n", LIFE);
    System.out.printf("담배를 하루에 %d 개피씩 %d년을 피우면, %d 일 %d 시간  %d분 수명이 단촉됨\n", cig, year, day1, hour, minute);
    System.out.printf("담배를 하루에 %d 개피씩 %d년을 피우면, 비용은 %,d won 필요함\n", FEE);


}
