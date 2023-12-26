public class stringmethod {
    public static void main(String[] args) {
        String name="Aditya";
        System.out.println(name);
        int value= name.length();
        System.out.println(value);

        String lstring= name.toLowerCase();
        System.out.println(lstring);

        String nonTrimmedString="       ADITYA        ";
        System.out.println(nonTrimmedString);

        String TrimmedString= nonTrimmedString.trim();
        System.out.println(TrimmedString);

        System.out.println(name.substring(2));
        System.out.println(name.substring(0));

        System.out.println(name.substring(1,3));

        System.out.println(name.replace('A','O'));

        System.out.println(name.startsWith("ADI"));
        System.out.println(name.startsWith("Adi"));

        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));

        System.out.println(name.indexOf("A"));

        System.out.println(name.equals("Aditya"));

        System.out.println(name.equalsIgnoreCase("aDItya"));

        System.out.println("\"What i sthis\"");
    }

}
