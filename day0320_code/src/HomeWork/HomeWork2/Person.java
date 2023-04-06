package HomeWork.HomeWork2;

public class Person {
    private String name;
    private int age;

    private char gender;
    private String job;

    public char getGender() {
        return gender;
    }



    public void setGender(char gender) {
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+"吃饭");
    }
    public void toilet(){
        System.out.println(name+"上洗手间");
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "我的名字："+ name + ", 今年" + age + "岁了, 工作是" + job ;
    }
}
