package lession5.Activity53;

public class Dictionary {
    private Word[] words;

    public Dictionary(Word[] words) {
        this.words = words;
    }

    public Word[] getWords() {
        return words;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }

    // Đếm số lượng từ vựng Anh-Viet va Viet-Anh
    public CountWordTypeOfDic countWordTypeOfDic() {
        int numberOfAnhViet = 0;
        for (Word word:words) {
            if (word.getType().equals("1")) {
                numberOfAnhViet++;
            }
        }
        int numberOfVietAnh = words.length - numberOfAnhViet;
        CountWordTypeOfDic result = new
                CountWordTypeOfDic(numberOfAnhViet, numberOfVietAnh);
        return result;
    }

    // Search word by type
    public Word findWord(String typeInput, String keyInput) {
        //Word rs = words[0];
        Word rs = words[0];
        String mean = words[0].getName();
        for (Word word:words) {
            if((word.getType().equals(typeInput)) && (word.getKey().equals(keyInput))) {
                rs = word;
                //mean = word.getName();
            }
        }
        return rs;
    }
}
