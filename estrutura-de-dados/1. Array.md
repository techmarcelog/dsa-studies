# 📦 Array

## O que é?

Um **Array** é uma estrutura de dados que ocupa um **espaço contínuo na memória física** do computador.

---

## Como funciona na memória?

Ao instanciar um array, você define o **tipo** e o **tamanho** dos elementos. Exemplo em Rust:

```rust
let my_array: [i32; 4] = [1, 2, 3, 4];
//              |    |
//           tipo  tamanho
```

Como `i32` ocupa **32 bits** por elemento, o layout na memória fica assim:

```
Ponteiro pro início
 |
[1 | 2 | 3 | 4]
```

| Índice | Valor | Posição na memória |
|--------|-------|--------------------|
| `[0]`  | 1     | `32 * 0`           |
| `[1]`  | 2     | `32 * 1`           |
| `[2]`  | 3     | `32 * 2`           |
| `[3]`  | 4     | `32 * 3`           |

---

## Por que o acesso é O(1)?

Como o tipo é fixo, a **posição de qualquer elemento é calculável diretamente** — não é necessário percorrer o array inteiro.

> Acesso e alteração de `[0]` e `[500]` levam o mesmo tempo → **Constante = O(1)**

---

## Limitação: tamanho fixo

O tamanho é definido na instanciação. Se precisar de mais elementos, é necessário **criar um novo array em outro espaço da memória**:

```rust
let new_array: [i32; 5] = [1, 2, 3, 4, 123];
//                    |
//               novo tamanho
```

```
[1 | 2 | 3 | 4 | X]   ← novo array em outro endereço
```

Isso acontece porque **não há garantia de que os espaços adjacentes na memória estão livres**.

---

## Resumo

| Operação         | Complexidade |
|------------------|-------------|
| Acesso por índice | O(1)        |
| Alteração por índice | O(1)    |
| Redimensionamento | O(n) — cria novo array |

---

*Fonte: anotações pessoais de estudo de DSA*