package tabelafutebol;

import java.util.Random;

public class Campeonato {
    
    private String nomeCamp;
    private Clube mandante;
    private Clube visitante;
    private int golsMandante;
    private int golsVisitante;
    
    public Campeonato(){
    }
    public Campeonato(String nomeCamp){
        this.nomeCamp = nomeCamp;
    }
    
    public String getNomeCamp(){
        return this.nomeCamp;
    }
    public void setNomeCamp(String n){
        this.nomeCamp = n;
    }
    
    public Clube getMandante(){
        return this.mandante;
    }
    public void setMandante(Clube mando){
        this.mandante = mando;
    }
    
    public Clube getVisitante(){
        return this.visitante;
    }
    public void setVisitante(Clube visita){
        this.visitante = visita;
    }
    
    public int getGolsMandante(){
        return this.golsMandante;
    }
    public void setGolsMandante(int gFM){
        this.golsMandante = gFM;
    }
     public int getGolsVisitante(){
        return this.golsVisitante;
    }
    public void setGolsVisitante(int gFV){
        this.golsVisitante = gFV;
    }
    
    
    
    public void Nomecampeonato(){
    System.out.println(this.getNomeCamp());
    }
    
    public void partida(Clube mandante, Clube visitante){
        
        this.mandante = mandante;
        this.visitante = visitante;
        
        Random aleatorio = new Random();
        
        int placar = aleatorio.nextInt(5);                
            setGolsMandante(placar);
            this.mandante.setgMarcados(placar);
            this.visitante.setgSofridos(placar);
                       
        int placar2 = aleatorio.nextInt(5);
            setGolsVisitante(placar2);
            this.visitante.setgMarcados(placar2);
            this.mandante.setgSofridos(placar2);
            
            
         if(this.getGolsMandante() > this.getGolsVisitante()){
             System.out.println(this.mandante.getNome()+ " " + this.getGolsMandante() + " X " + this.getGolsVisitante() + " " + this.visitante.getNome());
             this.mandante.ganhar();
             this.visitante.perder();            
         }
         else if(this.getGolsMandante() == this.getGolsVisitante()){
             System.out.println(this.mandante.getNome()+ " " + this.getGolsMandante() + " X " + this.getGolsVisitante() + " " + this.visitante.getNome());
             this.mandante.empatar();
             this.visitante.empatar();
         }
         else{
             System.out.println(this.mandante.getNome()+ " " + this.getGolsMandante() + " X " + this.getGolsVisitante() + " " + this.visitante.getNome());
             this.mandante.perder();
             this.visitante.ganhar();
         }
         this.mandante.setSaldo();
         this.visitante.setSaldo();
    }
    
    
    
}
