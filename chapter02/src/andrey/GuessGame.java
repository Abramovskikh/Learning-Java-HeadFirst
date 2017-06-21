package andrey;

/*Класс для игры в угадывание числа.
*Nгровая механика и логика происходит в экземпляре
*данного класса. Необходимы три экземпляра класса
*Player - игрок.*/
class GuessGame {

	/*Три переменных экземпляра типа Player.*/
	Player p1;
	Player p2;
	Player p3;

	/*Метод старта игры.*/
	public void startGame() {

		/*Создание трех объектов типа Player*/
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		/*Локальные переменные для хранения вариантов
		ответа игроков.*/
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		/*Локальные переменные для определения
		правильности ответа игроков.*/
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		/*Генерация случайного числа для значения поиска игроков.*/
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Я загадываю число от 0 до 9...");

		while(true) {
			System.out.println("Число которое нужно угадать, - " + targetNumber);

			/*Сообщение объекту Player о генерации числа для
			варианта ответа. Число будет занисено в переменную
			экземпляра number объекта Player*/
			p1.guess();
			p2.guess();
			p3.guess();

			/*Получаем варианты ответов игроков, сгенерированные шагом раньше.*/
			guessp1 = p1.number;
			System.out.println("Первый игрок думает, что это число - " + guessp1);
			guessp2 = p2.number;
			System.out.println("Второй игрок думает, что это число - " + guessp2);
			guessp3 = p3.number;
			System.out.println("Третий игрок думает, что это число - " + guessp3);

			/*Проверка результата на совпадение.*/
			if(guessp1 == targetNumber) p1isRight = true;
			if(guessp2 == targetNumber) p2isRight = true;
			if(guessp3 == targetNumber) p3isRight = true;

			/*Главная проверка. Выявление победителя!*/
			if(p1isRight || p2isRight || p3isRight) {
				System.out.println("У нас есть победитель!");
				System.out.println("Первый игрок угадал? " + p1isRight);
				System.out.println("Второй игрок угадал? " + p2isRight);
				System.out.println("Третий игрок угадал? " + p3isRight);
				System.out.println("Конец игры.");
				break;	// Остановка цикла
			} else {
				System.out.println("Nгроки должны попробовать еще раз.");
			}

		} // while

	} // startGame

} // class