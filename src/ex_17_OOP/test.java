package ex_17_OOP;

class test {
    public static void main(String[] args) {
         // input = taek string remove white spaces "aaaa bbccd"
        // and convert string or compress as 
        // convert string or compress this string as "a4b2c2d1"
        //System.out.println("Try programiz.pro");
        String str = "aaaa bbccd";
        int count = 0;
        
        for(int i = 0;i<str.length();i++){
            
            if(str.charAt(i)!= ' '){
                str += str.charAt(i);
            }
        }
        
        System.out.println(str);
        
        
    }
}
