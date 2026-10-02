//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
   Scanner keyboard = new Scanner(System.in);
   int num1;
   int num2;

   System.out.print("enter the first number");
   num1 = keyboard.nextInt();
   System.out.print("enter the second number");
   num2 =  keyboard.nextInt();

   System.out.printf("%d를 %d로 나누면 몫 = %d, 나머지 = %d \n, num1, num2, num1 / num2, num1 % num2");
    System.out.printf("%d를 %d로 나누면 몫 = %.1f, 나머지 = %d \n, num1, num2, (float) num1 / num2,");

}
