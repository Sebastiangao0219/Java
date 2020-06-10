/**
 * 
 */
package chapter6;

/**
 * simulate card shuffling 
 * @author Sebastian Gao
 * 
 */
public class ShuffleCardsDemo {

	public static void main(String[] args) {
		final int N = 52;
		//52 cards
		int[] cards = new int[N];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;//牌面与循环变量的值一致，0-51之间
		}
		System.out.println("洗牌前：");
		for (int i = 0; i < cards.length; i++) {
			System.out.print(cards[i]);
			if((i + 1) % 13 == 0) {
			System.out.println();
			}else {
				System.out.print(", ");
			}
		}
		/*洗牌：随机生成一个0-51之间的数字newIndex，cards[i]
		*和cards[newIndex]元素相交换
		*/
		for (int i = 0; i < cards.length; i++) {
			int newIndex = (int)(Math.random() * N);
			//0-51之间的随机数字
			int temp = cards[i];
			cards[i] = cards[newIndex];
			cards[newIndex] = temp;
		}
		//牌的花色数组
		String[] cardColors = {"黑桃", "红心", "方块", "梅花"};
		//牌面数组
		String[] cardValues = {
				"A","2","3","4","5","6","7","8","9","10","J","Q","K"
		};
		System.out.println("洗牌后：");
		for (int i = 0; i < cards.length; i++) {
			//System.out.print(cards[i]);
			System.out.printf("%s-%s", cardColors[cards[i] / 13], cardValues[cards[i] % 13]);
			if((i + 1) % 13 == 0) {
			System.out.println();
			}else {
				System.out.print("\t");
			}
		}
	}

}
