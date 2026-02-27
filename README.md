PLAN TRENINGOWY – APLIKACJA ANDROID

Autor:

* Adam Czajkowski
* Klasa: 4P
* Zawód: Technik Programista

1. Cel zadania

* Wykonanie aplikacji mobilnej na system Android w języku Java.
* Zastosowanie dwóch aktywności (Activity).
* Przekazywanie danych pomiędzy ekranami.
* Obsługa walidacji danych wprowadzanych przez użytkownika.

2. Opis działania aplikacji

Aplikacja umożliwia utworzenie prostego planu treningowego oraz jego potwierdzenie lub anulowanie.

Działanie programu przebiega w następujący sposób:

* Użytkownik wprowadza nazwę ćwiczenia.
* Użytkownik wpisuje liczbę powtórzeń.
* Użytkownik wybiera typ treningu z listy rozwijanej (Spinner).
* Po kliknięciu przycisku „Podsumowanie” następuje przejście do drugiego ekranu.
* Wyświetlane jest podsumowanie wprowadzonych danych.
* Użytkownik może potwierdzić lub anulować plan treningowy.
* Po powrocie do pierwszego ekranu wyświetlany jest odpowiedni komunikat (Toast).

3. Struktura aplikacji

MainActivity:

* Obsługa formularza.
* Pobieranie danych z pól EditText i Spinner.
* Walidacja danych wejściowych.
* Przekazywanie danych do SummaryActivity za pomocą Intent.
* Odbieranie wyniku z drugiej aktywności.

SummaryActivity:

* Odbieranie danych przekazanych przez Intent.
* Wyświetlenie podsumowania w TextView.
* Zwrócenie wyniku (RESULT_OK lub RESULT_CANCELED).

4. Zastosowane elementy programistyczne

* Język Java.
* Android Studio.
* Activity.
* Intent (przekazywanie danych).
* startActivityForResult.
* Spinner (lista rozwijana).
* EditText (wprowadzanie danych).
* TextView (wyświetlanie tekstu).
* Button (obsługa zdarzeń).
* Toast (komunikaty dla użytkownika).
* Obsługa wyjątków (NumberFormatException).

5. Walidacja danych

W aplikacji zaimplementowano:

* Sprawdzenie czy pole z nazwą ćwiczenia nie jest puste.
* Sprawdzenie czy pole z liczbą powtórzeń nie jest puste.
* Sprawdzenie czy liczba powtórzeń jest większa od 0.
* Obsługę błędu nieprawidłowego formatu liczby.

6. Możliwości rozbudowy aplikacji

Aplikację można w przyszłości rozbudować o:

* Zapisywanie planów treningowych do bazy danych.
* Dodanie historii treningów.
* Możliwość edycji planu.
* Dodanie wielu ćwiczeń w jednym treningu.
* Ulepszenie interfejsu graficznego (Material Design).

7. Struktura

plantreningowy/
└─ app/
   └─ src/
      └─ main/
         ├─ java/
         │  └─ com/
         │     └─ example/
         │        └─ plantreningowy/
         │           ├─ MainActivity.java
         │           └─ SummaryActivity.java
         ├─ res/
         │  ├─ layout/
         │  │  ├─ activity_main.xml
         │  │  └─ activity_summary.xml
         │  ├─ values/
         │  │  ├─ strings.xml
         │  │  ├─ colors.xml
         │  │  └─ themes.xml
         │  ├─ drawable/               (opcjonalne grafiki)
         │  └─ mipmap/                 (ikony aplikacji)
         └─ AndroidManifest.xml

Data wykonania: 2026
