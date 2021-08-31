package eci.edu.co

object ScalaMain extends App {

  val transactions = (1 to 10).map(_ => TransactionFactory.generateTransaction())
  println("\n\nAll Transactions\n")
  transactions.foreach(println)

  val transactionsBiggerThan20000Cop = transactions.filter(t => t.getValueInCop > 20000)
  println("\n\nTransactions bigger than $20.000 COP\n")
  transactionsBiggerThan20000Cop.foreach(println)

  val transactionsFromFlatMap = (1 to 10).flatMap(_ => {
    val t = TransactionFactory.generateTransaction()
    if (t.getValueInCop > 20000) Some(t) else None
  })
  println("Size: " + transactionsFromFlatMap.size)
}
