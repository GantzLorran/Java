
package modelo.bd;


public class DataBaseFactory {
    public static DataBase getDataBase(String nomeDb){
        if(nomeDb.equals("mysql")){
            return new MySqlDataBase();
        }else if(nomeDb.equals("postegre")){
            return new PostgreSqlDataBase();
        }
        return null;
    }
}
