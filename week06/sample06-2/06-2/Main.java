//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
    Scanner keyboard = new Scanner(System.in);
    final float DON = 3.75f;
    final int GOLD = 77500;
    float weight;

    System.out.print("당신의 몸무게는?");
    weight = keyboard.nextFloat();
    int gram = (int) (weight * 1000);
    long donofweight = gram / DON;
    long money = (long) (donofweight * GOLD);

    System.out.printf("%.1f Kg = %,d gram\n", weight, gram);
    System.out.printf("%.1f Kg = %,.2f 돈\n", weight, donofweight);
    System.out.printf("%.1f Kg = %,d won (gold 1돈 price = %,d won)\n", weight, money, GOLD);
}

