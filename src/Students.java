public class Students {
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

    private int id ;
    private String name;
    public Students(int i , String j){
        this.id = i;
        this.name = j ;

    }
    void display(){
        System.out.println(this.id + " " + this.name);
    }


}

