public class stringo {
    public static void main(String[] args) {
        // String name= new String ("Pallavi");
        // String name="Pallavi";
        // name= name + " Srivastva ";
        // System.out.println("Hello " + name);
        // System.out.println(name.charAt(5));
        // System.out.println(name.concat(" Srivastava "));


        StringBuffer sb=new StringBuffer("Pallavi");
        // System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Srivastva");
        // sb.deleteCharAt(4);
        sb.insert(8, " Java ");
        sb.setLength(30);
        sb.ensureCapacity(100);
        System.out.println(sb);
    }
}
