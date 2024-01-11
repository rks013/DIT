public class prim_type {
        public static void main(String args[]) {
            // range alloted by java for int datatype 
            int int_max = Integer.MAX_VALUE;
            int int_min = Integer.MIN_VALUE;
            System.out.println("Range is ");
            System.out.println("max value is " + int_max);
            System.out.println("min value is " + int_min);
            System.out.println("busted max is " + (int_max+1));//overflow 
            System.out.println("busted min is " + (int_min-1));//underflow  i.e cyled around to max value
            
            byte byte_max = Byte.MAX_VALUE; // byte primitive type 
            byte byte_min = Byte.MIN_VALUE;
            
            System.out.println("Range for byte data tytpe is ");
            System.out.println("max value is " +  byte_max);
            System.out.println("min value is " +  byte_min);

            short short_max = Short.MAX_VALUE; // short primitive type  
            short short_min = Short.MIN_VALUE;
            
            System.out.println("Range for short data tytpe is ");
            System.out.println("max value is " +  short_max);
            System.out.println("min value is " +  short_min);

            
            long long_max = Long.MAX_VALUE; // long primitive type 
            long long_min = Long.MIN_VALUE;
            
            System.out.println("Range for long data tytpe is ");
            System.out.println("max value is " +  long_max);
            System.out.println("min value is " +  long_min);
    
            //casting in java
            int new_int_value= (int_max/2); //by defalut java treat a expression as int 
            byte new_byte_value= (byte)(byte_max/2); //syntax for casting 
            short new_short_value= (short)(short_max/2);
            long new_long_value=50000L+10L*(new_int_value+new_byte_value+new_short_value);//**no need for casting in long as java happily accept a int value in long data type 
            System.out.println("line 38 outputted as" + new_long_value);// NEED TO ADD "L", so java treats as long value 
            
    
            //floating point number 
              
            float float_max = Float.MAX_VALUE; // float primitive type  
            float float_min = Float.MIN_VALUE;
            
            System.out.println("Range for float data tytpe is ");
            System.out.println("max value is " +  float_max);
            System.out.println("min value is " +  float_min);

              
            double double_max = Double.MAX_VALUE; // double primitive type  
            double double_min = Double.MIN_VALUE;
            
            System.out.println("Range for double data tytpe is ");
            System.out.println("max value is " +  double_max);
            System.out.println("min value is " +  double_min);

            //declaration for floating point number 
            int int_x=5;
            float float_x=5f;
            //or 
            float float_x1= (float)45.25;

            double double_x= 5d;// by default java accept double as in int
            //or 
            double double_x1=45689.2;

            float new_float_x= float_x/3f;
            System.out.println("maths with float outputted as " + new_float_x);// in java  float handle decimal number unlike int.
            System.out.println("maths with  double "+ double_x/3d);//double is more precise than float.
            System.out.println("maths with int" + int_x/3);

            //character primitive type 

            char my_char='D';//declaration of char data type. //single character is stored in single quote.
            char my_unicode_char='\u0044';
            System.out.println(my_unicode_char);

            //boolean data type 
             
           boolean isCustomerOver18= true;
           System.out.println(isCustomerOver18);

           //STRING 
          String my_string="this is the given string";
          System.out.println(my_string);
          my_string=my_string + ", hello world"; //  string append with + operator
          System.out.println(my_string);
          float float_num=56.25f;
          String new_my_string="100";
          new_my_string=new_my_string + float_num;
          System.out.println(new_my_string);//java convert numeric to text 



        }
    
}

//line 6-> what ever comes after "+" operator is convererted into string and gets outputted.
