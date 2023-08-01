programa
{
	
	funcao inicio()
	{
	//i_condicional é para entrar no looping e idades_max,min são responsaveís por armazenar a idade maxima e minima utilizando a idade_intermed de comparação
		cadeia i_condicional,i_saida
		inteiro idade_max,idade_min,idade_intermed, soma , i_contador
		real idade_media
		i_condicional = "sim"

		escreva("digite sua idade")
		leia(idade_intermed)
		i_contador = 1
		soma = idade_intermed
		idade_min = idade_intermed
		idade_max = idade_intermed
		
		enquanto (i_condicional == "sim")
			{
				// entrada de idade e a soma
				escreva("digite sua idade")
				leia(idade_intermed)
				soma = soma + idade_intermed
				i_contador ++
				// verificação de idades 
				se ( idade_max < idade_intermed)
					{
						idade_max = idade_intermed
					}
				senao
				{
					se ( idade_intermed < idade_min)
						{
							idade_min = idade_intermed
						}
						
				}
				
				// saída do looping
				escreva("deseja continuar? ")
				leia(i_saida)
				i_condicional = i_saida
			}
			//saída de dados
			 idade_media = soma/i_contador 
			
		escreva(" A media de idade de é de ",idade_media," A maior idade é de ", idade_max , " e a menor idade",idade_min)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 618; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */