package algorithms.challenge

import models.TreeNode
import models.TreeNodeS
import trees.levelOrder
import trees.preorderTraversal

fun main() {

    val root = TreeNodeS("F")

    val B = TreeNodeS("B")
    val G = TreeNodeS("G")

    root.left = B
    root.right = G

    val A = TreeNodeS("A")
    val D = TreeNodeS("D")
    val I = TreeNodeS("I")

    B.right = D
    B.left = A
    G.right = I

    val C = TreeNodeS("C")
    val E = TreeNodeS("E")
    val H = TreeNodeS("H")

    D.left = C
    D.right = E
    I.left = H

//    val list = traversalIteratively(root)
    val result = levelOrder(root)
    println(result)

}

fun traversalIteratively(root: TreeNode?): List<Int> {

    val list = arrayListOf<Int>()
    val stack = arrayListOf<TreeNode?>()

    stack.add(root)

    while (stack.isNotEmpty()) {

        val node = stack.removeLast()

        node?.`val`?.let {
            list.add(node.`val`)
        }

        if(node?.right != null) {
            stack.add(node.right)
        }

        if(node?.left != null) {
            stack.add(node.left)
        }

    }

    return list

}