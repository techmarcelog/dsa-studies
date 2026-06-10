package algoritmos.busca.binarysearch;

public class BinarySearch {

    public int buscar(int[] array, int alvo) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2; // evita overflow

            if (array[meio] == alvo) return meio;
            else if (array[meio] < alvo) esquerda = meio + 1;
            else direita = meio - 1;
        }

        return -1;
    }
}
