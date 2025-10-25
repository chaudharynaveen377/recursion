import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class treeTraversal {
    static class node{
        node left;
        node right;
        int data;
        node(int data){
            this.left=null;
            this.right=null;
            this.data=data;
        }
    }

    static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(" "+root.data);
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(node root){
        if(root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(" "+root.data);
    }
    static void inorder(node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(" "+root.data);
        inorder(root.right);
    }

    static void leveOrder(node root){
        if (root==null){
            return;
        }
        List<List<Integer>> lt1=new ArrayList<>();
         List<Integer> lt=new ArrayList<>();
        Queue<node> que=new LinkedList<>();
        que.add(root);
        int size=1;
        while (!que.isEmpty()){
            node temp=que.poll();
            lt.add(temp.data);
            size--;
            if (size==0){
                lt1.add(new ArrayList<>(lt));
                lt.clear();

            }
            if(temp.left!=null){
                que.add(temp.left);
            }
            if(temp.right!=null){
                que.add(temp.right);
            }
            if (size==0){
                size=que.size();
            }
        }
        for (List<Integer> x:lt1){
            System.out.println(x);
        }
//        System.out.println(lt1);


    }

    static int heightTree(node root){
        if (root==null){
            return 0;
        }
        return 1+Math.max(heightTree(root.left),heightTree(root.right));
    }

    static boolean isIdentical(node a,node b){
        if (a==null && b==null){
            return true;
        }

        if ((a==null && b!=null) || (a!=null && b==null) || a.data!=b.data  ){
            return false;
        }
        return isIdentical(a.left,b.left) && isIdentical(a.right,b.right);
    }
    static node mirror(node root){
        if (root==null){
            return null;
        }
        node newnode=new node(root.data);
        newnode.right=mirror(root.left);
        newnode.left=mirror(root.right);
        return newnode;
    }
    public static void main(String[] args) {
node a=new node(1);
a.left=new node(2);
a.right=new node(3);
a.left.left=new node(4);
a.left.right=new node(5);
a.right.right=new node(7);
a.left.right.right=new node(6);

        node b=new node(1);
        b.left=new node(2);
        b.right=new node(3);
        b.left.left=new node(4);
        b.left.right=new node(5);
        b.right.right=new node(7);
        b.left.right.right=new node(6);
        b.left.right.right.right=new node(6);
//b.left.left.left=new node(11);
preorder(a);
        System.out.println();
postorder(a);
        System.out.println();
inorder(a);System.out.println();
leveOrder(a);

        System.out.println(heightTree(a));
        System.out.println(isIdentical(a,b));
        node x=mirror(a);
        leveOrder(x);
    }
}
