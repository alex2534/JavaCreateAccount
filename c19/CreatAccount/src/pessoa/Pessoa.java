package pessoa;
import  endereco.Endereco;

import java.sql.Date;




public class Pessoa implements PessoaInterface {
	
	Endereco endereco;
	
	private String Nome;
	private String SobreNome;
	private String CPF;
	private Date DataNascimento;
	
	public Pessoa() {
		endereco = new Endereco();
	}
	
	
	@Override
	public String getNOme() {
		return Nome;
	};
	@Override
	public void setNome(String Nome) {
		this.Nome = Nome;
	};
	
	@Override
	public void setSobreNome(String SobreNome) {
		this.SobreNome = SobreNome;
	};
	
	@Override
	public String getSobreNome() {
		return SobreNome;
	};
	
	@Override
	public void setCPF(String CPF) {
		this.CPF = CPF;
	};
	@Override
	public String getCPF() {
		return CPF;
	};
	
	@Override
	public void setDataNascimento(Date DataNascimento) {
		this.DataNascimento = DataNascimento;
	};
	@Override
	public Date getDataNascimento() {
		return DataNascimento;
	};



}