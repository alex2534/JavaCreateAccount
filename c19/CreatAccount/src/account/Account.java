package account;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import conectar.Conectar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import  cpfVerifica.*;
import  pessoa.Pessoa;

public class Account {
	
	public static void main(String[] args) {
		
		Connection conection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
//		Scanner entrada = new Scanner(System.in);
//		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yy");
//
//		
//		Pessoa pessoa = new Pessoa();
//		String CPF;
//		
//		
		
		conection = Conectar.conectar();
		System.out.println(conection);
//		pessoa.setNome(entrada.next());
//		pessoa.getNOme();
//		pessoa.setSobreNome(entrada.next());
//		pessoa.getSobreNome();
//		pessoa.setCPF(entrada.next());
//		pessoa.getCPF();
//		pessoa.setDataNascimento(data.get2DigitYearStart());
//		pessoa.getDataNascimento();
//		
//		pessoa.getEndereco().setLogradouro(entrada.next());
//		pessoa.getEndereco().getLogradouro();
//		pessoa.getEndereco().setNumero(entrada.nextInt());
//		pessoa.getEndereco().getNumero();
//		pessoa.getEndereco().setUF(entrada.next());
//		pessoa.getEndereco().getUF();
//		pessoa.getEndereco().setCidade(entrada.next());
//		pessoa.getEndereco().getCidade();
//		pessoa.getEndereco().setPais(entrada.next());
//	
//		
//	
//		System.out.print(pessoa.getEndereco().getLogradouro());
//		
//		System.out.println("Entre seu cpf");
//		pessoa.setCPF(entrada.next());
//		CPF = pessoa.getCPF();
//		
//	     // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
//        if (ValidaCPF.isCPF(CPF) == true)
//           System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
//        else System.out.printf("Erro, CPF invalido !!!\n");
//        
		
		
	}
	
}
