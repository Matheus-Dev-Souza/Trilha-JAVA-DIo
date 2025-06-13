# DIO – Trilha Java Básico  
<https://www.dio.me>

## Autores
- **Gleyson Sampaio**

---

## Controle de Fluxo – Desafio

Vamos exercitar todo o conteúdo apresentado no módulo **Controle de Fluxo** codificando o seguinte cenário.

### Descrição

1. **Entrada de dados**  
   O sistema deve receber **dois parâmetros** pelo terminal, representando números inteiros.

2. **Processamento**  
   * Calcule a quantidade de interações (`for`) como a diferença entre os dois números.  
   * Imprima cada interação no console (`System.out.print`), por exemplo:  
     ```
     Imprimindo o número 1
     Imprimindo o número 2
     ...
     ```

3. **Exceção de negócio**  
   * Se o **primeiro parâmetro for maior** que o segundo, lance a exceção customizada `ParametrosInvalidosException` com a mensagem:  
     ```
     O segundo parâmetro deve ser maior que o primeiro
     ```

### Passo a passo do projeto

| Passo | O que fazer |
|-------|-------------|
| 1 | Crie o projeto **`DesafioControleFluxo`**. |
| 2 | Dentro do projeto, crie a classe **`Contador.java`** que conterá a lógica principal. |
| 3 | Crie a classe **`ParametrosInvalidosException.java`** para representar a exceção de negócio. |
| 4 | Implemente a leitura dos parâmetros, a validação e o laço `for`, conforme o esqueleto abaixo. |

---

## Esqueleto de código sugerido

```java
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();     // ← leia o primeiro número

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();   // ← leia o segundo número

        try {
            // chama o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            // imprime a mensagem de erro da exceção
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois)
            throws ParametrosInvalidosException {

        // valida se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException(
                "O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        // realiza o for para imprimir os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
