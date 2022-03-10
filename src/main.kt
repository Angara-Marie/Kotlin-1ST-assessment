fun main(){
    school()
    modulus()
    greeting("Tessa",25)
    measurement("I love food")

}
fun school(){
  var name = "CodeHive"
    var a = name[4]
    var b = name[5]
    var c = name[6]
    var d =name[7]
    var results="$a$b$c$d"
    println(results)
}


fun modulus(){
    var x = 10
    var y = 3
    var results = x%y
    println(results)

}
fun greeting(p:String, z:Int):String{

    var sentence = "Hi, my name is $p and I am $z years old."
    return(sentence)
}
fun measurement(stnc:String){
    println(stnc.length)

}