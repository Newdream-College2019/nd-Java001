   //  测试类ß
public class TestStu {
    public static void main(String[] args) {
        //1,管理员对象
        StudentBiz sb =new StudentBiz();
        //2,学生对象
        Student s = new Student();
        s.name="王二狗";
        
        Student s1 = new Student();
        s1.name="王来福";
        
        Student s2 = new Student();
        s2.name="王二娃";
        
        //3,管理员添加学生----参数传递：1:值传递，2:引用传递
       // sb.stuNames[0] = "王二娃";
        sb.addName(s.name);//实参
        sb.addName(s1.name);//实参 
        sb.addName(s2.name);
        System.out.println("-----------------------------------");
        sb.show();
        
        
        System.out.println("--------------------从下标为1开始到下标为2结束查找 二狗子这个是否存在在数组中------");
        //无返回值的方法的调用：直接调用  注意： 实参与形参必须一致。
        //sb.findByName(1, 2, "王二娃");
        
        //返回值的方法的调用：1，接受返回值，2，打印返回值
        String name = "王三娃";
        boolean f = sb.findByName2(1, 2, name);
        if(f) {
            System.out.println(name+"找到了");
        }else {
            System.out.println(name+"没有找到");
        }
    }
}
