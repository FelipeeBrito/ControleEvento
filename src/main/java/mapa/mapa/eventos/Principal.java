/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mapa.mapa.eventos;

// Felipe Maycon da Slva Brito 
//  Ra: 21103381-5
public class Principal {
  
    public static void main(String[] args) {

        Eventos NewEvent = new Eventos();
        Ingresso NewIngresso = new Ingresso();

        
        for (int i = 0; i < NewEvent.evento.length; i++) {
            NewEvent.evento[i] = new Eventos(
                    "Evento " + (i + 1),
                    ((i + 1) * 2) + "/" + (i + 1) + "/2022",
                    100.00 * (i + 1),
                    100 * (i + 1),
                    0
                );
        }

               
        for (Eventos evento : NewEvent.evento) {
            System.out.println(evento.summary());
            System.out.println(NewIngresso.getValueIngresso(evento.getPrice()));
        }

        
        if (NewEvent.evento[0].verifyCapacity()) {
            NewEvent.evento[0].sellTicket(); 

            NewIngresso.ingresso[0] = new Ingresso("CAMAROTE", "13456789123", "Felipe", NewEvent.evento[0].getName(), NewEvent.evento[0].getDate(), NewEvent.evento[0].getPrice(), NewEvent.evento[0].getCapacity(), NewEvent.evento[0].getSoldTickets());

            NewEvent.evento[0].listTickets[0] = NewIngresso.ingresso[0].summary();
        }
        if (NewEvent.evento[0].verifyCapacity()) {
            NewEvent.evento[0].sellTicket(); 

            NewIngresso.ingresso[1] = new Ingresso("PISTA", "13456789123", "Brito", NewEvent.evento[0].getName(), NewEvent.evento[0].getDate(), NewEvent.evento[0].getPrice(), NewEvent.evento[0].getCapacity(), NewEvent.evento[0].getSoldTickets());

            NewEvent.evento[0].listTickets[1] = NewIngresso.ingresso[1].summary();
        }
        if (NewEvent.evento[0].verifyCapacity()) {
            NewEvent.evento[0].sellTicket(); 

            NewIngresso.ingresso[2] = new Ingresso("VIP", "13456789123", "Kelvin", NewEvent.evento[0].getName(), NewEvent.evento[0].getDate(), NewEvent.evento[0].getPrice(), NewEvent.evento[0].getCapacity(), NewEvent.evento[0].getSoldTickets());

            NewEvent.evento[0].listTickets[2] = NewIngresso.ingresso[2].summary();
        }
        if (NewEvent.evento[1].verifyCapacity()) {
            NewEvent.evento[1].sellTicket(); 

            NewIngresso.ingresso[3] = new Ingresso("CAMAROTE", "13456789123", "JoaoV", NewEvent.evento[1].getName(), NewEvent.evento[1].getDate(), NewEvent.evento[1].getPrice(), NewEvent.evento[1].getCapacity(), NewEvent.evento[1].getSoldTickets());

            NewEvent.evento[1].listTickets[0] = NewIngresso.ingresso[3].summary();
        }
        if (NewEvent.evento[1].verifyCapacity()) {
            NewEvent.evento[1].sellTicket(); 

            NewIngresso.ingresso[4] = new Ingresso("VIP", "13456789123", "Flavio", NewEvent.evento[1].getName(), NewEvent.evento[1].getDate(), NewEvent.evento[1].getPrice(), NewEvent.evento[1].getCapacity(), NewEvent.evento[1].getSoldTickets());

            NewEvent.evento[1].listTickets[1] = NewIngresso.ingresso[4].summary();
        }
        if (NewEvent.evento[1].verifyCapacity()) {
            NewEvent.evento[1].sellTicket(); 

            NewIngresso.ingresso[5] = new Ingresso("PISTA", "13456789123", "Jefferson", NewEvent.evento[1].getName(), NewEvent.evento[1].getDate(), NewEvent.evento[1].getPrice(), NewEvent.evento[1].getCapacity(), NewEvent.evento[1].getSoldTickets());

            NewEvent.evento[1].listTickets[2] = NewIngresso.ingresso[5].summary();
        }

        
        for (Eventos evento : NewEvent.evento) {
            for (String listTicket : evento.listTickets) {
                System.out.println(listTicket);
            }
        }
        
    }
}
