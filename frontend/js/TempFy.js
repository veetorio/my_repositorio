let main = document.getElementById("content_main")
const result = document.getElementById("result")
let select = document.getElementById("select")
let input = document.getElementById("TempCalc")
let cnt = 0;
function abrir()
{
    let temperatura = medida();
    const CaixaResposta1 = document.createElement("div");
    const CaixaResposta2 = document.createElement("div");
    const solução2 = document.createElement("span")
    const solução = document.createElement("span") 
    solução.innerText = Conversor();
    solução2.innerText = input.value;
    
    CaixaResposta1.innerText = "Em Celsius";
    CaixaResposta2.innerText = temperatura;
    if(cnt === 0)
    {
        main.style.height = "70%";
        Caixa(CaixaResposta1,CaixaResposta2);
        
        result.appendChild(CaixaResposta1);
        result.appendChild(CaixaResposta2);
        solução2.style.color = "#009FFD"
        solução.style.color = "#009FFD"
        CaixaResposta2.appendChild(solução)
        CaixaResposta1.appendChild(solução2)
        

        result.style.height = "30%";
        result.style.width = "100%";
        result.style.borderradius
    }
    cnt ++;
}

function medida(){return select.value}
function Caixa(CaixaResposta1,CaixaResposta2)
{
    
    CaixaResposta1.style.width = "50%";
    CaixaResposta1.style.height = "15%";
    CaixaResposta1.style.padding = "2%"
    CaixaResposta1.style.display = "flex"
    CaixaResposta1.style.alignItems = "center"
    CaixaResposta1.style.justifyContent = "space-between"
    CaixaResposta1.style.borderradius = "5px";
    CaixaResposta1.style.backgroundColor = "white";
    CaixaResposta1.style.borderRadius = "5px";

    CaixaResposta2.style.width = "50%";
    CaixaResposta2.style.height = "15%";
    CaixaResposta2.style.padding = "2%"
    CaixaResposta2.style.display = "flex"
    CaixaResposta2.style.alignItems = "center"
    CaixaResposta2.style.justifyContent = "space-between"
    CaixaResposta2.style.borderRadius = "5px";
    CaixaResposta2.style.backgroundColor = "white";
    CaixaResposta2.style.borderradius = "5px";
   
}
function medida()
{
  return select.value
}

function Conversor()
{
    let FatordeConversão = medida()

    switch(FatordeConversão)
    {
        case "Celsius":
            return input.value
            break
        case "Kelvin":
            return (parseInt(input.value) + 273)
            break
            case "Fahrenheit":
            return ((parseInt(input.value)*9/5)+32)
            break
    }
}