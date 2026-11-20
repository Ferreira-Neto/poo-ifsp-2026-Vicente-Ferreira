import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraCsv {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

        try (CSVReader reader = new CSVReaderBuilder(new FileReader("funcionarios.csv"))
                .withCSVParser(parser)
                .build()) {

            List<String[]> linhas = reader.readAll();

            for (int i = 1; i < linhas.size(); i++) {
                String[] l = linhas.get(i);
                try {
                    double salario = Double.parseDouble(l[2]);
                    funcionarios.add(new Funcionario(l[0], l[1], salario));
                } catch (NumberFormatException e) {
                    System.out.println("Linha " + (i + 1) + " ignorada: salário inválido (" + l[2] + ")");
                }
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}