//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
    Scanner keyboard = new Scanner(System.in);
    int birth;
    String result;
    Calendar calendar = Calendar.getInstance();
    int year = calendar.get(Calendar.YEAR);
    System.out.print("ur birth year ");
    birth = keyboard.nextInt();

    if (birth > 0 && birth <= year) {
        switch (birth % 12) {
            case 0:
                result = "monkey";
                break;
            case 1:
                result = "rooster";
                break;
            case 2:
                result = "dog";
                break;
            case 3:
                result = "pig";
                break;
            case 4:
                result = "rat";
                break;
            case 5:
                result = "ox";
                break;
            case 6:
                result = "tiger";
                break;
            case 7:
                result = "rabbit";
                break;
            case 8:
                result = "dragon";
                break;
            case 9:
                result = "snake";
                break;
            case 10:
                result = "horse";
                break;
            case 11:
                result = "sheep";
                break;
            default:
                result = "error";
                break;
        }
    } else {
        result = "future born kid";
    }
    System.out.printf("ur birth year: %d, chinese zodiac: %s\n", birth, result);
}




