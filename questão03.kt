fun validarBioInfantil(bio: String?) {
    val tamanho = bio?.length ?: 0
    
    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}
