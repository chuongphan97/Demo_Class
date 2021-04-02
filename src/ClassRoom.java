public class ClassRoom {
     private int id;
     private String name;

    public ClassRoom(int id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private int capacity;

    public ClassRoom() {

    }
    void display(){
        System.out.println("Phòng số: " + this.id + "tên là: " + this.name+" có sức chứa: "+ this.capacity);
    }
}
