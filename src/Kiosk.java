import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menu;


    public Kiosk(List<Menu> menu) {
        this.menu = menu;
    }


    //기능
    public List<Menu> getMenu() {
        return menu;
    }

    public void start () {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("=================================================================");
            System.out.println("[MAIN MENU]");

            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i).getCategory());
            }

            System.out.println("0. 종료");
            System.out.println("=================================================================");

            System.out.println("원하시는 메뉴의 번호를 입력해주세요.");

            try {
                int number = scan.nextInt();

                if (number == 0) {
                    System.out.println("주문을 종료합니다.");
                    break;
                }

                if (number >= 1 && number <= menu.size()) {
                    Menu selectMenu = menu.get(number - 1);
                    System.out.println("[" + selectMenu.getCategory() + " MENU]");
                    selectMenu.printcategory();

                    System.out.println("0. 뒤로가기");
                    System.out.println("원하시는 메뉴의 번호를 입력해주세요.");

                    int inputItem = scan.nextInt();

                    if (inputItem == 0) {
                        continue;   // 메인 메뉴로
                    }

                    List<MenuItem> items = selectMenu.getMenuItems();
                    if (inputItem >= 1 && inputItem <= items.size()) {
                        MenuItem selectedItem = items.get(inputItem - 1);
                        System.out.println("선택한 메뉴: \n" + selectedItem);
                        break;

                    } else {
                        System.out.println("올바른 번호를 입력해주세요.");
                    }
                }

            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("다시 입력해주세요");
            }

        }
    }
}
