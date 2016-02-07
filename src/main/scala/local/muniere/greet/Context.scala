package local.muniere.greet

case class Context(
  val count: Int,
  val message: String
) {
  // simple case class
}

object Context {

  /**
    * Create a new default context
    * @return
    */
  def default = Context(
    count =  1,
    message = null
  )
}
