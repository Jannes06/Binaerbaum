public class Morsecode {
    public Morsecode(){
     BinaryTree <String>  S1 = new BinaryTree<String>("S",new BinaryTree<>("H"),new BinaryTree<>("V"));
     BinaryTree <String>  U1 = new BinaryTree<String>("U",new BinaryTree<>("F"),null);
     BinaryTree <String>  I1 = new BinaryTree<String>("I",S1,U1);
     BinaryTree <String>  R1 = new BinaryTree<String>("R",new BinaryTree<>("L"),null);
     BinaryTree <String>  W1 = new BinaryTree<String>("W",new BinaryTree<>("P"),new BinaryTree<>("J"));
     BinaryTree <String>  A1 = new BinaryTree<String>("A",R1,W1);
     BinaryTree <String>  E1 = new BinaryTree<String>("E",I1,A1);

     BinaryTree <String>  D1 = new BinaryTree<String>("D",new BinaryTree<>("B"),new BinaryTree<>("X"));
     BinaryTree <String>  K1 = new BinaryTree<String>("K",new BinaryTree<>("C"),new BinaryTree<>("Y"));
     BinaryTree <String>  N1 = new BinaryTree<String>("N",D1,K1);
     BinaryTree <String>  G1 = new BinaryTree<String>("G",new BinaryTree<>("Q"),new BinaryTree<>("Z"));
     BinaryTree <String>  M1 = new BinaryTree<String>("M",G1,new BinaryTree<>("O"));
     BinaryTree <String>  T1 = new BinaryTree<String>("T",N1,M1);

     BinaryTree <String> Start = new BinaryTree<String>("/",E1,T1);
    }
}
