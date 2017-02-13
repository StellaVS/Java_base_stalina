package dp.ort.ua.chapter9;

public class task_9_163 {
//	9.163. Даны три слова. Напечатать неповторяющиеся в них буквы.
	public static void main(String[] args) {
		String word_1 = "юповторяющиеся";
		String word_2 = "буквы";
		String word_3 = "напечататьь";
		char [] wordsToChar=(word_1.concat(word_2).concat(word_3)).toCharArray();
		for(int i=0;i<wordsToChar.length;++i){
			int counter=0;
			for(int j=0;j<wordsToChar.length;j++)
			{
				if (wordsToChar[i]==wordsToChar[j]){
					counter++;
				}
			}
			if (counter==1){
				System.out.print(wordsToChar[i]+", ");
			}
		}
	}

}
