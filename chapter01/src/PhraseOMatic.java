class PhraseOMatic {
	public static void main(String[] args) {
		
		// Три набора слов
		String[] wordListOne = {"круглосуточный", "трех-звенный",
				"3000-футовый", "взаимный", "обоюдный выигрыш", "фронтэнд",
				"на основе вэб-технологий", "проникающий", "умный", "шесть",
				"метод критического пути", "динамичный"};

		String[] wordListTwo = {"уполномоченный", "трудный",
				"ориентированный", "центральный",
				"распределенный", "кластеризованный", "фирменный",
				"позиционированный", "сетевой",
				"сфокусированный", "использованный с выгодой", "выровненный",
				"нацеленный на", "общий", "совместный", "ускоренный"};

		String[] wordListThree = {"процесс", "пункт разгрузки",
				"выход из положения", "тип структуры", "талант", "подход",
				"уровень завоеванного внимания", "портал", "период времени",
				"обзор", "образец", "пункт следования"};

		// Количество слов в каждом наборе
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		// Три случайных числа (положение слова в наборе)
		int rand1 = (int)(Math.random() * oneLength);
		int rand2 = (int)(Math.random() * twoLength);
		int rand3 = (int)(Math.random() * threeLength);

		// Фраза
		String phrase = wordListOne[rand1] + " " +
			wordListTwo[rand2] + " " + wordListThree[rand3];

		// Вывод в консоль
		System.out.println("Все, что нам нужно это - " + phrase);

	} // main
} // class