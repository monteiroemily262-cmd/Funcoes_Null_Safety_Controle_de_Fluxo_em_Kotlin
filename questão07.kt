fun limparBancoDeDados(emails: List<String?>) {
    var contasInvalidas = 0
    
    for (email in emails) {
        val tamanho = email?.length ?: 0
        
        if (email == null || tamanho == 0) {
            contasInvalidas++
            println("Aviso: Deleção pendente. Conta sem e-mail ou em branco.")
        } else {
            println("Conta válida: $email")
        }
    }
    
    println("Total de contas que precisam ser apagadas: $contasInvalidas")
}
