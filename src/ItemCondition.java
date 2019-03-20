public enum ItemCondition {
        NEW,
        USED,
        REFURBISHED
}

//Teoria:
//a) zyskujemy mozliwość, zmiany typu listy gdy będzie taka potrzeba
//b) Używać ArrayList gdy chce mieć szybki dostęp do elementów, LinkedList jeśli chce szybko usuwać/dodawać elemnty w środku listy
//c) Kiedy używac jakiej kilekcji:
//        List - gdyc chce mieć dostep do elemntów po indexie,
//        Map - mapa, gdy chce mieć dostęp do elemntów  po kluczu,
//        Set - gdy chce utworzyć kolekcję uniklanych elemntów,
//d) Interfejs Comparable implenetuje w klasie, w której go używamy:  implements Comparable<Czlowiek>
//używamy go:
//public int compareTo(Czlowiek o)
//        etoda compareTo zwraca liczbę całkowitą. Jeśli obiekt dla którego wywołujemy metodę ma wartość
//        mniejszą od tego podanego w parametrze zwracana jest wartość mniejsza od 0,
//        jeśli wyższą to większa od 0, natomiast jeśli są równe to zwracane jest 0.
//Intefesju Compre można użyć do prównywania obietków,
//
//e) Do stworzenia Comparatora najczęściej stosuje się klasy anonimowe
//        – czyli pozorne instancje interfejsu, które wykorzystywane będą tylko w tym miejscu w programie.
//        comparator ułatwia segregacje obiektów.
//d) metody z klasy Collections pozwalaja na posortowanie alementów z listy (sort) lub wybranie
//        najweiekszego z niej lementu (max)
//e) W przypadku metody equals()(przyjmijmy przykład dla zmiennej typu String) porównywana jest wartość (znak po znaku) zmiennej a i b. Niezależnie czy odwołują się one do tego samego miejsca w pamięci czy też nie
//        (oraz przy założeniu że ich wartość jest identyczna) wynik wywołania metody equals() będzie równy true.