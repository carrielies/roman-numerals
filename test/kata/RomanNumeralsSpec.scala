package kata

import org.scalatestplus.play._
import play.api.test.Helpers._
import play.api.test._


class RomanNumeralSpec extends PlaySpec with OneAppPerTest {

  "RomanNumberal" should {

    "return I when passed 1" in {
      RomanNumeral.toRoman(1) mustBe ("I")
    }

    "return II when passed 2" in {
      RomanNumeral.toRoman(2) mustBe ("II")
    }

    "return III when passed 3" in {
      RomanNumeral.toRoman(3) mustBe ("III")
    }

    "return IV when passed 4" in {
      RomanNumeral.toRoman(4) mustBe ("IV")
    }
    "return V when passed 5" in {
      RomanNumeral.toRoman(5) mustBe ("V")
    }

    "return X when passed 10" in {
      RomanNumeral.toRoman(10) mustBe ("X")
    }
    "return L when passed 50" in {
      RomanNumeral.toRoman(50) mustBe ("L")
    }

    "return MCMLIV when passed 1954" in {
      RomanNumeral.toRoman(1954) mustBe ("MCMLIV")
    }

    "return MCMXC when passed 1990" in {
      RomanNumeral.toRoman(1990) mustBe ("MCMXC")
    }

    "return MDCCCLXXXVIII when passed 1888" in {
      RomanNumeral.toRoman(1888) mustBe ("MDCCCLXXXVIII")
    }

    "return MMMDCCCLXXXVIII when passed 3888" in {
      RomanNumeral.toRoman(3888) mustBe ("MMMDCCCLXXXVIII")
    }

  }

}
