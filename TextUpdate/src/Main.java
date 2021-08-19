public class Main {
    public static void main(String[] args) {
        String test = "cacao and coffee success The table";
        update(test);
    }

    private static void update( String str) {
        String [] test = str.split(" ");
        for (String s: test) {
            char [] h = s.toCharArray();
            s = s.replace("ci", "si")
                    .replace("ce", "se")
                    .replace("ck", "k")
                    .replace("c", "k")
                    .replace("ee", "i")
                    .replace("oo","u");
            for (int i = 0; i < h.length-1; i++) {
                String a = "" + h[i];
                String b = "" + h[i] + h[i];
                if(h[i] == h[i+1]){
                    s = s.replace(b,a);
                }
            }
            if(s.lastIndexOf('e') == s.length()-1 && s.length()>1){
                s = s.substring(0, s.length() - 1);
            }
            if(!s.equalsIgnoreCase("an")&&!s.equalsIgnoreCase("a")&&!s.equalsIgnoreCase("th")){
                System.out.print(s + ' ');
            }
        }
    }
}
