// import Ass4.BinarySearchTree;

public class main {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[] {7,5,3,1,4,6,12,9,8,10,15,13,17};
		BinarySearchTree tree = new BinarySearchTree(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
			tree.AddNode(arr[i]);
		}
		

        int[] pop = new int[] {1,6,5,15,7};
		for (int i : pop){
			System.out.println("------------------");
			BinarySearchTree n = tree.RemoveNode(i);
			System.out.println("Remove : "+i);
			tree.printBreathFirstSearch();
		}
	}
}
