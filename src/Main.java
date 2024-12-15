import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Human> pList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("src/foreign_names.csv"));
        String line = br.readLine();
        while ((line = br.readLine()) != null) {
            String[] values = line.split(";");
            pList.add(new Human(
                    Long.parseLong(values[0]),
                    values[1],
                    new Subdivision(values[4].charAt(0)),
                    values[2],
                    Integer.parseInt(values[5]),
                    values[3]
            ));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(pList.get(i).toString());       //Демонстрация работы программы (сформирован список людей)
        }
    }

}
