import java.util.ArrayList;
import java.util.List;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        //개별 메뉴 생성
        //햄버거 메뉴
        List<MenuItem> burgerItems = new ArrayList<>();
        burgerItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("SmokeShack", 9.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        //음료 메뉴
        List<MenuItem> drinkItems = new ArrayList<>();
        drinkItems.add(new MenuItem("Coke", 2.5, "코카콜라"));
        drinkItems.add(new MenuItem("Sprite", 2.5, "스프라이트"));
        drinkItems.add(new MenuItem("Coffee", 3.5, "커피"));

        //사이드 메뉴
        List<MenuItem> sideItems = new ArrayList<>();
        sideItems.add(new MenuItem("French fry", 2.0, "프렌치 프라이"));
        sideItems.add(new MenuItem("Ice cream", 1.5, "아이스크림"));
        sideItems.add(new MenuItem("Onion ring", 2.5, "바삭 바삭한 어니언 링"));
        sideItems.add(new MenuItem("Cheese stick", 1.5, "쭉 쭉 늘어나는 치즈스틱"));

        // 메뉴 카테고리 추가, 각 개별 항목 추가
        Menu burger = new Menu("Burger");
        for (MenuItem item : burgerItems) {
            burger.getMenuItems().add(item);
        }

        Menu drink = new Menu("Drink");
        for (MenuItem item : drinkItems) {
            drink.getMenuItems().add(item);
        }

        Menu side = new Menu("Side");
        for (MenuItem item : sideItems) {
            side.getMenuItems().add(item);
        }

        // 메뉴 리스트에 추가
        List<Menu> menu = new ArrayList<>();
        menu.add(burger);
        menu.add(drink);
        menu.add(side);

        Kiosk kiosk = new Kiosk(menu);
        kiosk.start();
    }
}
1