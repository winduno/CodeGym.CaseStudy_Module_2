import java.util.Scanner;

public abstract class File implements IFile {
    private String id;
    private String nameNXB;
    private String soBanPhatHanh;
    private float rank;
    private float price;

    public File() {
    }

    public File(String id, String nameNXB, String soBanPhatHanh, float rank, float price) {
        this.id = id;
        this.nameNXB = nameNXB;
        this.soBanPhatHanh = soBanPhatHanh;
        this.rank = rank;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameNXB() {
        return nameNXB;
    }

    public void setNameNXB(String nameNXB) {
        this.nameNXB = nameNXB;
    }

    public String getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(String soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public float getRank() {
        return rank;
    }

    public void setRank(float rank) {
        this.rank = rank;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public void display() {
        System.out.println("File{" +
                "id='" + id + '\'' +
                ", nameNXB='" + nameNXB + '\'' +
                ", soBanPhatHanh='" + soBanPhatHanh + '\'' +
                ", rank=" + rank +
                ", price=" + price +
                '}');
    }

    public void addInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id : ");
        id = sc.nextLine();
        System.out.println("Enter tên nhà xuất : ");
        nameNXB = sc.nextLine();
        System.out.println("Enter số bản phát : ");
        soBanPhatHanh = sc.nextLine();
        System.out.println("Enter xếp hạng: ");
        rank = Float.parseFloat(sc.nextLine());
        System.out.println("Enter giá : ");
        price = Float.parseFloat(sc.nextLine());
    }
}
