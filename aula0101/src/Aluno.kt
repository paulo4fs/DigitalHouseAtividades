class Aluno(val ra: Int, var nome: String, var sobrenome: String) {
    val assistirAula: Boolean
        get() = true
    val fazerLicao: Boolean
        get() = true
}