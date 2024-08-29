public class Principal{

    public static void main(String[] args){
        
        Lista<String> lista = new Lista<String>("Alunos");

        lista.imprimeLista();
        lista.addInicio("Rafael");
        lista.imprimeLista();
        lista.addInicio("Miguel");
        lista.imprimeLista();
        lista.addFinal("Gabriel");
        lista.imprimeLista();
        lista.addFinal("Daniel");
        lista.imprimeLista();

        lista.removeInicio();
        lista.imprimeLista();

        lista.removeFinal();
        lista.imprimeLista();
    }
}