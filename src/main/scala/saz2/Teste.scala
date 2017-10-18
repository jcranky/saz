package saz2

class Teste {
  val nome = "jcranky"

  private var _idade = 99

  def idade_=(x: Int) = {
    require(x < 100)
    _idade = x
  }

  def idade = _idade
}

object MainTeste extends App {
  val t = new Teste()
  t.idade = 109

  println(t.nome)
  println(t.idade)
}
