//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
    Scanner keyboard = new Scanner(System.in);
    int man1;
    int man2;
    String result;
    String type1;
    String type2;

    System.out.print("first player 1 rock,  2 paper,  3 scissor ");
    man1 = keyboard.nextInt();
    System.out.print("second player 1 rock,  2 paper,  3 scissor ");
    man2 = keyboard.nextInt();

    if (man1 == 1) {
        type1 = "rock";
    } else if (man1 == 2) {
        type1 = "paper";
    } else {
        type1 = "scissor";
    }
    if (man2 == 1) {
        type2 = "rock";
    } else if (man2 == 2) {
        type2 = "paper";
    } else {
        type2 = "scissor";
    }

    switch (man1 - man2) {
        case 0:
            result = String.format("man1(%s) and man2(%s) draw", type1, type2);
            break;
        case -1:
        case 2:
            result = String.format("man2(%s) wins against man1(%s)", type2, type1);
            break;
        case -2:
        case 1:
            result = String.format("man1(%s) wins against man2(%s)", type1, type2);
            break;
        default:
            result = "error";
    }
    System.out.println(result);
}
