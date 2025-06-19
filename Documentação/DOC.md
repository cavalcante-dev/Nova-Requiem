# NOVA REQUIEM

## Visão Geral do Projeto

### Conceito

Nova Requiem é, em sua essência, um projeto de paixão. Ele une a busca pelo desafio, a paixão escrita e lógica com a vontade de criar algo "diferente" do padrão. 

O jogo utiliza dos conceitos de POO para apresentar uma narrativa engajante que estimula o jogador a pensar na solução do caso por si só, analisando as informações entregues pelos personagens e decidir o melhor curso de ação. 

Esta documentação trás os detalhes do projeto, razão por trás das escolhas técnicas e um pouco sobre o cerne do projeto enquanto jogo. 

### Gêneros

**Visual-Novel:** Um gênero de jogos que combina narrativa textual com ilustrações pré-renderizadas (no nosso caso um pouco menos do *Visual* e mais do *Novel*) e variado grau de interatividade. Conhecidas também como romances visuais, são definidas pelo foco no enredo e pela jogabilidade simples, na qual, tipicamente, o jogador deverá avançar o texto e fazer escolhas que definirão como a narrativa se desenvolve.

**RPG:** *Role-Playing-Game* ou no português "jogo de interpretações de papéis" é um gênero que coloca o jogador nos sapatos de um ou mais personagens, o fazendo tomar decisões pensando em como o personagem agiria e moldando sua personalidade com o decorrer da narrativa.

### Narrativa

**O Detetive:** Ao entrarmos no jogo, somos apresentados ao nosso protagonista incomum de nome definido pelo jogador. O Detetive é um homem complexo, bom no seu trabalho mas com comportamentos que o afastam das pessoas na sua vida. 

Assumindo o papel dele, o jogador deve escolher se manter colocar como um profisional exemplar durante o caso ou tomar certas decisões... exentricas, para se dizer o minimo. 

**O Caso:** A cidade de Santa Tereza é palco de um assassinato terrível: Francisco Lobos, um famoso empresario da cidade, foi encontrado morto em seu escritorio estufado em uma mala de viagem e os principais suspeitos do crime são uma dupla de zeladores que encontraram o corpo, a esposa e o irmão de Francisco. As pistas, uma carta revelando um adulterio e a aliança da esposa na cena do crime, parecem indicar um crime passional. 

**Os NPCs:** Definidos como *Non-Playble-Characters* (Personagens-Não-Jogáveis), os NPCs apresentados tem personalidades únicas, descubra a melhor maneira de abordá-los e descobrir as informações necessarias para identificar o culpado.

## Mecânicas de Jogo

### Atributos de Persoagem

O personagem conta com dois atributos principais são definidos por dois arquetipos - Sensitivo e Intelectual - e são utilizados para realizar testes ao longo do jogo. 

![Arquetipos de Personagem](Imagens\Terminal\Atributos.jpeg)

A cada final de capitulo, se a barra de atributo estiver maior ou igual a 2 o atributo evolue, ganhando +1 no seu total e reiniciando a barra de evolução.

![Codigo de Upar Atributo](Imagens\UparAtributo.png)

---

### Testes de Atributo

Durante o decorrer da narrativa, o jogador pode se deparar com a opção de fazer um teste de atributo com uma dificuldade pré-definida. O teste é a abstração do que seria duas rolagens de um dado de 6 lados e o resultado é a soma desses dados mais o atributo utilizado - *(1d6 + 1d6 + Atributo)*.

O resultado pode ser um **Sucesso** ou uma **Falha**, possuindo uma reposta diferente para cada.

#### EXEMPLO FALHA
![Exemplo no terminal de falha](Imagens\Terminal\TesteFalha.jpeg)

#### EXEMPLO SUCESSO
![Exemplo no terminal de sucesso](Imagens\Terminal\TesteSucesso.jpeg)

---

### Escolhas de Diálogo

Baseado em 4 estruras principais - *Capitulo, Turno, Gancho de Turno e Opções* - a escolha de dialogo ou ação é definida por uma opção de 1 a 4 da qual o jogador pode livremente decidir qual seguir. Cada opção possui uma resposta única e alguma definem informações importantes para o desenrolar da narrativa. 

As escolhas são definidas por:
- *Ação* -  Declarada normalmente sem aspas
- *Diálogo* - Declarada entre aspas duplas ("")    
- *Teste* - Declarada seguindo o padrão [TESTE (ATRIBUTO) - DIFICULDADE (DIFICULDADE DO TESTE)]

As escolhas são o que definem o curso de um turno, que apenas termina quando uma decisão especifica ou quantidade de decisões predefinidas são tomadas pelo usuário. Enquanto essa condição não for atingida o gancho de turno se repete. 

