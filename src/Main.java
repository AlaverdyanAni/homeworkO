public class Main {
    public static void main(String[] args) {
        Griffindor harryPoter=new Griffindor("Гарри Поттер",82,86,91,78,79);
        Griffindor germionGreinger=new Griffindor("Гермиона Грейнджер",81,88,76,79,92);
        Griffindor ronUizli=new Griffindor("Рон Уизли",77,85,86,90,68);

        Puffenduy zaxaryaSmidt=new Puffenduy("Захария Смит",68,75,85,78,90);
        Puffenduy sedrikDiggori=new Puffenduy("Седрик Диггори",72,69,81,66,59);
        Puffenduy jastinFinchFletchli=new Puffenduy("Джастин Финч-Флетчли",64,81,72,78,66);

        Kogtevran chjouChjang=new Kogtevran("Чжоу Чанг",59,81,74,68,55,90);
        Kogtevran padmaPatil=new Kogtevran("Падма Патил",62,75,49,62,58,70);
        Kogtevran marcusBebli=new Kogtevran("Маркус Белби",57,59,76,84,76,54);

        Slizerin drakoMalfoy=new Slizerin("Драко Малфой",52,67,48,84,60,58,70);
        Slizerin grexemMontegyu=new Slizerin("Грэхэм Монтегю",42,58,90,64,75,62,48);
        Slizerin gregoryGoyl=new Slizerin("Грегори Гойл",63,75,48,44,75,62,75);

        System.out.println(harryPoter);
        System.out.println(germionGreinger);
        System.out.println(ronUizli);
        System.out.println(zaxaryaSmidt);
        System.out.println(sedrikDiggori);
        System.out.println(jastinFinchFletchli);
        System.out.println(chjouChjang);
        System.out.println(padmaPatil);
        System.out.println(marcusBebli);
        System.out.println(drakoMalfoy);
        System.out.println(grexemMontegyu);
        System.out.println(gregoryGoyl);

        harryPoter.compareStudents(ronUizli);
        ronUizli.compareStudents(germionGreinger);
        germionGreinger.compareStudents(harryPoter);

        zaxaryaSmidt.compareStudents(sedrikDiggori);
        sedrikDiggori.compareStudents(jastinFinchFletchli);
        jastinFinchFletchli.compareStudents(zaxaryaSmidt);

        chjouChjang.compareStudents(padmaPatil);
        padmaPatil.compareStudents(marcusBebli);
        marcusBebli.compareStudents(chjouChjang);

        drakoMalfoy.compareStudents(grexemMontegyu);
        grexemMontegyu.compareStudents(gregoryGoyl);
        gregoryGoyl.compareStudents(drakoMalfoy);

        Hogwarts.compareStudents(chjouChjang,gregoryGoyl);
        Hogwarts.compareStudents(ronUizli,padmaPatil);
        Hogwarts.compareStudents(germionGreinger,drakoMalfoy);
        Hogwarts.compareStudents(grexemMontegyu,marcusBebli);
    }
}