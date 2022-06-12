# Algoritmos de ordenação

Um algoritmo pode ser entendido como um sequência de passos finitos que toma algum valor ou conjunto de valores como entrada, realiza um processamento a partir desses valores e retorna como resultado algum outro valor ou conjunto de valores. Sendo assim, os algoritmos de classificação, mais comumente chamados de algoritmos de ordenação, tomam para si um _input_, realizam processamento tendo como base esses dados e devolvem um _output_. Existem diversos tipos de algoritmos para este fim, porém para mensurar o desempenho, foram selecionados alguns, a saber:
* Bubble Sort
* Insertion Sort
* Merge Sort
* Quick Sort com um pivô
* Quick Sort com dois pivôs
* Selection Sort

Abaixo encontram-se algumas definições e informações sobre cada um dos algoritmos supracitados, bem como a análise de complexidade acompanhada pela notação Big O (Grande-O, tradução livre). Além disso, o código dos algoritmos desenvolvidos podem ser encontrados neste repositório.

<hr>

## Bubble Sort

O funcionamento do algoritmo Bubble é bastante simples. O algoritmo realiza repetidas trocas com os elementos adjacentes a fim de obter a desejada ordenação (crescente ou decrescentemente).

### Complexidade do algoritmo

| Melhor caso | Médio caso | Pior caso |
|:-----------:|:----------:|:---------:|
|     O(n)    |    O(n²)   |   O(n²)   |

### Desvantagens e vantagens

- [X] É recomendado não utilizá-lo para classificar grandes volumes de dados.
- [X] É de fácil entendimento e implementação.
- [X] Pode ser usado para ordenar duas variáveis ou mais variáveis, por exemplo.

<hr>

## Insertion Sort

O algoritmo Insertion é similar ao Bubble e funciona um jogo de cartas, onde na mão esquerda o jogador possui as cartas e ordena as mesmas conforme a necessidade surge (crescente ou decrescentemente).

### Complexidade do algoritmo

| Melhor caso | Médio caso | Pior caso |
|:-----------:|:----------:|:---------:|
|     O(n)    |    O(n²)   |   O(n²)   |

### Desvantagens e vantagens

- [X] É útil para organizar pequenas quantidades de dados e/ou dados mais ou menos ordenados.
- [X] É desaconselhável utilizá-lo para classificar grandes volumes de dados.
- [X] Pode ser utilizado para verificar se um conjunto de dados já está ordenado.

<hr>

## Selection Sort

O algoritmo Selection busca o menor elemento (ordem crescente) ou maior elemento (ordem decrescente) e o coloca no início do vetor. O vetor, então, começa a ser ordenado com as sucessivas iterações.

### Complexidade do algoritmo

| Melhor caso | Médio caso | Pior caso |
|:-----------:|:----------:|:---------:|
|    O(n²)    |    O(n²)   |   O(n²)   |

### Desvantagens e vantagens

- [X] Por possuir dois laços de repetição aninhados, sua complexidade sempre será O(n²), até mesmo no melhor caso.
- [X] Não é recomendado para altos volumes de dados.

<hr>

## Merge Sort

O algoritmo Merge é um dos "Divida e conquiste". Neste algoritmo, o vetor é dividido em duas metades que posteriormente são mescladas, ou seja, unidas novamente em um único vetor. Por possuir essa característica de divisão, é um algoritmo recursivo.

### Complexidade do algoritmo

| Melhor caso | Médio caso |  Pior caso |
|:-----------:|:----------:|:----------:|
|  O(n log n) | O(n log n) | O(n log n) |

### Desvantagens e vantagens

- [X] Não é recomendado para ordenar pequenos volumes de dados.
- [X] É uma ótima escolha para ordernar listas ligadas (não foram testadas neste momento).
- [X] Deve-se levar em consideração o espaço adicional em memória para os subvetores.

<hr>

## Quick Sort com um pivot

Assim como o algoritmo Merge, o Quick é um clássico "Divida e conquiste". No entanto, seu funcionamento é um pouco diferente, tendo em vista que ele usa o conceito de pivô, isto é, um elemento que será referência para o particionamento do vetor. Após a seleção do pivô, o quick realiza a ordenação particionando o vetor entre menores elementos e maiores elementos, respectivamente.

### Complexidade do algoritmo

| Melhor caso | Médio caso | Pior caso |
|:-----------:|:----------:|:---------:|
|  O(n log n) | O(n log n) |   O(n²)   |

### Desvantagens e vantagens

