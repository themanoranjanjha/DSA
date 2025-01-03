package strings;

public class UppLowCast {
    
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        UppLowCast r = new UppLowCast();
        r.convertCase(str);
       
        }

        public void convertCase(String s){
            
            StringBuilder Res = new StringBuilder();
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(Character.isUpperCase(c)){   
                    Res.append(Character.toLowerCase(c));
                    }
                    else if(Character.isLowerCase(c)){  
                        Res.append(Character.toUpperCase(c));
                    }
                    else{
                        Res.append(c);
                    }
                    }
                    System.out.println("Converted String: " + Res.toString());
        }

}
