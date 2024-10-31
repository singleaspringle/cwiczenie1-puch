# Baza danych MS SQL Server w Azure #
## Krok 1 ##
Z wykorzystaniem darmowej subskrypcji Azure utworzyłem dostęp na koncie studenckim Microsoft w domenie pw.edu.pl.

## Krok 2 ##
Podczas tworzenia zasobu SQL Database, nadałem projektowi nazwę "Projekt_testowy", a bazie danych "Baza_testowa". Utworzyłem także nowy serwer "puch-test.database.windows.net" i przypisałem uprawnienia administratora do swojego konta.
![Serwer](./assets/img0.png)

Następujące konfiguracje zostały ustawione:
![Konfiguracja](./assets/img1.png)

Ustawienia dotyczące obliczeń i magazynu zostały pozostawione jako domyślne dla środowiska Development.

Pozostawiona została opcja lokalnie nadmiarowy magazyn kopii zapasowych.

## Krok 3 ##
Baza została wdrożona

## Krok 4 ##
Aby możliwy był dostęp do bazy danych, ustawienia sieciowe zostały skonfigurowane tak, aby wybrane adresy IP miały dostęp do zasobu.
![Siec](./assets/img2.png)

### Azure Data Studio ###
![ADS Connection](./assets/img3.png)
![ADS Result](./assets/img4.png)

### SSMS ###
![SSMS Connection](./assets/img5.png)
![SSMS Result](./assets/img6.png)

## Krok 5 ##
Używając framework'u Spring stworzyłem prostą aplikację do połączenia się z bazą danych.
![Spring initializr](./assets/img8.png)

Aplikacja przewiduje obsługę tabeli "student" z polami:
- id
- email
- first_name
- last_name

W konfiguracji aplikacji dodałem połączenie z bazą danych:
![Connect App](./assets/img10.png)

Po uruchomieniu kodu aplikacji, utworzona została tabela Student w bazie danych.


Dodałem dane do tabeli:
![Add row](./assets/img75.png)

Następnie przetestowałem dostęp do bazy danych przez aplikację:
![Endpoint](./assets/img9.png)

## Krok 6 ##
Utworzyłem maszynę wirtualną z obrazem systemu Windows Server 2022.
![VM](./assets/img11.png)



## Krok 7 ##
Utworzyłem nową tabelę w magazynie:
![Tabela](./assets/img12.png)

Za pomocą przeglądarki magazynu dodałem dane do tabeli:
![Dane](./assets/img13.png)

W aplikacji skonfigurowałem dostęp do magazynu Azure:
![Config](./assets/img14.png)

## Konfiguracja Firewall Azure SQL Database ##
![Zapora](./assets/img2.png)