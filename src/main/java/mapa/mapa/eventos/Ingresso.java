/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa.mapa.eventos;

// Felipe Maycon da Slva Brito 
//  Ra: 21103381-5
public class Ingresso extends Eventos {
    private String tipo;
    private String nomeClient;
    private String CPF;
    private double variacao;
    protected Ingresso[] ingresso = new Ingresso[6];

    public Ingresso() {
    }

    public Ingresso(String type, String CPF, String name_client, String name_event, String date, double price, int capacity, int soldTickets) {
        super(name_event, date, price, capacity, soldTickets);
        this.tipo = type;
        this.CPF = CPF;
        this.nomeClient = name_client;
    }

    public String getType() {
        return tipo;
    }

    public String getCPF() {
        return CPF;
    }

    public double calcValue(String type) {
        switch (type) {
            case "VIP":
                this.variacao = getPrice() * 1.3;
                break;
            case "CAMAROTE":
                this.variacao = getPrice() * 1.6;
                break;
            default:
                this.variacao = getPrice();
                break;
        }
        return this.variacao;
    }

    public String getValueIngresso(double d) {
        String value = "====================================================\n";
        value += "CAMAROTE: " + (d * 1.6) + "\n";
        value += "VIP: " + (d * 1.3) + "\n";
        value += "PISTA: " + d + "\n";
        value += "====================================================\n";
        return value;
    }

    public String impressionValue(String tipo) {
        String Data = "";
        Data = "\n***************************************************\n";
        Data += "Evento: " + getName() + " - " + getDate() + "\n";
        Data += "\nIngresso: " + tipo;
        Data += "\nValor do ingresso: R$ " + calcValue(tipo);
        Data += "\n\n***************************************************\n";
        return Data;
    }

    public String summary() {
        String 
        summary = ".......................................................\n";
        summary += "..............RESUMO DE INGRESSO VENDIDO..............\n";
        summary += "Evento: " + getName() + " - " + getDate() + "\n";
        summary += "Nome: " + this.nomeClient + "\n";
        summary += "Tipo: " + this.tipo + "\n";
        summary += "CPF: " + this.CPF + "\n";
        summary += "Valor: " + calcValue(this.tipo) + "\n";
        summary += ".......................................................\n";
        summary += soldTickets() + "\n";
        summary += showQuantity() + "\n";
        summary += ".......................................................\n";
        return summary;
    }

}
    