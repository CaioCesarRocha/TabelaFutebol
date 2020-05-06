
package tabelafutebol;

import java.util.ArrayList;

public class TabelaFutebol {

     public static ArrayList<Clube> clubes = new ArrayList<Clube>();
     public static ArrayList<Campeonato> rodadas = new ArrayList<Campeonato>();
     
    public static void main(String[] args) {
                   
        Clube Cruzeiro = new Clube("Cruzeiro",0,0,0,0,0,0);
        clubes.add(Cruzeiro);
        
        Clube URT = new Clube("URT",0,0,0,0,0,0);   
        clubes.add(URT);
        
        Clube Galo = new Clube("Galo",0,0,0,0,0,0);
        clubes.add(Galo);
        
        Clube America = new Clube("America",0,0,0,0,0,0);
        clubes.add(America);
        
        
        Campeonato nome = new Campeonato("Campeonato Mineiro");
        nome.Nomecampeonato();
        
        Campeonato Rodada1 = new Campeonato();
        Rodada1.partida(clubes.get(1), clubes.get(2));
        Rodada1.partida(clubes.get(3), clubes.get(0));
        rodadas.add(Rodada1);
        
        
        Campeonato Rodada[] = new Campeonato[3];
        Rodada[1] = new Campeonato();
        Rodada[1].partida(clubes.get(1), clubes.get(2));
        Rodada[1].partida(clubes.get(3), clubes.get(0));
        Rodada[1].partida(clubes.get(3), clubes.get(2));
        
        
        URT.classificacao();
        America.classificacao();
        Cruzeiro.classificacao();
        Galo.classificacao();
        
    }
    
}
