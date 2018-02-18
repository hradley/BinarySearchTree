/**
  * Created by hradev01 on 2/18/2018.
  */
object Launcher extends App with Solver {

  val tree = Node(Node(Leaf(5), 6, Leaf(7)), 8, Leaf(9))

  println("Pre-order: " + dfsPre(tree))
  println("In-order: " + dfsIn(tree))
  println("Post-order: " + dfsPost(tree))
  println("Average: " + average(tree))

}
