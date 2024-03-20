package course;
public class Course {
    
    private String judul;
    private String deskripsi;
    private String namaPengajar;
    private String level;
    private double harga;

    public Course(String judul, String deskripsi, String namaPengajar, String level, double harga) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.namaPengajar = namaPengajar;
        this.level = level;
        this.harga = harga;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getJudul() {
        return judul;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public String getDeskripsi() {
        return deskripsi;
    }

    public void setNamaPengajar(String namaPengajar) {
        this.namaPengajar = namaPengajar;
    }
    
    public String getNamaPengajar() {
        return namaPengajar;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    public String getLevel() {
        return level;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double getHarga() {
        return harga;
    }

    public void getInfo() {
        System.out.println("===");
        System.out.println("COURSE INFO");
        System.out.println("title: " + judul);
        System.out.println("description: " + deskripsi);
        System.out.println("lecturer: " + namaPengajar);
        System.out.println("level: " + level);
        System.out.println("price: " + harga);
        System.out.println("===");
    }

    public static void main(String[] args) {
        Course course1 = new Course("data science", "learn about data science", "john doe", "all level", 150000);
        Course course2 = new Course("algorithm", "master the basics of algorithm", "enki", "beginner", 75000);
        Course course3 = new Course("docker", "learn about docker from zero to master", "ray krieger", "all level", 125000);

        course1.getInfo();
        course2.getInfo();
        course3.getInfo();
    }
}
