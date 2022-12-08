package Set_Method;


import java.util.LinkedHashSet;


class ClassA{
    private int id;
    private String name;
    private int age;

    public ClassA(int a, String b, int c) {
        this.id = a;
        this.name = b;
        this.age = c;
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class LinkedHas_Constructor{
    public static void main(String[] args) {
        ClassA o = new ClassA(1,"Udhaya",30);
        ClassA o1 = new ClassA(2,"Prakash",24);
        ClassA o2 = new ClassA(3,"Gaja",20);

        LinkedHashSet<ClassA> n = new LinkedHashSet<>();

        n.add(o);
        n.add(o1);
        n.add(o2);

        n.forEach(s-> System.out.println(s));

    }
};
