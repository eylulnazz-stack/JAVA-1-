//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.printf("직육면체 가로 입력 ");
    int width = keyboard.nextInt();

    System.out.printf("직육면체 세로 입력  ");
    int length = keyboard.nextInt();

    System.out.printf("직육면체 높이 입력 ");
    int height = keyboard.nextInt();

    int vol = width * length * height;

    System.out.printf("직육면체 가로 = %d cm\n", width);
    System.out.printf("직육면체 세로 = %d cm\n", length);
    System.out.printf("직육면체 높이 = %d cm\n", height);
    System.out.printf("직육면체 부피 = %d cm\n", vol);
}