// Classe ListaDuplamenteEncadeada que representa a lista duplamente encadeada
public class ListaDupla<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeLista;
    private int tamanho;  // Atributo para manter o tamanho da lista

    public ListaDupla() {
        this("Lista Duplamente Encadeada");
    }

    public ListaDupla(String nomeLista) {
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }

    public void addInicio(T dado) {
        NoDuplo<T> novoNo = new NoDuplo<T>(dado,0);
        if (primeiroNo == null) {
            primeiroNo = ultimoNo = novoNo;
        } else {
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
        atualizaIndices(); // Atualiza os índices após a inserção
        tamanho++;
    }

    public void addFinal(T dado) {
        NoDuplo<T> novoNo = new NoDuplo<T>(dado, tamanho);
        if (ultimoNo == null) {
            primeiroNo = ultimoNo = novoNo;
        } else {
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo = novoNo;
        }
        tamanho++;
    }

    public void removerInicio() {
        if (primeiroNo == null) {
            System.out.println("TOMA LISTA VAZIA");
            return;
        } 
        primeiroNo = primeiroNo.getProximoNo();
        if (primeiroNo != null) {
            primeiroNo.setAnteriorNo(null);
        } else {
            ultimoNo = null;
        }
    }

    public void removerFinal() {
        if (ultimoNo == null) {
            System.out.println("Lista vazia!");
            return;
    }  
        ultimoNo = ultimoNo.getAnteriorNo();
        if (ultimoNo != null) {
            ultimoNo.setProximoNo(null);
        } else {
            ultimoNo = null;
        }
    }
    // Método para atualizar os índices de todos os nós após modificações
    private void atualizaIndices() {
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;
        while (atual != null) {
            atual.setIndice(indice);
            atual = atual.getProximoNo();
            indice++;
        }
    }

    public void imprimeLista() {
        if (primeiroNo == null) {
            System.out.println("Lista Vazia");
        } else {
            System.out.printf("Dados da lista de %s:\n", nomeLista);
            NoDuplo<T> aux = primeiroNo;
            while (aux != null) {
                System.out.printf(" %s ", aux.toString());
                aux = aux.getProximoNo();
            }
            System.out.println();
        }
    }
}