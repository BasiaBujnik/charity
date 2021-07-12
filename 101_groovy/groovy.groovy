//zmienne s¹ dynamicznie typowane
def zmienna = 'like_groovy'
//metody mog¹ byæ wykonywane na ró¿ny sposób
println(zmienna)
println zmienna
//mo¿na pogramowac jak w JAVie ze statycznym typowaniem

String zmienna2 = 'like_java'
System.out.println(zmienna2)

// funkcje wygl¹daj¹ standardowo

def funkcja(def argument){
    println argument
}
funkcja("mocny argument")

//listy
def lista =[1,2,3,4]

//iterowanie po listach
//z closurami
lista.each {
    it -> println it
}
//dodanie elementu do listy

lista << 6
//starym sposobem
for(def l: lista){
    println l
}

//klasy
//obiekty beda mialy automatycznie utowrzone gettery i settery
class A{
    def a = 'a'
    def b = 'b'
    def print(){
        print a
        print b
        println ""
    }
    //konstruktor bezparametrowy nie zostanie wygnerowany jesli podamy wlasny
    A(a,b){
        this.a=a
        this.b=b
    }
}

//zamiast setterów i getterów mamy skrócon¹ skladnie
A obiekt = new A('a','b')
obiekt.print()
obiekt.a='aa'
obiekt.b='bb'
obiekt.print()

//G-stringi

def costam="cos tam"
println " wyswietl ${costam}" //G-string
println " wyswietl ${2+5}" //G-string
println ' wyswietl ${costam}' //String bez extrapolacji




