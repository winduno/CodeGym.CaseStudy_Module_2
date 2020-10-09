import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Method {

    static List<File> fileList = new ArrayList<>();

    public void add(Anime anime) throws IOException {
        anime.addInfo();
        fileList.add(anime);
    }

    public File search(String idSearch) throws IOException {
        for (File file : fileList) {
            if (idSearch.equals(file.getId())) {
                return file;
            }
        }
        return null;
    }

    public void show() {
        for (File file : fileList) {
            file.display();
        }
    }

    public void delete(String idDelete) {
        for (File file: fileList
             ) {
            fileList.remove(file);
        }
    }

    public void writeFile() throws IOException {
        FileWriter writer = new FileWriter("TaiLieu");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(fileList.toString());
        bufferedWriter.close();
    }

    public void readFile() throws IOException {

        FileReader frr = new FileReader("TaiLieu");
        BufferedReader br = new BufferedReader(frr);
        String text;
        while ((text = br.readLine()) != null) {
            System.out.println(text);
        }
        br.close();
    }

    public void update(Anime anime) {
        for (File file : fileList) {

        }
    }
}

