# 🎟️ Queue (Fila)

## O que é?

Uma **Queue** (Fila) é uma estrutura de dados que segue o princípio **FIFO**:

> **F**irst-**I**n **F**irst-**O**ut — o primeiro que entra é o primeiro que sai.

---

## Como funciona?

```
Fila:  1 - 2 - 3 - 4 - 5
       |               |
    H (Head)       T (Tail)
  1° que entra   Último que entra
  1° que sai     Último que sai
```

| Ponta | Nome | Comportamento |
|-------|------|---------------|
| Início | **Head** | Primeiro que entrou → primeiro que sai |
| Fim    | **Tail** | Último que entrou → último que sai |

---

## Analogia

Funciona exatamente como uma **fila de banco ou supermercado**:
- Quem chegou primeiro é atendido primeiro
- Novos elementos entram sempre pelo final

---

## Resumo

- ✅ Garante **ordem de chegada** no processamento
- 🔄 Operações principais: **enqueue** (adiciona no Tail) e **dequeue** (remove do Head)

---

*Fonte: anotações pessoais de estudo de DSA*