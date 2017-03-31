package sympozjummorskie.sympozjummorskie;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by michael on 14.04.15.
 */
public class AbstractAdapter extends RecyclerView.Adapter<AbstractAdapter.CommentViewHolder> {

    private Abstract.List abstractList;

    public AbstractAdapter() {
        abstractList = new Abstract.List();


        //  public Abstract(int id, String author, String info, String tytul, String streszczenie) {



        abstractList.add(new Abstract(1,"mgr inż. Adam Kaizer","Katedra Transportu i Logistyki Wydział Nawigacyjny","Innowacyjne rozwiązania w konteneryzacji", "Transport ładunków skonteneryzowanych, pomimo że jest najmłodszą formą przewozową, obecnie wyznacza najnowsze trendy w globalnej logistyce morskiej. Prosta i zarazem szybka technologia transportu, jaką stanowi konteneryzacja jest współcześnie obszarem wielu badań naukowych i licznych rozwiązań innowacyjnych.\n" +
                "Prezentacja przybliża wybrane, najnowsze wdrożenia stosowane w konteneryzacji."));


        abstractList.add(new Abstract(2,"dr Krzysztof Sarnowski","Katedra Ekonomii i Zarządzania\n" +
                "Wydział Przedsiębiorczości i Towaroznawstwa","Inwestowanie drogą do niezależności finansowej", "Celem prezentacji jest uświadomienie słuchaczom konieczności oszczędzania i pomnażania oszczędności poprzez inwestowanie, w sposób uwzględniający indywidualne preferencje. Reforma systemu emerytalnego spowodowała, że osoby wchodzące na rynek pracy nie powinny oczekiwać po przejściu na emeryturę świadczeń wypłacanych przez państwo, pozwalających na godziwe życie. Konieczne jest systematyczne, dobrowolne oszczędzanie, a następnie inwestowanie odłożonych kwot. Proste i bezpieczne instrumenty finansowe dają niewielkie stopy zwrotu. Warto więc poznać i nauczyć się wykorzystywać bardziej złożone formy inwestowania, które zapewniają wyższe zyski."));


        abstractList.add(new Abstract(3,"dr Sławomir Skiba","Katedra Logistyki i Systemów Transportowych Wydział Przedsiębiorczości i Towaroznawstwa","Innowacyjne przedsiębiorstwo. Konieczność? ", "Prowadzenie działalności gospodarczej, a w szczególności podjęcie decyzji o jej rozpoczęciu stanowi wyzwanie dla każdego. Tego typu rozterki stanowią szczególne wyzwanie dla osób, które rozpoczynają swoją karierę zawodową, czyli absolwentów wyższych uczelni. Spowodowane jest to przede wszystkim obawami przed podjęciem ryzyka, jakie niesie za sobą prowadzenie działalności gospodarczej na własny rachunek.\n" +
                "Celem prezentacji jest przedstawienie praktycznych kwestii związanych z prowadzeniem działalności gospodarczej."));


        abstractList.add(new Abstract(4,"Piotr Adamowicz, Alicja Wasilewska","Koło Naukowe Transportu i Logistyki TRANSLOG","Żegluga śródlądowa — stan obecny i szanse na rozwój w polsce ", "Żegluga śródlądowa to najbardziej energooszczędny i przyjazny dla środowiska środek transportu z obecnie dostępnych. W porównaniu do transportu drogowego, transport wodny emituje 5 razy mnie CO2 na tonę przewożonego towaru i 1,5 razy mniej niż kolej. Pomimo tych dużych zalet, za jego pomocą jest transportowanych zaledwie 6% ładunków w Europie.\n" +
                "3655 km — tyle wyniosła łączna długość śródlądowych dróg wodnych w Polsce w 2013 roku. Dostosowanie wymiarów statków i dróg to główne czynniki decydujące o efektywności transportu śródlądowego. W Polsce tylko 5,9% (214 km) z dostępnych szlaków spełniało wymogi dla dróg śródlądowych o znaczeniu międzynarodowym (klasa IV i V). Pozostała sieć to klasy niższe o znaczeniu regionalnym. Zaniedbania spowodowały zmniejszenie, i tak niewielkiego, udziału transportu rzecznego w naszym kraju z 0,8% do 0,3% w przewozach ładunków ogółem w latach 2000- 2013.\n" +
                "W bieżącym roku (2016) Polska ma przystąpić do porozumienia AGN (Europejskiego Porozumienia w Sprawie Głównych Śródlądowych Dróg Wodnych o Międzynarodowym Znaczeniu). Akcesja oznacza, że zaczniemy rozwijać transport towarów drogami śródlądowymi, a także turystykę na rzekach, kanałach i jeziorach. Wymagania zawarte w Konwencji AGN dla dróg wodnych o międzynarodowym znaczeniu to minimum IV klasa żeglugowości, a więc możliwość poruszania się jednostek o nośności do 1200 ton. Dodatkowym czynnikiem zachęcającym do rozwoju transportu rzecznego jest Biała Księga UE 2011, wyznaczająca kierunki rozwoju transportu. W dokumencie tym znajduje się postulat, by transport na odległość większą niż 300 kilometrów został przeniesiony na inne niż drogowe środki transportu. W 30% do 2030 roku, a do 2050 w 50%."));
        abstractList.add(new Abstract(5,"Karolina Brandt, Oskar Klein","Koło Naukowe Transportu i Logistyki TRANSLOG","Zastosowania nowych technologii w żegludze morskiej na rzecz ochrony środowiska", "Obecnie transport morski jest najpopularniejszym środkiem transportu towarów. Jest to środek tani i efektywny, stanowi aż 95% wszystkich międzynarodowych przepływów towarowych. Wartość ta ciągle wzrasta. W prezentacji przedstawiamy zagrożenia dla środowiska, wynikające z transportu morskiego oraz metody ich minimalizacji."));
        abstractList.add(new Abstract(6,"Mateusz Truszczyński","Koło Naukowe Innowacyjnych Systemów Transportowo-Logistycznych","Innowacyjne rozwiązania chroniące środowisko morskie", "Morza i oceany, stanowiąc ponad 70% powierzchni Ziemi, są niezwykle narażone na szkodliwą działalność człowieka. Zmiany zachodzące we wszechoceanie są sprzężone ze zjawiskami i procesami zachodzącymi na lądach. Do szkodliwych zjawisk dla wód należą zmiany fizyczne i chemiczne, nadmierna eksploatacja ich zasobów oraz zanieczyszczenia generowane z lądów i statków oraz przez testy nuklearne.\n" +
                "W prezentacji poruszone zostały przede wszystkim sposoby rozwiązania problemu zanieczyszczeń środowiska przez jednostki pływające."));
        abstractList.add(new Abstract(7,"Marianna Maruszczak, Natalia Wójcik","Koło Naukowe Transportu i Logistyki TRANSLOG","Rynek statków nowobudowanych ", "Rynek statków nowobudowanych najbardziej odróżnia od pozostałych to, że statki, które są tutaj sprzedawane jeszcze nie istnieją. W pracy zaprezentowano informacje charakteryzujące ten rynek. Przedstawiono również tendencje, co do rodzaju zamawianych statków oraz stocznie najczęściej wybierane do ich budowy."));
        abstractList.add(new Abstract(8,"Jakub Macholla, Roksana Wilgocka","Koło Naukowe Transportu i Logistyki TRANSLOG","Piractwo morskie dawniej i dziś ", "W dzisiejszych czasach transport towarów drogą morską jest jednym z najpopularniejszych sposobów na tani przewóz towarów. Duża liczba przewożonych ładunków jest powodem powstania wielu pokus, a także przyczynia się do piractwa.\n" +
                "W prezentacji przedstawiono historię piractwa od ich początków, aż do czasów współczesnych oraz sposoby walki z nieproszonymi gośćmi."));
        abstractList.add(new Abstract(9,"Jakub Adamus, Daniel Chrapkowski","Koło Naukowe Watchers","Większa wydajność statków dzięki zastosowaniu technologii whale tail ", "Transport morski od zawsze stanowił ważną gałąź światowej gospodarki. Stosunkowo niskie koszty transportu towarów o dużej objętości oraz bezpieczeństwo przewożonych surowców sprawiły, że gospodarka morska przez ostatnie lata prężnie się rozwijała. Ogromna ilość innowacyjnych technologii, które pojawiły się na światowym rynku w ostatnim czasie sprawiła, że nawigacja stała się jeszcze bezpieczniejsza, a koszty transportu zaczęły maleć.\n" +
                "W niniejszej prezentacji przedstawiono innowacyjny system „Whale Tail”. Technologia ta pozwali na wydajniejszą żeglugę, a to z kolei znacząco wpłynie na redukcję kosztów związanych ze zużyciem paliwa przez jednostkę."));
        abstractList.add(new Abstract(10,"Patryk Spigarski, Dawid Surowiecki","Grupa Młodych Menedżerów","Innowacyjne zastosowania bezzałogowych statków powietrznych ", "Drony — dla jednych zabawki, dla innych narzędzie pracy. Urządzenia te w ostatnich latach opanowują przestrzeń powietrzną. Ich zastosowanie jest nieograniczone. Od dłuższego czasu nie są używane tylko i wyłącznie przez wojsko. Drony to ciekawy przykład na to, jak technologia militarna przenika do zastosowań cywilnych.\n" +
                "W prezentacji została przedstawiona specyfikacja i budowa dronów oraz najciekawsze zastosowania tych właśnie urządzeń w Polsce i na świecie."));
        abstractList.add(new Abstract(11,"Anna Pezała, Adriana Wasilewska","Koło Naukowe Innowacyjnych Systemów Transportowo-Logistycznych","Technologia RFID jako innowacyjne rozwiązanie logistyczne na rynku FMCG", "Współcześnie w branży FMCG (ang.: Fast Moving Consumer Goods), gdzie kładzie się nacisk na czas oraz jakość wykonania usługi wraz ze wzrostem ilości produktów i ładunków przechodzących przez różne gałęzie transportu, magazynowania, logistyki i dystrybucji, konieczne jest wprowadzenie nowych, efektywnych technologii, pozwalających na sprawniejsze zarządzanie. W odpowiedzi na powstające problemy przychodzi technologia radiowej identyfikacji RFID (ang.: Frequency Identyfication), która za pomocą fal radiowych i indukcji umożliwia szybkie oraz łatwe przekazywanie danych zapisanych na nośnikach zwanych tagami. Obecnie jest to rozwiązanie znane, jednak dopiero stopniowo rozpowszechniane. Koszt wdrożenia takiego systemu może być relatywnie wysoki, jednak oferuje on szereg korzyści, które mogą niewątpliwie pozytywnie wpłynąć na przedsiębiorstwa z branży FMCG. Na co dzień z wykorzystywaniem systemu RFID możemy spotkać się na sklepowych półkach, gdzie służy on do zabezpieczania produktów przed kradzieżą. Ma on jednak dużo szersze zastosowanie, które przedstawienie jest celem pracy."));
        abstractList.add(new Abstract(12,"Krystian Adamus, Mateusz Bednarek","Koło Naukowe Watchers","Internet of things ", "Internet of Things umożliwia stworzenie tego, co w latach 70. XX wieku opisywali w swoich książkach autorzy powieści science-fiction. Autonomiczne sieci urządzeń, które pozwalałyby na inteligentne, w pełni zautomatyzowane działanie wszelkiej maści placówek czy statków.\n" +
                "W dzisiejszych czasach do Internetu podłączone są miliardy urządzeń — jest ich około czterokrotnie więcej niż ludzi na Ziemi. Zastosowanie tego typu rozwiązań pozwoliłoby między innymi na monitorowanie wilgotności gleby oraz stopnia jej zmineralizowania, a co za tym idzie — stopnia słodkości winogron i w rezultacie jakości wina. Zastosowań tych jest zdecydowanie więcej, część postaramy się przybliżyć podczas prezentacji.\n" +
                "Najciekawszym oraz najbliższym nam jest zastosowanie Internet of Things na statkach handlowych, które na autonomiczną żeglugę kontrolowaną z centrum zarządzania przez pojedyncze osoby. Jak będzie to wyglądać? Zapraszamy na prezentację!"));
        abstractList.add(new Abstract(13,"Karolina Janik","Naukowe Koło Finansów HOSSA","Beacony — czy podbiją świat technologii? ", "Coraz częściej w kręgach biznesowych, a szczególnie w środowisku IT usłyszeć można o beaconach, czyli małych urządzeniach, które pomimo niewielkich kształtów mogą zawierać w sobie bardzo duże pokłady danych. Sekret tych wyjątkowych urządzeń tkwi w ich prostocie. Beacony działają poprzez zainstalowany w nich chip energooszczędnej technologii Bluetooth, która sprawia, że urządzenie może wytrzymać na niewielkiej baterii nawet rok. Ich głównym zadaniem jest rozsyłanie zaprogramowanych wcześniej danych.\n" +
                "Celem prezentacji jest przedstawienie potencjału oraz technologii działania powyższych urządzeń, a także omówienie coraz szerszych obszarów ich zastosowania i spojrzenie w przyszłość beaconów — czy okażą się one konkurencyjnym rozwiązaniem?"));
        abstractList.add(new Abstract(14,"Jacek Rostankowski, Mariusz Schmidt, Adam Smulnik\n","","Historia nintendo,\u2028czyli innowacyjne podejście do technologii ", "Nasza prezentacja ma na celu przedstawienie historii firmy Nintendo oraz stworzonych przez nią innowacyjnych technologii. Przedstawimy innowacyjne produkty firmy, które odniosły komercjalny sukces na rynku oraz takie, które okazały się porażką. Jest to celowy zamiar, mający pokazać, iż nie każdy trend czy innowacyjna technologia przekuta w produkt musi okazać się sukcesem."));
        abstractList.add(new Abstract(15, "Izabela Wróblewska, Ewelina Ziajka","Koło Naukowe Innowacyjnych Systemów Transportowo-Logistycznych","Nowoczesne magazynowanie — przełom na rynku usług logistycznych ", "Prezentacja stanowi przegląd nowoczesnych rozwiązań wykorzystywanych w magazynach — od momentu wpłynięcia towaru, poprzez jego przepływ i identyfikację, aż po ekspedycję. Wszystkie przedstawione rozwiązania przyczyniają się do optymalizowania procesów magazynowych. W pracy przedstawiona została również polemika dotycząca wizji magazynu w przyszłości.\n" +
                "Plan pracy obejmuje: przedstawienie popytu na usługi magazynowe, nowoczesne metody usprawniające proces magazynowania oraz bezpieczeństwo i systemy wpływające na jego poprawę, a także podsumowanie, nowoczesne magazyny — ewolucja czy rewolucja na rynku usług logistycznych?"));
        abstractList.add(new Abstract(16,"Nikol Labuda, Marianna Maruszczak","Koło Naukowe Transportu i Logistyki TRANSLOG","Proekologiczne rozwiązania\u2028w nowoczesnych powierzchniach magazynowych ", "Obecnym trendem w budownictwie jest promowanie zrównoważonego rozwoju oraz posiadanie certyfikatów, które świadczą o prestiżu danego obiektu. Certyfikaty LEED oraz BREEAM to narzędzia służące do oceny nowoczesnych budynków, w tym również powierzchni magazynowych. Certyfikaty te przyznawane są obiektom, które wyróżnia jakość, a także nowoczesność zastosowanych materiałów.\n" +
                "W naszej prezentacji przedstawiamy koncepcję nowoczesnych powierzchni magazynowych oraz wybrane metody ich certyfikacji."));
        abstractList.add(new Abstract(17,"Klaudia Józefowska","Koło Naukowe e-Biznesu","Farmy wiatrowe — odnawialne źródło energii ", "W dzisiejszych czasach prąd jest wszędzie. Człowiek nauczył się odbierać energię elektrodą i przekazywać ją dalej, za pomocą przewodników. Prąd jest wszechobecny — towarzyszy nam w domu, w pracy czy podczas zabawy. Badania wykazują, iż zapotrzebowanie na prąd ciągle rośnie i w przeciągu 100 lat może powiększyć się nawet o 40%. Najbardziej znanymi źródłami pozyskiwania prądu są elektrownie węglowe, wodne i wiatrowe.\n" +
                "Elektrownie węglowe oddziaływają w sposób negatywny na nasze środowisko. Do atmosfery dostają się przeróżne zanieczyszczenia, które mogą powodować kwaśne deszcze i globalne ocieplenie. Dodatkowo, jest to źródło czerpania energii, które powstawało przez wiele milionów lat, jednak jest zasoby są wyczerpalne i kiedyś się skończą.\n" +
                "Kolejnym źródłem czerpania energii jest woda. Elektrownie wodne wykorzystują energię grawitacji — woda znajdująca się w zbiorniku przepływa kanałem do turbiny, która z generatorem wprowadza energię stworzoną przez wodę do transformatora, który następnie przekazuje ją dalej za pomocą linii przesyłowych.\n" +
                "Stale rosnące zapotrzebowanie na energię elektryczną, stymulująco wpływa na rozwój systemów elektroenergetycznych, zasilanych ze źródeł odnawialnych. W ostatnich latach, szczególnie dynamiczny rozwój obserwuje się w zakresie technologii wiatrowej, wykorzystywanej przy budowie elektrowni wiatrowych na obszarach lądowych i morskich. Morskie farmy wiatrowe posiadają szereg zalet ale także sporo wad. Mimo utrudnień związanych z wykorzystaniem morskich turbin wiatrowych, to właśnie w nich upatruje się przyszłość energetyki wiatrowej.\n" +
                "Rozwój morskich elektrowni wiatrowych w krajach Unii Europejskiej uzależniony jest przede wszystkim od dostępu do obszarów morskich oraz regulacji prawnych, wspierających potencjalnych inwestorów."));
        abstractList.add(new Abstract(18,"Michał Ostrowski\n","Koło Naukowe Towaroznawstwa CARGO","Akwakultura jako alternatywa rybołówstwa ", "Rosnąca populacja ludzi stawia wyzwanie branży spożywczej. Rynek stara się wyprodukować jak najwięcej żywności spełniającej coraz bardziej wygórowane wymagania współczesnego konsumenta. Problem ten dotyczy także branży rybnej. Coraz wyższe spożycie ryb na świecie oraz coraz bardziej ograniczone zasoby naturalne tego surowca zmusiły przedsiębiorców do znalezienia alternatywy dla rybołówstwa. Alternatywą tą jest akwakultura.\n" +
                "W prezentacji pragnę przybliżyć problem niedoboru ryb, podział akwakultury oraz jej obecny i przewidywany wpływ na branżę spożywczą na świecie."));
        abstractList.add(new Abstract(19,"Anna Flis, Paulina Karczmarczyk","Koło Naukowe Towaroznawstwa CARGO","Proces starzenia się wina na przykładzie wina gronowego messapo primitivo di manduria ", "Wino jest produktem rolnym, który charakteryzuje się docenianymi na całym świecie walorami smakowymi. Jest doskonałym przykładem produktu, w którym przy ocenie jakości decyduje przede wszystkim subiektywna ocena konsumentów, a mniej obiektywne wartości użytkowe.\n" +
                "Celem badania było zweryfikowanie wpływu warunków przechowywania na wybrane wyróżniki jakościowe czerwonego, wytrawnego wina gronowego. Badanie przeprowadzono dwuetapowo.\n" +
                "W pierwszej części badań wino poddano ocenie jakościowej, poprzez sprawdzenie jego wyróżników fizyko-chemicznych, takich jak: zawartość ekstraktu ogólnego, kwasowości oraz barwy L*a*b* w systemie CIE za pomocą kolorymetru.\n" +
                "Drugi etap badań obejmował ocenę organoleptyczną omawianego wina w dwóch powtórzeniach. W pierwszym oraz ostatnim dniu oznaczeń. Oceny organoleptycznej dokonał 15-osobowy zespół, oceniający z określoną wrażliwością sensoryczną, metodą profilowania-skalowania. Analizując uzyskane wyniki parametrów fizyko-chemicznych oraz ocenę organoleptyczną domniema się, iż przechowywane wino uległo zepsuciu o podłożu mikrobiologicznym. Zgodnie z literaturą, opisane zmiany odpowiadają chorobie, jaką jest gorzknienie wina, co ściśle łączy się z procesem starzenia się wyrobów gronowych."));




    }

