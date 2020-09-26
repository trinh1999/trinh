package Test;

public abstract class Nguoi {
    private String name;
    private int nam;
    private String diachi;
    private int tuoi;

    public Nguoi(String name, int nam, String diachi, int tuoi){
        this.name=name;
        this.nam=nam;
        this.diachi=diachi;
        this.tuoi=tuoi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public abstract void tinhtuoi(int tuoi);
}
