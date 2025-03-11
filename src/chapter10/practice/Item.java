package chapter10.practice;

//시스템의 제품이 가져야 할 기본 속성과 메서드
abstract class Item {
    private final String id;
    private final String name;

    //생성자
    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //추상 메서드 포함
    public abstract void display();

}
