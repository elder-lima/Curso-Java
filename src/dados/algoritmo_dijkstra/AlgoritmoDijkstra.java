package dados.algoritmo_dijkstra;

import java.security.InvalidParameterException;
import java.util.*;

public class AlgoritmoDijkstra {

    private int vertices[][];

    public AlgoritmoDijkstra(final int numVertices) {
        vertices = new int[numVertices][numVertices];
    }

    public void criarAresta(final int noOrigem, final int noDestino, final int peso) {
        if (peso >= 1) {
            vertices[noOrigem][noDestino] = peso;
            vertices[noDestino][noOrigem] = peso;
        } else {
            throw new InvalidParameterException("O peso não pode ser negativo");
        }
    }

    public int getMaisProximo(final int listaCusto[], final Set<Integer> naoVisitados) {
        int minDistancia = Integer.MAX_VALUE;
        int noProximo = -1;
        for (Integer i : naoVisitados) {
            if (listaCusto[i] < minDistancia) {
                minDistancia = listaCusto[i];
                noProximo = i;
            }
        }
        return noProximo;
    }

    public List<Integer> getVizinhos(final int no) {
        List<Integer> vizinhos = new ArrayList<>();
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[no][i] > 0) {
                vizinhos.add(i);
            }
        }
        return vizinhos;
    }

    public int getCusto(final int noOrigem, final int noDestino) {
        return vertices[noOrigem][noDestino];
    }

    public List<Integer> caminhoMinimo(final int noOrigem, final int noDestino) {
        int custo[] = new int[vertices.length];
        int antecessor[] = new int[vertices.length];
        Set<Integer> naoVisitados = new HashSet<>();

        for (int v = 0; v < vertices.length; v++) {
            custo[v] = Integer.MAX_VALUE;
            antecessor[v] = -1;
            naoVisitados.add(v);
        }
        custo[noOrigem] = 0;

        while (!naoVisitados.isEmpty()) {
            int noMaisProximo = getMaisProximo(custo, naoVisitados);
            if (noMaisProximo == -1) break;

            naoVisitados.remove(noMaisProximo);

            for (Integer vizinho : getVizinhos(noMaisProximo)) {
                int peso = getCusto(noMaisProximo, vizinho);
                if (peso > 0) {
                    int custoTotal = custo[noMaisProximo] + peso;
                    if (custoTotal < custo[vizinho]) {
                        custo[vizinho] = custoTotal;
                        antecessor[vizinho] = noMaisProximo;
                    }
                }
            }

            if (noMaisProximo == noDestino) {
                return caminhoMaisProximo(antecessor, noMaisProximo);
            }
        }
        return Collections.emptyList();
    }

    public List<Integer> caminhoMaisProximo(final int antecessor[], int noMaisProximo) {
        List<Integer> caminho = new ArrayList<>();
        while (noMaisProximo != -1) {
            caminho.add(noMaisProximo);
            noMaisProximo = antecessor[noMaisProximo];
        }
        Collections.reverse(caminho);
        return caminho;
    }
}
