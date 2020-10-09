import java.util.Scanner;

public class Anime extends File {
    private String nameOfAnime;
    private String author;
    private String soPage;
    private String country;

    public Anime() {
    }


    public Anime(String nameOfAnime, String id, String nameNXB, String soBanPhatHanh, float rank, float price, String author, String soPage, String country) {
        super(id, nameNXB, soBanPhatHanh, rank, price);
        this.author = author;
        this.soPage = soPage;
        this.country = country;
        this.nameOfAnime = nameOfAnime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSoPage() {
        return soPage;
    }

    public void setSoPage(String soPage) {
        this.soPage = soPage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNameOfAnime() {
        return nameOfAnime;
    }

    public void setNameOfAnime(String nameOfAnime) {
        this.nameOfAnime = nameOfAnime;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Anime{" +
                "nameOfAnime='" + nameOfAnime + '\'' +
                ", author='" + author + '\'' +
                ", soPage='" + soPage + '\'' +
                ", country='" + country + '\'' +
                '}');
    }

    @Override
    public void addInfo() {
        super.addInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Anime: ");
        nameOfAnime = sc.nextLine();
        System.out.println("Enter author: ");
        author = sc.nextLine();
        System.out.println("Enter so trang: ");
        soPage = sc.nextLine();
        System.out.println("Enter quoc gia phat hanh: ");
        country = sc.nextLine();
    }


}
