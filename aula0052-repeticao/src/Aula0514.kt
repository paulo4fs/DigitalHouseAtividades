fun main() {
    var validate = false
    println("digite seu nome:")
    while(!validate){
     var nome = readLine()!!.toString()
        if(nome.length>3){
            validate=true
        }
    }
    println("digite sua idade:")
    validate = false
    while(!validate){
        var idade = readLine()!!.toInt()
        if(idade in 1..149){
            validate=true
        }
    }
    println("digite seu salário:")
    validate=false
    while(!validate){
        var salario = readLine()!!.toDouble()
        if(salario<0){
            validate=true
        }
    }
    println("digite seu sexo:")
    validate = false
    while(!validate){
        var sexo = readLine()!!.toString().toLowerCase()
        if(sexo=="f" || sexo=="m"){
            validate = true
        }
    }
    println("digite seu estado civil (s,c,v,d):")
    validate=false
    while(!validate){
        var civil = readLine()!!.toString().toLowerCase()
        if(civil=="s" || civil== "c" || civil== "v" || civil== "d"){
            validate = true
        }
    }
    println("validação concluida")
}