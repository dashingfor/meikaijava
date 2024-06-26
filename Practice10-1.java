// 连续编号类

class Id {
    static int counter = 0;           // 赋到了哪一个标识编号
    private int id;                  // 标识编号     // 练习10-1：在原来的代码基础上添加static

    static int getMaxID() {                 // 练习10-1
        return counter;
    }
    
    //--- 构造函数 ---//
    public Id() {
        id = ++counter;                     // 标识编号
    }

    //--- 获取标识编号 ---//
    public int getId() {
        return id;
    }
}
public class IdTester {
    public static void main(String[] args) {
        Id a = new Id();                    // 标识编号1号
        Id b = new Id();                    // 标识编号2号

        System.out.println("a的标识编号：" + a.getId());
        System.out.println("b的标识编号：" + b.getId());

        System.out.println("Id.counter = " + Id.counter);
        System.out.println(" a.counter = " +  a.counter);
        System.out.println(" b.counter = " +  b.counter);
        System.out.println("最大标识编号" + Id.getMaxID());   // 练习 10-1
    }
}
