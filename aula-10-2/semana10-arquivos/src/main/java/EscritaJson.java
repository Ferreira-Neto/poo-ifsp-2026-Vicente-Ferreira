import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscritaJson {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = List.of(
                new Funcionario("Ana", "111.111.111-11", 8000.0),
                new Funcionario("Bruno", "222.222.222-22", 6000.0),
                new Funcionario("Carla", "333.333.333-33", 5500.0)
        );

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("funcionarios.json")) {
            gson.toJson(funcionarios, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}