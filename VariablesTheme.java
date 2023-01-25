public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1.Вывод значений переменных на консоль");
        byte ramSizeGb = 8;
        short hddCapacityGb = 256;
        int priceRub = 300000;
        long colorsNum = 1000000000;
        float cpuSpeedGz = 2.9f;
        double screenSizeIn = 13.3;
        char series = 'a';
        boolean reqSpecialConnection = false; 
        System.out.println("Ram size = " + ramSizeGb);
        System.out.println("Hard drive capacity = " + hddCapacityGb + " Gb");
        System.out.println("Price = " + priceRub + " rub");
        System.out.println("Colors number = " + colorsNum);
        System.out.println("Processor speed = " + cpuSpeedGz + " Gz");
        System.out.println("Screen size = " + screenSizeIn + " In");
        System.out.println("Series = " + series);
        System.out.println("Does the laptop require a special connection? = " 
            + reqSpecialConnection);

        System.out.println("\n2.Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int discountSum = (penPrice + bookPrice) * 11 / 100;
        int discountPrice = penPrice + bookPrice + discountSum;
        System.out.println("Сумма скидки = " + discountSum + " руб");
        System.out.println("Общая стоимость товаров со скидкой = " + discountPrice + " руб");

        System.out.println("\n3.Вывод слова JAVA");
        System.out.println("   J    a  v     v  a        ");
        System.out.println("   J   a a  v   v  a a     ");
        System.out.println("J  J  aaaaa  V V  aaaaa    ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = 9223372036854775807l;
        System.out.println("Первоначальное значение numByte = " + numByte);
        numByte++;
        System.out.println("Значение после инкремента numByte = " + numByte);
        numByte--;
        System.out.println("Значение после декремента numByte = " + numByte);
        System.out.println("Первоначальное значение numShort = " + numShort);
        numShort++;
        System.out.println("Значение после инкремента numShort = " + numShort);
        numShort--;
        System.out.println("Значение после декремента numShort = " + numShort);
        System.out.println("Первоначальное значение numInt = " + numInt);
        numInt++;
        System.out.println("Значение после инкремента numInt = " + numInt);
        numInt--;
        System.out.println("Значение после декремента numInt = " + numInt);
        System.out.println("Первоначальное значение numLong = " + numLong);
        numLong++;
        System.out.println("Значение после инкремента numLong = " + numLong);
        numLong--;
        System.out.println("Значение после декремента numLong = " + numLong);

        System.out.println("\n5.Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int temp = num1;
        System.out.println("с помощью третьей переменной");
        System.out.println("исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        num1 = num2;
        num2 = temp;
        System.out.println("новые значения переменных: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("с помощью арифметических операций");
        System.out.println("исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        temp = num1 - num2;
        num1 = num1 - temp;
        num2 = num2 + temp;
        System.out.println("новые значения переменных: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("с помощью побитовой операции");
        System.out.println("исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("новые значения переменных: num1 = " + num1 + ", num2 = "
         + num2);

        System.out.println("\n6.Вывод символов и их кодов");
        char hash = '#';
        char ampersand = '&';
        char atSign = '@';
        char circumflex = '^';
        char underscore = '_';
        System.out.println("код символа " + (int) hash + ", символ " + hash);
        System.out.println("код символа " + (int) ampersand + ", символ " + ampersand);
        System.out.println("код символа " + (int) atSign + ", символ " + atSign);
        System.out.println("код символа " + (int) circumflex + ", символ " + circumflex);
        System.out.println("код символа " + (int) underscore + ", символ " + underscore);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char openBracket = '(';
        char closeBracket = ')';
        System.out.println("    " + slash + backSlash + "    ");
        System.out.println("   " + slash + "  " + backSlash + "   ");
        System.out.println("  " + slash + underscore + openBracket + " " + closeBracket + backSlash + "  ");
        System.out.println(" " + slash + "      " + backSlash + " ");
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash
         + backSlash + underscore + underscore + backSlash);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int crsNum = 123;
        int hundred = crsNum / 100;
        int tens = crsNum / 10 % 10;
        int ones = crsNum % 10;
        System.out.println("Число N содержит:");
        System.out.println(hundred + " сотен");
        System.out.println(tens + " десятков");
        System.out.println(ones + " единиц");
        System.out.println("Сумма его цифр = " + (hundred + tens + ones));
        System.out.println("Произведение = " + (hundred * tens * ones));

        System.out.println("\n9.Вывод времени");
        int time = 86399;
        int hour = time / 3600;
        int min = time / 60 % 60;
        int sec = time % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}