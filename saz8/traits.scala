
trait Logging {
  def writeLog(msg: String): Unit
  def format(msg: String): String
  
  def log(msg: String): Unit = writeLog(format(msg))
}

trait SimpleFormatLogger extends Logging {
  def format(msg: String): String = s"[log] $msg"
}
trait ComplexFormatLogger extends Logging {
  def format(msg: String): String = s"[complex-log] $msg"
}

trait SystemLogger extends Logging {
  def writeLog(msg: String): Unit = println(msg)
}
trait FileLogger extends Logging {
  def writeLog(msg: String): Unit = println(s"[logando em arquivo] $msg")
}


object SimpleFileLogger extends SystemLogger with SimpleFormatLogger

SimpleFileLogger.log("olá mundo dos traits")


