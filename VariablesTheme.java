public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1.Вывод значений переменных на консоль");
        byte ramSizeGb = 8;
        short hardDriveCapacityGb = 256;
        int priceRub = 300000;
        long colorsNum = 1000000000;
        float processorSpeedGz = 2.9f;
        double screenSizeIn = 13.3;
        char series = 'a';
        boolean reqSpecialConnection = false; 
        System.out.println("Ram size = " + ramSizeGb);
        System.out.println("Hard drive capacity = " + hardDriveCapacityGb + " Gb");
        System.out.println("Price = " + priceRub + " rub");
        System.out.println("Colors number = " + colorsNum);
        System.out.println("Processor speed = " + processorSpeedGz + " Gz");
        System.out.println("Screen size = " + screenSizeIn + " In");
        System.out.println("Series = " + series);
        System.out.println("Does the laptop require a special connection? = " 
            + reqSpecialConnection);

        System.out.println("\n2.Расчет стоимости товара со скидкой");
        int pen = 100;
        int book = 200;
        int discount = 11;
        int discountSum = (pen + book) * 11 / 100;
        int purchaseSum = pen + book + discountSum;
        System.out.println("Сумма скидки = " + discountSum + " руб");
        System.out.println("Общая стоимость товаров со скидкой = " + purchaseSum + " руб");

        System.out.println("\n3.Вывод слова JAVA");
        System.out.println("   J    a  v     v  a        ");
        System.out.println("   J   a a  v   v  a a     ");
        System.out.println("J  J  aaaaa  V V  aaaaa    ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807l;
        int num1Incr = num1 + 1;
        int num1Decr = num1 - 1;
        int num2Incr = num2 + 1;
        int num2Decr = num2 - 1;
        int num3Incr = num3 + 1;
        int num3Decr = num3 - 1;
        long num4Incr = num4 + 1;
        long num4Decr = num4 - 1;
        System.out.println("Первоначальное значение num1 = " + num1);
        System.out.println("Значение после инкремента num1 = " + num1Incr);
        System.out.println("Значение после декремента num1 = " + num1Decr);
        System.out.println("Первоначальное значение num2 = " + num2);
        System.out.println("Значение после инкремента num2 = " + num2Incr);
        System.out.println("Значение после декремента num2 = " + num2Decr);
        System.out.println("Первоначальное значение num3 = " + num3);
        System.out.println("Значение после инкремента num3 = " + num3Incr);
        System.out.println("Значение после декремента num3 = " + num3Decr);
        System.out.println("Первоначальное значение num4 = " + num4);
        System.out.println("Значение после инкремента num4 = " + num4Incr);
        System.out.println("Значение после декремента num4 = " + num4Decr);

        System.out.println("\n5.Перестановка значений переменных");
        int numA = 2;
        int numB = 5;
        int numC;
        System.out.println("с помощью третьей переменной");
        System.out.println("исходные значения переменных: numA = " + numA + ", numB = " + numB);
        numC = numA;
        numA = numB;
        numB = numC;
        System.out.println("новые значения переменных: numA = " + numA + ", numB = " + numB);
        System.out.println("с помощью арифметических операций");
        System.out.println("исходные значения переменных: numA = " + numA + ", numB = " + numB);
        numC = numA - numB;
        numA = numA - numC;
        numB = numB + numC;
        System.out.println("новые значения переменных: numA = " + numA + ", numB = " + numB);
        System.out.println("с помощью побитовой операции");
        System.out.println("исходные значения переменных: numA = " + numA + ", numB = " + numB);
        System.out.println("новые значения переменных: numA = " + (byte) (numB &~numA) + ", numB = "
         + (byte) (numA &~numB));

        System.out.println("\n6.Вывод символов и их кодов");
        char char1 = '#';
        char char2 = '&';
        char char3 = '@';
        char char4 = '^';
        char char5 = '_';
        System.out.println("код символа " + (int)char1 + ", символ " + char1);
        System.out.println("код символа " + (int)char2 + ", символ " + char2);
        System.out.println("код символа " + (int)char3 + ", символ " + char3);
        System.out.println("код символа " + (int)char4 + ", символ " + char4);
        System.out.println("код символа " + (int)char5 + ", символ " + char5);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        char char6 = '/';
        char char7 = 92;
        char char8 = '(';
        char char9 = ')';
        System.out.println("    " + char6 + char7 + "    ");
        System.out.println("   " + char6 + "  " + char7 + "   ");
        System.out.println("  " + char6 + char5 + char8 + " " + char9 + char7 + "  ");
        System.out.println(" " + char6 + "      " + char7 + " ");
        System.out.println("" + char6 + char5 + char5 + char5 + char5 + char6 + char7 + char5 
            + char5 + char7);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int numN = 123;
        int numHund = numN / 100;
        int numTen = numN % 100 / 10;
        int numOne = numN % 100 % 10;
        System.out.println("Число N содержит:");
        System.out.println(numHund + " сотен");
        System.out.println(numTen + " десятков");
        System.out.println(numOne + " единиц");
        System.out.println("Сумма его цифр = " + (numHund + numTen + numOne));
        System.out.println("Произведение = " + (numHund * numTen * numOne));

        System.out.println("\n9.Вывод времени");
        int time = 86399;
        int hour = time / 60 / 60;
        int min = time / 60 % 60;
        int sec = time % 60 % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}