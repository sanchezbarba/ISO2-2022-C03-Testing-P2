package Trabajo_P2.Testing;

public class Triangulo {

	// se definen los lados y angulos como enteros para lograr abstraccion
	private int lado1, lado2, lado3;
	private int angulo1, angulo2, angulo3;
	private String tipoSegunLado;
	private String tipoSegunAngulo;

	public Triangulo(int lado1, int lado2, int lado3, int angulo1, int angulo2, int angulo3)
			throws numNegativoException, anguloException {
		this.lado1 = comprobarNum(lado1);
		this.lado2 = comprobarNum(lado2);
		this.lado3 = comprobarNum(lado3);
		this.angulo1 = comprobarAngulo(angulo1);
		this.angulo2 = comprobarAngulo(angulo2);
		this.angulo3 = comprobarAngulo(angulo3);
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}

	public int getAngulo1() {
		return angulo1;
	}

	public void setAngulo1(int angulo1) {
		this.angulo1 = angulo1;
	}

	public int getAngulo2() {
		return angulo2;
	}

	public void setAngulo2(int angulo2) {
		this.angulo2 = angulo2;
	}

	public int getAngulo3() {
		return angulo3;
	}

	public void setAngulo3(int angulo3) {
		this.angulo3 = angulo3;
	}

	public String getTipoSegunLado() {
		return tipoSegunLado;
	}

	public void setTipoSegunLado(String tipoSegunLado) {
		this.tipoSegunLado = tipoSegunLado;
	}

	public String getTipoSegunAngulo() {
		return tipoSegunAngulo;
	}

	public void setTipoSegunAngulo(String tipoSegunAngulo) {
		this.tipoSegunAngulo = tipoSegunAngulo;
	}

	public static boolean trianguloValido(Triangulo t) {
		if (t.getAngulo1() + t.getAngulo2() + t.getAngulo3() == 180)
			return true;
		else
			return false;
	}

	public static int comprobarAngulo(int num) throws numNegativoException, anguloException {
		num = comprobarNum(num);
		if (num >= 180) {
			throw new anguloException("ERROR. El ángulo no puede ser de 180 grados o mayor.\n");
		}
		return num;
	}

	public static int comprobarNum(int num) throws numNegativoException {
		if (num <= 0) {
			throw new numNegativoException("ERROR. El número debe ser positivo.\n");
		}
		return num;
	}

	public void clasificarSegunLado() {
		if (this.lado1 == this.lado2 && this.lado2 == this.lado3) {
			this.tipoSegunLado = "Equilatero";
		} else if (this.lado1 == this.lado2 || this.lado1 == this.lado3 || this.lado2 == this.lado3) {
			this.tipoSegunLado = "Isosceles";
		} else {
			this.tipoSegunLado = "Escaleno";
		}
	}

	public void clasificarSegunAngulo() {
		if (this.angulo1 == 90 || this.angulo2 == 90 || this.angulo3 == 90) {
			this.tipoSegunAngulo = "Rectangulo";
		}

		if (this.angulo1 < 90 && this.angulo2 < 90 && this.angulo3 < 90) {
			this.tipoSegunAngulo = "Acutangulo";
		}
		if ((this.angulo1 > 90 && this.angulo1 < 180) || (this.angulo2 > 90 && this.angulo2 < 180)
				|| (this.angulo3 > 90 && this.angulo3 < 180)) {
			this.tipoSegunAngulo = "Obtusangulo";
		}
	}
	
	public static boolean comprobarLado3(Triangulo t) { //teorema del coseno
		boolean correcto = false;
		int l1 = t.getLado1();
		int l2 = t.getLado2();
		int a1 = (int) Math.toRadians(t.getAngulo1());

		double operacion = (Math.pow(l1, 2)) + (Math.pow(l2, 2)) - 2 * (l1 * l2 * Math.cos(a1));
		double teoremaCoseno = Math.round(Math.sqrt(operacion));

		if (teoremaCoseno == t.getLado3()) {
			correcto = true;
		}
		return correcto;
	}

}
