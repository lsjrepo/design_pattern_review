package memeto;

/**
 * Created by lusaijie on 2018/2/15.
 */
public class Emp {
    private String name;
    private int age;
    private double salary;

    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //进行备忘录操作
    public EmpMemento memento(){
        return new EmpMemento(this);
    }
    //进行数据恢复,恢复成备忘录对象的值
    public void recovery(EmpMemento emto){
        this.name=emto.getName();
        this.age=emto.getAge();
        this.salary=emto.getSalary();
    }
}
