//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
   int a = Integer.MAX_VALUE;
   long b = a + 1; // overflow
   long c = a + 1; // long 형 연산이 가능

   System.out.printf("a = %,d, b = %,d\n", a, b, c);
}
