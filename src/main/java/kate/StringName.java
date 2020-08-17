package kate;

public class StringName {
    public static void main(String[] args) {
        String myName="Kateryna Rybachenko";
        System.out.println (myName.isEmpty());
        System.out.println(myName.length());
        System.out.println(myName.replace(" ", ""));
        System.out.println(myName.concat(" i am from Kyiv"));
        System.out.println(myName.toLowerCase());
        System.out.println(myName.toUpperCase().contains("Y"));
        System.out.println(myName.charAt(9));
        System.out.println(myName.hashCode());
        System.out.println(myName.equals("Kateryna Rybachenko"));
    }
}
