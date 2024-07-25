# [DIO](www.dio.me) - Trilha Java Básico

## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

```mermaid
classDiagram
    class Ipod {
        <<Interface>> Ipod
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class Telefone {
        <<Interface>> Telefone
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class Navegador {
        <<Interface>> Navegador
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    
    }

    iPhone --> Ipod
    iPhone --> Telefone
    iPhone --> Navegador
```

