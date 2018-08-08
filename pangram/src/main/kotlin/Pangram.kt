
class Pangram{
    companion object {
        fun isPangram (text : String):Boolean{
            val alpha = "abcdefghijklmnopqrstuvwxyz"
            return alpha.all { letter -> text.toLowerCase().contains(letter)}
        }
    }
}