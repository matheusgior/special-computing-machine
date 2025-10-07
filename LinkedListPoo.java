import java.util.LinkedList;

public class LinkedListPoo {

    public static void main(String[] args) {
        // Criação da LinkedList
        LinkedList<String> lista = new LinkedList<>();
        System.out.println("Lista inicial: " + lista);

        // Operações de Inserção
        System.out.println("\nInserção");
        lista.addFirst("Elemento A");
        System.out.println("Após addFirst do Elemento A" + lista);

        lista.addLast("Elemento C");
        System.out.println("Após addLast do Elemento C"+ lista);

        lista.add(1, "Elemento B");
        System.out.println("Após add do Elemento B" + lista);

        lista.add("Elemento D");
        System.out.println("Após add do Elemento D" + lista);

        // Operação de percorrer
        System.out.println("\nPercorrer");
        System.out.print("Percorrendo a lista: ");
        for (String item : lista) {
            System.out.print(item + ", ");
        }
        System.out.println();

        // Operação de Pesquisa
        System.out.println("\nPesquisa");
        String elementoProcurado = "Elemento B";
        int indice = lista.indexOf(elementoProcurado);
        if (indice != -1) {
            System.out.println(elementoProcurado + " encontrado no índice: " + indice);
            System.out.println("Elemento no índice 0: " + lista.get(0));
        } else {
            System.out.println(elementoProcurado + " não encontrado.");
        }

        // Operações de Remoção
        System.out.println("\nRemoção");
        lista.removeFirst();
        System.out.println("Após removeFirst(): " + lista);

        lista.removeLast();
        System.out.println("Após removeLast(): " + lista);

        lista.remove("Elemento B");
        System.out.println("Após remove do Elemento B: " + lista);

        if (!lista.isEmpty()) {
            lista.remove(0);
            System.out.println("Após remove(0): " + lista);
        }

        System.out.println("\nLista final: " + lista);
    }
}

