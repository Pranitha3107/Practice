package Literals;
public class char_literal {
    public static void main(String[] args) {
        char a='A';
        char b='b';
        char c='@';
        char d='1';
        char e='_';
        char f='(';
        char g='}';

        //Escape char
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';

        System.out.println("PranithaAnumula");
        System.out.println("Pranitha"+c+"Anumula");
        System.out.println("Pranitha"+tab_line+"Anumula");
        System.out.println("Pranitha"+"AB"+new_line+"Anumula");
        System.out.println("Pranitha\bAnumula");
        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char c11  = '\u1F60';
        char smily = '\u1f60'; // :)
        System.out.println("Emoji:"+smily);
        int codePoint = 0x1F600; // 😀 emoji
        System.out.println("Emoji: " + new String(Character.toChars(codePoint)));


    }
}
