class PallaviException extends Exception{
    public PallaviException(String str){
        super(str);
    }
}
 
public class excep {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new PallaviException("I dont want to print zero");
            }
        }
        // catch(Exception e){
        //     System.out.println("Something wrong" + e);
        // }
        catch(PallaviException e){
            j=18/1;
            System.out.println("Default output" + e);
        }
        catch(Exception e){
            System.out.println("Something Went wrong");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
