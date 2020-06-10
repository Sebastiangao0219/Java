package chapter10;
/** 
 * 
 * @author Sebastian_Gao 
 * 作者 E-mail:sebastiangao0219@gmail.com
 * @date 创建时间：Jun 9, 2020 1:06:54 AM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class ObjectArrayDemo {
	public static void sort(Hero[] heroArray) {
		Hero tempHero = null;//用来交换的英雄 
		for (int i = 0; i < heroArray.length; i++) {//bubble sort
			for (int j = 0; j < heroArray.length - i - 1; j++) {
				if(heroArray[j].compareToByName(heroArray[j + 1]) < 0) {
					tempHero = heroArray[j];
					heroArray[j] = heroArray[j + 1];
					heroArray[j + 1] = tempHero;
				}
			}
		}
	}

	public static void main(String[] args) {
		Warrior soldier1 = new Warrior();
		Warrior soldier2 = new Warrior();
		Warrior soldier3 = new Warrior();
		Warrior soldier4 = new Warrior();
		Warrior soldier5 = new Warrior();
		Archmage arch1 = new Archmage();
		Archmage arch2 = new Archmage();
		Archmage arch3 = new Archmage();
		Archmage arch4 = new Archmage();
		Archmage arch5 = new Archmage();
		
		Hero[] heroArray = {
				soldier1, soldier2, soldier3, soldier4, soldier5,
				arch1, arch2, arch3, arch4, arch5
		};
		System.out.println("Before Sort: ");
		System.out.println("Level\tNickname\tmaxLife\tlife\tAttack");
		for(Hero hero : heroArray) {
			System.out.println(hero);
		}
		sort(heroArray);
		System.out.println("After Sort: ");
		System.out.println("Level\tNickname\tmaxLife\tlife\tAttack");
		for(Hero hero : heroArray) {
			System.out.println(hero);
		}
	}

}
