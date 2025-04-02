// enum Status{
//     Running,Failed,Pending,Sucess;
// }
// public class enuum {
//     public static void main(String[] args) {
//         int i=5;
//         Status s[]=Status.values();
//         // System.out.println(s);
//         // System.out.println(s.ordinal());
//         for(Status ss:s){
//             System.out.println(ss + ":" + ss.ordinal());
//         }
//     }
    
// }


// enum Status{
//     Running,Failed,Pending,Sucess;
// }
// public class enuum {
//     public static void main(String[] args) {
//         Status s=Status.Running;
//         if(s==Status.Running)
//            System.out.println("All Good");
//         else if(s==Status.Pending)
//            System.out.println("Please wait");
//     }
    
// }

enum Status{
    Running,Failed,Pending,Sucess;
}
public class enuum {
    public static void main(String[] args) {
        Status s=Status.Running;
        switch (s) {
            case Running:
                System.out.println("All good");
                break;
        
            default:
                System.out.println("Done");
                break;
        }
    }
    
}
