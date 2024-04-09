package beans;

public class student {

    private int id;
    private String name;
    private String email;
    private String Address;
    private float Marks;

    public student(){

    }

    public student(int id , String name , String email , String Address , float Marks ){
        super();

        this.id = id;
        this.name = name;
        this.email = email;
        this.Address = Address;
        this.Marks = Marks;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public float getMarks() {
        return Marks;
    }

    public void setMarks(float marks) {
        this.Marks = marks;
    }

    public String toString(){
        String str = "["+getId()+" "+getName()+" "+getEmail()+" "+getAddress()+" "+getMarks()+"]";
        return str;
    }

}
