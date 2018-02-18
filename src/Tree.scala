/**
  * Created by hradev01 on 2/18/2018.
  */
sealed trait Tree
final case class Leaf(info: Int) extends Tree
final case class Node(left: Tree, info: Int, right: Tree) extends Tree
