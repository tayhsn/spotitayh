<h1 align="center"> SpotiTayh Music Player 🎶 </h1>

Programa pque simula um player de músicas, com as funções de adicionar, tocar e mostrar as músicas contidas na lista. Utilizando como base os requisitos do enunciado.



## Enunciado :bookmark_tabs:

Você está construindo um aplicativo de música e precisa uma classe MusicPlayer, com a qual deve armazenar os nomes das músicas em um Array de Strings. O Array já está definido no código de modelo a ser seguido. <br><br>

O player deve ter as seguines funções: <br>
**add**: Adiciona o nome de uma música recebida como argumento ao Array. <br>
**show**: Mostra todas as músicas em linhas separadas. <br>
**play**: retorna o nome da primeira música da lista .<br>

`class MusicPlayer {` <br>
  `private var songs: Array<String> = arrayOf()` <br>
      `//COMPLETE AQUI` <br>
`}` <br>

`fun main(args: Array<String>) {` <br>
  `val m = MusicPlayer()` <br><br>

  `while(true) {` <br>
    `var input = readLine()!!` <br>
    `if(input == "stop") {` <br>
      `break` <br>
    `}` <br>
    `m.add(input)` <br>
  `}` <br>
  `m.show()` <br>
  `m.play()` <br>
`}`

<hr>

###### Desenvolvimento de Dispositivos Móveis @ SENAI/BA 2021.2

