package Box1;

/**
 * @program: Item
 * @description: Student
 * @author: Mr.IoyYang
 * @create: 2023-08-12 21:17
 **/
public class Student {
    public int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void setName(String name){
        this.name=name;
    }


    public String toString() {
        return "age="+age+"\n"+ "name="+name;
    }

    public  String name;
}
