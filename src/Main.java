import Charecters.*;
import EnumS.PartsOfTigerEn;
import EnumS.ThingsEn;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        KristopherRobin kr = new KristopherRobin("Кристофер Робин");
        Pyatochok pt = new Pyatochok("Пяточек");
        Kenga kg = new Kenga("Кенга");
        LittleRu lr = new LittleRu("Маленький Ру");
        Tigra tg = new Tigra("Тигра");
        tg.suvat(PartsOfTigerEn.ЛАПУ);
        tg.eat(tg.find());
        tg.suvat(PartsOfTigerEn.НОС);
        tg.eat(tg.find());
        tg.ask(kg);
        kg.stayAround(lr);
        pt.stayAround(lr);
        kr.stayAround(lr);
        lr.eat(ThingsEn.РЫБИЙ_ЖИР);
        kg.ugovarivat(lr);
        pt.ugovarivat(lr);
        kr.ugovarivat(lr);
        lr.talk();
        kg.talk();
        lr.eat(ThingsEn.РЫБИЙ_ЖИР);





    }
}