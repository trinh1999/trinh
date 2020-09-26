public class dg {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public dg(int id, String name) {
        this.id = id;
        this.name = name;
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

    public int hashCode(){

        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof dg) {
            dg another = (dg) obj;
            if (this.id == another.id && this.name.equals(another.name))
                return true;
        }
        return false;
    }

}
class Entry{
    public static void main(String[] args) {
        dg dg1 = new dg(1,"tam");
        dg dg2 = new dg(1,"tam");
        dg d3 = dg1;
        System.out.println(dg1.hashCode());
        System.out.println(dg1);
        System.out.println(dg2.hashCode());
        System.out.println(dg2);
        System.out.println(dg1 == d3);
    }
}
