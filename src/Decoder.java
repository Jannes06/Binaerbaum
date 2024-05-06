public class Decoder {

    public static void decodiere (String code,BinaryTree baum){
        BinaryTree <String> baum1 = new BinaryTree<String>();
        BinaryTree speicher = baum;
        String wort = "";
        for (int e=0;e<code.length();e++) {
          if ('.'==(code.charAt(e))) {
              baum = baum.getLeftTree();

          }
          if('-'==(code.charAt(e))){
             baum = baum.getRightTree();

          }

          if('/'==(code.charAt(e))){
              wort= wort+(baum.getContent());
            baum = speicher;
             
          }


        }
        wort= wort+(baum.getContent());
        System.out.println(wort);
        }

    }


