///**
// * Classe principal do sistema
// * Gerencia sua execucao
// */
//package controller;
//
//import application.Salao;
//import application.Cliente;
//import application.Prestador;
//import java.io.IOException;
//import java.text.ParseException;
//import java.util.logging.FileHandler;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import model.ArquivoPrestador;
//import model.CadastroPrestador;
//
///**
// *
// * @author guilherme
// */
//public class MyController {
//
//    private static final Logger LOGGER = Logger.getLogger(Programa.class.getName());
//
//    public static void main(String args[]){
//
//        /*FileHandler fh = null;
//        
//        try {
//            fh = new FileHandler("log.txt");
//            fh.setLevel(Level.FINE);
//        } catch (IOException | SecurityException ex) {
//            Logger.getLogger(MyController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        LOGGER.addHandler(fh);    
//
//        try{
//            Programa prog;
//            prog = new Programa();                        
//
//            LOGGER.log(Level.INFO, "Entrou no sistema às: {0}", new SimpleDateFormat("HH:mm - dd/MM/yyyy").format(new Date(System.currentTimeMillis())));
//
//            Salao.setNome("Vicellis");
//            prog.boasVindas();
//
//            Cliente cli = new Cliente("Guilherme","47577220876","gg.dossantos@hotmail.com","19982534663",'M',new SimpleDateFormat("dd/MM/yyyy").parse("11/08/1998"));        
//            Cliente cli2 = new Cliente("José","47577220876","gg.dossantos@hotmail.com","19982534663",'M',new SimpleDateFormat("dd/MM/yyyy").parse("11/08/1998"));
//
//            System.out.println("Clientes cadastrados: \n");
//            System.out.println(cli.toString());
//            System.out.println(cli2.toString());
//
//            System.out.println("\n\nBuscando um prestador no arquivo: \n");
//            ArquivoPrestador arq = new ArquivoPrestador();
//            CadastroPrestador obj = arq.load();
//            Prestador prestador = obj.getPrestador();
//            System.out.println("\nNome: " + prestador.getNome() + "\nEmail: " + prestador.getEmail() + "\nSexo: " + prestador.getSexo());
//
//            prog.despedida();
//
//            LOGGER.log(Level.INFO, "Saiu do sistema às: {0}", new SimpleDateFormat("HH:mm - dd/MM/yyyy").format(new Date(System.currentTimeMillis())));
//
//        }catch(ParseException ex){
//            LOGGER.log(Level.SEVERE, ex.getMessage());
//            System.out.println("Houve um erro relacionado ao formato das datas, verifique e tente novamente");
//
//        }catch(Exception ex){
//            LOGGER.log(Level.SEVERE, ex.getMessage());
//            System.out.println("Algo deu errado: " + ex.getMessage());
//        }*/
//    }
//}