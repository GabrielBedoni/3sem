package ordenararray;

public class OrdenarArray {

    static final int MAX = 10;
    static int[] v = new int[MAX];

    public static void main(String[] args) {

        Metodos.popular(v);
        
        Metodos.ordena(v);
        Metodos.exibe(v);

    }

}
