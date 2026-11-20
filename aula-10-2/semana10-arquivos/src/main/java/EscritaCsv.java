
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscritaCsv {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = List.of(
                new Funcionario("Ana", "111.111.111-11", 8000.0),
                new Funcionario("Bruno", "222.222.222-22", 6000.0),
                new Funcionario("Carla", "333.333.333-33", 5500.0)
        );

        try (CSVWriter writer = new CSVWriter(
                new FileWriter("funcionarios.csv"),
                ';',
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END)) {

            writer.writeNext(new String[] {"nome", "cpf", "salario"});

            for (Funcionario f : funcionarios) {
                String[] linha = { f.getNome(), f.getCpf(), String.valueOf(f.getSalario()) };
                writer.writeNext(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
