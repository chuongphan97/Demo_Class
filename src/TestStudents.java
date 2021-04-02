public class TestStudents {
    public static void main(String[] args) {
        Students s2 = new Students(9,"Khanh");

        s2.display();
        System.out.println(s2.getId());
        s2.setName("Khanh em");
        System.out.println(s2.getName());

        ClassRoom andy = new ClassRoom();

        andy.setId(1);
        andy.setName("Andy");
        andy.setCapacity(30);
        andy.display();

        MyMath math = new MyMath(9,2.2);

        math.sum();
        System.out.println(math.sum());
        System.out.println(math.minus());
        System.out.println(math.devide());
        System.out.println(math.mutimle());


    }

}
