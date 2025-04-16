import java.sql.*;

public class ConexaoMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sum_pdv"; 
        String usuario = "root";
        String senha = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado com sucesso ao banco de dados!");
            conexao.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro na conexão com o banco de dados.");
            e.printStackTrace();
        }
    }
}