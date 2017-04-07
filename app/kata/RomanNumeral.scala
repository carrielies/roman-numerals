package kata


object RomanNumeral {

  case class RomanOutput(remainder: Int, output:String)
  case class RomanConversion(araibic: Int, roman:String)
  val romanDigits =
    List( RomanConversion(1000,"M"),
      RomanConversion(900,"CM"),
      RomanConversion(500,"D"),
      RomanConversion(400,"CD"),
      RomanConversion(100,"C"),
      RomanConversion(90,"XC"),
      RomanConversion(50,"L"),
      RomanConversion(40,"XL"),
      RomanConversion(10,"X"),
      RomanConversion(9,"IX"),
      RomanConversion(5,"V"),
      RomanConversion(4,"IV"),
      RomanConversion(1,"I")
    )

  def toRoman(n: Int): String = {
    romanDigits.foldLeft(RomanOutput(n, "")){
      (result, current) =>
        val times = result.remainder / current.araibic
        val remainingNumber = result.remainder - (current.araibic * times)
        val output = result.output + (current.roman * times)
        RomanOutput(remainingNumber, output)
    }.output
  }
}
