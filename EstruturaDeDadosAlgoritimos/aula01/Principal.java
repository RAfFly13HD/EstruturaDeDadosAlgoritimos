import java.util.Scanner;
import java.util.ArrayList;

public class Principal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Pessoa objPessoa = new Pessoa();

        System.out.println("Digite os dados da pessoa.");
        System.out.print("Nome: ");
        String nomePessoa = input.nextLine();

        System.out.print("Idade: ");
        int idade = input.nextInt();

        objPessoa.setNome(nomePessoa);
        objPessoa.setIdade(idade);

        //System.out.println(objPessoa.toString());

        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        listaPessoas.add(new Pessoa("José", 30));
        listaPessoas.add(new Pessoa("Mari", 25));
        listaPessoas.add(new Pessoa("Miguel", 40));
        listaPessoas.add(objPessoa);

        //Exibindo os objetos da listaPessoas armazenados na coleção
        for(Pessoa auxPessoa : listaPessoas){
            System.out.println(auxPessoa.toString());
        }
    }
}