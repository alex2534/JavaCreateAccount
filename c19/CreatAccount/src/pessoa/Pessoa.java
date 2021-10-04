package pessoa;
import java.util.Date;

import  endereco.Endereco;




public class Pessoa implements PessoaInterface {
	
	Endereco endereco;
	
	private int id;
	private String Nome;
	private String SobreNome;
	private String CPF;
	private Date DataNascimento;
	
	public Pessoa() {
		endereco = new Endereco();
	}
	
	public void setID(int ID) {
		this.id = ID;
	}
	
	public int getID() {
		return id;
	}
	
	@Override
	public void setEndereco(Endereco enderco) {
		this.endereco = endereco;
	};
	@Override
	public Endereco getEndereco() {
		return endereco;
	};
	
	
	@Override
	public String getNome() {
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
	
	public void setDataNascimento(Date date) {
		this.DataNascimento = date;
	};
	
	public java.sql.Date getDataNascimento() {
		return (java.sql.Date) DataNascimento;
	}

	@Override
	public void setDataNascimento(java.sql.Date DataNascimento) {
		// TODO Auto-generated method stub
		
	}



}
