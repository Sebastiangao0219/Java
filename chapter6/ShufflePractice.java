/**
 * 
 */
package chapter6;

/**
 * Cards shuffling
 * @author Sebastian Gao
 *
 */
public class ShufflePractice {

	public static void main(String[] args) {
		final int N = 52;// 52 cards in total
		int[] cards = new int[52];//put the 52 cards in an array
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;
		}
		System.out.println("Before Shuffle");
		for (int i = 0; i < cards.length; i++) {
			System.out.print(cards[i]);
		
			if((i + 1) % 13 == 0) {
				System.out.println();
			}else {
				System.out.print(", ");
			}
		}
		for (int i = 0; i < cards.length; i++) {
			int newIndex = -1, temp = -1;
			newIndex = (int) (Math.random() * N);
			temp = cards[i];
			cards[i] = newIndex;
			newIndex = temp;
		}
		String[] cardColors = {"Spades","Diamons","Heart","Club"};
		String[] cardValues = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		System.out.println("After Shuffle");
		for (int i = 0; i < cards.length; i++) {
			System.out.printf("%s-%s",cardColors[cards[i] / 13],cardValues[cards[i] % 13]);
		
			if((i + 1) % 13 == 0) {
				System.out.println();
			}else {
				System.out.print("\t");
			}
		}
	}

}
