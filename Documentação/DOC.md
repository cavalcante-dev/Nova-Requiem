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

![Arquetipos de Personagem](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/Terminal/Atributos.jpeg?raw=true)

A cada final de capitulo, se a barra de atributo estiver maior ou igual a 2 o atributo evolue, ganhando +1 no seu total e reiniciando a barra de evolução.

![Codigo de Upar Atributo](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/UparAtributo.png?raw=true)

---

### Testes de Atributo

Durante o decorrer da narrativa, o jogador pode se deparar com a opção de fazer um teste de atributo com uma dificuldade pré-definida. O teste é a abstração do que seria duas rolagens de um dado de 6 lados e o resultado é a soma desses dados mais o atributo utilizado - *(1d6 + 1d6 + Atributo)*.

O resultado pode ser um **Sucesso** ou uma **Falha**, possuindo uma reposta diferente para cada.

#### EXEMPLO FALHA
![Exemplo no terminal de falha](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/Terminal/TesteFalha.jpeg?raw=true)

#### EXEMPLO SUCESSO
![Exemplo no terminal de sucesso](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/Terminal/TesteSucesso.jpeg?raw=true)

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

![Exemplo no código de diferença de afinidade](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/ModeloResposta-Afinidade.png?raw=true)

---

### Finais Alternativos

As escolhas do jogador moldam a narrativa e o acesso as informações que o jogador recebe culminando na decisão final de declarar um culpado para que investigação prossiga. Uma escolha errada culmina no verdadeiro culpado fugindo enquando uma escolha certa trás uma narrativa positiva e, dependendo da realação com a *NPC-SofiaVentura*, até mesmo uma cena secreta.

## Classes

### *Main*

A classe *main*, sendo finalizada com um total de 85 linhas, possui em seu funcionamento um *loop for* que caminha por todos os capitulos, turnos e decisões do jogo, evitando repetição de código. 

O código também implementa um *loop do/while* que repete o gancho de turno até as condições de escolhas serem definidas, assim como já comentado na sessão ***Escolhas de Diálogo.***

#### LOOP PRINCIPAL
![classe *main*](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/FuncionamentoPrincipal.png?raw=true)

A quantidade de capitulos, assim como a quantidade de turnos por capitulo, são definidos logo no incio do programa. Assim, o loop já se inicia com um ínicio e um final pré estabelecidos. 

#### CAPITULOS
![instanciação de capitulo](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/Capitulos.png?raw=true)

---

### util/Cores

Uma classe utilitaria que serve para definir as cores do texto do terminal e a formatação em *italico*. Por ser uma classe *static* ela é chamada diretamente nas utilizações de *System.out.print()* - sem precisar da instanciação de um objeto especifico. 

A classe utiliza de Códigos de Escape ANSI. 

#### CÓDIGOS DE CORES
![classe cores](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/ClasseCoresANSI.png?raw=true)

---

### textos/Capitulos

Cada capitulo é definido por apenas dois atributos: 
- *capitulo* - Representando o número do capitulo atual
- *turnosPorCapitulo* - Representando o número total de turnos (loops) do capitulo

Quanto a metodos, a classe possui apenas dois: uma para inciar o titulo do capitulo e outra para o texto de transição - este disponivel apenas para os capitulos do 1 ao 3. 

#### inicioCapitulo()
![Função de inicio de capitulo](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/InicioCapitulos.png?raw=true)

#### finalCapitulo()
![Função de final de capitulo](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/FinalCapitulos.png?raw=true)

---

### textos/Turnos

Os turnos são compostos por apenas um bloco de texto principal que serve como descrição da situação onde o *Detetive* se encontra no momento e, como explicado anteriormente, a quantidade de turnos é definido pelo capitulo. A classe recebe em sua construção o objeto *Jogador* e *Lista de NPCs* criadas na *Main*. 

#### Turnos
![Construtor de Turnos](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/ConstrutorTurnos.png?raw=true)

Os metodos principais da classe Turnos são o narrar(), responsavel por ambientar a cena e o introducao(), utilizado apenas no inicio do codigo para definir o arquetipo e o nome do *Detetive*. 

#### introducao()
![Função de introdução](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/Introdu%C3%A7%C3%A3o.png?raw=true)

#### narrar()

O metodo narrar() recebe na classe *Main* os valores de capitulo e turno atual e utiliza de uma verificação em If/Else para determinar qual bloco de texto será utilizado. 

![Função de narrar](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/FinalCapitulos.png?raw=true)

Como metodos auxiliares, temos o verificarArquetipo() e o verificarNome() que fazem o tratamento do Scanner, evitando que o programa pare devido a introdução de valores invalidos por parte do jogador. 

#### verificarNome()
![verificação de input](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/VerficarNome.png?raw=true)

#### verificarArquetipo()
![verificação de input](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/VerificarArquetipo.png?raw=true)

---

### textos/Escolhas

A classe escolhas serve para definir as opções de ação disponiveis para o jogador. Ela possui dois metodos principais e metodos auxiliares que limpam e visualmente "bloqueiam" opções especificas.

A classe recebe em sua construção o objeto *Jogador* e *Lista de NPCs* criadas na *Main*. Adicionalmente ela também possui um vetor de tamanho 4 que armazena as variaveis das opções.

#### Construtor
![construtor de turnos](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/CosntrutorEscolhas.png?raw=true)

O *Gancho de Turno*, assim como os outros metodos de bloco de texto, recebe o capitulo e o turno do ponto que está no *loop*. Assim ele busca o blobo *If/Else* equivalente e o imprime a cada iteração do *Do/While*. 

