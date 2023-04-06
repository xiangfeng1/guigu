package HomeWork.HomeWork2;

public class Test {
    public static void main(String[] args) {
        Man man1 = new Man();
        man1.setName("张三");
        man1.setAge(23);
        man1.setJob("Java中级工程师");

        Man man2 = new Man();
        man2.setName("李四");
        man2.setAge(24);
        man2.setJob("大数据工程师");

        Woman woman1 = new Woman();
        woman1.setName("翠花");
        woman1.setAge(22);
        woman1.setJob("UI设计师");

        Woman woman2 = new Woman();
        woman2.setName("如花");
        woman2.setAge(23);
        woman2.setJob("前端设计师");

        System.out.println("------------初次见面--------------");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);

        System.out.println("-------------开始聚餐--------------");
        man1.eat();
        man2.eat();
        woman1.eat();
        woman2.eat();

        System.out.println("---------------饭后休息-------------");
        man1.toilet();
        man1.smoke();
        man2.toilet();
        man2.smoke();

        woman1.toilet();
        woman1.makeup();
        woman2.toilet();
        woman2.makeup();
    }
}
