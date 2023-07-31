programa
{
	
	funcao inicio()
	{ inteiro n1
	cadeia impar_ou_par,sinal
	
		
	escreva("digite um número ")
	leia(n1)
	se (n1 > 0)
	{
		sinal = "Positivo"
		se (n1 % 2 == 0)
		{
			impar_ou_par = "par"
		}
		senao
		{
			impar_ou_par = "impar"
			
		}
		
	}
	senao
	{
		sinal = "Negativo"
		se (n1 % 2 == 0)
		{
			impar_ou_par = "par"
		}
		senao
		{
			impar_ou_par = "impar"
			
	}
	}

	
	escreva(" O seu número ", n1 , " ele é ", impar_ou_par," e ", sinal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 470; 
 * @DOBRAMENTO-CODIGO = [27];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */