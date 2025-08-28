package _02_BuilderConstructor;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new SubwayBuilder(15, "")
						.setBread("통밀")
						.setSize(15)
						.setCheese("모짜렐라")
						.build();
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder()
						.setBread("통밀")
						.setSize(15)
						.setCheese("모짜렐라")
						.setVegetable(true)
						.setSource("청양마요")
						.build();
		System.out.println(menu2);
		String exTopping = sc.nextLine();
		
		Subway menu3 = subwayBuilder
				.setExtraTopping(exTopping)
				.build();
		System.out.println();
	}

}