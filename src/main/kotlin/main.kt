
fun main() {
//    N1
//    val x = listOf(1,1,2,2,20,20,80,5,5)
//    fun singleNumber(numbs: List<Int>): Int{
//        var singleNumb = 0
//        for (num in numbs.sorted()) {
//            if (num != numbs[numbs.indexOf(num) + 1]) {
//                singleNumb = num
//            }
//        }
//        return singleNumb
//
//    }

//    N2
//    fun minSplit(amount: Int): Int {
//        var cash = amount
//        val list = mutableListOf(50, 20, 10, 5)
//        var change = 0
//        while (list.isNotEmpty()) {
//            if (cash / list.first() < 0) {
//                list.removeFirst()
//            } else {
//                change += cash / list.first()
//                cash %= list.first()
//                list.removeFirst()
//            }
//        }
//
//        change += cash
//
//        return change
//    }


//N3
//    fun notContains(array: Array<Int>): Int {
//        val list = array.filter { it >= 0 }.toMutableList()
//        var numb = 0
//        while (numb == 0) {
//            if (list.contains(list.min() + 1)) {
//                list.remove(list.min())
//            } else {
//                numb = list.min() + 1
//            }
//
//        }
//        return numb
//
//
//    }

//N4
//    fun binaryToDecimal(x: String): Int {
//        val list = x.toList().reversed()
//        val newList = mutableListOf<Double>()
//        for (item in list) {
//            if (item.code == 48) {
//                newList.add(0.0)
//            } else {
//                newList.add(1.0)
//            }
//        }
//        var decimal = 0.0
//        var ind = 0
//        newList.forEach {
//            decimal += it * (2.0).pow(ind)
//            ind += 1
//        }
//        return decimal.toInt()
//    }
//
//    fun binaryStrings(y: String, z: String): String {
//        var sum = binaryToDecimal(y) + binaryToDecimal(z)
//        var binary = ""
//        while (sum / 2 > 0 || sum != 0) {
//            binary += (sum % 2).toString()
//            sum /= 2
//        }
//        return binary.reversed()
//    }

//    N5
//    fun fibonacciNumber(n: Int): Int {
//        return if (n <= 1) {
//            n
//        } else {
//            fibonacciNumber(n - 1) + fibonacciNumber(n - 2)
//        }
//    }
//
//    fun countVariants(stairsCount: Int): Int {
//        return fibonacciNumber(stairsCount + 1)
//    }


//N6
//    class DataStructure {
//
//        val array = ArrayList<Int>()
//        val map = HashMap<Int,Int>()
//        fun remove(x: Int){
//            if (map.contains(x)){
//                val index = map[x]
//                map.remove(x)
//                val lastElement = array.size - 1
//                array[index!!] = array[lastElement]
//                array.remove(lastElement)
//                map[array[index]] = index
//
//            }
//        }
//
//    }

}
