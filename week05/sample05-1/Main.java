//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int width;
    int height;
    int area;
    char type;
    boolean flag;

    System.out.print("사각형의 가로 길이 입력 (예: 5)");
    width = keyboard.nextInt();
    System.out.print("사각형의 새로 길이 입력 (예: 5)");
    height = keyboard.nextInt();

    flag = (width > 0 && height > 0) ? true : false;

    type = (width == height) ? '정' : '직';
    area = width * height;

    String result = flag == true ? String.format("**** %c사각형 넓이 ****\n\t가로 길이: %,d Cm\n\t새로 길이: %,d Cm\n\t 넓이: %,d\u33a0\n", type, width, height, area) : "data 오류";

    System.out.println(result);

}
