
import static javax.swing.JOptionPane.*;

public class EjercicioUnidad1
{

	public static void rectangulo()
	{
		float b = Float.parseFloat( showInputDialog( "Base" ) );
		float h = Float.parseFloat( showInputDialog( "Altura" ) );

		float a = b * h;
		float p = ( b + h ) * 2;

		showMessageDialog( null , "Area es igual a: " + a + "\nPerimetro es igual a: " + p );

	}//rectangulo

	public static void Circulo()
	{
		float r = Float.parseFloat( showInputDialog( "Escribe el radio del circulo: " ) );
		float a = ( float ) Math.PI * r * r;
		float p = 2 * r * ( float ) Math.PI;

		showMessageDialog( null , "Area es igual a: " + a + "\nPerimetro es igual a: " + p );
	}//Circulo

	public static void esPar()
	{
		float n = Float.parseFloat( showInputDialog( "Escribe un numero: " ) );

		if ( n % 2 == 0 )
			showMessageDialog( null , +n + " es un n�mero par" );
		else
			showMessageDialog( null , +n + " es un n�mero impar" );

	}//par o impar

	public static void esMayorEdad()
	{
		String nombre = showInputDialog( "Escribe tu nombre: " );
		int edad = Integer.parseInt( showInputDialog( "Anota tu edad: " ) );

		if ( edad >= 18 )
			showMessageDialog( null , nombre + " eres mayor de edad" );
		else
			showMessageDialog( null , nombre + " eres menor de edad" );

	}//esMayorEdad

	public static void esTriangulo()
	{
		float l1 = Float.parseFloat( showInputDialog( "Dame una medida: " ) );
		float l2 = Float.parseFloat( showInputDialog( "Dame una segunda medida: " ) );
		float l3 = Float.parseFloat( showInputDialog( "Dame una tercera medida: " ) );

		if ( l1 + l2 > l3 && l2 + l3 > l1 && l1 + l3 > l2 )
		{
			if ( l1 == l2 && l2 == l3 )
			{
				showMessageDialog( null , "Tus medidas" + l1 + " " + l2 + " " + l3 + " si pueden formar un triangulo y es equilatero" );

			}
			if ( l1 == l2 && l2 != l3 || l2 == l3 && l3 != l1 || l1 == l3 && l3 != l2 )
			{
				showMessageDialog( null , "Tus medidas" + l1 + " " + l2 + " " + l3 + " si pueden formar un triangulo y es isoceles" );
			}

			if ( l1 != l2 && l2 != l3 )
			{
				showMessageDialog( null , "Tus medidas" + l1 + " " + l2 + " " + l3 + " si pueden formar un triangulo y es escaleno" );
			}

		}
		else
			showMessageDialog( null , "tus medidas " + l1 + " " + l2 + " " + l3 + " no pueden formar un triangulo" );

	}//esTriangulo

	public static void salario()
	{
		float salario = Float.parseFloat( showInputDialog( "�Cual es tu salario?" ) );
		float ns = 0;
		if ( salario < 1000 )
			ns = ( float ) ( salario * 1.25 );
		else if ( salario < 1000 )
			ns = ( float ) ( salario * 1.1 );
		else
			ns = ( float ) ( salario * 1.05 );

		showMessageDialog( null , "Tu nuevo salario: $" + ns + "\nAntes: $" + salario );

	}//salario

	public static void formulaGeneral()
	{
		float N = Float.parseFloat( showInputDialog( "ingresa el numero: " ) );
		float N2 = Float.parseFloat( showInputDialog( "ingresa otro numero" ) );
		float N3 = Float.parseFloat( showInputDialog( "ingresa un tercer numero" ) );
		double x1 = ( -N2 + Math.sqrt( N2 * N2 - 4 * N * N3 ) ) / ( 2 * N );
		double x2 = ( -N2 - Math.sqrt( N2 * N2 - 4 * N * N3 ) ) / ( 2 * N );

		showMessageDialog( null , "x1= " + x1 + "\nx2= " + x2 );

	}//FG (formula general)

	public static void esBisiesto()
	{
		int year = Integer.parseInt( showInputDialog( "Escribe un a�o" ) );
		if ( year % 4 == 0 && year % 100 != 0 || year % 1000 == 0 )
			showMessageDialog( null , "El a�o " + year + " es bisiesto" );
		else
			showMessageDialog( null , "El a�o " + year + " no es bisiesto" );

	}//Fin esBiciesto

