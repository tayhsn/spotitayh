class MusicPlayer {
    private var songs: Array<String> = arrayOf()

    fun show() {
        songs.forEach { println(it) }
    }

    fun add(input: String) {
        songs += input
    }

    fun play() {
        println(songs[0])
    }
}

fun main(args: Array<String>) {
    val m = MusicPlayer()

    println("Bem vindo ao Spotitayh, seu canal de músicas!")
    while (true) {
        println("Insira músicas para adicionar a sua playlist ou STOP para sair")
        val input = readLine()!!
        if (input.lowercase() == "stop") {
            break
        }
        m.add(input)
    }
    println("A sua playlist contêm:")
    m.show()
    print("E a música que está tocando agora: ")
    m.play()
}