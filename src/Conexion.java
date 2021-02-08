public class Conexion {
      int test;
      public Conexion(){
             this.test = 11111111;
      }

      public void hitest(){
            System.out.println(test);
      }
        /*  Statement myStatement;
    int prtd = 0;
    public Conexion(){


        Connection miConnect = null;
        try {
            miConnect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/domino?serverTimezone=UTC", "root", "");

            myStatement = miConnect.createStatement();
            System.out.println("Conectado a Base de Datos");
        } catch (SQLException e) {
            e.printStackTrace();

        }


}
public  void guardarPartida(String nombreG, int pntsG){

    try {
        ResultSet myResults = myStatement.executeQuery("select 'id_partida' from domino");
        while (myResults.next()) {
           prtd = myResults.getInt("id_partida");
        }
        if (prtd == 0){
            prtd = 1;
        }
        else{
            prtd += 1;
        }

        System.out.println("Guardando partida...");
        String instrGP = "insert into domino (id_partida, nombre_ganador, puntos_ganador) values ("+prtd+", '"+nombreG+"', '"+pntsG+"' )";

    }catch (SQLException e) {
        e.printStackTrace();
    }
}

public void verPartidas(){
    ResultSet myResults = null;
    try {
        myResults = myStatement.executeQuery("select * from domino");
        if(myResults.next() == true) {
            System.out.println("Partidas guardadas: ");
            while (myResults.next()) {

                System.out.println( "Partida: " + myResults.getString("id_partida") + ", Ganador: " + myResults.getString("nombre_ganador") + ", Puntos: " + myResults.getString("puntos_ganador"));
            }
        }
        else {
            System.out.println("Sin resultados");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

}*/

}

  /*  Statement myStatement;
    int prtd = 0;
    public Conexion(){


        Connection miConnect = null;
        try {
            miConnect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/domino?serverTimezone=UTC", "root", "");

            myStatement = miConnect.createStatement();
            System.out.println("Conectado a Base de Datos");
        } catch (SQLException e) {
            e.printStackTrace();

        }


}
public  void guardarPartida(String nombreG, int pntsG){

    try {
        ResultSet myResults = myStatement.executeQuery("select 'id_partida' from domino");
        while (myResults.next()) {
           prtd = myResults.getInt("id_partida");
        }
        if (prtd == 0){
            prtd = 1;
        }
        else{
            prtd += 1;
        }

        System.out.println("Guardando partida...");
        String instrGP = "insert into domino (id_partida, nombre_ganador, puntos_ganador) values ("+prtd+", '"+nombreG+"', '"+pntsG+"' )";

    }catch (SQLException e) {
        e.printStackTrace();
    }
}

public void verPartidas(){
    ResultSet myResults = null;
    try {
        myResults = myStatement.executeQuery("select * from domino");
        if(myResults.next() == true) {
            System.out.println("Partidas guardadas: ");
            while (myResults.next()) {

                System.out.println( "Partida: " + myResults.getString("id_partida") + ", Ganador: " + myResults.getString("nombre_ganador") + ", Puntos: " + myResults.getString("puntos_ganador"));
            }
        }
        else {
            System.out.println("Sin resultados");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

}*/

