//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] salary = {25, 50, 75, 100, 125};
        String name = "Руська";
        int random = (int) (Math.random() * salary.length);
        int pepe = salary[random];
        int max = 125;
        int min = 25;
        System.out.println("Сегодня учусь " + salary[random] + " минут!");

        if (salary[random] == max) {
            System.out.println("Поздравляю, это будет длинный урок!");
        } else if (salary[random] == min) {
            System.out.println("Маловато для урока, лентяй! Перезапусти ещё раз!");
        } else {
                System.out.println("Нормально, но лучше больше!");
            }
        }
    }