#### ganchoTurno()
![gancho de texto](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/GanchoTurnos.png?raw=true)

Como metodos relacionados a opções, a classe possui um para definir as opções do turno, um com o *loop* de impressão de cada opção e um para "remove-lá" quando for escolhida. Todos acessados em diferentes pontos do codigo para evitar repetições de estruturas.

#### Metodos de Opções
![metodos que manipulam as opções](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/Op%C3%A7oes.png?raw=true)

---

### textos/Respostas 

Similar aos demais metodos, para a classe *Resposta* recebe em seu contrutor os utilitarios de *Jogador*, a *Lista de NPCs* e, adicionamente, um objeto da classe *Escolhas* para acessar metodos. 

#### *Resposta*
![construtor da classe](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/ConstrutorResposta.png?raw=true)

É na classe *Resposta* que utilizamos os testes de atributo assim como definimos o bloco de texto para sucesso / falha e o definidos qual opção irá determinar o fim de um turno. 

#### Modelo de Bloco de Respostas
![construtor da classe](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/ModeloResposta-Preenchido.png?raw=true)

Como metodo auxiliar, temos o verificarResposta() que realizar o tratamento do Scanner, evitando que o programa pare devido a introdução de valores invalidos por parte do jogador. 

#### verificarResposta()
![verificação de input](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/VerficarResposta.png?raw=true)

A maneira que um turno deve terminar pode ser definido de 3 diferentes maneiras, com um contador que deve passar por todos as opções, um contador que deve passar por uma quantidade X de opções ou definindo a variavel fimTurno diretamente na opção. 

#### Definidores de Fim de Turno
![metodos que definem o fim de um turno](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/ContadorDeFinalTurno.png?raw=true)

---

### textos/Finais

Esta classe é a classe que determina se a escolha de suspeito foi realizada corretamente e mostra qual dos finais o jogador conseguir. Como atributos ela recebe a *Lista de NPCs* como *listaSuspeitos* e dois booleanos - finalSecreto e finalSofia - ambos determinam alterações nos dois finais principais.

#### Construtor Final
![metodos que definem o final secreto](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/ConstrutorFinais.png?raw=true)

Este metodo faz uma verificação da *listaSuspeitos* e verifica qual dos quatro o jogador marcou como o culpado, assim decidindo no *If/Else* qual final o jogador conseguir. 

#### narrarFinal()
![textos para os finais](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/TextoFinais.png?raw=true)


O metodo de verificação dos finais alternativos levam em consideração a afinidade da NPC-SofiaVentura e escolhas especificas durante a narrativa, assim tendo um total de quatro variações: duas para o final bom e duas para o final ruim.

#### Verificação de Final Secreto
![metodos que definem o final secreto](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/Verfica%C3%A7%C3%A3oCenaSecreta.png?raw=true)

---

### entities/Jogador

A entidade principal do sistema. É no jogador que definimos o nome do *Detetetive* e seus atributos - baseado em arquetipos. 

#### Construtor de Jogador 
![construtor da jogador](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/ConstrutorJogador.png?raw=true)

Como metodos da classe temos rolarTeste() que recebe o atributo a ser utilizado e a dificuldade do teste e o uparAtributo() que é verificada ao final de cada capitulo.

#### rolarTeste()
![abstração de 2 dados de 6](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/RolarTestes.png?raw=true)

#### uparAtributo() 
![barra de progresso](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/UparAtributo.png?raw=true)

---

### entities/NPC

A SuperClasse NPC foi criada para organização do codigo, uma vez que todas as instancias de NPCs possuem seus proprios metodos de dialogos e respostas mas compartilham atributos em comum (nome, afinidade, jogadorUtilitarios e culpa). Desta maneira é possivel evitar que o metodo getAfinidade, por exemplo, seja repetido em todos os diferentes NPCs do jogo. 

#### Construtor de NPC
![construtor da classe](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/ConstrutorNPC.png?raw=true)

O construtor de subclasse inicia os valores variaveis, porém todos começam inocentes - definido na classe pai.

#### Construtor de NPC-SubClasses
![construtor da classe](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/ConstrutorNPC-Qualquer.png?raw=true)

Todos os NPCs são instanciados pelo programa a partir da classa *Main*, com seus valores já pré-definidos. 

#### NPCs
![npsc](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/NPCs.png?raw=true)

---

Individualmente, cada NPC possui os metodos *dialogar()* e *responder()* - ambos recebendo o valor de capitulo / turno e *responder()* recebendo adicionalmente resposta. 

*dialogar()* - Utilizado quando o bloco de texto do NPC se encontra na classe *Turnos*
*respoder()* - Utilizado quando o bloco de texto do NPC se encontra na classe *Resposta*

#### Modelo de Resposta (SOFIA) 
![construtor da classe](https://github.com/cavalcante-dev/Nova-Requiem/blob/main/Documenta%C3%A7%C3%A3o/Imagens/ModeloResposta-NPC.png?raw=true)

### SUBCLASSES

#### entities/npcs/SofiaVentura
#### entities/npcs/GuilhermeZelador
#### entities/npcs/PedroZelador
#### entities/npcs/EmeraldaLobos
#### entities/npcs/HenricoLobos

---

## Referências

### Requisitos Técnicos

**Versão: JAVA 24+** <br>
**Plataformas:** CMD, Terminais de IDEs, BASH etc. <br>
**RAM:** Durante o jogo, a utilização de RAM pode variar de 42mb a 43mb

### Uso de IA no Projeto

### Sites de Pesquisa

### Ferramentas Utilizadas

### Repositório GitHub

### A Equipe
