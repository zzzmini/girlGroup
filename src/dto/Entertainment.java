package dto;

public class Entertainment {
    private int e_id;
    private String name;

    @Override
    public String toString() {
        return "Entertainment{" +
                "e_id=" + e_id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
