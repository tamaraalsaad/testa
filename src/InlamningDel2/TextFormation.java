package InlamningDel2;

public class TextFormation {
    private int lineCount;
    private int characterCount;
    private int wordCount;
    private String longestWord;
    private boolean stopReceived;
    private String STOP_WORD;


    public TextFormation() {
        lineCount = 0;
        characterCount = 0;
        wordCount = 0;
        longestWord = "";
        stopReceived = false;
        STOP_WORD = "stop";

    }

    public void processLine(String line) {
        if (line.equals(STOP_WORD)) {
            stopReceived = true;
            return;
        }
        lineCount++;
        characterCount += line.length();
        if (!line.trim().isEmpty()) {
            String[] words = line.trim().split("\\s+");
            wordCount += words.length;
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
    }
        public boolean shouldStop() {
            return stopReceived;
        }
    public int getLineCount() {
        return lineCount;
    }
    public int getCharacterCount() {
        return characterCount;
    }
    public int getWordCount() {
        return wordCount;
    }
    public String getLongestWord() {
        return longestWord;
    }
    }