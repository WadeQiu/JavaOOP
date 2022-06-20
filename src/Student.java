public class Student {

    public String name;
    public int age;
    public String sex;
    public String ID;

    public Student(String name, int age, String sex, String ID) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.ID = ID;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
