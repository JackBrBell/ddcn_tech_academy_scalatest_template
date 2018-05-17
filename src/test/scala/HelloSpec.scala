import org.scalatest._

class CrossOverSpec extends WordSpec with MustMatchers {

  "CrossOverSpec" must {

    "Return 0 when given 1" in {
       CrossOver.chrom("0", "1", 0)  mustEqual List("1", "0")
    }
"Return 000 when given 111" in {
  CrossOver.chrom("000", "111", 1) mustEqual List("100", "011")
}
  }

}
