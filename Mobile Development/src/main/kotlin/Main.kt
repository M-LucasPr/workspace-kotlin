fun main() {
    println("Meu primeiro print em Kotlin")

    val product: string = "Iphone"
    // val: imutável
    // var: mutável

    val units: int = 11 // Inteiro, sem casas decimais.
    val total: float = 31.00f // 32-bit
    val price: double = 7000 // 64 bit Floating com extensas casa decimais.

    // Sempre sinalizar o tipo da variável (string, double, int)
    // Padrão camelCase: variável de receber escreverDestaManeira
    println(product::class) // Verificar a classe da variável

}