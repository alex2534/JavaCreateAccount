package AccountDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ConnectionFactory.ConnectionFactory;
import pessoa.Pessoa;

public class DaoPessoaSalvar {
	public void create(Pessoa a) {

		try {
			ConnectionFactory fabricaconection = new ConnectionFactory();
			Connection conexao = ConnectionFactory.creatConnection();

			// cria um preparedStatment baseado em uma string SQL

			String sql = "INSERT INTO Pessoas (nome, sobreNome) values (?, ?) ";
			PreparedStatement stmt = conexao.prepareStatement(sql);

			// preenche os valores de (? ? ? )
			stmt.setString(1, a.getNome());
			stmt.setString(2, a.getSobreNome());
//			stmt.setString(4, a.getCPF());
//			stmt.setString(5, a.getEndereco().getLogradouro());
//			stmt.setString(6, a.getEndereco().getCidade());

			stmt.execute();
			stmt.close();

			System.out.println("A pessoa " + a.getNome() + "foi gravado BD. ");

		} catch (SQLException e) {
			System.err.println("Erro na comunicação com o banco de dados! ");
			e.printStackTrace();

		}
	}

///Read Area do Codito
	public Pessoa read(int id) {

		try {

			// utiliza a fabrica de conexao para criar uma Connection SQL
			ConnectionFactory fabricaconection = new ConnectionFactory();
			Connection conexao = ConnectionFactory.creatConnection();
			// Busca o aluno pelo id
			String sql = "SELECT * FROM Pessoas WHERE PessoaId = ?";
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, id);

			ResultSet resultado = stmt.executeQuery();
			if (resultado.next()) {
				Pessoa b = new Pessoa();
				b.setNome(resultado.getString("Nome"));
				b.setSobreNome(resultado.getString("sobreNome"));
				b.setID(resultado.getInt("PessoaId"));
				System.out.println(
						"A Pessoa " + b.getNome() + " , Account n. " + b.getSobreNome() + " . " + "id " + b.getID());

				return b;
			} else {
				System.out.println("Account não encontrada !");
			}
			conexao.close();
		} catch (Exception e) {
			System.err.println("Erro na comunicação com o banco de dados!");
			e.printStackTrace();
			return null;
		}
		return null;
	}

	public void update(Pessoa a) {
		try {
//utiliza a fabrica de conexao para criar uma Connection SQl
			ConnectionFactory fabricaconection = new ConnectionFactory();
			Connection conexao = ConnectionFactory.creatConnection();

			// Cria um preparedStatement baseado em string SQL
			String sql = "UPDATE Pessoas SET Nome = ?, sobreNome = ? WHERE PessoaId = ? ";
			PreparedStatement stmt = conexao.prepareStatement(sql);

			// preenche os valores para (?, ? , ?)

			stmt.setString(1, a.getNome());
			stmt.setString(2, a.getSobreNome());
			stmt.setInt(3,  a.getID());
			
			stmt.executeUpdate();
			stmt.close();
			conexao.close();

			System.out.println("O aluno " + a.getNome() + " foi atualizado no BD");

		} catch (Exception e) {
			System.err.println("Erro na comunicação com o banco de dados!");
			e.printStackTrace();
		}
	}

	public void delete(Pessoa pessoa) {
		try {
//utitiza A FABRICA DE CONEXAO PARA CRIAR UMA CONENCTION SQL 
			
			ConnectionFactory fabricaCon = new ConnectionFactory();
			Connection conexao = fabricaCon.creatConnection();
			
			//Remove o aluno 
			String sql = "DELETE FROM Pessoas WHERE PessoaId = ?";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt = conexao.prepareStatement(sql);
			
			stmt.setInt(1, pessoa.getID());
			stmt.execute();
			
			stmt.close();
			System.out.println("A pessoa com o id   "+ pessoa.getID() +" foi removido do BD.");
			conexao.close();
			
		} catch (Exception e) {
			System.err.println("Erro na comunicação com o banco de dados!");
			e.printStackTrace();		}
	}
}
