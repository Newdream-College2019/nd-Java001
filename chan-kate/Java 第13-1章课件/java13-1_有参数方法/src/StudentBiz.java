
//管理学生对象的对象的类------学生管理员
public class StudentBiz {
    /* 保存学生名字的数组 */
    String[] stuNames = new String[3];
    int index;// 默认值

    /* 添加学生的方法 */
    public void addName(String name) {// name形式参数
        System.out.println("形式参数的name值为：" + name);
        // 添加学生
        // 1,找到数组中的空位置 时间复杂度o(n)
        // for(int i=0;i<stuNames.length;i++) {
        // 这是方式不是很好---每次都要从第1开始遍历数组
//            if(stuNames[i]==null) {
//                //2，添加学生
//                stuNames[i] = name;
//                break;
//            }
        // 比较好的方式：记录索引 时间复杂度o(1)
        if (index == stuNames.length) {
            System.out.println("学生已经满了");
            return;
        }
        stuNames[index] = name;
        index++;
    }

    // 显示所有学生的信息的方法
    public void show() {
        // 调用addName方法？？？
        addName("王旺财");
        for (int i = 0; i < stuNames.length; i++) {
            System.out.println(stuNames[i] + "\t");
        }
    }

    // 指定查找的区间，查找某个学生
    public void findByName(int start, int end, String name) {
        // 标记法
        boolean flag = false;// 假设没找到 做一个标记
        for (int i = start; i <= end; i++) {
            if (stuNames[i].equals(name)) {
                System.out.println(name + "已找到......");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(name + "没有找到.....");
        }

    }
    //多参数有返回的方法的方式
    public boolean findByName2(int start, int end, String name) {
        // 标记法
        boolean flag = false;// 假设没找到 做一个标记
        for (int i = start; i <= end; i++) {
            if (stuNames[i].equals(name)) {
                flag = true;
                break;
            }
        }
        return flag;

    }

}
