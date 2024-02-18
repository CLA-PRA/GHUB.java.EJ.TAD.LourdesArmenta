package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;

class AppTest {
    
    static Rational r;
    static Rational a;
    static Rational b;

    static Numerote n1;
    static Numerote n2;
    static Numerote n3;

    static Fecha f1;
    static Fecha f2;
    static Fecha f3;

    static Persona p1;


    @BeforeAll public static void setUp() {
        r = new Rational();

        n3 = new Numerote();

        f3 = new Fecha();
        
    }
    
    @Test public void testRationalAdd() throws Exception {
        a = new Rational(7,5);
        b = new Rational(2,3);
        r=r.add(a,b);

        assertTrue(r.getNumerador()==31);
        assertTrue(r.getDenominador()==15);    
       
    }
    
    @Test public void testRationalMult() throws Exception  {
        a = new Rational(7,5);
        b = new Rational(2,3);
        r=r.mult(a,b);

        assertTrue(r.getNumerador()==14);
        assertTrue(r.getDenominador()==15);   
    }

    @Test public void testRationalEqual() throws Exception {
        a = new Rational(2,5);
        b = new Rational(4,10);

        assertTrue(r.equal(a,b));
    }

    @Test public void testNumeroteSuma() {
        n1 = new Numerote("987654321543216789123");
        n2 = new Numerote("123456789123456789123");
       
        n3=n1.suma(n2);
        
       
        assertTrue(n3.toString().equals("1111111110666673578246"));
      
    }
    @Test public void testNumeroteResta() {
        n1 = new Numerote("987654321543216789123");
        n2 = new Numerote("123456789123456789123");
        
        n3=n1.resta(n2);
       
        assertTrue(n3.toString().equals("864197532419760000000"));
  
    }
    @Test public void testFechaEquals(){
        f2 = new Fecha(2,11,1970);
        f1 = new Fecha("2/11/1970");

        assertTrue(f1.equals(f2));
    }
    @Test public void testFechaAddDias(){
        f1 = new Fecha(2,11,1970);
        
        f2 = f1.addDias(360+30+1);

        f3=new Fecha("3/12/1971");

        assertTrue(f1.equals(f3));
      
    }
    @Test public void TestFechafechaToDias(){
        
        f1 = new Fecha("2/11/1970");
        
        assertTrue(f1.fechaToDias()==709532);   

    }
    @Test public void TestFechaDiasToFecha(){
        f1 = new Fecha("2/11/1970"); 
        int dias = f1.fechaToDias();
        f1.diasToFecha(dias+360);
        
        f3 = new Fecha("2/11/1971");
        assertTrue(f1.equals(f3));

    }
    @Test public void TestPoligonoCalcularPerimetro(){
        
        
        Punto v1 = new Punto(1,1);
        Punto v2 = new Punto(1,4);
        Punto v3 = new Punto(3,4);
        Punto v4 = new Punto(4,3);
        Punto v5 = new Punto(3,1);
        Punto arreglo[] = new Punto[6];
        arreglo[0]=v1;
        arreglo[1]=v2;
        arreglo[2]=v3;
        arreglo[3]=v4;
        arreglo[4]=v5;
        arreglo[5]=v1;
       
        Poligono poligono = new Poligono(arreglo);
        
        assertTrue(poligono.calcularPerimetro()==10.650281539872886);

    }
    @Test public void testPersona(){
        p1 = new Persona("AELL680211","Lourdes Armenta",new Fecha("11/2/1968"));
        f1 = new Fecha(11,2,1968);
        assertTrue(p1.getDni().equals("AELL680211"));
        assertTrue(p1.getNombre().equals("Lourdes Armenta"));
        assertTrue(p1.getFechaNacimiento().equals(f1));
    }

    
}