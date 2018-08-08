class Isogram {
    companion object {
        fun isIsogram(sentence: String): Boolean {
//            for (i in 0 until sentence.length) {
////                val character = sentence[i]
////                for (j in i+1 until sentence.length) {
////                    if(character == sentence[j]){
////                        return false
////                    }
////                }
////            }

            return sentence.toLowerCase()
                    .filterNot { it == ' ' || it == '-' }
                    .groupBy { it }
                    .values
                    .none { it.size > 1 }
        }
    }

}