Ao escolhar uma opção ela é visualmente bloqueada com "-----------". 

---

### Afinidade de NPCs

Certas escolhas durante a narrativa podem alterar a percepção de certos personagens em relação ao *Detetive*, estas opções não possuem marcações visuais e são perceptiveis por analise de contexto narrativo. 

No capitulo de interrogatorio a afinidade define o quão disposto um *NPC* está a compartilhar informações com o *Detetive* e no caso especifico do *NPC-SofiaVentura* a afinidade desbloqueia o 
final secreto do jogo. 

![Exemplo no código de diferença de afinidade](Imagens\ModeloResposta-Afinidade.png)

---

### Finais Alternativos

As escolhas do jogador moldam a narrativa e o acesso as informações que o jogador recebe culminando na decisão final de declarar um culpado para que investigação prossiga. Uma escolha errada culmina no verdadeiro culpado fugindo enquando uma escolha certa trás uma narrativa positiva e, dependendo da realação com a *NPC-SofiaVentura*, até mesmo uma cena secreta.

## Classes

### *Main*

A classe *main*, sendo finalizada com um total de 85 linhas, possui em seu funcionamento um *loop for* que caminha por todos os capitulos, turnos e decisões do jogo, evitando repetição de código. 

O código também implementa um *loop do/while* que repete o gancho de turno até as condições de escolhas serem definidas, assim como já comentado na sessão ***Escolhas de Diálogo.***

#### LOOP PRINCIPAL
![classe *main*](Imagens\FuncionamentoPrincipal.png)

A quantidade de capitulos, assim como a quantidade de turnos por capitulo, são definidos logo no incio do programa. Assim, o loop já se inicia com um ínicio e um final pré estabelecidos. 

#### CAPITULOS
![instanciação de capitulo](Imagens\Capitulos.png)

---

### util/Cores

Uma classe utilitaria que serve para definir as cores do texto do terminal e a formatação em *italico*. Por ser uma classe *static* ela é chamada diretamente nas utilizações de *System.out.print()* - sem precisar da instanciação de um objeto especifico. 

A classe utiliza de Códigos de Escape ANSI. 

#### CÓDIGOS DE CORES
![classe cores](Imagens\ClasseCoresANSI.png)

---

### textos/Capitulos

Cada capitulo é definido por apenas dois atributos: 
- *capitulo* - Representando o número do capitulo atual
- *turnosPorCapitulo* - Representando o número total de turnos (loops) do capitulo

Quanto a metodos, a classe possui apenas dois: uma para inciar o titulo do capitulo e outra para o texto de transição - este disponivel apenas para os capitulos do 1 ao 3. 

#### inicioCapitulo()
![Função de inicio de capitulo](Imagens\InicioCapitulos.png)

#### finalCapitulo()
![Função de final de capitulo](Imagens\FinalCapitulos.png)

---

### textos/Turnos

Os turnos são compostos por apenas um bloco de texto principal que serve como descrição da situação onde o *Detetive* se encontra no momento e, como explicado anteriormente, a quantidade de turnos é definido pelo capitulo. A classe recebe em sua construção o objeto *Jogador* e *Lista de NPCs* criadas na *Main*. 

#### Turnos
![Construtor de Turnos](Imagens\ConstrutorTurnos.png)

Os metodos principais da classe Turnos são o narrar(), responsavel por ambientar a cena e o introducao(), utilizado apenas no inicio do codigo para definir o arquetipo e o nome do *Detetive*. 

#### introducao()
![Função de introdução](Imagens\Introdução.png)

#### narrar()
![Função de narrar](Imagens\FinalCapitulos.png)


O metodo narrar() recebe na classe *Main* os valores de capitulo e turno atual e utiliza de uma verificação em If/Else para determinar qual bloco de texto será utilizado. 

Como metodos auxiliares, temos o verificarArquetipo() e o verificarNome() que fazem o tratamento do Scanner, evitando que o programa pare devido a introdução de valores invalidos por parte do jogador. 

---

### textos/Escolhas

---

### textos/Respostas 

---

### textos/Finais

---

### entities/Jogador
### entities/NPC

---

### entities/npcs/SofiaVentura
### entities/npcs/GuilhermeZelador
### entities/npcs/PedroZelador
### entities/npcs/EmeraldaLobos
### entities/npcs/HenricoLobos

---

## Referências

### Requisitos Técnicos

**Versão: JAVA 24+** <br>
**Plataformas:** CMD, Terminais de IDEs, BASH etc.
**RAM:** Durante o jogo, a utilização de RAM pode variar de 42mb a 43mb

### Uso de IA no Projeto

### Sites de Pesquisa

### Ferramentas Utilizadas

### Repositório GitHub

### O Grupo

