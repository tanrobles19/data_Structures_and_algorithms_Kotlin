package algorithms.challenge

import models.TreeNode
import trees.preorderTraversal

fun main() {

    val root = TreeNode(1)

    root.left = null
    root.right = TreeNode(2)

    root.right?.left = TreeNode(3)

    val list = traversalIteratively(root)
    println(list)

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