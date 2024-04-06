public class Senha {
    private String senha;
    private int tamanhoMinimo;
    private int tamanhoMaximo;
    private String caracteresEspeciais;
    public Senha ( String senha , String caracteresEspeciais , int tamanhoMinimo , int tamanhoMaximo ){
        this.senha = senha;
        this.tamanhoMinimo = tamanhoMinimo;
        this.tamanhoMaximo = tamanhoMaximo;
        this.caracteresEspeciais = caracteresEspeciais;}
        public Senha (){
            this( "" , "!@#*()-+ ",12 , 18 );
           
        } 
        public String getSenha(){
            return senha;
        } public void setSenha(String senha){
            this.senha = senha;
        }
    public int gettamanhoMinimo(){
        return tamanhoMinimo;

    }
    public void set(int tamanhoMinimo){
            this.tamanhoMinimo = tamanhoMinimo;}

    public int gettamanhoMaximo(){
        return tamanhoMaximo;
    } 
    public void settamanhoMaximo (int tamanhoMaximo){
        this.tamanhoMaximo = tamanhoMaximo;
    }
    public String getcaracteresEspeciais (){
        return caracteresEspeciais;
    } 
    public void setcaracteresEspeciais (String caracteresEspeciais){

            this.caracteresEspeciais = caracteresEspeciais;
        }
}
