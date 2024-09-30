class Examen  {

    val plantillas=  charArrayOf('a','c','b','a','d','b','b','c','a','a','b','d')
    val nombres = Array(4){""}
    val notas: FloatArray = FloatArray(4)
    val respuestas: Array<CharArray> = Array(4) {CharArray(12)}
    var contador: Int = 0

fun leerRespuestas(respuestasEstu: CharArray) {
    if (contador < 4)
        respuestas[contador] = respuestasEstu
    contador++
    }
     }
fun calculaNota(respuestas: Array<CharArray>, plantillas: Array<Char>,notas: FloatArray ){
    for (fila in respuestas.indices){
        var correctas = 0
        for (colum in respuestas[fila].indices){
            if(respuestas[fila][colum] == plantillas[colum]){
                correctas++
            }
        }
        notas[fila] = (correctas/12.0f) * 100
    }
}
fun promedioGrupo(): Float {
    //no se
 }



