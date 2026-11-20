import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class LeituraJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Type tipoLista = new TypeToken<List<Funcionario>>() {}.getType();

        try (FileReader reader = new FileReader("funcionarios.json")) {
            List<Funcionario> funcionarios = gson.fromJson(reader, tipoLista);

            for (Funcionario f : funcionarios) {
                System.out.println(f);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}