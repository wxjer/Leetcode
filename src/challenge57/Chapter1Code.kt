/**
 * 创建一个简单的消费计算程序。该程序应该提示用户输入账单金额和小费比例，该程序必须计算出小费，并显示小费和总金额
 */
fun main(args: Array<String>) {
    println("请输入消费金额：")
    var total = getInput()
    while (total == null || total <= 0) {
        println("请输入正确的金额：")
        total = getInput()
    }
    println("请输入小费比例：")
    var percentage = getInput()
    while (percentage == null||percentage<1||percentage>100) {
        println("请输入正确的小费比例,15%的小费比例，应该输入15")
        percentage = getInput()
    }
    val tip = if (percentage <= 0.0) {
        0.0
    } else {
        (total * percentage / 100.0)
    }
    println("小费：$${String.format("%.2f",tip)}")
    println("总消费：$${String.format("%.2f",total+tip)}")

}

fun getInput(): Double? {
    val inputS = readLine()
    return inputS?.toDoubleOrNull();
}
