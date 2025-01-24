import java.util.Arrays;

class Analysis {
    public static int[] fMapping(String string){
        System.out.println("--DECREASING FREQUENCY DISTRIBUTION--");

        //FrequencyCalculator
        int[] fArray = new int[26];
        //AnalyzeFrequency
        for(char c: string.toCharArray()){
            if(Character.isLetter(c)){
                c = Character.toLowerCase(c);
                fArray[c -'a']++;
            }
        }

        char[] characters = new char[26];
        for(int i=0; i<26; i++){
            characters[i] = (char)(i + 'a');
        }

        //orderConversionViaBubbleSort
        for(int i=0; i<25; i++){
            for(int j= 0; j<25-i; j++){
                if(fArray[j] <fArray[j+1]){
                    int temp = fArray[j];
                    fArray[j] = fArray[j+1];
                    fArray[j+1] = temp;

                    char tempChar = characters[j];
                    characters[j] = characters[j+1];
                    characters[j+1] = tempChar;

                }
            }
        }

        //MappingOntoGlobalFrequencies AND printingOutput
        char[] GlobalFrequencies = "ETAOINSHRDLCUMWFGYPBVKJXQZ".toCharArray();
        for(int i =0; i<26; i++){
            if (fArray[i]>0){
                System.out.println(characters[i] + ": " + fArray[i] + ":  " + GlobalFrequencies[i]);
            }
        }

    return fArray;
    }
}



