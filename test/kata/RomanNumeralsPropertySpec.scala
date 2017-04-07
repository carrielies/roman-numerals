package kata

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll


object RomanNumeralsPropertySpec extends Properties("RomanNumeral") {

  property("no more that 3 I") = forAll { a: Int =>
    !RomanNumeral.toRoman(a).contains("IIII")
  }

  property("no more that 1 V") = forAll { a: Int =>
    !RomanNumeral.toRoman(a).contains("VV")
  }

  property("no more that 3 X") = forAll { a: Int =>
    !RomanNumeral.toRoman(a).contains("XXXX")
  }
}