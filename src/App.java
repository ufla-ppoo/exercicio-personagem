public class App {
    public static void main(String[] args) throws Exception {
        // A lógica principal do programa foi separada em outra classe.
        //
        // Isso foi feito para evitar usos conceitualmente incorretos de
        // atributos e métodos estáticos (será explicado na aula teórica
        // de revisão)
       
        Principal principal = new Principal();
        principal.executar();
    }
}
