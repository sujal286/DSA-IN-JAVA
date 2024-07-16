
class Stringbuilder {
    
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("Sujal");

        System.out.println(sb.charAt(0));

        System.out.println(sb.length());

        sb.setCharAt(0,'Z');
        System.out.println(sb);

        sb.insert(2,'j');
        System.out.println(sb);

        sb.delete(2,3);
        System.out.println(sb);

        sb.append(" Saha");
        System.out.println(sb);
    }
}
