class UniqueSumTest extends BaseTest{
    "Entering three unique numbers" should "return the sum of those numbers" in {
      UniqueSum.uniSum(1,2,3) should equal (6)
    }

    "Entering two identical numbers" should "return the non-identical number" in {
      UniqueSum.uniSum(1,1,2) should equal (2)
    }

  "Entering three identical numbers" should "return 0" in {
    UniqueSum.uniSum(1,1,1) should equal (0)
  }
}
