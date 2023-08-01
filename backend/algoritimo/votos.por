programa
{
	
	funcao inicio()
	{	
		cadeia resposta
	
		inteiro voto_indivi,votos_total
		real percentual_cand1,percentual_cand2,percentual_cand3,cont,cont_v1,cont_v2,cont_v3

		
		cont = 0.0
		cont_v1 = 0.0
		cont_v2 = 0.0
		cont_v3 = 0.0
		
		resposta = "sim"

		enquanto ( resposta == "sim")
		{
			cont++

			escreva("escolha o seu candidato 1/2/3 ")
			leia(voto_indivi)

			escolha (voto_indivi)
			{
				caso 1:
					cont_v1 ++
					pare
				caso 2:
					cont_v2 ++
					pare
				caso 3:
					cont_v3 ++
					pare
				caso contrario: 
					escreva("seu candidato não existe")
			}
			escreva("ainda vai votar ?")
			leia(resposta)
		}
		votos_total = cont
		percentual_cand1 = (cont_v1/votos_total)*100 
		
		percentual_cand2 = (cont_v2/votos_total)*100
		
		percentual_cand3 = (cont_v3/votos_total)*100

		escreva("candidato 1 recebeu : ",percentual_cand1,"%","\n","cadidato 2 recebeu :",percentual_cand2,"%","\n","candidato 3 recebeu : ",percentual_cand3,"%")
			
			
			
			
			
		


	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 667; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */