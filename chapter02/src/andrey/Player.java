package andrey;

/*Класс для создания экземпляров типа Player*/

class Player {

	/*Переменная экземпляра для хранения
	сгенерированного числа методом guess()*/
	int number;

	/*Метод для генерации числа (попытка отгадать число от 0 до 9)*/
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("Думаю, это число " + number);
	} // guess

} // class