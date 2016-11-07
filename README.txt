OBS: 

Viagem ao fundo do mar

Uma equipe de cientista est� explorando a fossa das Marianas e para isso utiliza submarinos n�o tripulados. Os cientistas j� mapearam a �rea a ser explorada e a dividiram em tr�s eixos: X, Y e Z. Esses eixos controlam o posicionamento e profundidade do submarino.

A posi��o do submarino � representado pela nota��o (0, 0, 0, NORTE) que indica os pontos X, Y, Z e a dire��o que o submarino aponta (Norte, Sul, Leste e Oeste).

Os cientistas utilizam uma serie comandos simples para fazer a movimenta��o do submarino: L, R, para girar o submarino para esquerda ou direita, M para mover o submarino e U e D para subir ou descer o submarino.

Voc� deve desenvolver um sistema que processe uma s�rie de comandos e fa�a a navega��o desse submarino.

Para simplificar, leve em considera��o que o submarino sempre come�ar� no ponto (0, 0, 0, NORTE) e que todo movimento quando o submarino estiver apontada para o NORTE, somar� 1 ao eixo Y, todo movimento quando o submarino estiver apontada para o LESTE somar� 1 ao eixo X e todo movimento para baixo diminuir� 1 do eixo Z.

Entrada:

Os cientistas mandar�o os comandos agrupados em uma �nica linha, como no exemplo:

LMRDDMMUU
Sa�da:

A sa�da dever� conter a coordenada final do submarino junto com sua dire��o, como no exemplo:

1 2 -1 NORTE


 # OBS no Exemplo do Git a Saida esta 1 2 -1 NORTE (Fiquei em duvidas se � possivel o eixo Z ficar -1 utilizando os comandos LMRDDMMUU)

		
		// Submarino result = navegacao.comandosEntrada("LMRDDMMUU");
		//
		// Submarino submarino = new Submarino();
		//
		// submarino.setX(1);
		// submarino.setY(2);
		// submarino.setZ(-1); //Aqui o esperado seria z = 0
		// submarino.setDirecao(Direcao.NORTE);
		
		//Assert.assertEquals(submarino, result);
		
		
O Segundo Exemplo funciona corretamente!

Exemplo de execu��o:

Dado a seguinte entrada:

(Lembrando que a posi��o inicial do submarino � 0, 0, 0, NORTE)

RMMLMMMDDLL
A sa�da esperada �:

2 3 -2 SUL