programa
{
	
	funcao inicio()
	{
		inteiro inicio_intervalo,final_intervalo,soma3_intervalo,i
		soma3_intervalo = 0
		escreva("coloque seu intervalo da soma","\n")
		
		escreva("inicío do intervalo ")
		leia(inicio_intervalo)

		escreva("fim do intervalo ")
		leia(final_intervalo)

		para (i = inicio_intervalo; i <= final_intervalo; i++)
		{
			se ( i % 2 == 0 )
			{
				soma3_intervalo += i*i*i
				
			}
		}
		escreva(soma3_intervalo)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 403; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */