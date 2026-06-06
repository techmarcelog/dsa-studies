# ⚡ Memória Cache

## O que é?

A **memória cache** é uma camada de memória extremamente rápida que fica entre o **processador (CPU)** e a **memória principal (RAM)**.

> O objetivo é evitar que a CPU precise buscar dados na RAM o tempo todo — o que seria muito mais lento.

---

## Hierarquia de memória

```
        [ CPU ]
           |
      [ Cache ]   ← muito rápida, pouca capacidade
           |
       [ RAM ]    ← mais lenta, mais capacidade
           |
      [ Disco ]   ← mais lenta ainda, grande capacidade
```

| Memória | Velocidade | Capacidade |
|---------|------------|------------|
| **Cache** | Muito alta | Pequena (KB/MB) |
| **RAM**   | Alta       | Média (GB) |
| **Disco** | Baixa      | Grande (TB) |

---

## Como funciona?

Quando a CPU precisa de um dado, ela verifica primeiro na cache:

```
CPU precisa de um dado
        |
   Está na cache?
   /            \
 Sim             Não
  |               |
Cache Hit      Cache Miss
(rápido ✅)   busca na RAM
               e salva na cache
               para próxima vez
```

| Evento | O que acontece |
|--------|----------------|
| **Cache Hit**  | Dado encontrado na cache → acesso imediato |
| **Cache Miss** | Dado não está na cache → busca na RAM |

---

## Níveis de cache

```
L1 → mais rápida, menor (dentro do núcleo da CPU)
L2 → intermediária
L3 → maior, compartilhada entre núcleos
```

---

## Relação com estruturas de dados

A forma como os dados ficam organizados na memória afeta diretamente o uso da cache:

- **Array** → elementos contíguos na memória → **cache-friendly** (aproveita bem a cache)
- **Linked List** → elementos espalhados na memória → **menos eficiente** para a cache

---

## Resumo

- ⚡ Cache é uma memória ultra-rápida entre CPU e RAM
- ✅ **Cache Hit**: dado já está na cache → acesso rápido
- ❌ **Cache Miss**: dado não está → busca na RAM, mais lento
- 🔗 Estruturas contíguas (como Arrays) aproveitam melhor a cache

---

*Fonte: anotações pessoais de estudo de DSA*