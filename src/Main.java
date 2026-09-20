//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("____________");
        System.out.println("Задача 1:");
        int firstFriday = 5;
        for (int day = 1; day <= 31; day++) {
            if ((day - firstFriday) % 7 == 0 && day >= firstFriday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println("____________");
        System.out.println("Задача 2, цикл do-while:");
        int fullDistance = 42195;
        int distanceCovered = 0;
        System.out.println("Дистанция: " + fullDistance + " метров");

        do {
            int remainingDistance = fullDistance - distanceCovered;
            System.out.println("Держитесь! Осталось " + remainingDistance + " метров");
            distanceCovered += 500;
        }
        while (distanceCovered <= fullDistance);
        System.out.println("____________");
        System.out.println("Задача 2, цикл for:");
        System.out.println("Дистанция: " + fullDistance + " метров");
        for (int distanceCoveredFor = 0; distanceCoveredFor <= fullDistance; distanceCoveredFor += 500) {
            int remainingDistance = fullDistance - distanceCoveredFor;
            System.out.println("Держитесь! Осталось " + remainingDistance + " метров");
        }
        System.out.println("____________");
        System.out.println("Задача 3, цикл while + continue:");
        int budget = 900;
        int currentDay = 1;
        int dailyRate = 100;
        System.out.println("Бюджет: " + budget + "₽");
        System.out.println("Стоимость парковки: " + dailyRate + "₽/день (каждый 5‑й день — бесплатно)");
        while (budget >= 0) {
            currentDay++;
            if (currentDay % 5 == 0) {
                System.out.println("День " + currentDay + ": оплата не взимается (каждый 5‑й день — бесплатно)");
                continue;
            }
            if (budget < dailyRate) {
                break;
            }
            budget -= dailyRate;
            System.out.println("День " + (currentDay - 1) + ": списано " + dailyRate + "₽. Осталось: " + budget + "₽");
        }
        System.out.println("Итого: автомобиль можно оставить на " + (currentDay - 2) + " дней");
        System.out.println("____________");
        System.out.println("Задача 4:");
        int month = 0;
        double total = 0;
        while (true) {
            month++;
            total += 15000;
            if (month % 6 == 0) {
                total += total * 0.07;
            }
            System.out.printf("Месяц %d: %.2f ₽%n", month, total);
            if (total >= 12000000) {
                break;
            }
        }
        System.out.println("Цель достигнута за " + month + " месяцев.");
        System.out.println("____________");
        System.out.println("Задача 5:");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев " + overheats
                        + "! Зарядка приостановлена на 2 минуты. Текущий заряд: " + charge + "%");
                if (overheats > 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }
                minute++;
                continue;
            }
            charge += 2;
            System.out.println("Минута " + minute + ": заряд " + charge + "%");
        }
        System.out.println("Время зарядки составило " + minute + " минут.");
    }
}