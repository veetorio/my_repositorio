package PooDesafio.Desafio01;

import java.util.ArrayList;
import java.util.List;

public class Compra
{
  ArrayList<Item> itens = new ArrayList<>();

  void addItens(Produto p,int _quanti)
  {
      this.itens.add(new Item(p,_quanti));
  }
  double valorFinal()
  {
      double tot = 0;
      for (Item produtos : itens)
      {
          tot += (produtos.produto._preco) * produtos.qtd;
      }
      return tot;
  }




}
