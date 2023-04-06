package com.zxf.HomeWork.HomeWork11;


import java.util.function.Predicate;
/*已知在java.util.function包下有一个Predicate接口（这个接口不用写）
- 包含抽象方法：boolean test(Object obj);

（1）声明一个数组工具类ArrayTools，包含
静态方法：public static void print(Object[] arr)：使用for循环遍历输出数组元素

（2）声明一个员工类Employee
- 包含属性编号、姓名、年龄、薪资，私有化，
- 提供无参和有参构造
- 提供get/set方法
- 重写toString方法，返回员工对象的基本信息

（3）声明一个员工管理类：EmployeeService，
- 包含private Employee[] arr并创建长度为5的数组
- 包含private int total，记录arr中员工对象个数
- 包含public void add(Employee emp)方法，将emp对象添加到arr数组中，
- 包含public Employee[] get(Predicate p)方法，这个方法的作用就是在arr数组中筛选出满足某个条件的员工对象。
  - 要求遍历arr数组，统计arr数组中有几个元素通过p的test方法判断返回true，假设count个
  - 创建Emloyee[]数组result，长度为count，并把arr中满足p的test方法条件的元素就添加到返回值的result数组中。

（4）在测试类中，创建EmployeeService对象，*/

public class EmployeeService {
    private Employee[] arr=new Employee[5];
    //记录arr中员工对象的个数
    private int total;

    //想数组添加元素
    public void add(Employee emp){
        if (total >=arr.length) {
            System.out.println("数组已满，无法添加");
            return;
        }
        arr[total++]=emp;
    }

   // 调用get(Predicate p)方法，通过匿名内部类的对象给形参p赋值，分别实现获取：
    public Employee[] get(Predicate p) {
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if( p.test(arr[i])) {
                count++;
            }
        }
        Employee[] result= new Employee[count];
        count=0;
        for (int i = 0; i <arr.length ; i++) {
            if( p.test(arr[i])) {
               result[count++]=arr[i];
            }
        }
        return result;
    }
}
