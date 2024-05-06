public class Encoder {

    public static String weg = "";
    public static String speicher="";








  public static void  postOrder(BinaryTree baum){
    if ( baum!= null){
        postOrder(baum.getLeftTree());        //Springt zum linken zweig
        postOrder(baum.getRightTree());       // Springt zum rechten zweig
        System.out.println(baum.getContent());   // Mittlerer Wert

    }
  }
    public static void  inOrder(BinaryTree baum){
        if ( baum!= null){
            inOrder(baum.getLeftTree());        //Springt zum linken zweig
            System.out.println(baum.getContent());   // Mittlerer Wert
            inOrder(baum.getRightTree());       // Springt zum rechten zweig


        }
    }
    public static void  praeOrder(BinaryTree baum){
        if ( baum!= null){
            System.out.println(baum.getContent());   // Mittlerer Wert
            praeOrder(baum.getLeftTree());        //Springt zum linken zweig
            praeOrder(baum.getRightTree());       // Springt zum rechten zweig


        }
    }
  public static void buchstabePruefen(String buchstabe,BinaryTree baum){
      if ( baum!= null){

          if (baum.getContent()==(buchstabe)){
              System.out.println("true");
              return;
          }
          buchstabePruefen(buchstabe,baum.getLeftTree());        //Springt zum linken zweig
          buchstabePruefen(buchstabe,baum.getRightTree());       // Springt zum rechten zweig
      }
  }






   //public static teilfinden(String wort){
   // for (int i = 1; i<= wort.length();,)
    // }
    public static String encoder(String satz,BinaryTree baum){
         String code = "";
      for ( int i=0;i<satz.length();i++){

         String buchstabe = String.valueOf(satz.charAt(i));
          System.out.println(buchstabe);
          code = code + (encodieren(buchstabe,baum,""));
          System.out.println(encodieren(buchstabe,baum,"")); //(encodieren(buchstabe,baum,""));

      }
      return code;
    }

























    public static String encodieren(String buchstabe,BinaryTree baum, String weg){

          if ( baum!= null){
            if (baum.getContent()==(buchstabe)){
                speicher = weg;
                speicher = speicher + "/";
                System.out.println("found");
            }
            encodieren(buchstabe,baum.getLeftTree(),weg+".");        //Springt zum linken zweig
            encodieren(buchstabe,baum.getRightTree(),weg+"-");       // Springt zum rechten zweig

        }

          return speicher;
    }
}