import java.util.ArrayList;

public class BinarySearchTree {

	int data;
	BinarySearchTree left = null;
	BinarySearchTree right = null;

	public BinarySearchTree(int data) {
		this.data = data;
	}

	public BinarySearchTree RemoveNode(int key) {
		if (key > this.data) {
			if (this.right.right == null) {
				this.right = null;
				return null;
			}
			this.right.RemoveNode(key);

		} else if (key < this.data) {
			if (this.left.left == null) {
				this.left = null;
				return null;
			}
			this.left.RemoveNode(key);
		} else {
			if (this.left == null && this.right == null) {
				return null;
			}
			if (this.left == null || this.right == null) {
				if (this.left != null) {
					return this.left;
				} else {
					return this.right;
				}
			}
			BinarySearchTree temp = this.right;
			while (temp.left != null) {
				temp = temp.left;
			}
			this.data = temp.data;
			this.right.RemoveNode(temp.data);
		}
		return left;
	}

	public void AddNode(int data) {

		if (data >= this.data) {
			if (this.right == null) {
				this.right = new BinarySearchTree(data);
			} else {
				this.right.AddNode(data);

			}
		} else {
			if (this.left == null) {
				this.left = new BinarySearchTree(data);
			} else {
				this.left.AddNode(data);

			}
		}
	}

	public void printTreeDepthFirstSearch(int level) {

		for (int i = 0; i < level; i++) {
			System.out.print(" ");
		}
		System.out.print("-");
		System.out.println(this.data);

		if (this.left != null)
			this.left.printTreeDepthFirstSearch(level + 1);
		if (this.right != null)
			this.right.printTreeDepthFirstSearch(level + 1);
	}

	public void printAscending() {

		if (this.left != null)
			this.left.printAscending();
		System.out.println(this.data);
		if (this.right != null)
			this.right.printAscending();
	}

	public void printDeascending() {
		if (this.right != null)
			this.right.printDeascending();
		System.out.println(this.data);
		if (this.left != null)
			this.left.printDeascending();

	}

	public void printBreathFirstSearch() {
		ArrayList<BinarySearchTree> arr = new ArrayList<BinarySearchTree>();
		arr.add(this);
		while (!arr.isEmpty()) {
			BinarySearchTree p = arr.remove(0);
			if (p.left != null)
				arr.add(p.left);
			if (p.right != null)
				arr.add(p.right);
			System.out.println(p.data);
		}
	}

}
