package prog;
public class Ponto {
	//Atributos
	private int x,y;
	
	//Construtores

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void setPonto(int xs, int ys) {
		setX(xs);
		setY(ys);
	}
	public Ponto () {
		this.x = 0;
		this.y = 0;
	}
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
    }
	
	//Métodos
	
	public boolean pontosIguais(Ponto pPonto) {
		return this.x == pPonto.x && this.y == pPonto.y;
	}

	public double calcularDist(Ponto pPonto) {
		int contaX = this.x - pPonto.x;
		int contaY = this.y - pPonto.y;
		return Math.sqrt(contaX * contaX + contaY * contaY);
		
	}

}
/*
O primeiro construtor Ponto() não recebe nenhum parâmetro e define os atributos this.x e this.y com valores zerados.

O segundo construtor Ponto() recebe dois parâmetros e os atribui como this.x e this.y.

O primeiro método recebe o objeto Ponto e verifica se seus atributos x e y são iguais ou não(true or false).

O segundo método recebe um objeto Ponto como parâmetro e calcula a distância entre os pontos através da fórmula utilizada na geometria analítica, que foi simplificada no código(d = sqrt((xb - xa)^2 + (yb - ya)^2). O método retorna um valor double que equivale a distância entre os dois pontos.
*/
