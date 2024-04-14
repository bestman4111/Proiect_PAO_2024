# Proiect PAO 2024
Proiectul meu presupune modelarea unor biblioteci cu sectiuni dedicate pentru carti, CD-uri sau reviste si a autorilor cartilor si cititorilor lor.

## Library
Clasa Library este, practic, o clasa de serviciu care primeste ca parametrii numele bibliotecii, strada, numarul si orasul in care se afla si numarul maxim de sectiuni pe care il poate avea biblioteca respectiva. Cele mai multe date membre au getter si setter. Clasa Library dispune de metoda addSection care primeste ca parametru o sectiune pe care o adauga intr-un array.

## Section
Clasa Section are un nume pentru a stii pentru ce e destinata sectiunea respectiva si un tip de sectiune, dintre carte, CD si revista.

## Article
Clasa Article nu se refera la articolele din reviste, ci la carti, CD-uri sau reviste. Numele a fost ales pentru ca denumirea de obiect nu mi se parea potrivita. Clasa Article are o singura data membra, anume numele articolului.

## Book
Clasa Book mosteneste clasa Article si se refera la cartile dintr-o sectiune. Pe langa nume, mostenit din clasa Article, clasa Book are ca date membre numarul de pagini, anul publicarii carti si editura. Clasa Book contine getter-ii si setter-ii de rigoare.

## CD
Clasa CD mosteneste clasa Article si se refera la CD-urile dintr-o sectiune. Aceasta are ca date membre numarul de piste de pe CD-ul respectiv, genul in care se incadreaza, care poate fi unul dintre Metal, Rock, Pop, Classical, Electronic, Jazz, Rap si Other, anul aparitiei si casa de discuri. Clasa CD contine si ea getter-i si setter-i.

## Magazine
Clasa Magazine mosteneste si ea clasa Article si are reprezinta revistele dintr-o sectiune. Aceasta are ca date membre numarul de pagini, numarul aparut, care este transmis sub forma unui String, si editura la care a aparut. Clasa Magazine are, la randul ei, getter-ii si setter-ii necesari.

## Person
Clasa Person este clasa o clasa generica pentru persoane. Mai tarziu, va fi mostenita de alte clase. Date membre sunt numele si anul nasterii persoanei.

## Author
Clasa Author este clasa dedicata autorilor de carti. Aceasta are ca date membre un cod asociat fiecarui autor de catre o entitate ce tine evidenta tuturor autorilor de carti din lume, cod diferit de indexul de persoana sau de autor, si numarul de carti scrise. 

## Reader
Clasa Reader este pentru cititori. Nu are date membre proprii, in afara de indexul de cititor. Are constructor si functia toString().

## ArticleService
Clasa ArticleService este o clasa de serviciu, folosita pentru a adauga mai multe articole intr-un array. Cand se declara un obiect nou de tip ArticleService, trebuie precizat numarul maxim de articole care pot fi adaugate in array-ul respectiv.

## PersonService
Clasa PersonService este clasa de serviciu responsabila cu adaugare mai multor persoane, fie autori, fie cititori intr-un array de marime maxima precizata declararea unui nou obiect de tip PersonService.

## Main
Clasa Main se ocupa cu apelurile functiilor de adaugat sectiuni, articole, respectiv persoane. Aici sunt declarate toate obiectele si, unde este cazul, este apelata functia toString() pe obiect. La finalul functiei main din clasa Main am apelat inca o data functia addPerson() din clasa PersonService pentru a afisa eroarea care se returneaza cand se incearca adaugarea mai multor persoane decat maximul declarat precedent.