	public static void menuOperaciones()
	{
		float a = Float.parseFloat( showInputDialog( "Escribe un numero: " ) );
		float b = Float.parseFloat( showInputDialog( "Escribe un numero: " ) );

		String op = showInputDialog( "S) Suma\nR) Resta\nM) Multiplicacion\nD) Division" );
		op = op.toUpperCase();
		if ( op.equals( "S" ) )
			showMessageDialog( null , a + "+" + b + "=" + ( a + ( float ) b ) );
		else if ( op.equals( "R" ) )
			showMessageDialog( null , a + "-" + b + "=" + Math.abs( a - ( float ) b ) );
		else if ( op.equals( "M" ) )
			showMessageDialog( null , a + "*" + b + "=" + Math.abs( a * ( float ) b ) );
		else if ( op.equals( "D" ) )
			showMessageDialog( null , a + "/" + b + "=" + Math.abs( a / ( float ) b ) );

		else
			showMessageDialog( null , "No hay opcion valida" );

	}//Fin menuOperaciones

	public static void usarString()
	{

		String a = showInputDialog( "Con que palabra termina la siguiente frase:\n La vaca es pinta" );
		a = a.toLowerCase();
		if ( a.endsWith( "pinta" ) )
			showMessageDialog( null , "Correcto" );
		else
			showMessageDialog( null , "Incorrecto" );

	}//Fin usarString

	public static void cuentaVocales()
	{
		String cad = showInputDialog( "Escribe un texto" );
		cad = cad.toLowerCase();
		int v = 0;
		for ( int i = 0 ; i < cad.length() ; i++ )
			if ( cad.charAt( i ) == 'a' || cad.charAt( i ) == 'e' || cad.charAt( i ) == 'i' || cad.charAt( i ) == 'o' || cad.charAt( i ) == 'u' )
				v++;
		showMessageDialog( null , cad + " tiene " + v + " vocales" );
	}// Fin Cuenta vocales

	public static void numeros1aN()
	{
		int n = Integer.parseInt( showInputDialog( "Escribe un numero" ) );
		String cad = "";
		for ( int i = 1 ; i <= n ; i++ )
			cad = cad + i + "\n";
		showMessageDialog( null , cad );

	}//Fin numeros de 1 a N

	public static void numerosParesde1aN()
	{
		int n = Integer.parseInt( showInputDialog( "Escribe un numero" ) );
		String cad = "";
		for ( int i = 1 ; i <= n ; i++ )
			if ( i % 2 == 0 )
				cad = cad + i + "\n";

		showMessageDialog( null , cad );

	}// fin de clase

	public static void sumaNumerosimpares1aN()
	{
		int n = Integer.parseInt( showInputDialog( "Escribe un numero" ) );
		String cad = "";
		int impar = 0;
		for ( int i = 1 ; i <= n ; i++ )
			if ( i % 2 != 0 )
			{
				cad = cad + i + "\n";
				impar = impar + i;
			}

		showMessageDialog( null , cad + "\nLa suma es " + impar );
	}//fin de clase

	public static void numerosAExponentes()
	{

		int n = Integer.parseInt( showInputDialog( "Escribe un numero y te mostrara su cuadratico" ) );
		String cad = "";
		for ( int i = 1 ; i <= n ; i++ )
		{
			int y = i * i;
			cad = cad + i + " - " + y + "\n";

		}

		showMessageDialog( null , cad );

	}//Fin numeroAExponentes

	public static void numerosSobreX()
	{

		int n = Integer.parseInt( showInputDialog( "Escribe un numero " ) );
		String cad = "";
		float suma = 0;
		for ( int i = 1 ; i <= n ; i++ )
		{
			if ( i % 2 == 0 )
				suma = suma - ( 1 / ( float ) i );

			else
				suma = suma + ( 1 / ( float ) i );
		}
		showMessageDialog( null , suma );
	}//FIn

	public static void tarea()
	{
		int n = Integer.parseInt( showInputDialog( "Escribe un numero" ) );
		float d = 0;
		for ( int i = 1 ; i <= n ; i++ )
			if ( n % i == 0 )
				d++;
		if ( d == 2 )
			showMessageDialog( null , "El numero " + n + " es primo" );
		else
			showMessageDialog( null , "El numero " + n + " no es primo" );
	}

	public static void tarea2()
	{
		int n = Integer.parseInt( showInputDialog( "Escribe un numero" ) );

		int suma = 0;
		for ( int i = 1 ; i < n ; i++ )
			if ( n % i == 0 )
				suma += i;
		if ( suma == n )
			showMessageDialog( null , "Tu numero es perfecto" );
		else
			showMessageDialog( null , "Tu numero no es perfecto" );

	}

	public static void main( String[] args )
	{
		tarea2();

	}//main

}//Fin