    @Override
    public CommentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.comment_row, viewGroup, false);

        return new CommentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CommentViewHolder commentViewHolder, int i) {
        Abstract abstract2 = abstractList.get(i);



        commentViewHolder.nameTextView.setText(abstract2.author);
        commentViewHolder.commentTextView.setText(abstract2.tytul);


        commentViewHolder.strszczenie = abstract2.streszczenie;
        commentViewHolder.autor = abstract2.author;
        commentViewHolder.info = abstract2.info;
        commentViewHolder.tytul = abstract2.tytul;

    }

    @Override
    public int getItemCount() {
        return abstractList.size();
    }

    public class CommentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView nameTextView;
        public TextView commentTextView;

        public String strszczenie;
        public String tytul;
        public String info;
        public String autor;





        public static final String KEY_STESZCZENIE = "1";
        public static final String KEY_TYTUL = "3";
        public static final String KEY_INFO = "2";
        public static final String KEY_AUTOR= "4";




        public CommentViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
            commentTextView = (TextView) itemView.findViewById(R.id.commentTextView);

        }

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(v.getContext(), MoreActivity.class);
            intent.putExtra(KEY_AUTOR,autor);
            intent.putExtra(KEY_STESZCZENIE,strszczenie);
            intent.putExtra(KEY_TYTUL,tytul);
            intent.putExtra(KEY_INFO,info);

            v.getContext().startActivity(intent);
        }
    }
}
