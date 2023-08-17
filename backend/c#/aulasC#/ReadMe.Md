<style>
    body
    {
        color:#9522BF;
        background-color: #262626;
    }
    .static
    {
        color:#46F05C;
    }
    .void
    {
        color:orange;
    }
    .nome
    {
        color:#378CFA;
    }
    .comando
    {
        color:#FA3936;
    }
</style>
<h1>Aulas C# <img src="imag/do-sustenido.png" align="right"></h1>

<details>
<Summary>Conteúdo</Summary>
<ul>
<li><a href="#Func">Funções</a></li>
<li><a href="#Array">Array</a></li>
<li><a href="#ForEach">ForEach</a></li>
<li><a href="#Enum">Enum</a></li>
<li><a href="#Escopo">Escopo</a></li>

</ul>
</details>



<h2 id="Func">Funções</h2>

<p>
    Funções são tecnicamente um de tipo varíavel que armazena um bloco de codigo que pode retorna ou não um valor.
    <br>
    <br>
    Funções que não retornão valor, sempre vem acompanhado das palavras chaves "void" e "static"
    <br>
    <br>
        <span class="static">static</span> <span class="void">void</span> <span class="nome">mensagem</span>()<br>
    {<br>
       <span class="static">Console</span>.<span class="nome">WriteLine</span><span class="comando">("União Sovietica");</span>
    <br>
    }
    <br>
    As que retornam um valor, sempre irão vir com o comando "return" e seu tipo que irá retorna um valor ao escopo da função.
    <br>
    <br>
     <span class="static">static</span> <span class="void">string</span> <span class="comando">mensagem3</span>( <span class="void">int</span> num1)<br>
    {<br>
        if (num1 % 2 == 0)
        {<br>
            return "é par";
        }<br>
        else
        {<br>
            return "É ìmpar";
        }<br>
    }<br>
</p>

<h2 id="Array">Array</h2>

<p>
    Array é um tipo de variável que armazena mais de um dado. 
    <br>
    e sua sintaxe é desta forma:
    <br>
    <span class="void">string</span><span class="nome">[]</span> <span class="static">produtos</span> = {"Maçã","Pera","Macarrão","Abacaxi","Kiwi","Ameixa","Goiaba"};
</p>

<h2 id="ForEach">ForEach</h2>