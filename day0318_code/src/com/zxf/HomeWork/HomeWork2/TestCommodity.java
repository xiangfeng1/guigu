package com.zxf.HomeWork.HomeWork2;
/*商品
* 我们需要做一个商品管理系统，目前需要展示的是商品的编号、名称、价格、
* 库存等信息，请设计商品类，并创建几个商品对象来展示其信息
* */
public class TestCommodity {
    public static void main(String[] args) {
        Commodity commodity1 = new Commodity();
        commodity1.id="1212";
        commodity1.title="java基础";
        commodity1.price=35.2;
        commodity1.stock=5;
        System.out.println(commodity1.getInfo());


    }
}
