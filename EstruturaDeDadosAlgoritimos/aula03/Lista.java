public class Lista<T>{
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeLista;

    public Lista(){
        this("Lista");
    }

    public Lista(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
        }
    }

    public void addFinal(T dado){
        No<T> novoNo = new No<T>(dado);
        if(ultimoNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public void removeInicio(){
        if(primeiroNo == null){
            System.out.println("Lista Vazia");
        }else{
            System.out.println("Dado: " + primeiroNo.getDado() + " removido da lista.");
            primeiroNo = primeiroNo.getNextNode();
        }
    }

    public void removeFinal(){
        if(primeiroNo == null){
            System.out.println("Lista Vazia");
        }else{
            System.out.println("Dado: " + ultimoNo.getDado() + " removido da lista.");
            
            No<T> aux = primeiroNo;

            while(aux.getNextNode() != ultimoNo){
                aux = aux.getNextNode();
            }
            ultimoNo = aux;
            aux.setNextNo(null);
        }
    }

    public void imprimeLista(){
        if(primeiroNo == null){
            System.out.println("Lista Vazia");
        }else{
            System.out.printf("Dados da lista de %s:\n", nomeLista);

            No<T> aux = primeiroNo;

            while(aux != null){
                System.out.printf("- %s\n", aux.getDado());
                aux = aux.getNextNode();
            }
        }
    }
}