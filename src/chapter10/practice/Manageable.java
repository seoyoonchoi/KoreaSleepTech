package chapter10.practice;

import java.util.List;

public interface Manageable {
    //재고관리시스템에서의 동작 정의
    void add(Item item);
    void remove(String id);
    List<Item> search(String keyword);
    //같은 이름의 다른 아이템이 여러개 있을 수 있기 때문에 이렇게 list로 반환한다.
    List<Item> searchByCategory(String category);
    List<Item> searchByPriceRange(int minPrice, int maxPrice);
    //가격 range에 따라 아이템을 반환해줌
    void updateStock(String id, int quantity);
    void listAll();



}
