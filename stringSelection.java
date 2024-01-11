public class stringSelection {
    public static void main(String[] args) {
        System.out.println("Hello, World!\n");
        String str = "a@b!c^%1*2#3";
        
        System.out.println(stringSelct(str));
        System.out.println("**************");
        //or other method.
        String new_str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(new_str);
        
    }
    public static String stringSelct(String str){
        int length = str.length();
        String str2="";
        for(int i =0; i<length;i++){
             
            //System.out.println(str.charAt(i));
             
            String check =""+str.charAt(i);
            if(check.matches("\\w")){
                str2=str2+str.charAt(i);
            }
            //System.out.println(str2);
        }
        return str2;
    }
}
