public class Cyper
{
    public static void main(String args[])
    {
        System.out.println("Input: hello");
        System.out.println("Encrypted: " + encrypt("hello"));
        System.out.println("Decrypted: " + decrypt("lipps"));
    }
    
    public static String encrypt(String input)
    {
        String output = "";
        for (int i = 0; i<input.length(); i++)
        {
            int z = 0;
            switch (input.charAt(i)){
            case 'a': z = 1; break;
            case 'b': z = 2; break;
            case 'c': z = 3; break;
            case 'd': z = 4; break;
            case 'e': z = 5; break;
            case 'f': z = 6; break;
            case 'g': z = 7; break;
            case 'h': z = 8; break;
            case 'i': z = 9; break;
            case 'j': z = 10; break;
            case 'k': z = 11; break;
            case 'l': z = 12; break;
            case 'm': z = 13; break;
            case 'n': z = 14; break;
            case 'o': z = 15; break;
            case 'p': z = 16; break;
            case 'q': z = 17; break;
            case 'r': z = 18; break;
            case 's': z = 19; break;
            case 't': z = 20; break;
            case 'u': z = 21; break;
            case 'v': z = 22; break;
            case 'w': z = 23; break;
            case 'x': z = 24; break;
            case 'y': z = 25; break;
            case 'z': z = 26; break;
            }
            z += 4;
            z=z%26;
            switch (z){
            case 1: output += 'a'; break;
            case 2: output += 'b'; break;
            case 3: output += 'c'; break;
            case 4: output += 'd'; break;
            case 5: output += 'e'; break;
            case 6: output += 'f'; break;
            case 7: output += 'g'; break;
            case 8: output += 'h'; break;
            case 9: output += 'i'; break;
            case 10: output += 'j'; break;
            case 11: output += 'k'; break;
            case 12: output += 'l'; break;
            case 13: output += 'm'; break;
            case 14: output += 'n'; break;
            case 15: output += 'o'; break;
            case 16: output += 'p'; break;
            case 17: output += 'q'; break;
            case 18: output += 'r'; break;
            case 19: output += 's'; break;
            case 20: output += 't'; break;
            case 21: output += 'u'; break;
            case 22: output += 'v'; break;
            case 23: output += 'w'; break;
            case 24: output += 'x'; break;
            case 25: output += 'y'; break;
            case 26: output += 'z'; break;
            }
        }
        return output;
    }
    
    public static String decrypt(String input)
    {
        String output = "";
        for (int i = 0; i<input.length(); i++)
        {
            int z = 0;
            switch (input.charAt(i)){
            case 'a': z = 1; break;
            case 'b': z = 2; break;
            case 'c': z = 3; break;
            case 'd': z = 4; break;
            case 'e': z = 5; break;
            case 'f': z = 6; break;
            case 'g': z = 7; break;
            case 'h': z = 8; break;
            case 'i': z = 9; break;
            case 'j': z = 10; break;
            case 'k': z = 11; break;
            case 'l': z = 12; break;
            case 'm': z = 13; break;
            case 'n': z = 14; break;
            case 'o': z = 15; break;
            case 'p': z = 16; break;
            case 'q': z = 17; break;
            case 'r': z = 18; break;
            case 's': z = 19; break;
            case 't': z = 20; break;
            case 'u': z = 21; break;
            case 'v': z = 22; break;
            case 'w': z = 23; break;
            case 'x': z = 24; break;
            case 'y': z = 25; break;
            case 'z': z = 26; break;
            }
            z -= 4;
            z=z%26;
            switch (z){
            case 1: output += 'a'; break;
            case 2: output += 'b'; break;
            case 3: output += 'c'; break;
            case 4: output += 'd'; break;
            case 5: output += 'e'; break;
            case 6: output += 'f'; break;
            case 7: output += 'g'; break;
            case 8: output += 'h'; break;
            case 9: output += 'i'; break;
            case 10: output += 'j'; break;
            case 11: output += 'k'; break;
            case 12: output += 'l'; break;
            case 13: output += 'm'; break;
            case 14: output += 'n'; break;
            case 15: output += 'o'; break;
            case 16: output += 'p'; break;
            case 17: output += 'q'; break;
            case 18: output += 'r'; break;
            case 19: output += 's'; break;
            case 20: output += 't'; break;
            case 21: output += 'u'; break;
            case 22: output += 'v'; break;
            case 23: output += 'w'; break;
            case 24: output += 'x'; break;
            case 25: output += 'y'; break;
            case 26: output += 'z'; break;
            }
        }
        return output;
    }
    
}
