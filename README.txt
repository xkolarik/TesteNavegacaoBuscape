OBS: 

Entrada:

Os cientistas mandarão os comandos agrupados em uma única linha, como no exemplo:

LMRDDMMUU
Saída:

A saída deverá conter a coordenada final do submarino junto com sua direção, como no exemplo:

1 2 -1 NORTE


 # OBS no Exemplo do Git a Saida esta 1 2 -1 NORTE (Fiquei em duvidas se é possivel o eixo Z ficar -1 utilizando os comandos LMRDDMMUU)

		
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

Exemplo de execução:

Dado a seguinte entrada:

(Lembrando que a posição inicial do submarino é 0, 0, 0, NORTE)

RMMLMMMDDLL
A saída esperada é:

2 3 -2 SUL