import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Method mt = new Method();
        int choice;
        do {
            System.out.println("1.add");
            System.out.println("2.search");
            System.out.println("3.show");
            System.out.println("4.delete");
            System.out.println("5.update");
            System.out.println("6.Write to File");
            System.out.println("7.Read to file");
            System.out.println("Exit");
            Scanner sc = new Scanner(System.in);
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Anime");
                    Anime anime = new Anime();
                    try {
                        mt.add(anime);
                    } catch (Exception e){
                        System.err.println(e.getMessage());
                    }

                    System.out.println("Add complete!!");
                    break;
                case 2:
                    System.out.println("Enter id of file want search. ");
                    String idSearch = sc.nextLine();
                    mt.search(idSearch).display();
                    break;
                case 3:
                    mt.show();
                    break;
                case 4:
                    System.out.println("Enter id of file want delete. ");
                    String idDelete = sc.nextLine();
                    mt.delete(idDelete);
                    System.out.println("Delete complete!!");
                    break;
                case 5:
                    System.out.println("Enter id want update. ");
                    String idUpdate = sc.nextLine();
                    break;
                case 6:
                    mt.writeFile();
                    System.out.println("Add to file complete!!");
                    break;
                case 7:
                    mt.readFile();
                    break;
            }
        } while (choice != 8);
    }
}
