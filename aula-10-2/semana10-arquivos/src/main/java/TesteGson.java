import com.google.gson.Gson;

public class TesteGson {
    public static void main ( String[] args )   {
        Gson gson = new Gson();
        Gerente gerente = new Gerente( "Ana","111.111.111-11", 8000.0, 5 );

        String json = gson.toJson(gerente);
        System.out.println(json);

        Gerente lido = gson.fromJson(json, Gerente.class );
        System.out.println(lido);
        System.out.println("Bonus: " + lido.calcularBonus() );

    }

}
