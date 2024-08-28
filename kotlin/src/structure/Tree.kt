package structure


class TreeNode(var data: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class BinaryTree {
    private var root: TreeNode? = null

    fun insert(data: Int) {
        root = insertRec(root, data)
    }

    private fun insertRec(root: TreeNode?, data: Int): TreeNode {
        if (root == null) {
            return TreeNode(data)
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data)
        } else if (data > root.data) {
            root.right = insertRec(root.right, data)
        }
        return root
    }

    fun inOrder() {
        inOrderRec(root)
    }

    private fun inOrderRec(root: TreeNode?) {
        if (root != null) {
            inOrderRec(root.left)
            print("${root.data} ")
            inOrderRec(root.right)
        }
    }

    fun preOrder() {
        preOrderRec(root)
    }

    private fun preOrderRec(root: TreeNode?) {
        if (root != null) {
            print("${root.data} ")
            preOrderRec(root.left)
            preOrderRec(root.right)
        }
    }

    fun postOrder() {
        postOrderRec(root)
    }

    private fun postOrderRec(root: TreeNode?) {
        if (root != null) {
            postOrderRec(root.left)
            postOrderRec(root.right)
            print("${root.data} ")
        }
    }

    fun search(data: Int): Boolean {
        return searchRec(root, data)
    }

    private fun searchRec(root: TreeNode?, data: Int): Boolean {
        if (root == null) {
            return false
        }
        if (root.data == data) {
            return true
        }
        return if (data < root.data) {
            searchRec(root.left, data)
        } else {
            searchRec(root.right, data)
        }
    }
}

fun main() {
    val tree = BinaryTree()

    tree.insert(50)
    tree.insert(30)
    tree.insert(20)
    tree.insert(40)
    tree.insert(70)
    tree.insert(60)
    tree.insert(80)

    println("In-order traversal:")
    tree.inOrder()
    println()

    println("Pre-order traversal:")
    tree.preOrder()
    println()

    println("Post-order traversal:")
    tree.postOrder()
    println()

    println("Search for 40: ${tree.search(40)}")
    println("Search for 90: ${tree.search(90)}")
}
