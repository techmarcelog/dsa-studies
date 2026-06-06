# 🔗 Linked List

## O que é?

Uma **Linked List** é uma estrutura de dados onde os elementos **não precisam estar sequencialmente alocados na memória** — diferente do Array.

Os elementos são **ligados entre si como elos de uma corrente**: cada nó sabe onde o próximo está.

---

## Como funciona na memória?

Enquanto um Array ocupa posições contínuas, a Linked List pode estar espalhada pela memória:

```
Memória física:

[1 | X] [2 | X]         ← nós da Linked List espalhados
   [3 | X]
            [4 |  ]
   [X | X | X | 5]      ← LinkedList[1, 2, 3, 4, 5]

[7 | 8 | 9]             ← Array[7, 8, 9] ocupa espaço contínuo
```

> `X` representa o ponteiro para o próximo nó.  
> Cada nó carrega o **valor** + o **endereço do próximo**.

---

## Leitura: O(n)

Para acessar um elemento, é necessário **percorrer a lista desde o início** seguindo os ponteiros — não existe cálculo direto de posição como no Array.

```
[1] → [2] → [3] → [4] → [5]
 ↓
precisa passar por todos até chegar no que quer
```

---

## Comparação: Linked List vs Array

| Operação | Linked List | Array |
|----------|-------------|-------|
| Leitura  | O(n) — precisa percorrer tudo | O(1) — sabe onde está tudo |
| Alocação de memória | Espalhada (não contígua) | Contígua |

---

## Resumo

- ✅ Vantagem: não precisa de memória contígua — cresce com mais flexibilidade
- ❌ Desvantagem: acesso mais lento — sempre O(n) para leitura

---

*Fonte: anotações pessoais de estudo de DSA*