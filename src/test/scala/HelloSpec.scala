import org.scalatest._

class CrossOverSpec extends WordSpec with MustMatchers {

  "CrossOverSpec" must {

    "Return 0 when given 1" in {
       CrossOver.chrom("0", "1", 0)  mustEqual List("1", "0")
    }

  }

}
