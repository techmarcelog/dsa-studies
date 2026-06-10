# Binary Search

## O que é

Binary Search (Busca Binária) é um algoritmo de busca eficiente que funciona em arrays **ordenados**. Em vez de verificar elemento por elemento, ele divide o array ao meio a cada iteração, descartando metade dos elementos restantes.

---

## Pré-requisito obrigatório

> O array **precisa estar ordenado** antes de aplicar Binary Search. Em um array desordenado, o algoritmo retorna resultados incorretos.

---

## Como funciona

1. Define os ponteiros `esquerda` (início) e `direita` (fim)
2. Calcula o índice do `meio`
3. Compara o valor do meio com o alvo:
   - **Igual** → encontrou, retorna o índice
   - **Alvo maior** → descarta a metade esquerda (`esquerda = meio + 1`)
   - **Alvo menor** → descarta a metade direita (`direita = meio - 1`)
4. Repete até encontrar ou `esquerda > direita`

---

## Complexidade

| Caso | Tempo | Espaço |
|---|---|---|
| Melhor caso | O(1) | O(1) |
| Caso médio | O(log n) | O(1) |
| Pior caso | O(log n) | O(1) |

O(log n) significa que a cada iteração o problema é **dividido pela metade**.
Em um array de 1.000.000 elementos, são necessárias no máximo ~20 comparações.

---

## Detalhe importante: cálculo do meio

// ❌ Forma ingênua — pode causar integer overflow
int meio = (esquerda + direita) / 2;

// ✅ Forma correta
int meio = esquerda + (direita - esquerda) / 2;
```

Se `esquerda` e `direita` forem valores muito grandes, a soma dos dois pode ultrapassar `Integer.MAX_VALUE`.

---

## Iterativo vs Recursivo

| | Iterativo | Recursivo |
|---|---|---|
| Espaço | O(1) | O(log n) — call stack |
| Legibilidade | Um pouco mais verboso | Mais próximo da definição teórica |
| Uso em produção | ✅ Preferido | Apenas se necessário |

---

---

## Armadilhas comuns

- Aplicar em array **não ordenado**
- Usar `(esquerda + direita) / 2` sem proteção contra overflow
- Condição do while errada: usar `<` em vez de `<=` (perde o caso de 1 elemento)
- Atualizar `meio` em vez de `esquerda`/`direita`

---

## Recursos

- [NeetCode — Binary Search](https://neetcode.io/roadmap)
- [LeetCode #704 — Binary Search](https://leetcode.com/problems/binary-search/) ← problema clássico para começar