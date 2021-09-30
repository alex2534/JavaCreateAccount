package endereco;

import pessoa.Pessoa;

public class Endereco implements EnderecoInterface {
	
	private String Logradouro;
	private String Cidade;
	private String Estado;
	private String Pais;
	private String UF;
	private int Numero;
	private int Quadra;
	
	public String getLogradouro() {
		return Logradouro;
	}
	
	@Override
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	@Override
	public String getCidade() {
		return Cidade;
	}
	
	@Override
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	@Override
	public String getEstado() {
		return Estado;
	}
	@Override
	public void setEstado(String estado) {
		Estado = estado;
	}
	@Override
	public String getPais() {
		return Pais;
	}
	@Override
	public void setPais(String pais) {
		Pais = pais;
	}
	@Override
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	@Override
	public int getNumero() {
		return Numero;
	}
	@Override
	public void setNumero(int numero) {
		Numero = numero;
	}

	public int getQuadra() {
		return Quadra;
	}
	
	@Override
	public void setQuadra(int quadra) {
		Quadra = quadra;
	}

	@Override
	public void setUF(char UF) {
		// TODO Auto-generated method stub
		
	}


	

}
