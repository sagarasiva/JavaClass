package Day5;

public class StringLoop {
    //example of string loop array
    public static void main(String[] args) {

        //   name store in array
        //                 0        1      2       3
        String[] fruit= {"Mango","Apple","grapes","lemon"};
        //for loop for execute the name;
        //ad for each loop/ enhanced for each loop


        /** for( Datatype refvar:Array name[]){
         *                s.o.p(refvar);
         *                }
         */
      for (String f : fruit ){
            System.out.println(f);
        }
    }

}
