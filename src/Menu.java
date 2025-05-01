import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String category;
    private List<MenuItem> menuItems;

    //생성자
    public Menu(String category) {
        this.category = category;
        this.menuItems = new ArrayList<>();
    }

    @Override
    public String toString() {
        return category;
    }

    //게터
    public String getCategory() {
        return category;
    }

    //메뉴 리스트 출력
    public void printcategory () {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i));
        }
    }

    // List 리턴
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
1