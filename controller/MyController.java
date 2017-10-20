/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import libs.Cliente;
import libs.Pessoa;

/**
 *
 * @author guilherme
 */
public class MyController {
    
    /**
     * 
     * @param args
     * @throws ParseException 
     */
    public static void main(String args[]) throws ParseException{
       
        Cliente p;
        p = new Cliente("1", "Guilherme", "gg.dossantos@hotmail.com", "19982534663", 'M', new SimpleDateFormat("dd/mm/yyyy").parse("11/08/1998"), "comum");
        
        System.out.println("Dados da pessoa: \n\n");
        
        System.out.println("Código: "+p.getCodigo());
        System.out.println("Nome: "+p.getNome());
        System.out.println("E-mail: "+p.getEmail());
        System.out.println("Telefone: "+p.getTelefone());
        System.out.println(p.getSexo() == 'M' ? "Sexo: Masculino" : "Sexo: Feminino");
        System.out.println("Data de nascimento: "+p.getDataNascimento());
        System.out.println(p.isAtivo() ? "Cliente está: Ativo" : "Cliente está: Inativo");
        System.out.println("Tipo de cliente: "+p.getTipoCliente());
        
    }
}
