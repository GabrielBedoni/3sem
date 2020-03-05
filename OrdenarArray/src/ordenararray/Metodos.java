package ordenararray;

public class Metodos {

    public static void popular(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 101);
        }
    }

    public static void exibe(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("v[" + i + "]=" + v[i]);
        }
    }

    public static void ordena(int[] v) {
        int min, aux;
        for (int i = 0; i < v.length - 1; i++) {
            min = 0;
            for (int j = i + 1; j < v.length; j++) {
                if (v[min] > v[j]) {
                    min = j;
                }
                aux = v[min];
                v[min] = v[i];
                v[i] = aux;
            }
        }
    }
}
