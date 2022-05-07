# 7DaysOfCOde

## PRIMEIRO DESAFIO:
>você vai fazer o seu código Java rodar e consumir a API do IMDB! Seu objetivo será imprimir os resultados de uma busca na linha de comando.
Explicando melhor, você vai usar essa API para pesquisar os top 250 filmes e imprimir o JSON correspondente no console da sua IDE.
  Ahh, também será preciso gerar uma APIKey (uma chave de acesso), registrando o seu email no site. Com a chave em mãos, você poderá buscar filmes, séries, etc., através da API.
Tomei a liberdade de realizar esse desafio utilizando:
* Lombok: para diminuir a quantidade de códigos que vamos escrever
* OpenFeign: para fazer de fato a nossa integração entre os dois projetos
* Spring Web: só para subir o servidor Apache Tomcat

>TESTANDO A CHAMADA
* Ao subir a aplicação chame o controller com a seguinte url: ```http://localhost:8080/movies```

## SEGUNDO DESAFIO:
>A tarefa será extrair o título do filme e a URL da imagem a partir da resposta JSON.
>TESTANDO A CHAMADA
* Ao subir a aplicação chame o controller com a seguinte url: ```http://localhost:8080/movies/titles/images```