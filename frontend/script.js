// Utilizando DOM

const formulario  = document.querySelector("form");  // acessei uma tag


// estou acessando classes
const nome = document.querySelector(".nome");
const email = document.querySelector(".email");
const senha = document.querySelector(".senha");
const telefone = document.querySelector(".telefone");


function limpar() {
   nome.value = "",
   email.value = "",
   senha.value = "",
   telefone.value = ""
}



// precisa de uma API para funcionamento
function cadastrar() {
  
  fetch("http://localhost:8080/usuarios",
    {
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      method: "POST", // ENVIAR ALGO 
      body: JSON.stringify({nome: nome.value, 
        email: email.value,
        senha: senha.value,
        telefone: telefone.value})
    })
    .then(function (res) {console.log(res)}) //nao sei isso
    .catch(function (res) {console.log(res)}) // nem isso 
};



// criação do objeto em JSON
formulario.addEventListener('submit', function(event) { 
  event.preventDefault();  // ESTUDAR ISSO
  cadastrar();
  limpar();
});

