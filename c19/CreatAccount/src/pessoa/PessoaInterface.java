package pessoa;

import java.sql.Date;

import endereco.Endereco;

public interface PessoaInterface {
	
	public void setNome(String Nome);
	public String getNOme();
	
	public void setSobreNome(String SobreNome);
	public String getSobreNome();
	
	public void setCPF(String CPF);
	public String getCPF();
	
	public void setDataNascimento(Date DataNascimento);
	public Date getDataNascimento();
	
	public void setEndereco(Endereco enderco);
	public Endereco getEndereco();

	
}
