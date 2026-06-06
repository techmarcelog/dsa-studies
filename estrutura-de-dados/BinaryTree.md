# 🌳 Binary Tree (Árvore Binária)

## O que é?

Uma **Binary Tree** é uma estrutura de dados hierárquica onde cada nó pode ter **no máximo dois filhos**: um à esquerda e um à direita.

> Muito parecida com a estrutura da **Linked List** — a diferença é que em vez de um ponteiro para o próximo, cada nó tem **dois ponteiros**: um para o filho esquerdo e outro para o filho direito.

---

## Estrutura

```
          H (Head / Raiz)
          |
        [Node]
       /       \
  [Left]      [Right]
  (Node)      (Node)
```

| Componente | Descrição |
|------------|-----------|
| **Head**   | Nó raiz — ponto de entrada da árvore |
| **Left**   | Ponteiro para o nó filho da esquerda |
| **Right**  | Ponteiro para o nó filho da direita |

---

## Como funciona internamente?

Cada nó carrega:
- Um **valor**
- Um **ponteiro Left** → aponta para o nó da esquerda
- Um **ponteiro Right** → aponta para o nó da direita

```
Node {
  valor
  left  → Node | null
  right → Node | null
}
```

---

## Comparação com Linked List

| Estrutura       | Ponteiros por nó | Direção |
|-----------------|------------------|---------|
| **Linked List** | 1 (próximo)      | Linear → |
| **Binary Tree** | 2 (left, right)  | Hierárquica ↙ ↘ |

---

## Terminologia

| Termo | Significado |
|-------|-------------|
| **Raiz (Root/Head)** | Nó do topo, sem pai |
| **Folha (Leaf)** | Nó sem filhos (left e right são null) |
| **Altura** | Número de níveis da árvore |

---

*Fonte: anotações pessoais de estudo de DSA*