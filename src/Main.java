public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();


    } public static void task1() {
        System.out.println("Задача 1");
         int age = 15;
         if (age >= 18) {
         System.out.println("Если возраст человека равен 18 лет, то он совершеннолетний ");
         }
         if (age < 18) {
             System.out.println("Ели человек не достиг совершеннолетия, нужно немного подождать");
         }
         int secondAge = 29;
         if (secondAge >= 18) {
         System.out.println("Если врзраст человека равен 18, то он совершеннолетний " );
         if (secondAge < 18 ) {
             System.out.println("Если человек не достиг совершенолетия, нужно немного подождать");

         }



        }

         } public static void task2() {
             System.out.println("Задача 2");
             int outdoorsDegrees = 3;
             if (outdoorsDegrees < 5) {
             System.out.println("На улице 3 градуса, нужно надеть шапку.");
             int outdoorsDegreesSecondOption = 6;
             if (outdoorsDegreesSecondOption > 5) {
             System.out.println("На улице 6 градусов, можно идти без шапки ");
             }
             }
             } public static void task3() {
                 System.out.println("Задача 3 ");
                 int speedOne = 100;
                 if (speedOne > 60) {
                 System.out.println("Если скорость 100 км/ч, то придется заплатить штраф ");
                 int speedSecond = 40;
                 if (speedSecond < 60) {
                 System.out.println("Если скорость 40 км/ч, то можно ездить спокойно");
                 }
                 }
                 } public static void task4() {
                   System.out.println("Задача 4 ");
                   int age = 4;
                   if (age >= 2 && age <= 6) {
                   System.out.println("Если возраст человека равен "+ age + " то ему нужно ходить в детский сад");
                   } else if (age== 7 && age < 18) {
                       System.out.println("Если возраст человека равен "+ age + " то ему нужно ходить в школу");
                   } else if (age> 18 && age <= 24) {
                       System.out.println("Если возраст человека равен "+ age + " то ему нужно ходить в университет");
                   }  else if (age >= 24) {
                      System.out.println("Если возраст человека равен "+ age + " то ему нужно ходить на работу");

                   }
                   } public static void task5() {
                     System.out.println("Задача 5");
                     int age = 12;
                     if (age < 5){
                     System.out.println("Если возраст ребенка " + age + " то он не может кататься на аттракционе");
                     } else if (age > 5 && age < 14){
                         System.out.println("Если возраст ребенка " + age + " то он может кататься на аттракционе только в сопровождении взрослого");
                     } else if (age > 14) {
                       System.out.println("Если возраст ребенка " + age + " то он может кататься без сопровождения взрослого");

                     }
                     } public static void task6(){
                       System.out.println("Задача 6");
                       int totalSeat = 102;
                       int seatCount = 60;
                       int standingSeat = 42;
                       int seatCountOptionTwo = 64;
                       int standingSeatOptionTwo = 33;
                       int totalSeatOptionTwo = 99;
                       if (seatCountOptionTwo <= 60){
                       System.out.println("В вагоне есть " + (seatCount -seatCountOptionTwo) + " сидячих мест");
                       } else {
                        System.out.println("Сидячих мест нет");
                            if (standingSeatOptionTwo <= 42) {
                                System.out.println("В вагоне есть  " + (standingSeat - standingSeatOptionTwo)  + " стоячих мест");
                            }

                            }
                             } public static void task7() {
                              System.out.println(" Задача 7 ");
                              int one = 6;
                              int two = 3;
                              int three =8;
                              if (one> two){
                              if (one>three){
                               System.out.println("Максимальное число " + one);
                              } else if (three>one){
                                  System.out.println("Максимальное число " + three);
                              } else{
                                System.out.println("Числа " + one + " и " + three+ " равны");
                              }
                               } else if (two>one){
                                  if (two>three){
                                  System.out.println("Максимальное число " + two);
                                  } else if (three>two){
                                      System.out.println("Максимальное число " + three);
                                  } else{
                                      System.out.println("Числа " + two + " и " + three+ " равны");
                                  }
                              }


    }
}