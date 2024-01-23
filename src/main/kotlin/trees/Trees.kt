package trees

import apple.laf.JRSUIUtils.Tree
import models.TreeNode

fun preorderTraversal(root: TreeNode?): List<Int> {
    return traversal(root, arrayListOf())
}

// ITERATIVE SOLUTION

fun preorderIterative(root: TreeNode?, list: ArrayList<Int>): List<Int> {

    val list = arrayListOf<Int>()
    val stack = arrayListOf<TreeNode?>()

    stack.add(root)

    while (stack.isNotEmpty()) {
        val node = stack.removeLast()
        if(node?.`val` != null) {
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

// RECURSIVE SOLUTION

fun preorderTraversal(node: TreeNode?, list: ArrayList<Int>): List<Int> {

    if(node?.`val` != null) {
        list.add(node.`val`)
    }else{
        return list
    }

    if(node.left != null) traversal(node.left, list)

    if(node.right != null) traversal(node.right, list)

    return list
}

fun inorderIterative(root: TreeNode?): List<Int> {

    var current = root
    val stack = arrayListOf<TreeNode?>()
    val list = arrayListOf<Int>()

    while (current != null || stack.isNotEmpty()) {
        while (current != null) {
            stack.add(current)
            current = current.left
        }

        current = stack.removeLast()
        current?.`val`?.let { list.add(it) }
        current = current?.right

    }

    return list
}

fun postOrderTraversal(node: TreeNode?, list: ArrayList<Int>): List<Int> {

    node?.left?.let { postOrderTraversal(node.left, list) }

    node?.right?.let { postOrderTraversal(node.right, list) }

    node?.`val`?.let { list.add(it) }

    return list
}

fun postOrderIterative(root: TreeNode?): List<Int> {

    val result = arrayListOf<Int>()
    val stack = arrayListOf<TreeNode?>()

    if(root == null) return result

    stack.add(root)

    while (stack.isNotEmpty()) {

        val node = stack.removeLast()

        node?.`val`?.let {
            result.add(0, it)
        }

        node?.left?.let { stack.add(it) }
        node?.right?.let { stack.add(it) }

    }

    return result

}// end postOrderIterative()




