/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplloretangulo.newpackage;

import javax.swing.JOptionPane;


public class funcionario {
     // 1 coloco os atributos
    private String nome;
    private String sobrenome;
    private int horasTrabalhadas; // # é int
    private double valorPorHora; 
 
    //contrustor
    public Funcionario(){
        nome = "";
        sobrenome= "";
        horasTrabalhadas="";
        valorPorHora="";
        
      
    }
    
    //sobrerecarga de metodo
    
    public Funcionario(String nome, String sobrenome);
    this.nome = nome;
    this.sobrenome=sobrenome;
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the horasTrabalhadas
     */
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    /**
     * @param horasTrabalhadas the horasTrabalhadas to set
     */
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    /**
     * @return the valorPorHora
     */
    public double getValorPorHora() {
        return valorPorHora;
    }

    /**
     * @param valorPorHora the valorPorHora to set
     */
    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    //+nomeCompleto():void - sem retorno
    public void nomeCompleto(){
        JOptionPane.showMessageDialog(null, "Nome completo:"+ (nome+sobrenome));
    }
    //+calcularSalario();void
    public void calcularSalario(){
        JOptionPane.showMessageDialog(null," Salario:" + (valorPorHora*horasTrabalhadas));
    }
    public void incrementarHoras(int horas){ // pegar e adiconar
        this.horasTrabalhadas += horas; // +=  -  pegar o conteudo em horas trabalhadas e somar com horas
    } // CLASSE CRIADA
}


