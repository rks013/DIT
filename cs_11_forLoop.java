 class forLoop {
    public static void main(String[] args) {
        int i=0;
        //checking contro flow in for loop.
        for(st('i');st('C')&&(i<13);st('I')){ 
            st('E');
            i++;
            if(i==10)
                break;
        }
        System.out.println("\ni: initialization , C:condition check, E: execute body, I: increment/decrement");

    }
    static boolean  st(char c){
        System.out.print(c+" ");
        return true;
    }
}
