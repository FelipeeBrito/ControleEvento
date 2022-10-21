/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa.mapa.eventos;
 
// Felipe Maycon da Slva Brito 
//  Ra: 21103381-5
public class Eventos {
    private String NomeEvento;
    private String data;
    private double preco;
    private int capacidade;
    private int Tickets;
    protected Eventos[] evento = new Eventos[2];
    protected String[] listTickets = new String[3];

    public Eventos() {
    }

    public Eventos(String Nome_Evento, String date, double price, int capacity, int soldTickets) {
        this.NomeEvento = Nome_Evento;
        this.data = date;
        this.preco = price;
        this.capacidade = capacity;
        this.Tickets = soldTickets;
    }

    public void setList(String[] list) {
        this.listTickets = list;
    }

    public String[] getList() {
        return listTickets;
    }

    public int getSoldTickets() {
        return Tickets;
    }

    public String getName() {
        return NomeEvento;
    }

    public String getDate() {
        return data;
    }
    
    public double getPrice() {
        return this.preco;
    }

    public int getCapacity() {
        return this.capacidade;
    }

    public String summary() {
        String 
        summary = "====================================================\n";
        summary += "=======================EVENTO======================\n";
        summary += "Nome: " + this.NomeEvento + "\n";
        summary += "Data: " + this.data + "\n";
        summary += "Preco unico: " + this.preco + "\n";
        summary += "Capacidade: " + this.capacidade + "\n";
        summary += "====================================================";
        return summary;
    }

    public boolean verifyCapacity() {
        if (this.capacidade > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void sellTicket() {
        this.Tickets++;
        this.capacidade--;
    }

    public String soldTickets() {
        return "Quantidade de ingressos vendidos: " + getSoldTickets();
    }

    public String showQuantity() {
        return "Quantidade de ingressos disponíveis: " + getCapacity();
    }
}