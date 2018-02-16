package kata

import org.scalatestplus.play._
import play.api.test.Helpers._
import play.api.test._


class RomanNumeralSpec extends PlaySpec with OneAppPerTest {

  "RomanNumberal.toRoman" should {

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

  "RomanNumberal.fromRoman" should {

    "return 1 when passed I" in {
      RomanNumeral.fromRoman("I") mustBe (1)
    }

    "return 2 when passed II" in {
      RomanNumeral.fromRoman("II") mustBe (2)
    }

    "return 3 when passed III" in {
      RomanNumeral.fromRoman("III") mustBe (3)
    }

    "return 4 when passed IV" in {
      RomanNumeral.fromRoman("IV") mustBe (4)
    }

    "return 5 when passed V" in {
      RomanNumeral.fromRoman("V") mustBe (5)
    }

    "return 10 when passed X" in {
      RomanNumeral.fromRoman("X") mustBe (10)
    }
    "return 50 when passed L" in {
      RomanNumeral.fromRoman("L") mustBe (50)
    }

    "return 1954 when passed MCMLIV" in {
      RomanNumeral.fromRoman("MCMLIV") mustBe (1954)
    }

    "return 1990 when passed MCMXC" in {
      RomanNumeral.fromRoman("MCMXC") mustBe (1990)
    }

    "return 1888 when passed MDCCCLXXXVIII" in {
      RomanNumeral.fromRoman("MDCCCLXXXVIII") mustBe (1888)
    }

    "return 3888 when passed MMMDCCCLXXXVIII" in {
      RomanNumeral.fromRoman("MMMDCCCLXXXVIII") mustBe (3888)
    }

  }
}
