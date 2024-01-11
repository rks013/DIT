 class asciiValue {
    public static void main(String[] args) {
         char[] capitals = new char[26];
         char[] smalls = new char[26];

         //ascii value of Caps letters i.e A-Z : 65-90
         for(int i=65,index=0;i<=90; i++,index++){
            capitals[index]=(char)i;
         }
         System.out.println();
        //ascii value of small letters i.e a-z : 97-122
        for(int i=97,index=0;i<=122; i++,index++){
            smalls[index]=(char)i;
         }

         //printing
         Printing(capitals);
         System.out.println();
         Printing(smalls);


    }
    public static void Printing(char[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
