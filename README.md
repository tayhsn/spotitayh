<h1 align="center"> SpotiTayh Music Player 🎶 </h1>

Programa pque simula um player de músicas, com as funções de adicionar, tocar e mostrar as músicas contidas na lista. Utilizando como base os requisitos do enunciado.



## Enunciado :bookmark_tabs:

Você está construindo um aplicativo de música e precisa uma classe MusicPlayer, com a qual deve armazenar os nomes das músicas em um Array de Strings. O Array já está definido no código de modelo a ser seguido.

O player deve ter as seguines funções:
**add**: Adiciona o nome de uma música recebida como argumento ao Array.
**show**: Mostra todas as músicas em linhas separadas.
**play**: retorna o nome da primeira música da lista .


`class MusicPlayer {`
  `private var songs: Array<String> = arrayOf()`
      `//COMPLETE AQUI  
}`
`fun main(args: Array<String>) {`
  `val m = MusicPlayer()`

  `while(true) {`
    `var input = readLine()!!`
    `if(input == "stop") {`
      `break`
    `}`
    `m.add(input)`
  `}`
  `m.show()`
  `m.play()`
`}`

<hr>

###### Desenvolvimento de Dispositivos Móveis @ SENAI/BA 2021.2

