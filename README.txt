OBS: 

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