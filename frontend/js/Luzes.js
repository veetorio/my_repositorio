let rand = (max) => {return Math.random() * (max)}


var divs = document.getElementsByClassName("luz")
let indice = Math.floor(rand(divs.length))
// let tempo = new DelayNode()
let padroes = [pisca,sequencial,DropAleatorio]

console.log(divs)
function on()
{
    setTimeout(padroes[0],1000)
}

function pisca(){
    for(i = 0;i < 1;i++)
    {
        divs[0].style.backgroundColor = "blue"
        divs[1].style.backgroundColor = "blue"
        divs[2].style.backgroundColor = "blue"
        for(i = 0;i< 1;i++)
        {
            divs[i].style.backgroundColor = "none"
        }
    }
}
function sequencial(){
    console.log("2")
}
function DropAleatorio(){
    console.log("3")
}