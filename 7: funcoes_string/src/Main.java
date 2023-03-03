public class Main {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG   ";
        String s01 = original.toLowerCase(); // deixa tudo minúsculo
        String s02 = original.toUpperCase(); // deixa tudo maiúscula
        String s03 = original.trim(); // elimina os espaços nos cantos
        String s04 = original.substring(2); // gera uma nova string a partir do char indicado
        String s05 = original.substring(2, 9); // recorta do 2 ao 9
        String s06 = original.replace('a', 'x'); // substitui o 'a' por 'x'
        String s07 = original.replace("abc", "xy"); // substitui a substring

        int i = original.indexOf("bc"); // primeira ocorrência
        int j = original.lastIndexOf("bc"); // última ocorrência

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);

        System.out.printf("%n");

        String s = "potato apple lemon";
        String[] vect = s.split(" "); //vai dividir em substrings sempre que encontrar o espaço
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println("Word 1: " + word1);
        System.out.println("Word 2: " + word2);
        System.out.println("Word 3: " + word3);
    }
}
