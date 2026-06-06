# 📚 Stack (Pilha)

## O que é?

Uma **Stack** (Pilha) é uma estrutura de dados que segue o princípio **LIFO**:

> **L**ast-**I**n **F**irst-**O**ut — o último que entra é o primeiro que sai.

---

## Como funciona?

```
Empilhando:        Desempilhando:

    [ 5 ]  ← topo      [ 5 ]  ← sai primeiro
    [ 4 ]              [ 4 ]
    [ 3 ]              [ 3 ]
    [ 2 ]              [ 2 ]
    [ 1 ]  ← base      [ 1 ]  ← sai por último
```

> O último elemento adicionado fica no topo — e é o primeiro a ser removido.

---

## Comparação com Queue

| Estrutura | Princípio | Primeiro a sair |
|-----------|-----------|-----------------|
| **Stack** | LIFO | O último que entrou |
| **Queue** | FIFO | O primeiro que entrou |

---

## Operações principais

| Operação | O que faz |
|----------|-----------|
| **push** | Adiciona elemento no topo |
| **pop**  | Remove o elemento do topo |
| **peek** | Lê o topo sem remover |

---

## Analogia

Funciona como uma **pilha de pratos**:
- Você empilha pratos um em cima do outro
- O último prato colocado é o primeiro a ser retirado

---

## Resumo

- 🔄 **LIFO**: último a entrar, primeiro a sair
- ✅ Ideal para: histórico de navegação, desfazer ações (Ctrl+Z), chamadas de função (call stack)

---

*Fonte: anotações pessoais de estudo de DSA*