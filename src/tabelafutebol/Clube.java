package tabelafutebol;

public class Clube {
    private String nome;
    private int pontos;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int gMarcados;
    private int gSofridos;
    private int saldo;
    
    public Clube(String nome){
        this.nome = nome;
        pontos = 0;
        vitorias = 0;
        empates  = 0;
        derrotas = 0;
        gMarcados  = 0;
        gSofridos = 0;
        saldo = 0;
        
    }
    
    public Clube(String nome, int p, int v, int e, int d,int gM, int gS){
        this.nome = nome;
        pontos = p;
        vitorias = v;
        empates = e;
        derrotas = d;
        gMarcados = gM;
        gSofridos = gS;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    
    public int getPontos(){
        return this.pontos;
    }
    public void setPontos(int p){
        this.pontos = p;
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    public int getgMarcados() {
        return gMarcados;
    }
    public void setgMarcados(int gMarcado) {
        this.gMarcados =  gMarcados + gMarcado;
    }
    
    public int getgSofridos() {
        return gSofridos;
    }   
    public void setgSofridos(int gSofrido) {
        this.gSofridos =  gSofridos + gSofrido;
        
    }

    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(){
        this.saldo = saldo + (getgMarcados() - getgSofridos());
    }
    
    
    public void ganhar(){
        setVitorias(getVitorias()+1);
        setPontos(getPontos()+3);
    }
    
    public void empatar(){
        setEmpates(getEmpates()+1);
        setPontos(getPontos()+1);
    }
    public void perder(){
        setDerrotas(getDerrotas()+1);
    }
    
    
    
    public void classificacao(){
        
        
        System.out.print("Nome:  "+ this.getNome()+ " | ");
        System.out.print("P:" + this.getPontos()+ " | ");
        System.out.print("V: " + this.getVitorias()+ " |");
        System.out.print("E: "+ this.getEmpates()+ " | ");
        System.out.print("D: "+ this.getDerrotas()+ " | ");
        System.out.print("S: "+ this.getSaldo()+ " | ");
        System.out.print("GF: "+ this.getgMarcados()+ " | ");
        System.out.println("GS: "+this.getgSofridos()+ " | ");
    }
    
}


