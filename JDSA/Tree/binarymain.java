public class binarymain
{
    public static void main(String[] args) {
        binarytree bt = new binarytree(10);
        bt.insertleft(bt.root,5);
        bt.insertright(bt.root,15);
        bt.insertleft(bt.root.left,3);
        bt.insertright(bt.root.left,8);
        bt.insertleft(bt.root.right,12);

        System.out.print("preorder traversal : ");
        bt.preorder(bt.root);
        System.out.println();
        System.out.print("inorder traversal : ");
        bt.inorder(bt.root);
        System.out.println();
        System.out.print("postorder traversal : ");
        bt.postorder(bt.root);
        System.out.println();
    }
}
