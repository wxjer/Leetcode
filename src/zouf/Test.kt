package zouf

import utils.ArrayUtils

fun main(args:Array<String>){
    var array1= ArrayUtils.generateRandomArray(100,100)
    var array2 = ArrayUtils.generateRandomArrayWithMaxValue(100,100);
    ArrayUtils.printArray(array1)
    ArrayUtils.printArray(array2)
}
