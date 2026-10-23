//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
    Scanner keyboard = new Scanner(System.in);

    int num;
    String result;
    String result1;
    char result2;
    String result3;
    String result1_1;
    char result2_1;
    String result3_1;

    System.out.print("양의 정수 입력 ");
    num = keyboard.nextInt();
    if (num > 0 ) {
        result = num % 2 == 0 ? "짝" : "홀";

        if (num % 2 == 0) {
            result1 = "짝";
            result2 = '짝';
            result3 = String.format("%d는 짝수입니다.", num);
        } else {
            result1 = "홀";
            result2 = '홀';
            result3 = String.format("%d는 홀수입니다.", num);
        }

        switch (num % 2) {
            case 0:
                result1_1 = "짝";
                result2_1 = '짝';
                result3_1 = String.format("%d는 짝수입니다.", num);
                break;

            case 1:
                result1_1 = "홀";
                result2_1 = '홀';
                result3_1 = String.format("%d는 홀수입니다.", num);
                break;

            default:
                result1_1 = "error";
                result2_1 = 'e';
                result3_1 = "error";
                break;
        }

        System.out.printf("%d는 %s수입니다.\n", num, result);
        System.out.printf("%d는 %s수입니다.\n", num, result1);
        System.out.printf("%d는 %c수입니다.\n", num, result2);
        System.out.println(result3);

        System.out.printf("%d는 %s수입니다.\n", num, result1_1);
        System.out.printf("%d는 %c수입니다.\n", num, result2_1);
        System.out.println(result3_1);
    } else {
        System.out.println("error");
    }

}