- [X] Não requer espaço adicional em memória como no Merge.
- [X] É um dos mais rápidos, daí o nome quick (rápido, tradução livre).
- [X] Pode ser tendencioso e demorar mais se o pivô escolhido não for o ideal (vide o próximo algoritmo).

<hr>

## Quick Sort com dois pivots

O algoritmo Quick com dois pivôs segue a mesma lógica do anterior, porém com o acréscimo de um outro pivô para melhor balancear o algoritmo e corrigir a deficiência do quick com pivô único.

A classificação com Quick dual-pivot é utilizada pela linguagem Java e está incluído na classe Arrays da mesma. Ao utilizar o método sort(), estamos utilizando o quick dual-pivot. Um dos algoritmos mais rápidos existentes! 🚀

### Complexidade do algoritmo

| Melhor caso | Médio caso | Pior caso |
|:-----------:|:----------:|:---------:|
|  O(n log n) | O(n log n) |   O(n²)   |

### Desvantagens e vantagens

- [X] É um dos algoritmos mais rápidos e eficientes.
- [X] Não requer espaço adicional em memória como no Merge.

## Comparação entre os algoritmos de complexidade O(n²)

|      Algoritmo x Tempo     |    100   |   1000   |   10000  |   100000  |    1000000   |
|:--------------------------:|:--------:|:--------:|:--------:|:---------:|:------------:|
|    Bubble Sort crescente   | PT0.001S | PT0.008S | PT0.424S | PT15.206S | PT27M38.924S |
|   Bubble Sort decrescente  |   PT0S   | PT0.012S | PT0.367S | PT18.032S |  PT53M8.489S |
|  Insertion Sort crescente  |   PT0S   | PT0.002S | PT0.022S |  PT1.761S |  PT2M38.959S |
| Insertion Sort decrescente |   PT0S   | PT0.005S | PT0.026S |  PT3.117S |  PT5M53.988S |
|  Selection Sort crescente  | PT0.001S | PT0.006S | PT0.117S |  PT3.83S  |  PT5M44.874S |
| Selection Sort decrescente |   PT0S   | PT0.007S | PT0.136S | PT10.755S |  PT27M35.96S |
_* Tempo em minutos e segundos_

Podemos perceber que os algoritmos de complexidade O(n²) conseguem se sair bem com pequenos volumes de dados. Por outro lado, quando temos um volume maior de dados, os mesmos algoritmos levam muito mais tempo para desempenhar as funções de ordenação crescente e decrescente. Sendo assim, seu uso se mostra ineficiente para esses casos, tendo em vista que devemos poupar recursos computacionais como memória e processador.

Outro ponto que merece destaque é a ordenação decrescente que nos testes realizados se mostrou morosa e onerosa computacionalmente pelo fato de suas complexidades quadráticas.

## Comparação entre os algoritmos de complexidade O(n log n)

|         Algoritmo x Tempo         |  100 |   1000   |   10000  |  100000  |  1000000 |
|:---------------------------------:|:----:|:--------:|:--------:|:--------:|:--------:|
|        Merge Sort crescente       | PT0S |   PT0S   | PT0.002S | PT0.014S | PT0.185S |
|  Quick Sort com 1 pivot crescente | PT0S | PT0.001S | PT0.002S | PT0.012S | PT0.145S |
| Quick Sort com 2 pivots crescente | PT0S | PT0.001S | PT0.004S | PT0.013S | PT0.129S |
_* Tempo em minutos e segundos_

Em comparação com os algoritmos de complexidade O(n²) vistos anteriormente, os algoritmos O(n log n) apresentam resultados bem melhores quando se trata de ordenar grandes volumes de dados. Podemos verificar que conseguimos obter resultados expressivos em milissegundos, conforme a tabela acima demonstra.

Outro fator que devemos considerar é o fato de que os algoritmos de complexidade O(n log n) podem demorar quase o mesmo tempo para ordenar pequenas quantidades de dados. Nesse caso, seria mais fácil e menos oneroso implementar um algoritmo O(n²) para facilitar o entendimento e simplificar as coisas.

#### Nota ❗
Para fins de detalhamento, o tempo de execução dos algoritmos estão escritos em um arquivo chamado "Tempos.txt" e podem ser obtidos acessando a pasta referente ao algoritmo que se deseja consultar.

#### Ferramentas utilizadas 🔧
* Processador: i5 10<sup>th</sup>
* Editor de texto: Visual Studio Code
* Versão do compilador: 1.8.0_202

Desenvolvido por <a href="https://github.com/machado-joao">João Lucas Coelho Machado</a> 👨🏻‍💻
