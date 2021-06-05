public class P1008Top {
    public static void main(String args[]){
        for(int a = 123 ; a < 330 ; a ++){
            int b = a * 2;
            int c = a * 3;
            if(ok(a, b, c)){
                System.out.println(a + " " + b + " " + c);
            }
        }
    }
    public static boolean ok(int a, int b, int c){
        String v = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
        if(v.contains("1") && v.contains("2") && v.contains("3") && v.contains("4") && v.contains("5") && v.contains("6") && v.contains("7") && v.contains("8") && v.contains("9"))
            return true;
        return false;
    }
}
