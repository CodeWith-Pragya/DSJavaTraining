

public class PasswordGenerator
{

    public static void main(String[] args) {
        int numChar = 1;

        int charSpot = 0;
        String[] password = new String[8];

        int lowerc = 0;
        int upperc = 0;
        int num = 0;
        int sym = 0;

        int min;
        int max;
        int x = 0;

        String printPassword = "";

        for(int i = 0; i < 8; i++){
            String alphachar = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*?1234567890";
            min = 0;
            max = alphachar.length();
            int randSpot = (int)(Math.random() * ((max - min) +1)) + min;
            password[i]=alphachar.substring(randSpot,randSpot+1);
        }
        while (x<4){
            x++;
            min = 0;
            max = 7;
            charSpot = (int)(Math.random() * ((max - min) +1)) + min;
            if(x==1){
                if(charSpot != lowerc){
                    lowerc = charSpot;
                    String allLowercase = "abcdefghijklmnopqrstuvwxyz";

                    min = 1;
                    max = 26;
                    int a = (int)(Math.random() * ((max - min) +1)) + min;

                    String lowercase = allLowercase.substring(a-1,a);

                    password [charSpot] = lowercase;
                }else{
                    x--;
                }
            }

            if(x==2){
                if(charSpot != upperc && charSpot != lowerc){
                    upperc = charSpot;
                    String allLowercase = "abcdefghijklmnopqrstuvwxyz0";

                    min = 1;
                    max = 26;
                    int b = (int)(Math.random() * ((max - min) +1)) + min;

                    String lowercase = allLowercase.substring(b-1,b);
                    String uppercase = lowercase.toUpperCase();

                    password [charSpot] = uppercase;
                }else{
                    x--;
                }
            }

            if(x==3){
                if(charSpot != num && charSpot != upperc && charSpot != lowerc){
                    num = charSpot;

                    String allNumbers = "12345678900";
                    min = 1;
                    max = 10;
                    int c = (int)(Math.random() * ((max - min) +1)) + min;

                    String number = allNumbers.substring(c-1,c);

                    password [charSpot] = number;
                }else{
                    x--;
                }
            }

            if(x==4){
                if(charSpot != sym && charSpot != num && charSpot != upperc && charSpot != lowerc){
                    sym = charSpot;

                    String allSymbols = "!@#$%^&*?0";
                    min = 1;
                    max = 9;
                    int d = (int)(Math.random() * ((max - min) + 1)) + min;

                    String symbol = allSymbols.substring(d-1,d);

                    password [charSpot] = symbol;
                }else{
                    x--;
                }
            }

        }
        for(int i = 0; i < 8; i++){
            printPassword += password[i];
        }

        System.out.println(printPassword);
    }
}