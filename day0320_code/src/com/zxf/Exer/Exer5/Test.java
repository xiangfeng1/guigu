package com.zxf.Exer.Exer5;
/*（1）声明父类：Person类

- 包含属性：姓名，年龄，性别，属性私有化，
- 包含get/set方法
- 提供无参构造public Person()
- 提供有参构造public Person(String name, int age, char gender)
- 重写toString方法：例如：姓名：张三，年龄：23，性别：男

（2）声明子类：Student类，继承Person类

- 新增属性：score成绩，属性私有化，
- 包含get/set方法
- 提供无参构造public Student()
- 提供有参构造public Student(String name, int age, char gender, int score)
- 重写toString()方法：例如：姓名：张三，年龄：23，性别：男，成绩：89

（3）声明子类：Teacher类，继承Person类

- 新增属性：salary薪资，属性私有化，
- 包含get/set方法
- 提供无参构造public Teacher()
- 提供有参构造public Teacher(String name, int age, char gender, double salary)
- 重写toString()方法：例如：姓名：张三，年龄：23，性别：男，薪资：10000

（4）在测试类的main方法中用有参构造创建三个类的对象，并调用相应的方法测试*/
public class Test {
    public static void main(String[] args) {
        Person p = new Person("张三",23,'男');
        System.out.println(p);

        Student s = new Student("李四",25,'男',90);
        System.out.println(s);

        Teacher t = new Teacher("王五",36,'男',20000);
        System.out.println(t);
    }
}
