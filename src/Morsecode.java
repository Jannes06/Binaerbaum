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

     BinaryTree <Integer> b4 = new BinaryTree<Integer>(21);
     BinaryTree <Integer> b6 = new BinaryTree<Integer>(6,null,new BinaryTree<>(7));
     BinaryTree <Integer> b3 = new BinaryTree<Integer>(3, new BinaryTree<Integer>(5),b6);
     BinaryTree <Integer> b2 = new BinaryTree<Integer>(2,b4,null);
     BinaryTree <Integer> b1 = new BinaryTree<Integer>(1,b2,b3);



     TreeDrawer.drawTreeInWindow(Start);
        //System.out.println(getHoechsteZahl(b1));

     //Decoder.decodiere("-../---/-./-./.-/.--/./-/-/.-" ,Start);
     //Decoder.decodiere("--",Start);
     System.out.println(code("ZARA",Start));
     //System.out.println(Encoder.encoder("Z",Start));




     //System.out.println(getBlaetterAnzahl(T1));
    }



    public int getTiefe (BinaryTree baum){
     return tiefe(baum)-1;
 }

    private int  tiefe(BinaryTree baum){
     int links;
     int rechts;


     if (!baum.isEmpty()){
     links = tiefe(baum.getLeftTree());
     rechts = tiefe(baum.getRightTree());

     if (links >rechts) {
        return links+ 1;
     }
     else {  //Wenn rechts also größer ist
      return rechts+ 1;
     }
     //-------Wenn der Baum leer ist, gibt er 0 zurück und zählt so nicht zur Tiefe
     }
     else {
      return 0;
     }
    }


    public int getGesamtKnotenAnzahl(BinaryTree baum){
       int links;
       int rechts;

       if(!baum.isEmpty()){
        links = getGesamtKnotenAnzahl(baum.getLeftTree());
        rechts = getGesamtKnotenAnzahl(baum.getRightTree());

        return links+rechts +1;
       }
       else return 0;
    }


    public int getBlaetterAnzahl(BinaryTree baum){
     int links;
     int rechts;


     if (!baum.isEmpty()) {

         links = getBlaetterAnzahl(baum.getLeftTree());
         rechts = getBlaetterAnzahl(baum.getLeftTree());

        if (links == 0 && rechts ==0){
            System.out.println("blatt");
            System.out.println(links+rechts+1);
            return links + rechts +1;
        }
        else {
            System.out.println("keinblatt");
            System.out.println(links+rechts+0);
            return links+ rechts +0;
        }
     }
     else return 0;

 }

   public int getHoechsteZahl(BinaryTree baum){
       int links, rechts, mitte;

       if  (!baum.isEmpty()){
           links = getHoechsteZahl(baum.getLeftTree());
           rechts = getHoechsteZahl(baum.getRightTree());
           mitte = (int) baum.getContent();

           if ( links > rechts) {
               if (links > mitte) {
                   return links;
               } else {
                   return mitte;
               }
           }


           else {
               if (rechts >mitte ) {
                   return rechts;
               }
               else {
                   return mitte;
               }

           }
       }
       else {
           return 0;
       }

   }

    public  String code (String pText,BinaryTree baum){
        String ausgabe = ".";
        for ( int i=0;i<pText.length();i++){
            ausgabe = encodierenNeu(pText.charAt(i),baum,"")+"/";
        }
        return ausgabe;
    }



    private String encodierenNeu(Character buchstabe,BinaryTree baum, String weg){




        if (baum.isEmpty()) {
            return "";

        }
        else {
            if (baum.getContent() == buchstabe) {
                return weg;

            }
            else {
                String links = encodierenNeu(buchstabe, baum.getRightTree(), weg + ".");
                if (!links.equals("")) {
                    return links;
                }
                else {

                    return   encodierenNeu(buchstabe, baum.getRightTree(), weg + "-");
                }
            }
        }


    }
}
