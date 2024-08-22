package EstruturaDeDadosAlgoritimos.aula02;
public class Principal {
    public static void main(String[] args) {
        No<String> obj1 = new No<String>("Rafael");
        System.out.println(obj1.imprimeDados());
        
        No<String> obj2 = new No<String>("TEI TEI TEI");
        System.out.println(obj2.imprimeDados());

        No<String> obj3 = new No<String>("Mula");
        System.out.println(obj3.imprimeDados());

        obj1.setAux(obj2);
        System.out.println(obj1.getAux().imprimeDados());

        No<String> objAux = obj1;
        while(objAux != null) {
            System.out.println(objAux.imprimeDados());
            objAux = objAux.getAux();
        }


    }
}