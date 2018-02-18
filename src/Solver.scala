/**
  * Created by hradev01 on 2/18/2018.
  */
trait Solver {

  //pre-order
  def dfsPre(t: Tree): List[Int] = t match {
    case l: Leaf => List(l.info)
    case n: Node => n.info :: dfsPre(n.left) ::: dfsPre(n.right)
  }

  //in-order
  def dfsIn(t: Tree): List[Int] = t match {
    case l: Leaf => List(l.info)
    case n: Node => dfsIn(n.left) ::: n.info :: dfsIn(n.right)
  }

  //post-order
  def dfsPost(t: Tree): List[Int] = t match {
    case l: Leaf => List(l.info)
    case n: Node => dfsPost(n.left) ::: dfsPost(n.right) ::: List(n.info)
  }
  //Find average of all value in the tree
  def average(t: Tree): Int = {
    val tree = dfsIn(t)
    (tree :\ 0)(_+_) / tree.size
  }

}
